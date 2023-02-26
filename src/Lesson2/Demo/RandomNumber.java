package Lesson2.Demo;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int maxValue = 5000;
        // Random từ 0 đến maxValue
        int x = random.nextInt(maxValue);
        System.out.println(x);
    }
}
