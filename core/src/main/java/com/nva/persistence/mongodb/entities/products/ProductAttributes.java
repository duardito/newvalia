package com.nva.persistence.mongodb.entities.products;

import java.util.Date;

/**
 * Created by edu on 19/12/2014.
 */
public class ProductAttributes {

    private String price;
    private Date date;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
