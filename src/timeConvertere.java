public class timeConvertere {
    public static String getDurationString(int minutes, int seconds){
        if(minutes <0 || seconds <0 || seconds >=60){
            return ("Invalid");
        }
        int hours = minutes/60;
        int minute =minutes %60;
        return hours + " h "+ minute +" m "+ seconds + " s ";

    }
    public static String getDurationString( int seconds){
        if (seconds < 0){
            return "Invalid";
        }else{
            int minutes = seconds/ 60;
            int sec = seconds % 60;
            return  (getDurationString(minutes,sec));
        }
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));

    }
}
