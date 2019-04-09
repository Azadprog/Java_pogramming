package com.company;

public class Vip {
    private String vipName;
    private double vipCreditLimit;
    private String vipEmail;


    public Vip() {      // First constructor
       this("Default name", 9999, "Defaultemail@hotmail.com");
        System.out.println("This is a First constructor ");

    }




    public Vip(String Name, double CreditLimit) {  //Second constructor
        this (Name, CreditLimit , "mynameiskhan@hotmail.com");
        System.out.println("This is a Second constructor ");
    }

    public Vip(String Name, double CreditLimit, String Email) { // Third Constructor}

        this.vipName = Name;
        this.vipCreditLimit = CreditLimit;
        this.vipEmail = Email;

        System.out.println("This is a Third constructor ");

    }

        // getter
        public String getVipName () {
            return vipName;

        }


        public double getVipCreditLimit () {

            return vipCreditLimit;

        }

        public String getVipEmail () {

            return vipEmail;
        }


    }