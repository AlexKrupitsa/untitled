package Homework_2;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Task_2_2 {
    public static void main(String[] args) {

        int count = 3;
        String rightAnswer = "six";
        String sos = "sos";

        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "How old are you? You have 3 attempts to answer. Or you can give up by typing sos!");

        for (int i = 1; i <= count; i++) {
            String userAnswer = scanner.next();
            if (rightAnswer.equals(userAnswer)) {
                System.out.println("You are right");
                break;
            } else if (userAnswer.equals(sos)) {
                System.out.println("Don't give up!");
                break;
            } else {
                System.out.println("Wrong! It was your " + i + " of " + count + " attempt!");
            }
        }
        }
    }