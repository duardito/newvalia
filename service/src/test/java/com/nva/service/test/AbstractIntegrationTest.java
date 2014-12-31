package com.nva.service.test;

import com.nva.log.InitLogger;
import com.nva.persistence.PersistenceConfiguration;
import com.nva.log.bean.Log;
import com.nva.persistence.mongodb.entities.products.Product;
import com.nva.persistence.mongodb.entities.shops.Shop;
import com.nva.persistence.mongodb.entities.users.User;
import com.nva.service.ApplicationConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by edu on 08/12/2014.
 */
@EnableAspectJAutoProxy
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( classes = {  PersistenceConfiguration.class, ApplicationConfig.class, InitLogger.class} )
@ActiveProfiles("mongodb")
public abstract class AbstractIntegrationTest {

    @Autowired
    private MongoTemplate mongoTemplate;

   //@Test
    public void aremoveCollections(){
        mongoTemplate.dropCollection(Shop.class);
        mongoTemplate.dropCollection(Product.class);
        mongoTemplate.dropCollection(User.class);
        mongoTemplate.dropCollection(Log.class);
    }

}
