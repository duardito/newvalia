package com.nva.integration.products;

import com.nva.support.exceptions.ServiceErrors;
import com.nva.service.products.ProductServiceInterface;
import com.nva.support.beans.product.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by edu on 09/12/2014.
 */
@RestController
public class ProductsImpl implements ProductsInterface{

    @Autowired
    private ProductServiceInterface productServiceInterface;

    @RequestMapping(value = "/product/find/{name}", method = RequestMethod.GET, produces = "application/json")
    @Override
    public ProductVO findByName(@PathVariable String name) throws ServiceErrors {
        ProductVO productVO = new ProductVO();
        productVO.setName(name);

        productVO = productServiceInterface.findByName(productVO);
        if(productVO == null){
            throw new ServiceErrors();
        }

        return productVO;
    }

    @RequestMapping(value = "/product/save", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @Override
    public ProductVO save(@RequestBody ProductVO productVO) {
        return productServiceInterface.save(productVO);
    }

    @RequestMapping(value = "/product/findAll", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<ProductVO> findAll() {
        return productServiceInterface.findAll();
    }


}
