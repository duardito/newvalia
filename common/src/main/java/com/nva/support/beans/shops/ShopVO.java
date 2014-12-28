package com.nva.support.beans.shops;

import com.nva.support.beans.AbstractVO;
import com.nva.support.beans.product.ProductAttributesVO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edu on 19/12/2014.
 */
public class ShopVO extends AbstractVO {

    private List<ProductAttributesVO> productAttr = new ArrayList<ProductAttributesVO>();

    public List<ProductAttributesVO> getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(List<ProductAttributesVO> productAttr) {
        this.productAttr = productAttr;
    }
}
