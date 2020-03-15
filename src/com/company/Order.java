package com.company;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

//Make static factory method here
class Order implements Sale {

    Customer customer;
    Item item;

    //Store purchase order
    private Map<Item<? extends Item>, BigDecimal> purchaseOrder = new HashMap<>();

    public void purchaseOrder(Map<Item<? extends Item>, BigDecimal> purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
        /*
        for(Map.Entry<Item<? extends Item>, BigDecimal> entry : purchaseOrder.entrySet()){
            purchaseOrder();
        }
        */
    }

    public Order(Customer customer, Item<? extends Item> item){
        this.customer = customer;
        this.item = item;
    }

    @Override
    public void performSale(Customer customer, Item<? extends Item> item) {
    }
}
