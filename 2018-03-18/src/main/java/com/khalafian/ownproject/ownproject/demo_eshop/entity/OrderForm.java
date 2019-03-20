package com.khalafian.ownproject.ownproject.demo_eshop.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
public class OrderForm extends BaseEntity
{

    @OneToMany(mappedBy = "id")
    private Set<OrderedProduct> orderedProductSet;

    @Enumerated(EnumType.STRING)
    private OrderState orderState;

    public Set<OrderedProduct> getOrderedProductSet() {
        return orderedProductSet;
    }

    public void setOrderedProductSet(Set<OrderedProduct> orderedProductSet) {
        this.orderedProductSet = orderedProductSet;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
}

