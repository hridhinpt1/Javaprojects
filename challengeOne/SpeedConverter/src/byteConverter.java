public class byteConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else if((kiloBytes == 0) || (kiloBytes > 0)){
            int MB = kiloBytes/1024;
            int KB = kiloBytes - MB * 1024;
            System.out.println(kiloBytes + " KB = "+ MB +" MB"+" and "+KB+"KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(0);
    }

}
