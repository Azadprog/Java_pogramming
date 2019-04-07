package com.company;

public class Bankaccount {
    private String accountNr;
    private double balance;
    private String name;
    private String email;
    private String phoneNr;

    //methodes

    public void deposit(double depositAmount){

        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made . now balance is " + this.balance);

      }
  public void withdrawal(double withdrawalAmount){

        if (this.balance - withdrawalAmount < 0) {


            System.out.println("Only " + this.balance + " available  Withdrawal not processed ");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.balance);

        }

  }

    //Setter
    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;

    }

    public void setBalance(double balance) {

        this.balance = balance;

    }

    public void setName(String name) {

        this.name = name;

    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setPhoneNr(String phoneNr) {

        this.phoneNr = phoneNr;
    }

    // getter
    public String getAccountNr() {

        return accountNr;

    }

    ;

    public double getBalance() {

        return balance;

    }

    ;

    public String getName() {

        return name;
    }

    ;

    public String getEmail() {

        return email;

    }

    public String getPhoneNr() {

        return this.phoneNr;

    }

};
