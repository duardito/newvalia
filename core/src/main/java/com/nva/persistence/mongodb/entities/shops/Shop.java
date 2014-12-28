package com.nva.persistence.mongodb.entities.shops;

import com.nva.persistence.mongodb.entities.MongoAuditedDocument;
import com.nva.persistence.mongodb.entities.products.ProductAttributes;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edu on 19/12/2014.
 */
@Document(collection="shops")
public class Shop extends MongoAuditedDocument {

    private List<ProductAttributes> productAttr = new ArrayList<ProductAttributes>();

    public List<ProductAttributes> getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(List<ProductAttributes> productAttr) {
        this.productAttr = productAttr;
    }
}
