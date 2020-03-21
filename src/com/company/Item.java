package com.company;
import java.math.BigDecimal;

abstract class Item {
    BigDecimal price;
    private String manufacturer;
    private final int itemId;

    public Item(BigDecimal price, String manufacturer){
        this.price = price;
        this.manufacturer = manufacturer;
        this.itemId = (int) Math.random();
    }

    public void test(){};




}
