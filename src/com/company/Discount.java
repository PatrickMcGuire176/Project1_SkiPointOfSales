package com.company;

import java.math.BigDecimal;

public class Discount {
    Item item;

    public void createDiscount() {
    }

    public BigDecimal getDiscount(int itemId) {
        DatabaseManager<BigDecimal> databaseManager = new DatabaseManager<>();
        StringBuilder stringBuilder = new StringBuilder("select top 1 discount.price")
                .append(System.getProperty("line.separator"))
                .append("from discount")
                .append(System.getProperty("line.separator"))
                .append("join item")
                .append(System.getProperty("line.separator"))
                .append("on discount.ItemId  = Item.ItemId")
                .append(System.getProperty("line.separator"))
                .append("where discount.EndDate > SYSDATETIME()")
                .append(System.getProperty("line.separator"))
                .append("and discount.StartDate < SYSDATETIME()")
                .append(System.getProperty("line.separator"))
                .append("order by item.price - discount.price desc")
                .append(System.getProperty("line.separator"));

        BigDecimal result = databaseManager.runGenericQuery(stringBuilder, BigDecimal.class);
        return result;
    }

    static boolean checkForDiscountWithName(String name) {
        return true;
    }

    public void getDiscount() {
    }
}
