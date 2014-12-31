package com.nva.service.test;

import com.nva.service.ServiceErrors;
import com.nva.service.products.ProductServiceInterface;
import com.nva.support.ParamBuilder.ParamsVO;
import com.nva.support.beans.product.ProductAttributesVO;
import com.nva.support.beans.product.ProductVO;
import com.nva.support.beans.shops.ShopVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by edu on 08/12/2014.
 */
public class ProductsTest extends AbstractIntegrationTest{

    @Autowired
    private ProductServiceInterface productServiceInterface;

    @Test
    public void addNewShopNotIn(){

        ShopVO shopVO = new ShopVO();
        shopVO.setId("carrefour");

        ParamsVO paramsVO = ParamsVO.createNewParamsVO(new ProductVO(),shopVO,new ProductAttributesVO());
        List <ProductVO> list =  productServiceInterface.findProductNotInShop(paramsVO);
        for(ProductVO productVO1 : list){
            System.out.println("this product is not in shop "+shopVO.getId() +": " +productVO1);
        }
    }

    //@Test
    public void testSearchProduct(){
        ProductVO  productVO = new ProductVO();
        productVO.setId("1");
        productVO.setName("leche");
        //ProductVO  newProductVO =  productServiceInterface.findByName(productVO);
        //System.out.println(newProductVO);
       // Assert.assertNotNull(newProductVO);
    }

    //@Test
    public void addNewPrice() throws ServiceErrors {
        ProductVO productVO = new ProductVO();
        productVO.setName("leche");
        productVO  = productServiceInterface.findByName(productVO);

        ShopVO shopVO = new ShopVO();
        shopVO.setId("carrefour");

        ProductAttributesVO productAttributesVO = new ProductAttributesVO();
        productAttributesVO.setDate(new Date());
        productAttributesVO.setPrice("112233445566");
        ParamsVO paramsVO = ParamsVO.createNewParamsVO(productVO,shopVO,productAttributesVO);

        productVO = productServiceInterface.updatePrice(paramsVO);

        System.out.println(productVO);
    }

    @Test
    public void saveProducts(){
        saveProductLeche();
        saveProductPan();
    }

    //@Test
    public void addShop(){
        String nameAndId = "mercadona";
        ShopVO shopVO = new ShopVO();
        shopVO.setId(nameAndId);
        shopVO.setName(nameAndId);

        List<ProductVO> lista = productServiceInterface.findAll();
        List<ShopVO> shopList = new ArrayList<>();
        shopList.add(shopVO);


        for(ProductVO productVO : lista){
            productVO.setAttr(shopList);
            ParamsVO paramsVO = ParamsVO.createNewParamsVO(productVO,shopVO,new ProductAttributesVO());
            productServiceInterface.addNewShop(paramsVO);
        }
    }

    public void  saveProductLeche(){
        String nameAndId = "carrefour";
        ProductVO productVO = new ProductVO();
        productVO.setName("leche");

        List<ShopVO> lista = new ArrayList<ShopVO>();
        ShopVO shopVO = new ShopVO();
        shopVO.setId(nameAndId);
        shopVO.setName(nameAndId);

        List<ProductAttributesVO> attr = new ArrayList<>();
        ProductAttributesVO productAttributesVO = new ProductAttributesVO();
        productAttributesVO.setDate(new Date());
        productAttributesVO.setPrice("1.6");
        attr.add(productAttributesVO);

        productAttributesVO = new ProductAttributesVO();
        productAttributesVO.setDate(new Date());
        productAttributesVO.setPrice("5.7");
        attr.add(productAttributesVO);

        shopVO.setProductAttr(attr);
        lista.add(shopVO);
        productVO.setAttr(lista);

        productServiceInterface.save(productVO);
    }


    public void  saveProductPan(){
        String nameAndId = "mercadona";
        ProductVO productVO = new ProductVO();
        productVO.setName("pan bimbo");
        List<ShopVO> lista = new ArrayList<ShopVO>();
        ShopVO shopVO = new ShopVO();
        shopVO.setId(nameAndId);
        shopVO.setName(nameAndId);
        List<ProductAttributesVO> attr = new ArrayList<>();
        ProductAttributesVO productAttributesVO = new ProductAttributesVO();
        productAttributesVO.setDate(new Date());
        productAttributesVO.setPrice("1.6");
        attr.add(productAttributesVO);

        productAttributesVO = new ProductAttributesVO();
        productAttributesVO.setDate(new Date());
        productAttributesVO.setPrice("5.7");
        attr.add(productAttributesVO);

        shopVO.setProductAttr(attr);
        lista.add(shopVO);
        productVO.setAttr(lista);

        productServiceInterface.save(productVO);
    }

    //@Test
    public void listProducts(){
        List<ProductVO> lista = productServiceInterface.findAll();
        for(ProductVO productVO : lista){
            System.out.println(productVO);
        }
    }

}
