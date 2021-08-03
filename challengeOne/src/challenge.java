public class challenge {
    public static void main (String args []){
        double variableOne = 20.00d;
        double variableTwo = 80.00d;
        double variableSum = (variableOne +variableTwo)*100;
        double variableReminder = variableSum % 40.00d;
        boolean variableTrue =(variableReminder == 0)?true:false;
        System.out.println("Boolean variable is " + variableTrue);
        if(!variableTrue){
            System.out.println("Got some reminder:"+variableReminder );
        }

    }
}
