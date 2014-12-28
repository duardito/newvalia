package com.nva.support.beans.product;

import com.nva.support.beans.AbstractVO;
import com.nva.support.beans.shops.ShopVO;

import java.util.Date;
import java.util.List;

/**
 * Created by edu on 07/12/2014.
 */
public class ProductVO extends AbstractVO {

    private List <ShopVO>attr;

    public List<ShopVO> getAttr() {
        return attr;
    }

    public void setAttr(List<ShopVO> attr) {
        this.attr = attr;
    }

    protected String getPriceByDateAndShop(){
        StringBuffer sb = new StringBuffer();
        for(ShopVO shop : attr){
            final String shopName =  shop.getName();
            sb.append(" shop name: ").append(shopName).append(", ");
            sb.append(" has this product:").append(getName()).append(", ");
            for(ProductAttributesVO productAttributes : shop.getProductAttr()){
                final String shopPrice = productAttributes.getPrice();
                final Date shopDate = productAttributes.getDate();
                sb.append(" with price:").append(shopPrice).append(", ");
                sb.append(" in this date:").append(shopDate).append(".");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getPriceByDateAndShop();
    }
}
