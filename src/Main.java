import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {


        System.out.println("TASK1" + "\nFirst array");

        int[] massiv = new int[3];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(massiv[i]);
        }


        System.out.println("\nSecond array");

        double[] massiv2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.println(massiv2[i]);
        }


        System.out.println("\nThird array");

        //моё настроение с графиком работы 2/2 по ночам
        int[] myMood = {1, 1, 10, 10};
        for (int i = 0; i < 4; i++) {
            System.out.println(myMood[i]);
        }
    }

    public static void task2() {


        System.out.println("\nTASK2" + "\nFirst array");

        int[] massiv = new int[3];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        System.out.print(massiv[0] + ", " + massiv[1] + ", " + massiv[2]);

        //Второй вариант этого задания

        System.out.println("\n");
        int[] massiv01 = new int[3];
        massiv01[0] = 1;
        massiv01[1] = 2;
        massiv01[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i == massiv01.length - 1) {
                System.out.print(massiv01[i]);
            } else {
                System.out.print(massiv01[i] + ", ");
            }
        }


        System.out.println("\n\nSecond array");

        double[] massiv2 = {1.57, 7.654, 9.986};
        double cell0 = massiv2[0];
        double cell1 = massiv2[1];
        double cell2 = massiv2[2];
        {
            System.out.print(cell0 + " ," + cell1 + " ," + cell2);
        }


        System.out.println("\n\nThird array");


        int[] myMood = {1, 1, 10, 10};
        int number0 = myMood[0];
        int number1 = myMood[1];
        int number2 = myMood[2];
        int number3 = myMood[3];
        for (int i = 0; i < 4; i++)
            if (i == myMood.length - 1) {
                System.out.print(myMood[i]);
            } else {
                System.out.print(myMood[i] + ", ");
            }
    }

    public static void task3() {


        System.out.println("\n\nTASK3" + "\nFirst array");

        //Не уверен, что задание сделал правильно, но в консоль выводится то, что требуется :/

        int[] massiv = new int[3];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        for (int i = 2; i >= 0; i--) {
            if (i == massiv.length - 3) {
                System.out.print(massiv[i]);
            } else {
                System.out.print(massiv[i] + ", ");
            }
        }


        System.out.println("\n\nSecond array");

        double[] massiv2 = {1.57, 7.654, 9.986};
        double cell0 = massiv2[0];
        double cell1 = massiv2[1];
        double cell2 = massiv2[2];
        for (int i = 2; i >= 0; i--) {
            if (i == massiv2.length - 3) {
                System.out.print(massiv2[i]);
            } else {
                System.out.print(massiv2[i] + ", ");
            }
        }


        System.out.println("\n\nThird array");

        int[] myMood = {1, 1, 10, 10};
        int number0 = myMood[0];
        int number1 = myMood[1];
        int number2 = myMood[2];
        int number3 = myMood[3];
        for (int i = 3; i >= 0; i--) {
            if (i == myMood.length - 4) {
                System.out.print(myMood[i]);
            } else {
                System.out.print(myMood[i] + ", ");
            }
        }
    }

    public static void task4() {

        System.out.println("\n\nTASK4" + "\nFirst array");

        int[] massiv = new int[3];
        massiv[0] = 1;
        massiv[1] = 2;
        massiv[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (massiv[i] % 2 ==0){
                System.out.println(massiv[i] + 1);
            }else {
                System.out.println(massiv[i]);
        }
    }
}}

