package com.nva.service.shops;

import com.nva.persistence.mongodb.entities.shops.Shop;
import com.nva.persistence.mongodb.repositories.shops.ShopRepository;
import com.nva.support.beans.shops.ShopVO;
import com.nva.support.dozer.DozerConversionInterface;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by edu on 19/12/2014.
 */
@Service
public class ShopServiceImpl implements ShopServiceInterface {

    @Autowired
    private DozerConversionInterface<?> dozerConversion;

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public ShopVO saveShop(ShopVO shopVO) {

        final Shop shop = dozerConversion.map(shopVO, Shop.class);
        final Shop shopFromDb = shopRepository.save(shop);
        return dozerConversion.map(shopFromDb,ShopVO.class);
    }

    @Override
    public List<ShopVO> findAll() {

        List <Shop>list = shopRepository.findAll();
        return dozerConversion.map(new DozerBeanMapper(),list,ShopVO.class);
    }
}
