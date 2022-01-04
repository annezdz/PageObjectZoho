package firstSteps;

public class CodeBlocks {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(true, 1000, 8, 200);
        System.out.println("Your final score was " + highScore);

        displayHighScorePosition("Anne", 10);
        int res1 = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",res1);
        int res2 = calculateHighScorePosition(900);
        displayHighScorePosition("Ana",res2);
        int res3 = calculateHighScorePosition(400);
        displayHighScorePosition("Dudu",res3);
        int res4 = calculateHighScorePosition(50);
        displayHighScorePosition("Eduardo",res4);
        int res5 = calculateHighScorePosition(1000);
        displayHighScorePosition("Peppa",res5);



    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position in the high score table " + position + " on the " +
                "high score table. ");
    }

    public static int calculateHighScorePosition(int score){
//        if(score >= 1000){
//            return 1;
//        }else if (score >= 500){
//            return 2;
//        }else if(score >= 100){
//            return 3;
//        }else{
//            return 4;
//        }
        int position = 4;
        if(score >= 1000){
            position = 1;
        }
        else if(score >= 500){
            position = 2;
        }
        else if(score >= 100){
            position = 3;
        }
        return position;
    }
}
