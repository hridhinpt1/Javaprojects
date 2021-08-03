public class score {
    public static void main (String args []){
        int output=calculateScore(true,1000,8,200);
        System.out.println("Output is :"+output);



    }

    public static int calculateScore(boolean gameOn, int score, int level, int bonus) {
        if (gameOn){
            int totalScore = score + (level * bonus);
            return totalScore;
        }
        else {
            return -1;
        }
    }

}
