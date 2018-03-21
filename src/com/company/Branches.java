package com.company;

import java.util.ArrayList;

public class Branches {
    ArrayList<Customer> customerArrayListInBranche = new ArrayList<Customer>();
    public void addCustometForBranche(String name)
    {
        customerArrayListInBranche.add(new Customer(name));
    }
    public void displayCustomersAllTransaction()
    {
        for(int i = 0 ;i<customerArrayListInBranche.size(); i++)
        {
            Customer customer = customerArrayListInBranche.get(i);
            customer.showCustomerTransaction();
        }
    }

    public void addTransactionForCustomer(String name,double transaction)
    {
        for(int i = 0 ;i<customerArrayListInBranche.size(); i++)
        {
            Customer customer = customerArrayListInBranche.get(i);
            if(customer.getName().equals(name))
            {
                customer.addTransactionsArrayList(transaction);
            }
        }
    }
}
