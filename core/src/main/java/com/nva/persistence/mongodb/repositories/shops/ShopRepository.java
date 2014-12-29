package com.nva.persistence.mongodb.repositories.shops;

import com.nva.persistence.mongodb.entities.shops.Shop;
import com.nva.persistence.mongodb.repositories.MongoOperationsAbstract;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by edu on 19/12/2014.
 */
@EnableMongoRepositories
@Configuration
public interface ShopRepository extends MongoOperationsAbstract<Shop, String> {
}
