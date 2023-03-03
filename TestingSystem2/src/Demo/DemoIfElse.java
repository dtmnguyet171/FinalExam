package Demo;

public class DemoIfElse {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;
//        if (x>y) {
//            System.out.println("X is greater");
//        } else if (y>x) {
//            System.out.println("Y is greater");
//        } else {
//            System.out.println("Both the mumbers are equal");
//        }
        String text = "";
        text = (x>y) ? "X là số lớn hơn" : "Các trường hợp còn lại";
        System.out.println(text);
    }
}
