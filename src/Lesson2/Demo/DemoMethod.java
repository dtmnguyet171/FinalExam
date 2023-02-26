package Lesson2.Demo;

public class DemoMethod {
    public static void main(String[] args) {
        demoMethod();
        inputMethod(3);
        inputMethod2(1, 2);
        int kq = tinhTong(3,5);
        System.out.println(kq);
    }
    public static void demoMethod(){
        System.out.println("Đây là một method trả về kiểu dữ liệu void");
    }
    public static void inputMethod(int number){
        System.out.println(number);
    }
    public static void inputMethod2(int number, int number2){
        System.out.println(number + ", " + number2);
    }
    public static int tinhTong(int number1, int number2){
        return (number1 + number2);
    }
}
