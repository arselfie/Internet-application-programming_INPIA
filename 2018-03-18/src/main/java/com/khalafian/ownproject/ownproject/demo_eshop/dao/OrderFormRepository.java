package com.khalafian.ownproject.ownproject.demo_eshop.dao;

import com.khalafian.ownproject.ownproject.demo_eshop.entity.OrderForm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderFormRepository extends JpaRepository<OrderForm, Long>{}
