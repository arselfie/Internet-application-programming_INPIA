package com.khalafian.ownproject.ownproject.demo_eshop.service;

import com.khalafian.ownproject.ownproject.demo_eshop.entity.Product;

import java.util.Optional;

public interface ProductService
{
    Optional<Product> findById(Integer id);
}
