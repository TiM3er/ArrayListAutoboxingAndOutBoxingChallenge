package com.company;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank();

	bank.addNewBranche("testBranch");
	bank.addNewCustomerToBranch(0,"test");
    bank.addNewCustomerToBranch(0,"test");

    bank.addTransactionToBranch(0,"test",100);
    bank.addNewCustomerToBranch(0,"test2");
    bank.addTransactionToBranch(0,"test2",100);
    bank.addTransactionToBranch(0,"test2",200);
    bank.addTransactionToBranch(0,"test",300);
	bank.showAllBranchCustomersAndTransaction();
	bank.finalazeBranch();
    bank.showAllBranchCustomersAndTransaction();
    }
}
