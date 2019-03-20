package com.khalafian.ownproject.ownproject.demo_eshop.dao;

import com.khalafian.ownproject.ownproject.demo_eshop.entity.OrderedProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedProductRepository extends JpaRepository<OrderedProduct, Long>{}