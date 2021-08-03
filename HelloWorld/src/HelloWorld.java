class HelloWorld{
    public static void main (String[] args){
        int finalNumber = 10;
        ;

        for(int start =1; start <=finalNumber;start++){
            int factorial = 1;
            int find = start;
            for(int i = 1;i<= find;i++){
                factorial *= i;
            }
            System.out.println("Factorial of"+" "+ start+" " +"is"+" "+ factorial);
        }

    }
}