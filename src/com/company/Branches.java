package com.company;

import java.util.ArrayList;

public class Branches {
    public String getBranchName() {
        return BranchName;
    }

    private ArrayList<Customer> customerArrayListInBranche = new ArrayList<Customer>();
    private  String BranchName;

    public Branches(String branchName) {
        BranchName = branchName;
        System.out.println("Create new branches");
    }



    public void addCustometForBranche(String name)
    {
        if(!isCustumeInThisBranch(name))
        {
            customerArrayListInBranche.add(new Customer(name));
            System.out.println("Customer add");

        }
        else
        {
            System.out.println("Customer already exist");
        }
    }
    private boolean isCustumeInThisBranch(String name)
    {
        for(int i = 0;i<customerArrayListInBranche.size();i++)
        {
            Customer customer = customerArrayListInBranche.get(i);
            if (customer.getName().equals(name))
            {
                return true;
            }
        }
        return false;
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
    public void finalazeAllCustomersInBranchTransaction()
    {
        for(int i = 0 ;i<customerArrayListInBranche.size(); i++)
        {
            Customer customer = customerArrayListInBranche.get(i);
            customer.finalazeTransaction();
        }
    }
}
