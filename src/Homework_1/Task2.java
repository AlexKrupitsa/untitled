package Homework_1;

public class Task2 {
    public static void main(String[] args){
         int A = -100;
        //int A = Integer.parseInt(args[0]);
        int B = 100;
        // int B = Integer.parseInt(args[1]);
         int num = 200;
        // int num = Integer.parseInt(args[2]);

        if(num<A){
            System.out.println("Число в диапазоне до " + A);
        } else if (num<B){
            System.out.println("Число в диапазоне от " + A + " до " + B);
        } else {
            System.out.println("Число больше либо равно " + B);
        }
    }
}


// также можно вводить числа через терминал
