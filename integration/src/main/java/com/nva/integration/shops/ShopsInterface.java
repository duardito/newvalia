package com.nva.integration.shops;

import com.nva.support.beans.shops.ShopVO;

import java.util.List;

/**
 * Created by edu on 19/12/2014.
 */
public interface ShopsInterface {

    public ShopVO save(final ShopVO shopVO);
    public List<ShopVO> findAll();
}
