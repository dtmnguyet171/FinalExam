package Assignment;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        question8();
//        question9();
//        question10();
//        question11();
//        question12();
        question13();
        question14();
        question15();
        question16();
    }
    public static void question1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String string = scanner.nextLine();
        System.out.println("Số ký tự là: " + string.length());
    }
    public static void question2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ nhất:");
        String s1 = scanner.nextLine();
        System.out.println("Nhập vào chuỗi thứ hai:");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));
    }
    public static void question3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        String firstChar = String.valueOf(name.charAt(0)).toUpperCase();
        String remain = name.substring(1);
        System.out.println(firstChar + remain);
    }
    public static void question4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tên:");
        String name = scanner.nextLine();
        for (int i=0; i<name.length(); i++){
            String character = String.valueOf(name.charAt(i)).toUpperCase();
            System.out.println("Ký tự thứ " + (i+1) + " là: " + character);
        }
    }
    public static void question5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ:");
        String lastName = scanner.nextLine();
        System.out.println("Nhập vào tên:");
        String firstName = scanner.nextLine();
        System.out.println(lastName + " " + firstName);
    }
    public static void question6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên:");
        String fullName = scanner.nextLine();
        String[] words = fullName.split(" ");
        String lastName = words[0];
        String firstName = words[words.length - 1];
        String remain = " ";
        for (int i = 1; i <= words.length - 2; i++) {
            remain += words[i] + " ";
        }
        System.out.println("Họ là: " + lastName);
        System.out.println("Tên đệm là: " + remain);
        System.out.println("Tên là: " + firstName);
    }
    public static void question7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên: ");
        String name = scanner.nextLine();
        String name1 = name.trim();
        String name2 = name1.replaceAll("\\s+"," ");
        String[] words = name2.split(" ");
        String fullName = "";
        for (int i=0; i< words.length; i++){
            String firstChar = String.valueOf(words[i].charAt(0));
            String remain = words[i].substring(1);
            String word = firstChar.toUpperCase() + remain;
            fullName += word + " ";
        }
        System.out.println("Họ tên sau khi chuẩn hóa là: "+fullName);
    }
    public static void question8(){
        String[] groupName = {"Java", ".NET", "Java hihi"};
        for (String name : groupName){
            if(name.contains("Java")){
                System.out.println(name);
            }
        }
    }
    public static void question9(){
        String[] groupName = {"Java", ".NET", "Java hihi"};
        for (String name : groupName){
            if(name.equals("Java")){
                System.out.println(name);
            }
        }
    }
    public static void question10(){
        String s1 = "OK";
        String s2 = "O";
        String reverse = "";
        for (int i = s1.length() - 1; i >= 0; i--){
            String a = String.valueOf(s1.charAt(i));
            reverse += a;
        }
        if (s2.equals(reverse)){
            System.out.println("Đây là chuỗi đảo ngược");
        } else {
            System.out.println("Đây không phải là chuỗi đảo ngược");
        }
    }
    public static void question11(){
        String string = "java";
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            String ch = String.valueOf(string.charAt(i));
            if (ch.equals("a")){
                count = count + 1;
            }
        }
        System.out.println("Số lần xuất hiện ký tự a là:" + count);
    }
    public static void question12(){
        String string = "OK";
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--){
            String a = String.valueOf(string.charAt(i));
            reverse += a;
        }
        System.out.println(reverse);
    }
    public static void question13(){
        String string = "abc";
        for (int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
            if (checkNumber(ch)){
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
    public static boolean checkNumber(char ch){
        if ((ch >= '0') && (ch <= '9')){
            return true;
        } else {
            return false;
        }
    }
    public static void question14(){
        String string = "VTI Academy";
        String replaceString = string.replace("e","*");
        System.out.println(replaceString);
    }
    public static void question15(){
        String string = "Đỗ Thị Minh Nguyệt";
        String[] words = string.split(" ");
        String reverse = "";
        for (int i = (words.length-1); i >=0; i--){
            String word = words[i];
            reverse += word + " ";
        }
        System.out.println(reverse);
    }
    public static void question16(){
        String string = "Railway66";
        int n = 3;
        if (string.length()%n!=0){
            System.out.println("KO");
        } else {
            for (int i = 0; i < string.length(); i += n) {
                System.out.println(string.substring(i, (i + n)));
            }
        }
    }
}
