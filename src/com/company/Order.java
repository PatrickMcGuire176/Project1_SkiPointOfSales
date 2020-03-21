package com.company;
import java.util.ArrayList;
import java.util.List;

class Order implements Sale {
    Customer customer;
    Discount discount;
    List<Item> orderItems = new ArrayList<>();
    int total;

    public Order(Customer customer, Item item){
        this.customer = customer;
        addOrderItem(item);
    }

    public void addOrderItem(Item item){
        //discount.checkForDiscount(1);
        this.orderItems.add(item);
    }

    @Override
    public void performSale(Order order) {
        for (Item orderItem : order.orderItems){
            total += orderItem.price.intValue();
        }
    }
}
