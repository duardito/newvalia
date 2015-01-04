package com.nva.persistence.mongodb.entities.products;

import com.nva.persistence.mongodb.entities.MongoAuditedDocument;
import com.nva.persistence.mongodb.entities.shops.Shop;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

/**
 * Created by edu on 07/12/2014.
 */
@Document(collection="products")
public class Product extends MongoAuditedDocument {

    private List<Shop> shopList;

    public List<Shop> getShopList() {
        return shopList;
    }

    public void setShopList(List<Shop> shopList) {
        this.shopList = shopList;
    }

    protected String getPriceByDateAndShop(){
        StringBuffer sb = new StringBuffer();
        for(Shop shop : shopList){
            final String shopName =  shop.getName();
            sb.append(" shop name: ").append(shopName).append(", ");
            sb.append(" has this product:").append(getName()).append(", ");
            for(ProductAttributes productAttributes : shop.getProductAttr()){
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