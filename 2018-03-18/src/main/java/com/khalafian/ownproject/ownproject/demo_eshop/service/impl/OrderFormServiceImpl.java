package com.khalafian.ownproject.ownproject.demo_eshop.service.impl;

import com.khalafian.ownproject.ownproject.demo_eshop.dao.OrderFormRepository;
import com.khalafian.ownproject.ownproject.demo_eshop.entity.OrderForm;
import com.khalafian.ownproject.ownproject.demo_eshop.service.OrderFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderFormServiceImpl implements OrderFormService
{
    private OrderFormRepository orderFormRepository;

    @Autowired
    public OrderFormServiceImpl(OrderFormRepository orderFormRepository)
    {
        this.orderFormRepository = orderFormRepository;
    }

    public void addNewOrder(OrderForm orderForm)
    {
        orderFormRepository.saveAndFlush(orderForm);
    }
}
