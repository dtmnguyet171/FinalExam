package Assignment;

public class Exercise3 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }
    public static void question1(){
        Integer salary = new Integer(5000);
        float salary1 = (float) salary;
        System.out.println(salary1);
    }
    public static void question2(){
        String string = "12345";
        int string1 = Integer.valueOf(string);
        System.out.println(string1);
    }
    public static void question3(){
        Integer a = 12345;
        int a1 = a.intValue();
        System.out.println(a1);
    }
}
