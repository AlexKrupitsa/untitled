package Homework_1;

public class Task4 {
    public static void main(String[] args) {
/*double A = 1000;
double B = 1101;*/
int A = Integer.parseInt(args[0]);
int B = Integer.parseInt(args[1]);

if (B<0.9*A || B>1.1*A){
    System.out.println("Czyslo " + B + " za predelami 10% ot "+ A);
}else {
    System.out.println("Czyslo " + B + " v predelah 10% ot "+ A);
}
    }
}

// решение через терминал.