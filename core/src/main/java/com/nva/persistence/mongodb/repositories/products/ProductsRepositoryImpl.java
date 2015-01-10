package com.nva.persistence.mongodb.repositories.products;

import com.nva.params.Params;
import com.nva.persistence.mongodb.entities.products.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * Created by edu on 07/12/2014.
 */
public class ProductsRepositoryImpl implements ProductsRepositoryCustom{

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Product update(Product product) {
        final Query query = new Query();
        query.addCriteria( Criteria.where("name").is(product.getName()) );
        return mongoTemplate.findAndModify(query, Update.update("price", product.getShopList().get(0)), Product.class);
    }

    public Product addNewPrice(Params params){

        mongoTemplate.updateFirst(
                Query.query(
                        Criteria.where("name").is(params.getProduct().getName())
                                .andOperator(
                                        Criteria.where("shopList.name").is(params.getShop().getId()))),
                new Update()
                        .push("shopList.$.productAttr", params.getProductAttributes()), Product.class);

        final Query query = new Query();
        query.addCriteria( Criteria.where("name").is(params.getProduct().getName()) );
        return mongoTemplate.findOne(query,Product.class);
    }

    public Product addNewShop(Params params){

        mongoTemplate.updateFirst(
                Query.query(
                        Criteria.where("name").is(params.getProduct().getName())),
                new Update()
                        .push("shopList", params.getShop()), Product.class);

        final Query query = new Query();
        query.addCriteria( Criteria.where("name").is(params.getProduct().getName()) );
        return mongoTemplate.findOne(query,Product.class);
    }

    public List <Product> findProductNotInShop(Params params) {
        final Query query = new Query();
        query.addCriteria( Criteria.where("shopList.name").nin(params.getShop().getId()) );
        return mongoTemplate.find(query,Product.class);
    }
}
