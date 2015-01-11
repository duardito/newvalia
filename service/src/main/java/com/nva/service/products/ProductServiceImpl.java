package com.nva.service.products;

import com.nva.params.Params;
import com.nva.persistence.mongodb.entities.products.Product;
import com.nva.persistence.mongodb.entities.products.ProductAttributes;
import com.nva.persistence.mongodb.entities.shops.Shop;
import com.nva.persistence.mongodb.repositories.products.ProductsRepository;
import com.nva.support.ParamBuilder.ParamsVO;
import com.nva.support.beans.product.ProductAttributesVO;
import com.nva.support.beans.product.ProductVO;
import com.nva.support.beans.shops.ShopVO;
import com.nva.support.dozer.DozerConversionInterface;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by edu on 07/12/2014.
 */
@Service
public class ProductServiceImpl implements ProductServiceInterface{

    @Autowired
    private ProductsRepository productsRepository;

    @Autowired
    private DozerConversionInterface<?> dozerConversion;

    @Override
    public ProductVO findByName(final ProductVO productVO){

        final Product product = dozerConversion.map(productVO, Product.class);

        final Product productFromDb = productsRepository.findByName(product.getName());
        if(productFromDb == null){
           return null;
        }
        return dozerConversion.map(productFromDb,ProductVO.class);
    }

    @Override
    public ProductVO save(final ProductVO productVO) {

        final ProductVO p = findByName(productVO);
        if(p == null){
            final Product product = dozerConversion.map(productVO, Product.class);
            final Product productFromDb = productsRepository.save(product);
            return dozerConversion.map(productFromDb,ProductVO.class);

        }else{
            ShopVO shopVO = new ShopVO();
            String shopName = productVO.getShopList().get(0).getName();
            shopVO.setName(shopName);
            shopVO.setId(shopName);

            ProductAttributesVO productAttributesVO = new ProductAttributesVO();
            String price = productVO.getShopList().get(0).getProductAttr().get(0).getPrice();
            Date date = productVO.getShopList().get(0).getProductAttr().get(0).getDate();
            productAttributesVO.setDate(date);
            productAttributesVO.setPrice(price);

            ParamsVO paramsVO = ParamsVO.createNewParamsVO(productVO, shopVO,  productAttributesVO);
            updatePrice(paramsVO);
        }
        return new ProductVO();

    }

    @Override
    public List<ProductVO> findAll() {
        List <Product>list = productsRepository.findAll();
        return dozerConversion.map(new DozerBeanMapper(),list,ProductVO.class);
    }

    @Override
    public ProductVO updatePrice(final ParamsVO paramsVO) {
        final Params params = getParams(paramsVO);

        final Product productFromDb = productsRepository.addNewPrice(params);
        return dozerConversion.map(productFromDb,ProductVO.class);
    }

    @Override
    public ProductVO addNewShop(ParamsVO paramsVO) {
        final Params params = getParams(paramsVO);

        final Product productFromDb = productsRepository.addNewShop(params);
        return dozerConversion.map(productFromDb,ProductVO.class);
    }

    @Override
    public List<ProductVO> findProductNotInShop(ParamsVO paramsVO) {
        final Params params = getParams(paramsVO);
        final List<Product> list = productsRepository.findProductNotInShop(params);
        return dozerConversion.map(new DozerBeanMapper(),list,ProductVO.class);
    }

    protected Params getParams(final ParamsVO paramsVO){
        final Product product = dozerConversion.map(paramsVO.getProductVO(), Product.class);
        final ProductAttributes productAttributes = dozerConversion.map(paramsVO.getProductAttributesVO(), ProductAttributes.class);
        final Shop shop = dozerConversion.map(paramsVO.getShopVO(), Shop.class);
        return Params.createNewParams(product, shop, productAttributes);
    }
}
