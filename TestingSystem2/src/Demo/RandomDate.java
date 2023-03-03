package Demo;

import java.util.Random;
import java.time.LocalDate;

public class RandomDate {
    public static void main(String[] args) {
        Random random = new Random();
        int minDate = (int) LocalDate.of(2010, 1, 1).toEpochDay();
        int maxDate = (int) LocalDate.now().toEpochDay();
        long randomLong = minDate + random.nextInt(maxDate - minDate);
        LocalDate randomDate = LocalDate.ofEpochDay(randomLong);
        System.out.println(randomDate);
    }
}

