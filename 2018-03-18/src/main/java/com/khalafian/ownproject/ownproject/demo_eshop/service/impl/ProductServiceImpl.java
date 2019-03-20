package com.khalafian.ownproject.ownproject.demo_eshop.service.impl;

import com.khalafian.ownproject.ownproject.demo_eshop.dao.ProductRepository;
import com.khalafian.ownproject.ownproject.demo_eshop.entity.Product;
import com.khalafian.ownproject.ownproject.demo_eshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService
{
    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository)
    {
        this.productRepository = productRepository;
    }

    @Override
    public Optional<Product> findById(Integer id) {
        return productRepository.findById(id);
    }
}
