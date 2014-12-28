package com.nva.integration.products;

import com.nva.service.products.ProductServiceInterface;
import com.nva.support.beans.product.ProductVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by edu on 09/12/2014.
 */
@RestController("/product")
public class ProductsImpl implements ProductsInterface{

    @Autowired
    private ProductServiceInterface productServiceInterface;

    @RequestMapping(value = "/find/{name}", method = RequestMethod.GET, produces = "application/json")
    @Override
    public ProductVO findByName(@PathVariable String name) {
        ProductVO productVO = new ProductVO();
        productVO.setName(name);
        return productServiceInterface.findByName(productVO);
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @Override
    public ProductVO save(@RequestBody ProductVO productVO) {
        return productServiceInterface.save(productVO);
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<ProductVO> findAll() {
        return productServiceInterface.findAll();
    }


}
