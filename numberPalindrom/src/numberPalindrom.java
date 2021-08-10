public class numberPalindrom {
    public static boolean isPalindrome(int number){
        int reminder = 0;
        int startNumber = number;
        int finalNumber = 0;
        while(number > 0 || number <0){
            reminder = number%10;
            number = number /10;
            finalNumber =(finalNumber *10) + reminder;
        }
        if(startNumber == finalNumber){
            return true;
        }else {
            return false;
        }


    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));

    }
}
