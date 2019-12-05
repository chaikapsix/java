public class Main {
    public static void main(String[] args) {
        //Fn = Fn-1 + Fn-2
        int repetition = 10;
        int Fn1 = 0;
        int Fn2 = 1;
        for(int Counter_Fibonacci = 0; Counter_Fibonacci < repetition; Counter_Fibonacci++) {
            Fn1 += Fn2;
            Fn2 = Fn1 - Fn2;
            System.out.println(Fn2);
        }
        int Factorial = 1;
        int Num_Factorial = 6;
        for(int Counter_Factorial = 1; Counter_Factorial <= Num_Factorial; Counter_Factorial++) {
            Factorial *= Counter_Factorial;
        }
        System.out.println("Факториал от " + Num_Factorial + " = " + Factorial);
    }
}
