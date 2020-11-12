package Homework_3;

import java.util.concurrent.ThreadLocalRandom;

public class Task_3_1 {
    /*public static void main(String[] args) {

        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        StringBuilder stringBuilder = new StringBuilder();
        int min = 0, max = 1000;

        for (int i = 0; i < 100; i++) {
            int randInteger = localRandom.nextInt(min, max);
            stringBuilder.append(" ").append(randInteger);
        }
        System.out.println(stringBuilder);
    }
}*/

    public static void main(String[] args) {

        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        String resultString = "";

        int min = 0, max = 1000;

        for (int i = 0; i < 100; i++) {
            int randInteger = localRandom.nextInt(min, max);
            resultString += " " + randInteger;
        }
        System.out.println(resultString);
    }
}