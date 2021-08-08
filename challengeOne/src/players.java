public class players {
    public static void main(String args[]){
        displayHighScorePosition("Hridhin","Center back" );
        System.out.println(calculateHighScorePosition(1500));
        int value =0;
        String name = "Hridu";


    }
    public static void displayHighScorePosition(String name, String position){
        System.out.println(name + " manged to get into position" + position +" on the high score table");


    }
    public static int calculateHighScorePosition(int score){
        if (score >1000){
            return 1;

        }else if (score >500 && score <1000){
            return 2;
        }else if (score >100 && score <500){
            return 3;
        }else{
            return 4;
        }

    }
}
