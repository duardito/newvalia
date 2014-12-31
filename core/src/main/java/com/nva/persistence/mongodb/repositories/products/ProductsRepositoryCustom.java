package com.nva.persistence.mongodb.repositories.products;

import com.nva.params.Params;
import com.nva.persistence.mongodb.entities.products.Product;

import java.io.Serializable;
import java.util.List;

/**
 * Created by edu on 07/12/2014.
 */
public interface ProductsRepositoryCustom <M, S extends Serializable>{

    public M update(final Product product);
    public M addNewPrice(final Params params);
    public M addNewShop(final Params params);
    public List<M> findProductNotInShop(final Params params);

}
