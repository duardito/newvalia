package com.nva.service;

import com.nva.service.products.ProductServiceImpl;
import com.nva.service.shops.ShopServiceImpl;
import com.nva.service.users.UsersServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by edu on 09/12/2014.
 */
@ComponentScan( basePackages ="com.nva.service.*" , basePackageClasses = { ProductServiceImpl.class, ShopServiceImpl.class, UsersServiceImpl.class})
@Configuration
public interface ApplicationConfig {
}
