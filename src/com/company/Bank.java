package com.company;

import java.util.ArrayList;

public class Bank {
    ArrayList<Branches> branchesArrayList = new ArrayList<Branches>();
    public void addNewBranche(String branchName)
    {
        branchesArrayList.add(new Branches(branchName));
    }
    public void addNewCustomerToBranch(int indexOfBranch, String name)
    {
        if(indexOfBranch<branchesArrayList.size())
        {
            Branches branches = branchesArrayList.get(indexOfBranch);
            branches.addCustometForBranche(name);
        }
    }
    public void addTransactionToBranch(int indexOfBranch,String nameOfCustomer,double transaction)
    {
        if(indexOfBranch<branchesArrayList.size())
        {
            Branches branches = branchesArrayList.get(indexOfBranch);
            branches.addTransactionForCustomer(nameOfCustomer,transaction);
        }
    }
    public void showAllBranchCustomersAndTransaction()
    {
        for(int i =0;i<branchesArrayList.size();i++)
        {
            Branches branches = branchesArrayList.get(i);
            System.out.println("Branch name "+ branches.getBranchName());
            branches.displayCustomersAllTransaction();
        }
    }
    public void finalazeBranch()
    {
        for(int i =0;i<branchesArrayList.size();i++)
        {
            Branches branches = branchesArrayList.get(i);
            branches.finalazeAllCustomersInBranchTransaction();
        }
    }

}
