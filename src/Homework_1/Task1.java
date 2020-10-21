package Homework_1;

public class Task1 {
    public static void main(String[] args) {

      /*  if (args.length == 0) {
            System.out.println("no args");
            return;
        }
        int day = Integer.parseInt(args[0]);
        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("nothing");
                break;
        }*/
int date = 4;
        if(date == 1){
            System.out.println("Заданное число соответствует Monday");
        } else if (date == 2) {
            System.out.println("Заданное число соответствует Tuesday");
        } else if (date == 3) {
            System.out.println("Заданное число соответствует Wednesday");
        } else if (date == 4) {
            System.out.println("Заданное число соответствует Thursday");
        } else if (date == 5) {
            System.out.println("Заданное число соответствует Friday");
        } else if (date == 6) {
            System.out.println("Заданное число соответствует Saturday");
        } else if (date == 7) {
            System.out.println("Заданное число соответствует Sunday");
        } else {
            System.out.println("Число не соответстуеют ни одному дню недели");
        }
    }

}

/*
1. Первый вариан решил через switch и args
2. Второй вариант через if else
Вариант через switch можно вводить через терминал
 */