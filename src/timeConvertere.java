public class timeConvertere {
    public static String getDurationString(int minutes, int seconds){
        if(minutes <=0 || seconds <=0 || seconds >=60){
            return ("Invalid");
        }
        int hours = minutes/60;
        int minute =minutes %60;
        int sec = seconds;
        String result = hours + " hours "+ minute +" mintes "+ sec + " seconds ";
        return result;

    }
    public static void getDurationString( int seconds){
        if (seconds <= 0){
            System.out.println("Invalid");
        }else{
            int min = seconds/60;
            System.out.println("Minutes Calculated :"+ min);
            String passedResult = getDurationString(min,seconds);
            System.out.println("Passed result "+ passedResult);

        }

    }

    public static void main(String[] args) {
        System.out.println(getDurationString(61,1));

        getDurationString(219601);
    }
}
