package Homework_3;

import java.util.concurrent.ThreadLocalRandom;

public class Task_3_2 {
       public static void main(String[] args) {

        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        StringBuilder stringBuilder = new StringBuilder();
        int min = 0, max = 1000;
        String regex = "\\s\\d{2}\\s";

        for (int i = 0; i < 100; i++) {
            int randInteger = localRandom.nextInt(min, max);
            stringBuilder.append(" ").append(randInteger);
        }

           System.out.println(stringBuilder);   // для проверки оставил эту строку

        System.out.println(stringBuilder.toString().replaceAll((regex)," -1 "));
    }
}

