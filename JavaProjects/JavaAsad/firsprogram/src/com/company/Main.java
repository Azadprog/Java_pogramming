package com.company;

public class Main {



    public static void main(String[] args) {
    Bankaccount user1 = new Bankaccount("1234", 0.80 , "Bom Brown", "Therimaki@hotmil.com", "98765434)");

        System.out.println(user1.getAccountNr());
        System.out.println(user1.getBalance());

    System.out.println(user1.getName());
    user1.withdrawal(100);
     user1.deposit(50);
     user1.withdrawal(100);

     user1.deposit(51);
     user1.withdrawal(100);

        Bankaccount hackeraccount = new Bankaccount("hackeraccount", "hackemyass@hotmail.com","12345" );
        System.out.println(hackeraccount.getPhoneNr() + " name " + hackeraccount.getName());


        Vip Azad = new Vip("Azadkillaz", 23435675, "myemail@hotmail.com");
        System.out.println( "Limit " + Azad.getVipCreditLimit() + " Name " + Azad.getVipName() + " Email " + Azad.getVipEmail() );


    }
}
