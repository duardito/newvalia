package com.nva.service.products;

import com.nva.support.ParamBuilder.ParamsVO;
import com.nva.support.beans.product.ProductVO;

import java.util.List;

/**
 * Created by edu on 07/12/2014.
 */
public interface ProductServiceInterface {

    public ProductVO findByName(final ProductVO product);
    public ProductVO save(ProductVO product);
    public List<ProductVO> findAll();
    public ProductVO updatePrice(final ParamsVO paramsVO);
    public ProductVO addNewShop(final ParamsVO params);
}
