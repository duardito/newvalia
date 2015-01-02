package com.nva.params;

import com.nva.persistence.mongodb.entities.products.Product;
import com.nva.persistence.mongodb.entities.products.ProductAttributes;
import com.nva.persistence.mongodb.entities.shops.Shop;

/**
 * backend immutable class focused to wrap all parameters in backend object, each method will have only one parameter,
 * with this decission we are avoiding to have methods with an excesive parameters.
 *
 * add an extra private constructor and a public static instantiate when required
 *
 * @since 1.0
 * @author Eduard frades
 * Created by edu on 20/12/2014.
 */
public final class Params {

    private Product product;
    private Shop shop;
    private ProductAttributes productAttributes;

    public static Params createNewParams(final Product product,final Shop shop,final ProductAttributes productAttributes){
        return new Params( product, shop, productAttributes);
    }

    private Params(Product product, Shop shop, ProductAttributes productAttributes) {
        this.product = product;
        this.shop = shop;
        this.productAttributes = productAttributes;
    }

    public static Params createNewParams(final Product product){
        return new Params( product);
    }

    private Params(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public ProductAttributes getProductAttributes() {
        return productAttributes;
    }

    public Shop getShop() {
        return shop;
    }
}
