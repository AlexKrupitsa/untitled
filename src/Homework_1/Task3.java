package Homework_1;

public class Task3 {
    public static void main(String[] args){
        int A = 28;
        int B = 68;
        int C = 100;
        double sum =0;

        // ищем наибольшее число
        if(A>B) {
            if (A > C) {
                System.out.println("Наибольшее число " + A);
            } else {
                System.out.println("Наибольшее число: " + C);
            }
        }
else {
    if (B>C) {
        System.out.println("Наибольшее число: " + B);
    }
    else {
        System.out.println("Наибольшее число: " + C);
    }
        }

// ищем наименьшее число
        if(A<B) {
            if (A < C) {
                System.out.println("Наименьшее число " + A);
            } else {
                System.out.println("Наименьшее число: " + C);
            }
        }
        else {
            if (B<C) {
                System.out.println("Наименьшее число: " + B);
            }
            else {
                System.out.println("Наименьшее число: " + C);
            }
        }

// ищем среднее арифметическое
        sum = (A+B+C)/3.0;
        System.out.println("Среднее арифметическое: " + sum);

    }
}
