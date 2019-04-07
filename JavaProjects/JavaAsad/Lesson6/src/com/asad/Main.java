package com.asad;

public class Main {

    public static void main(String[] args) {
	int result  = 1 + 2 ;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;

        result = result -1;
        System.out.println(previousResult + " -1 = " + result);
        previousResult = result;

        result = result * 10;
               System.out.println(previousResult + " * 10 = " + result);
               previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1 ;
        System.out.println("Result is now " + result);
        result++;
        System.out.println("Result is now " + result);
        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);
        result *= 10;
        System.out.println("Result is now " + result);
        result -= 10;
        System.out.println("Result is now " + result);
        result /= 10;
        System.out.println("Result is now " + result);

       boolean isAlien = false;
       if(isAlien == false)
           System.out.println("It it not a Alien");

       int topScore = 80;
       if (topScore < 100);
        System.out.println("you got the topScore");

     int secondTopScore = 81;
     if (topScore > secondTopScore && topScore < 100)
         System.out.println(" Greater then top score");
     if ((topScore > 90) || ( secondTopScore <= 90))
         System.out.println("one of this test should be true");

        boolean isCar = false;
     if (isCar == true)
        System.out.println("Rhis is not suuposed to happen");

     isCar = true;
     boolean wasCar = isCar ? true : false;
     if(wasCar)
         System.out.println("wasCar is true");

     double  doubleValue = 20d;
     double  secondDoubleValue = 80d ;
        double doubleResult = (doubleValue + secondDoubleValue )*  25;
        System.out.println("mytotal =" + doubleResult);
     double doubleSum  =  doubleResult % 40;

     if (doubleSum <= 20)
        System.out.println("Tottal was over the limit");

    }
}
