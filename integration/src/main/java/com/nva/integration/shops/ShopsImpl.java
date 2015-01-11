package com.nva.integration.shops;

import com.nva.service.shops.ShopServiceInterface;
import com.nva.support.beans.shops.ShopVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by edu on 19/12/2014.
 */
@RestController
public class ShopsImpl implements ShopsInterface{

    @Autowired
    private ShopServiceInterface shopServiceInterface;

    @RequestMapping(value = "/shop/save", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
    @Override
    public ShopVO save(@RequestBody ShopVO shopVO) {

        return shopServiceInterface.saveShop(shopVO);
    }

    @RequestMapping(value = "/shop/findAll", method = RequestMethod.GET, produces = "application/json")
    @Override
    public List<ShopVO> findAll() {
        return shopServiceInterface.findAll();
    }


}
