package com.example.apiwebok.repositories;

import com.example.apiwebok.models.ProductModel;

public interface ProductRestRepository {
    void save(ProductModel productModel);

    ProductModel getProductById(int id);

    int getProductLastCount();

    void setProductLastCount(int count);
}
