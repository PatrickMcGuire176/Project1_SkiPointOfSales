package com.company;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
    	DatabaseManager databaseManager = new DatabaseManager();

    	Item mySki = new Ski(new BigDecimal(100), Ski.Manufacturer.ARMADA,
				new Ski.SkiBuilder().size(174).tipWidth(124).waistWidth(88).tailWidth(109));
	    Customer myCustomer = new Customer("John", "Smith", 123);
	    Order myOrder = new Order(myCustomer, mySki);
		myOrder.performSale(myOrder);
		
    }
}
