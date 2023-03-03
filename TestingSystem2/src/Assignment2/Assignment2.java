package Assignment2;

import Assignment.PositionName;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) throws ParseException {
// EXERCISE 3: DATE FORMAT
        System.out.println("DATE FORMAT");
    // Question 1
        // ------------Khoi tao gia tri cho Exam----------------
        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = "A02";
        exam1.title = "Exam 1";
        exam1.duration = 90;
        exam1.createDate = new Date();

        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = "A01";
        exam2.title = "Exam 2";
        exam2.duration = 120;
        exam2.createDate = new Date();

        Exam exam3 = new Exam();
        exam3.examId = 3;
        exam3.code = "A03";
        exam3.title = "Exam 3";
        exam3.duration = 90;
        exam3.createDate = new Date("2023/01/09");
        // -----------------------------------------------------
        System.out.println("Question 1");
        Locale locale = new Locale("vn", "VN");
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
        System.out.println("Thông tin exam thứ nhất:");
        System.out.println("Exam Id: " + exam1.examId);
        System.out.println("Code: " + exam1.code);
        System.out.println("Title: " + exam1.title);
        System.out.println("Duration: " + exam1.duration);
        System.out.println("Create Date: " + dateFormat.format(exam1.createDate));
        System.out.println("\n");

    // Question 2
        System.out.println("Question 2");
        Exam[] arrExam = {exam1, exam2, exam3};
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Exam exam : arrExam) {
            System.out.println("Exam " + exam.examId + " đã tạo ngày: " + dateFormat1.format(exam.createDate));
        }
        System.out.println("\n");

    // Question 3
        System.out.println("Question 3");
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy");
        for (Exam exam : arrExam) {
            System.out.println("Exam " + exam.examId + " đã tạo ngày: " + dateFormat2.format(exam.createDate));
        }
        System.out.println("\n");

    // Question 4
        System.out.println("Question 4");
        DateFormat dateFormat3 = new SimpleDateFormat("yyyy-MM");
        for (Exam exam : arrExam) {
            System.out.println("Exam " + exam.examId + " đã tạo ngày: " + dateFormat3.format(exam.createDate));
        }
        System.out.println("\n");

    // Question 5
        System.out.println("Question 5");
        DateFormat dateFormat4 = new SimpleDateFormat("MM-dd");
        for (Exam exam : arrExam) {
            System.out.println("Exam " + exam.examId + " đã tạo ngày: " + dateFormat4.format(exam.createDate));
        }
        System.out.println("\n");

// RANDOM NUMBER
    System.out.println("RANDOM NUMBER");
    Random random = new Random();
    // Question 1
        System.out.println("Question 1");
        int a = random.nextInt();
        System.out.println(a);
        System.out.println("\n");

    // Question 2
        System.out.println("Question 2");
        float b = random.nextFloat();
        System.out.println(b);
        System.out.println("\n");

    // Question 3
        System.out.println("Question 3");
        String[] arrName = {"Đỗ Thị Minh Nguyệt", "Hồ Thị Hòa", "Mai Thị Hồng"};
        int c = random.nextInt(arrName.length);
        System.out.println(arrName[c]);
        System.out.println("\n");

    // Question 4
        System.out.println("Question 4");
        int minDate = (int) LocalDate.of(1995, 07, 24).toEpochDay();
        int maxDate = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomLong = minDate + random.nextInt(maxDate - minDate);
        LocalDate randomDate = LocalDate.ofEpochDay(randomLong);
        System.out.println(randomDate);
        System.out.println("\n");

    // Question 5
        System.out.println("Question 5");
        int maxDate1 = (int) LocalDate.now().toEpochDay();
        long randomLong1 =  maxDate1 - random.nextInt(365);
        LocalDate randomDate1 = LocalDate.ofEpochDay(randomLong1);
        System.out.println(randomDate1);
        System.out.println("\n");

    // Question 6
        System.out.println("Question 6");
        long randomLong2 = random.nextInt(maxDate1);
        LocalDate randomDate2 = LocalDate.ofEpochDay(randomLong2);
        System.out.println(randomDate2);
        System.out.println("\n");
    // Question 7
        System.out.println("Question 7");
        int d = random.nextInt(900) +100;
        System.out.println(d);
        System.out.println("\n");

//// INPUT FROM CONSOLE
//    System.out.println("INPUT FROM CONSOLE");
//    Scanner scanner = new Scanner(System.in);
//    // Question 1
//        System.out.println("Question 1");
//        System.out.println("Nhập vào số nguyên thứ nhất");
//        int inputInt1 = scanner.nextInt();
//        System.out.println("Nhập vào số nguyên thứ hai");
//        int inputInt2 = scanner.nextInt();
//        System.out.println("Nhập vào số nguyên thứ ba");
//        int inputInt3 = scanner.nextInt();
//        System.out.println("Bạn vừa nhập vào các số: " + inputInt1 +", " + inputInt2+", " + inputInt3);
//
//    // Question 2
//        System.out.println("Question 2");
//        System.out.println("Nhập vào số thực thứ nhất:");
//        float inputFloat1 = scanner.nextFloat();
//        System.out.println("Nhập vào số thực thứ hai:");
//        float inputFloat2 = scanner.nextFloat();
//        System.out.println("Bạn vừa nhập vào các số: " + inputFloat1 + ", " + inputFloat2);
//
//    // Question 3
//        System.out.println("Question 3");
//        System.out.println("Nhập vào họ:");
//        String lastName = scanner.nextLine();
//        System.out.println("Nhập vào tên:");
//        String firstName = scanner.nextLine();
//        System.out.println("Họ tên vừa nhập là: " + lastName + " " + firstName);
//
//    // Question 4
//        System.out.println("Question 4");
//        System.out.println("Nhập vào ngày sinh của bạn: ");
//        String inputDate = scanner.nextLine();
//        DateFormat dateFormat5 = new SimpleDateFormat("yyyy-MM-dd");
//        Date birthDate = dateFormat5.parse(inputDate);
//        System.out.println("Ngày sinh của bạn là: " + birthDate);
//
//    // Question 5
//        System.out.println("Question 5");
//        position();
//
//    // Question 6
//        System.out.println("Question 6");
//        department();
////    // Question 7
////        System.out.println("Question 7");
////        while (true) {
////            System.out.println("Hãy nhập vào 1 số chẵn: ");
////            int number = scanner.nextInt();
////            if (number % 2 == 0) {
////                System.out.println("Số chẵn vừa nhập là: " + number);
////                return;
////            } else {
////                System.out.println("Đây không phải là số chẵn");
////            }
////        }
//    // Question 8
//        System.out.println("Question 8");
//        while (true) {
//            System.out.println("Mời bạn nhập vào chức năng muốn sử dụng");
//            int choice = scanner.nextInt();
//            if (choice == 1 || choice == 2){
//                if (choice == 1){
//                    position();
//                    break;
//                } else {
//                    department();
//                    break;
//                }
//            } else{
//                System.out.println("Mời bạn nhập lại");
//            }
//        }
    // Question 9
    // Question 10
    // Question 11
// METHOD
    System.out.println("METHOD");
    // Question 1
        System.out.println("Question 1");
        question1();
        System.out.println("\n");

    // Question 2
        System.out.println("Question 2");
        question2();
        System.out.println("\n");

    // Question 3
        System.out.println("Question 3");
        question3();
        System.out.println("\n");
    }
    public static void position () throws ParseException {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();
        System.out.println("Nhập vào AccountId: ");
        account.accountId = scanner.nextInt();
        System.out.println("Nhập vào Email: ");
        account.email = scanner.nextLine();
        System.out.println("Nhập vào Username: ");
        account.username = scanner.nextLine();
        System.out.println("Nhập vào FullName: ");
        account.fullName = scanner.nextLine();
        System.out.println("Nhập vào CreateDate: ");
        String dateString = scanner.nextLine();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date createDate = dateFormat.parse(dateString);
        account.createDate = createDate;
        System.out.println("Nhập vào Position Id: ");
        int positionId = scanner.nextInt();
        switch (positionId) {
            case 1:
                Position position1 = new Position();
                position1.positionName = PositionName.DEV;
                account.position = position1;
                break;
            case 2:
                Position position2 = new Position();
                position2.positionName = PositionName.TEST;
                account.position = position2;
                break;
            case 3:
                Position position3 = new Position();
                position3.positionName = PositionName.SCRUM_MASTER;
                account.position = position3;
                break;
            case 4:
                Position position4 = new Position();
                position4.positionName = PositionName.PM;
                account.position = position4;
                break;
        }
        System.out.println("Thông tin Account vừa nhập là: ");
        System.out.println("Email: " + account.email);
        System.out.println("Username: " + account.username);
        System.out.println("Fullname: " + account.fullName);
        System.out.println("CreateDate: " + account.createDate);
        System.out.println("Postion Name: " + account.position.positionName);
        System.out.println("\n");
    }
    public static void department(){
        Scanner scanner = new Scanner(System.in);
        Department department = new Department();
        System.out.println("Nhập vào DepartmentId: ");
        department.departmentId = scanner.nextInt();
        System.out.println("Nhập vào DepartmentName: ");
        department.departmentName = scanner.next();
        System.out.println("Thông tin Department vừa nhập là: ");
        System.out.println("DepartmentId: " + department.departmentId);
        System.out.println("DepartmentName: " + department.departmentName);
    }
    public static void question1(){
        for (int i =1; i<10; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
    public static void question2(){
        Account account1 = new Account();
        account1.accountId = 1;
        account1.email = "acc1@gmail.com";
        account1.username = "user1";
        account1.fullName = "User 1";
        account1.createDate = new Date();

        Account account2 = new Account();
        account2.accountId = 2;
        account2.email = "acc2@gmail.com";
        account2.username = "user2";
        account2.fullName = "User 2";
        account2.createDate = new Date();

        Account[] arrAccount = {account1,account2};
        for (Account account : arrAccount) {
            System.out.println("Thông tin của Account thứ " + account.accountId + " là: ");
            System.out.println("Email: " + account.email);
            System.out.println("Username: " + account.username);
            System.out.println("Full name: " + account.fullName);
            System.out.println("CreateDate: " + account.createDate);
            System.out.println("\n");
        }
    }
    public static void question3(){
        for (int i = 1; i<10; i++){
            System.out.println(i);
        }
    }
}
