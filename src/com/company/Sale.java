package com.company;

public interface Sale {
    void performSale(Customer customer, Item<? extends Item> item);
}
