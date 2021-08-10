public class textDigitSum {
    public static int sumDigits(int number){
        int sum =0;
        int reminder = 0;
        if((number >= 0) && (number <9)){
            return -1;
        }else if(number < 0){
            return -1;
        }else {
            while (number >9){
                reminder = number %10;
                number = number/10;
                sum+=reminder;
            }
            sum +=number;
            return sum;
        }

    }

    public static void main(String[] args) {
        System.out.println(sumDigits(0));
    }
}
