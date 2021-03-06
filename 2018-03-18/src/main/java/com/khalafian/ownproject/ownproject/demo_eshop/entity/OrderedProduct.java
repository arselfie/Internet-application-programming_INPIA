package com.khalafian.ownproject.ownproject.demo_eshop.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Data
public class OrderedProduct extends BaseEntity
{
    @ManyToOne
    private Product product;

    @ManyToOne
    private OrderForm order;

    private Integer amount;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderForm getOrder() {
        return order;
    }

    public void setOrder(OrderForm order) {
        this.order = order;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
