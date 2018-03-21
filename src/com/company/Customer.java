package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionsArrayList = new ArrayList<Double>();

    public Customer(String name) {
        this.name = name;
    }

    public void showCustomerTransaction()
    {
        System.out.println(name +" transactions: ");
        for(int i =0;i<transactionsArrayList.size();i++)
        {
            System.out.println(transactionsArrayList.get(i));
        }
    }

    public void addTransactionsArrayList(double transacionValue) {
        transactionsArrayList.add(Double.valueOf(transacionValue));
    }

    public String getName() {
        return name;
    }
}
