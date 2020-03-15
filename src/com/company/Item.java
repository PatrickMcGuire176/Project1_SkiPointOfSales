package com.company;
import java.math.BigDecimal;

abstract class Item {
    public BigDecimal price;
    private String manufacturer;

    public Item(BigDecimal price, String manufacturer){
        this.price = price;
        this.manufacturer = manufacturer;
    }

}
