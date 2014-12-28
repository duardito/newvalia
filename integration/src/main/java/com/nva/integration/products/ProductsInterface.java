package com.nva.integration.products;

import com.nva.support.beans.product.ProductVO;

import java.util.List;

/**
 * Created by edu on 09/12/2014.
 */
public interface ProductsInterface {

    public ProductVO findByName(final String name);
    public ProductVO save(final ProductVO productVO);
    public List<ProductVO> findAll();

}
