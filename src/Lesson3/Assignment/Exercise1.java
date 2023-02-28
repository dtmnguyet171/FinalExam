package Lesson3.Assignment;


import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
    }

    public static void question1() {
        float salary1;
        float salary2;
        salary1 = (float) 5240.5;
        salary2 = (float) 10970.055;
        int roundSalary1 = (int) salary1;
        int roundSalary2 = (int) salary2;
        System.out.println("Lương của Account 1 sau khi làm tròn là: " + roundSalary1);
        System.out.println("Lương của Account 2 sau khi làm tròn là: " + roundSalary2);
    }

    public static void question2() {
        Random random = new Random();
        int number = random.nextInt(90000);
        if (number < 10) {
            String number1 = (String) ("0000"+number);
            System.out.println(number1);
        } else if (number < 100) {
            String number1 = (String) ("000"+number);
            System.out.println(number1);
        } else if (number < 1000) {
            String number1 = (String) ("00"+number);
            System.out.println(number1);
        } else if (number < 10000) {
            String number1 = (String) ("0"+number);
            System.out.println(number1);
        } else {
            String number1 = (String) (""+number);
            System.out.println(number1);
        }
    }

    public static void question3() {
        Random random = new Random();
        int number = random.nextInt(90000);
        if (number < 10) {
            String number1 = (String) ("0000"+number);
            System.out.println("Hai chữ số cuối là: "+ number1.substring(3));
        } else if (number < 100) {
            String number1 = (String) ("000"+number);
            System.out.println("Hai chữ số cuối là: "+ number1.substring(3));
        } else if (number < 1000) {
            String number1 = (String) ("00"+number);
            System.out.println("Hai chữ số cuối là: "+ number1.substring(3));
        } else if (number < 10000) {
            String number1 = (String) ("0"+number);
            System.out.println("Hai chữ số cuối là: "+ number1.substring(3));
        } else {
            String number1 = (String) (""+number);
            System.out.println("Hai chữ số cuối là: "+ number1.substring(3));
        }
    }

    public static void question4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập vào b: ");
        int b = scanner.nextInt();
        float result = (float)a/(float)b;
        System.out.println("a/b= " + result);
    }
}
