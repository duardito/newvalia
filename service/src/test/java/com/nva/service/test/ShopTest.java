package com.nva.service.test;

import com.nva.service.shops.ShopServiceInterface;
import com.nva.support.beans.shops.ShopVO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by edu on 19/12/2014.
 */
public class ShopTest extends AbstractIntegrationTest{

    @Autowired
    private ShopServiceInterface shopServiceInterface;



    @Test
    public void saveShop(){
        aremoveCollections();
        ShopVO shop = new ShopVO();
        String nameAndId = "carrefour";
        shop.setId(nameAndId);
        shop.setName(nameAndId);
        shopServiceInterface.saveShop(shop);

        shop = new ShopVO();
        nameAndId = "mercadona";
        shop.setId(nameAndId);
        shop.setName(nameAndId);
        shopServiceInterface.saveShop(shop);
    }


}
