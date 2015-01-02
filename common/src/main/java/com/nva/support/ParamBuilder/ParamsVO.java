package com.nva.support.ParamBuilder;

import com.nva.support.beans.product.ProductAttributesVO;
import com.nva.support.beans.product.ProductVO;
import com.nva.support.beans.shops.ShopVO;

/**
 * view object immutable class focused to wrap all parameters in view object, each method will have only one parameter,
 * with this decission we are avoiding to have methods with an excesive parameters.
 *
 * add an extra private constructor and a public static instantiate when required
 *
 * @since 1.0
 * @author Eduard frades
 * Created by edu on 20/12/2014.
 */
public final class ParamsVO {

    private ProductVO productVO;
    private ShopVO shopVO;
    private ProductAttributesVO productAttributesVO;

    public static ParamsVO createNewParamsVO(final ProductVO productVO,final ShopVO shopVO,final ProductAttributesVO productAttributesVO){
        return new ParamsVO( productVO, shopVO, productAttributesVO);
    }

    private ParamsVO(ProductVO productVO, ShopVO shopVO, ProductAttributesVO productAttributesVO) {
        this.productVO = productVO;
        this.shopVO = shopVO;
        this.productAttributesVO = productAttributesVO;
    }

    public static ParamsVO createNewParamsVO(final ProductVO productVO){
        return new ParamsVO( productVO);
    }

    private ParamsVO(ProductVO productVO) {
        this.productVO = productVO;
    }

    public ProductVO getProductVO() {
        return productVO;
    }

    public ShopVO getShopVO() {
        return shopVO;
    }

    public ProductAttributesVO getProductAttributesVO() {
        return productAttributesVO;
    }

}
