package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("Your final score was " + highScore);


        score = 10000;
         levelCompleted = 8;
         bonus = 200;

   highScore  = calculateScore(true, 10000,8,200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Asad", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Tester", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Hamid", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Haider", highScorePosition);

        highScorePosition = calculateHighScorePosition(9000);
        displayHighScorePosition("FittePuler", highScorePosition);
			

    }



    public static void displayHighScorePosition( String namePlayer, int  highScorePosition) {

        System.out.println(namePlayer + "You manage to get into position " + highScorePosition + "on the highScore table");
    }



    public  static int calculateHighScorePosition (int playerScore) {
        if (playerScore >= 1000){
            return 1;

        } else if (playerScore >= 500 && playerScore < 1000 ) {
            return 2;

        } else if(playerScore >= 100 && playerScore <500) {
            return 3;

        } else {
            return 4;
        }

    }



    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {




        if(gameOver){
            int finalScore = score + ( levelCompleted * bonus);
            finalScore += 2000;

            return  finalScore;
        }
          return -1;

    }
}

