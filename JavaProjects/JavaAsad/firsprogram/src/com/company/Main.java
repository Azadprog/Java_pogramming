package com.company;

public class Main {

    public static void main(String[] args) {



    Bankaccount user1 = new Bankaccount();
    user1.setName("hacker");
    user1.setAccountNr("1234");
    user1.setEmail("hacker@hotmal.com");
    user1.setPhoneNr("98785463");
    user1.setBalance(5000);

        System.out.println(user1.getName());
    user1.withdrawal(100);
     user1.deposit(50);
     user1.withdrawal(100);

     user1.deposit(51);
     user1.withdrawal(100);

    }
}
