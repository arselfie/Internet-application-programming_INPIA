package com.khalafian.ownproject.ownproject.demo_eshop.dao;

import com.khalafian.ownproject.ownproject.demo_eshop.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer>
{
    Optional<Product> findById(Integer id);
}

