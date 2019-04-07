package com.asad;

public class Main {

    public static void main(String[] args) {
        // write your code here


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calcualteScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calcualteScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);


        int highScorePosition = calculateHighScorePostion(1500);
        displayHighScorePosition("Asad",highScorePosition);

         highScorePosition = calculateHighScorePostion(900);
        displayHighScorePosition("Gilbert",highScorePosition);

         highScorePosition = calculateHighScorePostion(400);
        displayHighScorePosition("Kevin",highScorePosition);

         highScorePosition = calculateHighScorePostion(50);
        displayHighScorePosition("Adam",highScorePosition);

        highScorePosition = calculateHighScorePostion(10);
        displayHighScorePosition("yasin", highScorePosition);


    }







    public static void  displayHighScorePosition ( String playerName, int highScorePosition ) {

        System.out.println(playerName + " managed to get into position " + highScorePosition + " on high score table ");

    }






    public static  int   calculateHighScorePostion (int playerScore) {

        if (playerScore > 1000) {
            return 1;

        } else if  (playerScore > 500 && playerScore < 1000) {
            return 2;

        } else if ( playerScore >100 && playerScore <500) {
            return 3;

        } else {
            return 4;

//            displayHighScorePosition("Hacker", 1500 );
//            displayHighScorePosition("Hacker", 900 );
//            displayHighScorePosition("Hacker", 400 );
//            displayHighScorePosition("Hacker", 50 );
//            calculateHighScorePostion(1500);
//            calculateHighScorePostion(900);
//            calculateHighScorePostion(400);
//            calculateHighScorePostion(50);
//            return  -1;
        }

    }




    public static int calcualteScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;

            return finalScore;
        }
        return -1;


    }







}

