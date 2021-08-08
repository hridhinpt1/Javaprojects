public class SpeedConverter {
    public static void main(String[] args) {
        double result = toMilesPerHour(10.25);
        System.out.println(result);




    }
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        else {
            return Math.round(kilometersPerHour/1.6090);
        }

    }
    public static void printConversion(double kilometerPerHour){
        if (kilometerPerHour <0){
            System.out.println("Invalid Value");
        }else
            System.out.println(kilometerPerHour+"km/h ="+toMilesPerHour(kilometerPerHour)+"mi/h");


    }

}
