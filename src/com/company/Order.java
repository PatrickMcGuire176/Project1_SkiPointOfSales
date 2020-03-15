package com.company;
import java.util.ArrayList;
import java.util.List;

class Order implements Sale {
    Customer customer;
    List<Item> orderItems = new ArrayList<>();
    int total;

    public Order(Customer customer, Item item){
        this.customer = customer;
        this.orderItems.add(item);
    }

    public void addOrderItem(Item item){
        this.orderItems.add(item);
    }

    @Override
    public void performSale(Order order) {
        for (Item orderItem : order.orderItems){
            total += orderItem.price.intValue();
        }
    }
}
