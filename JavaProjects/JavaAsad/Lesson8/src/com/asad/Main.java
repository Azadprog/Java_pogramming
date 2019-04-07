package com.asad;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("your score was  less than 5000 but greater then 1000");
//        } else if (score < 1000) {
//
//            System.out.println("Your Score was less than 1000");
//        } else {
//
//            System.out.println("Got here");

            if (gameOver ) {

                int finalScore = score + (levelCompleted * bonus ) ;
                System.out.println("Your final score was " + finalScore);

            }


            if ( gameOver == true ) {
                score += 9200  ;
                levelCompleted += 3;
                bonus += 100;
                int secondFinalScore = score + (levelCompleted * bonus );

                System.out.println("Your secondFinalScore was " +  secondFinalScore );
            }

    }
}
