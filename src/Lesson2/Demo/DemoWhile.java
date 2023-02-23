package Lesson2.Demo;

public class DemoWhile {
    public static void main(String[] args) {
        // Kiểm tra điều kiện trước --> hành động
        int i = 1;
        while (i<5) {
            System.out.println(i);
            i++;
        }
        // do - while: Thực hiện hành động trong đó trước --> kiểm tra điều kiện
        int abc = 0;
        do {
            abc ++;
            System.out.println(abc);
        } while (abc<5);
    }
}
