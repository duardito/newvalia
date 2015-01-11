package com.nva.service.shops;

import com.nva.support.beans.shops.ShopVO;

import java.util.List;

/**
 * Created by edu on 19/12/2014.
 */
public interface ShopServiceInterface {

    public ShopVO saveShop(final ShopVO shopVO);
    List<ShopVO> findAll();
}
