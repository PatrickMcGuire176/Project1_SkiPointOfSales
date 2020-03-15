package com.company;

public class Customer extends Person {
    private final int customerID;

    public Customer(String firstName, String lastName, int CustomerID) {
        super(firstName, lastName);
        this.customerID = CustomerID;
    }
}


