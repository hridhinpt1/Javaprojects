public class factorial {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return (n * factorial(n-1));
    }
    public static void main(String args[]){
        int i,fact=1;
        for(int num =1;num<10;num++){
            int number =num;
            fact = factorial(number);
            System.out.println("factorial of" + " "+number+" "+"is"+" "+fact);
        }

    }
}
