package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionsArrayList = new ArrayList<Double>();
    private double accauntBalance;

    public Customer(String name) {
        this.name = name;
        this.accauntBalance = 0;
    }

    public void showCustomerTransaction()
    {
        System.out.println(name +" transactions: ");
        for(int i =0;i<transactionsArrayList.size();i++)
        {
            System.out.println(transactionsArrayList.get(i));
        }
        System.out.println("account balance" + accauntBalance);
    }

    public void addTransactionsArrayList(double transacionValue) {
        transactionsArrayList.add(Double.valueOf(transacionValue));
    }

    public String getName() {
        return name;
    }
    public void finalazeTransaction()
    {
        for(int i =0;i<transactionsArrayList.size();i++)
        {
            accauntBalance += transactionsArrayList.get(i);
        }
    }
}
