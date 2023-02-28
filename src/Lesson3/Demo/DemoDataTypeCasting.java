package Lesson3.Demo;

public class DemoDataTypeCasting {
    public static void main(String[] args) {
        // Nới rộng (widening)
        int i = 100;
        long l = i;
        float f = l;
        System.out.println("Giá trị Int: "+ i);
        System.out.println("Giá trị Long: "+ l);
        System.out.println("Giá trị Float: " + f);
        // Thu hẹp (narrowing)
        double d = 0.9;
        long l2 = (long) d;
        int i2 = (int) l2;
        System.out.println("Giá trị Double: "+d);
        System.out.println("Giá trị Long: "+l2);
        System.out.println("Giá trị Int: "+i2);

        long l3 = Long.MAX_VALUE;
        int i3 = (int) l3;
        System.out.println(l3);
        System.out.println(i3);
    }
}
