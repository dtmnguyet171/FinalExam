package Demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DemoDate {
    public static void main(String[] args) {
        // Định dạng theo pattern
        Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String stringDate = dateFormat.format(date);
        System.out.println(stringDate);
        // Định dạng theo khu vực
        Locale locale = new Locale("v1", "VN");
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        String stringDate2 = dateFormat1.format(date);
        System.out.println(stringDate2);

    }
}
