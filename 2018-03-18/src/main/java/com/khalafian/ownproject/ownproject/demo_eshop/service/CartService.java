package com.khalafian.ownproject.ownproject.demo_eshop.service;

import com.khalafian.ownproject.ownproject.demo_eshop.entity.Product;

import java.util.Map;

public interface CartService
{
    void addProduct(Product product);

    void removeProduct(Product product);

    Map<Product, Integer> getProductsInCart();

    void checkout();

    Double getTotal();
}
