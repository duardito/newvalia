package com.nva.persistence.mongodb.repositories.products;

import com.nva.persistence.mongodb.entities.products.Product;
import com.nva.persistence.mongodb.repositories.MongoOperationsAbstract;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by edu on 07/12/2014.
 */
@EnableMongoRepositories
@Configuration
public interface ProductsRepository extends MongoOperationsAbstract<Product, String>, ProductsRepositoryCustom<Product, String>{

    public Product findByName(String name);
}
