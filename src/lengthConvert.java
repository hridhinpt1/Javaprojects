public class lengthConvert {
    public static double calcFeetAndInchesToCentimeter(double feet, double inches){
        if(feet <0 || inches <0 || inches <=12){
            System.out.println("Invalid Out");
            return -1;
        }else {
            return feet * 30.48 + inches * 2.54;
        }

    }
    public static double calcFeetAndInchesToCentimeter(int inches){
        if(inches <=0){
            System.out.println("Invalid out");
            return -1;
        }else{
            return inches/0.083;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeter(6,-10));

    }
}
