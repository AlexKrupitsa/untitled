package Homework_3;

import java.util.Scanner;

public class Task_3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please, enter your name");
        String userAnswerName = scanner.next();

        System.out.println("please, enter your age");
        String userAnswerAge = scanner.next();

        String str = String.format("Good morning, %s! %nYou are %s years old.", userAnswerName, userAnswerAge);
        System.out.println(str);
    }
}
