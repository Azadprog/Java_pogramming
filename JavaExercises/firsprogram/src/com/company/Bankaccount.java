package com.company;

public class Bankaccount {
    private String accountNr;
    private int balance;
    private String name;
    private String email;
    private String phoneNr;

    //Setter
    public void setAccountNr(String accountNr) {
        this.accountNr = accountNr;

    }

    public void setBalance(int balance) {

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
    public int getAccountNr() {

        return this.accountNr;

    }

    ;

    public int getBalance() {

        return this.balance;

    }

    ;

    public String getName() {

        return this.name;
    }

    ;

    public String getEmail() {

        return this.email;

    }

    public int getPhoneNr() {

        return this.phoneNr;

    }

    public  int   depositFunds(int balance){

        this.balance= balance;
        balance++;

      return balance;
    };

    public static int  withdrawFunds(){}


};
