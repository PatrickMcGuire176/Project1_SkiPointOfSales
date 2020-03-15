package com.company;
import java.math.BigDecimal;

abstract class Item<T> {
    //Price of the item
    public BigDecimal price;
    //Manufacturer of item
    private String manufacturer;

    abstract void setPrice(BigDecimal price);
    abstract void setManufacturer(BigDecimal price);

    public Item(BigDecimal price, String manufacturer){
        this.price = price;
        this.manufacturer = manufacturer;
    }

}
