package Lesson2.Assignment;

import java.util.Date;

public class Program {
    public static void main(String[] args) {

// ----------------------Khoi tao gia tri cho Department-------------------
        Department department1 = new Department();
        department1.departmentId = 1;
        department1.departmentName = "Sale";

        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "Marketing";

        Department department3 = new Department();
        department3.departmentId = 3;
        department3.departmentName = "Finance";

        // -------------Khoi tao gia tri cho Position-------------------------
        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.PM;

        Position position2 = new Position();
        position2.positionId = 2;
        position2.positionName = PositionName.SCRUM_MASTER;

        Position position3 = new Position();
        position3.positionId = 3;
        position3.positionName = PositionName.TEST;

        // ---------------Khoi tao gia tri cho Account---------------------------

        Account account1 = new Account();
        account1.accountId = 1;
        account1.departmentId = department1;
        account1.email = "account1@gmail.com";
        account1.username = "User 1";
        account1.fullName = "Username 1";
        account1.positionId = position3;
        account1.createDate = new Date("2023/01/01");

        Account account2 = new Account();
        account2.accountId = 2;
        account2.departmentId = department2;
        account2.email = "account2@gmail.com";
        account2.username = "User 2";
        account2.fullName = "Username 2";
        account2.positionId = position2;
        account2.createDate = new Date("2022/02/01");

        Account account3 = new Account();
        account3.accountId = 3;
        account3.departmentId = department2;
        account3.email = "account3@gmail.com";
        account3.username = "User 3";
        account3.fullName = "Username 3";
        account3.positionId = position3;
        account3.createDate = new Date();

        // ----------------Khoi tao gia tri cho Group----------------
        Group group1 = new Group();
        group1.groupId = 1;
        group1.groupName = "Group 1";
        group1.creatorId = account1;
        group1.createDate = new Date("2023/03/01");

        Group group2 = new Group();
        group2.groupId = 2;
        group2.groupName = "Group 2";
        group2.creatorId = account2;
        group2.createDate = new Date("2023/02/01");

        Group group3 = new Group();
        group3.groupId = 3;
        group3.groupName = "Group 3";
        group3.creatorId = account3;
        group3.createDate = new Date();

        account2.groups = new Group[] {group1, group2};
        group1.accounts = new Account[] {account1, account2, account3};

        // -------------------Khoi tao gia tri cho GroupAccount-----------------
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.groupId = group1;
        groupAccount1.accountId = account2;
        groupAccount1.joinDate = new Date("2023/03/02");

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.groupId = group1;
        groupAccount2.accountId = account1;
        groupAccount2.joinDate = new Date("2023/03/02");

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.groupId = group3;
        groupAccount3.accountId = account3;
        groupAccount3.joinDate = new Date();

        // -------------------Khoi tao gia tri cho TypeQuestion-------------
        TypeQuestion type1 = new TypeQuestion();
        type1.typeId = 1;
        type1.typeName = TypeName.MULTIPLE_CHOICE;

        TypeQuestion type2 = new TypeQuestion();
        type2.typeId = 2;
        type2.typeName = TypeName.MULTIPLE_CHOICE;

        TypeQuestion type3 = new TypeQuestion();
        type3.typeId = 3;
        type3.typeName = TypeName.ESSAY;

        // -------------------Khoi tao gia tri cho CategoryQuestion------------
        CategoryQuestion category1 = new CategoryQuestion();
        category1.categoryId = 1;
        category1.categoryName = "Java";

        CategoryQuestion category2 = new CategoryQuestion();
        category2.categoryId = 2;
        category2.categoryName = ".NET";

        CategoryQuestion category3 = new CategoryQuestion();
        category3.categoryId = 3;
        category3.categoryName = "SQL";

        // --------------------Khoi tao gia tri cho Question---------------
        Question question1 = new Question();
        question1.questionId = 1;
        question1.content = "Question 1";
        question1.categoryId = category1;
        question1.typeId = type2;
        question1.creatorId = account2;
        question1.createDate = new Date();

        Question question2 = new Question();
        question2.questionId = 2;
        question2.content = "Question 2";
        question2.categoryId = category3;
        question2.typeId = type3;
        question2.creatorId = account1;
        question2.createDate = new Date("2023/02/01");

        Question question3 = new Question();
        question3.questionId = 3;
        question3.content = "Question 3";
        question3.categoryId = category2;
        question3.typeId = type1;
        question3.creatorId = account3;
        question3.createDate = new Date("2022/03/30");

        // -------------Khoi tao gia trị cho Answer---------------
        Answer answer1 = new Answer();
        answer1.answerId = 1;
        answer1.content = "Answer 1";
        answer1.questionId = question2;
        answer1.isCorrect = true;

        Answer answer2 = new Answer();
        answer2.answerId = 2;
        answer2.content = "Answer 2";
        answer2.questionId = question1;
        answer2.isCorrect = false;

        Answer answer3 = new Answer();
        answer3.answerId = 3;
        answer3.content = "Answer 3";
        answer3.questionId = question1;
        answer3.isCorrect = false;

        // ------------Khoi tao gia tri cho Exam----------------
        Exam exam1 = new Exam();
        exam1.examId = 1;
        exam1.code = "A02";
        exam1.title = "Exam 1";
        exam1.categoryId = category2;
        exam1.duration = 90;
        exam1.creatorId = account2;
        exam1.createDate = new Date();

        Exam exam2 = new Exam();
        exam2.examId = 2;
        exam2.code = "A01";
        exam2.title = "Exam 2";
        exam2.categoryId = category1;
        exam2.duration = 120;
        exam2.creatorId = account1;
        exam2.createDate = new Date();

        Exam exam3 = new Exam();
        exam3.examId = 3;
        exam3.code = "A03";
        exam3.title = "Exam 3";
        exam3.categoryId = category3;
        exam3.duration = 90;
        exam3.creatorId = account1;
        exam3.createDate = new Date("2023/01/09");

        // -----------Khoi tao gia tri cho ExamQuestion----------------
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examId = exam1;
        examQuestion1.questionId = question1;

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.examId = exam2;
        examQuestion2.questionId = question2;

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.examId = exam1;
        examQuestion3.questionId = question3;

// --------------------------------Assignment 2------------------------------------
// IF
    System.out.println("IF---------------------------------------------------------");
    // -------------------------------------- Question 1 -----------------------------------------
        System.out.println("Question 1");
        if (account2.departmentId == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account2.departmentId.departmentName);
        }
        System.out.println("\n");

    // ---------------------------------------- Question 2 ----------------------------------------
        System.out.println("Question 2");
        if (account2.groups == null) {
            System.out.println("Nhân viên này chưa có group");
        } else if
        (account2.groups.length < 3) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account2.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
        System.out.println("\n");

    // ---------------------------------------- Question 3 ----------------------------------------
        System.out.println("Question 3");
        String text = "";
        text = (account2.departmentId == null) ? "Nhân viên này chưa có phòng ban" : "Phòng ban của nhân viên này là: " + account2.departmentId.departmentName;
        System.out.println(text);
        System.out.println("\n");

    // ---------------------------------------- Question 4 ----------------------------------------
        System.out.println("Question 4 ");
        String text2 = "";
        text2 = (account1.positionId.positionName == PositionName.DEV) ? "Đây là Developer" : "Người này không phải là Developer";
        System.out.println(text2);
        System.out.println("\n");

// SWITCH CASE
    System.out.println("SWITCH CASE -----------------------------------------------------");
    // ----------------------------------------- Question 5 ---------------------------------------
        System.out.println("Question 5");
        int countAccount = group1.accounts.length;
        switch (countAccount) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
        System.out.println("\n");

    // ------------------------------------- Question 6 -------------------------------------
        System.out.println("Question 6");
        int countGroup = account2.groups.length;
        switch (countGroup) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
        System.out.println("\n");

    // ------------------------------------- Question 7 -------------------------------------
        System.out.println("Question 7");
        PositionName position = account1.positionId.positionName;
        switch (position) {
            case DEV:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
        System.out.println("\n");

// FOREACH
    System.out.println("FOREACH ------------------------------------------------------");
    // ---------------------------------- Question 8 -------------------------------------
        Account[] arrAccount = {account1,account2,account3};
        System.out.println("Question 8");
        for (Account account : arrAccount) {
            System.out.println("Thông tin của Account thứ " + account.accountId + " là: ");
            System.out.println("Email: " + account.email);
            System.out.println("Full name: " + account.fullName);
            System.out.println("Phòng ban: " + account.departmentId.departmentName);
            System.out.println("\n");
        }
        System.out.println("\n");

    // --------------------------------- Question 9 ----------------------------------------
        Department[] arrDepartment = {department1, department2, department3};
        System.out.println("Question 9");
        for (Department department : arrDepartment) {
            System.out.println("Thông tin phòng ban thứ " + department.departmentId + " là: ");
            System.out.println("ID: " + department.departmentId);
            System.out.println("Name: " + department.departmentName);
            System.out.println("\n");
        }
        System.out.println("\n");

// FOR
    System.out.println("FOR -------------------------------------------------");
    // ------------------- Question 10 ---------------------
        System.out.println("Question 10");
        for (int i = 0; i < arrAccount.length; i++) {
            System.out.println("Thông tin của Account thứ " + (i+1) + " là: ");
            System.out.println("Email: " + arrAccount[i].email);
            System.out.println("Full name: " + arrAccount[i].fullName);
            System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
            System.out.println("\n");
        }
        System.out.println("\n");

    // ----------------------------- Question 11 ---------------------------------
        System.out.println("Question 11");
        for (int i = 0; i < arrDepartment.length; i++) {
            System.out.println("Thông tin department thứ " + (i+1) + " là: ");
            System.out.println("Id: " + arrDepartment[i].departmentId);
            System.out.println("Name: " + arrDepartment[i].departmentName);
            System.out.println("\n");
        }
        System.out.println("\n");

    // ------------------- Question 12 ---------------------
        System.out.println("Question 12");
        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i+1) + " là: ");
            System.out.println("Id: " + arrDepartment[i].departmentId);
            System.out.println("Name: " + arrDepartment[i].departmentName);
            System.out.println("\n");
        }
        System.out.println("\n");

    // ------------------- Question 13 ---------------------
        System.out.println("Question 13");
        for (int i = 0; i < arrAccount.length; i++) {
            if (i == 1) {continue;}
            System.out.println("Thông tin của Account thứ " + (i + 1) + " là: ");
            System.out.println("Email: " + arrAccount[i].email);
            System.out.println("Full name: " + arrAccount[i].fullName);
            System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
            System.out.println("\n");
        }
        System.out.println("\n");

    // ------------------- Question 14 ---------------------
        System.out.println("Question 14");
        for (int i = 0; i < 3; i++) {
            System.out.println("Thông tin của Account thứ " + (i+1) + " là: ");
            System.out.println("Email: " + arrAccount[i].email);
            System.out.println("Full name: " + arrAccount[i].fullName);
            System.out.println("Phòng ban: " + arrAccount[i].departmentId.departmentName);
            System.out.println("\n");
        }
        System.out.println("\n");

    // ---------------------- Question 15 -------------------------------
        System.out.println("Question 15");
        for (int i = 0; i <= 20; i ++) {
            if (i%2 == 1) {continue;}
            System.out.println(i);
        }
        System.out.println("\n");

// WHILE
    System.out.println("WHILE-----------------------------------------");
    // ----------------- Question 16 ------------------
        System.out.println("Question 16");
        // Làm lại Q10
        System.out.println("Làm lại Question 10");
        int number = 0;
        while (number < arrAccount.length) {
            System.out.println("Thông tin của Account thứ " + (number+1) + " là: ");
            System.out.println("Email: " + arrAccount[number].email);
            System.out.println("Full name: " + arrAccount[number].fullName);
            System.out.println("Phòng ban: " + arrAccount[number].departmentId.departmentName);
            System.out.println("\n");
            number++;
        }
        System.out.println("\n");

        // Làm lại Q11
        System.out.println("Làm lại Question 11");
        int number2 = 0;
        while (number2 < arrDepartment.length) {
            System.out.println("Thông tin department thứ " + (number2+1) + " là: ");
            System.out.println("Id: " + arrDepartment[number2].departmentId);
            System.out.println("Name: " + arrDepartment[number2].departmentName);
            System.out.println("\n");
            number2++;
        }
        System.out.println("\n");

        // Làm lại Q12
        System.out.println("Làm lại Question 12");
        int number3 = 0;
        while (number3 < 2) {
            System.out.println("Thông tin department thứ " + (number3+1) + " là: ");
            System.out.println("Id: " + arrDepartment[number3].departmentId);
            System.out.println("Name: " + arrDepartment[number3].departmentName);
            System.out.println("\n");
            number3++;
        }
        System.out.println("\n");

        // Làm lại Q13
        System.out.println("Làm lại Question 13");
        int number4 = 0;
        while (number4 < arrAccount.length) {
            number4++;
            if (number4 == 2) {continue;}
            System.out.println("Thông tin của Account thứ " + (number4) + " là: ");
            System.out.println("Email: " + arrAccount[number4-1].email);
            System.out.println("Full name: " + arrAccount[number4-1].fullName);
            System.out.println("Phòng ban: " + arrAccount[number4-1].departmentId.departmentName);
            System.out.println("\n");
        }
        System.out.println("\n");

        // Làm lại Q14
        System.out.println("Làm lại Question 14");
        int number5 = 0;
        while (number5 < 3) {
            System.out.println("Thông tin của Account thứ " + (number5+1) + " là: ");
            System.out.println("Email: " + arrAccount[number5].email);
            System.out.println("Full name: " + arrAccount[number5].fullName);
            System.out.println("Phòng ban: " + arrAccount[number5].departmentId.departmentName);
            System.out.println("\n");
            number5++;
        }
        System.out.println("\n");

        // Làm lại Q15
        System.out.println("Làm lại Question 15");
        int number6 = 0;
        while (number6 <=20) {
            number6++;
            if(number6%2 == 0) {continue;}
            System.out.println(number6-1);
        }
        System.out.println("\n");

// DO-WHILE
    // ------------------------------ Question 17 ---------------------------------
        // Làm lại Q10
        System.out.println("Làm lại Question 10");
        int num1 = 0;
        do {
            System.out.println("Thông tin của Account thứ " + (num1+1) + " là: ");
            System.out.println("Email: " + arrAccount[num1].email);
            System.out.println("Full name: " + arrAccount[num1].fullName);
            System.out.println("Phòng ban: " + arrAccount[num1].departmentId.departmentName);
            System.out.println("\n");
            num1++;
        } while (num1 < arrAccount.length);
        System.out.println("\n");

        // Làm lại Q11
        System.out.println("Làm lại Question 11");
        int num2 = 0;
        do {
            System.out.println("Thông tin department thứ " + (num2+1) + " là: ");
            System.out.println("Id: " + arrDepartment[num2].departmentId);
            System.out.println("Name: " + arrDepartment[num2].departmentName);
            System.out.println("\n");
            num2++;
        } while (num2 < arrDepartment.length);
        System.out.println("\n");

        // Làm lại Q12
        System.out.println("Làm lại Question 12");
        int num3 = 0;
        do {
            System.out.println("Thông tin department thứ " + (num3+1) + " là: ");
            System.out.println("Id: " + arrDepartment[num3].departmentId);
            System.out.println("Name: " + arrDepartment[num3].departmentName);
            System.out.println("\n");
            num3++;
        } while (num3<2);
        System.out.println("\n");

        // Làm lại Q13
        System.out.println("Làm lại Question 13");
        int num4 = 0;
        do {
            num4++;
            if (num4 == 2) {continue;}
            System.out.println("Thông tin của Account thứ " + (num4) + " là: ");
            System.out.println("Email: " + arrAccount[num4-1].email);
            System.out.println("Full name: " + arrAccount[num4-1].fullName);
            System.out.println("Phòng ban: " + arrAccount[num4-1].departmentId.departmentName);
            System.out.println("\n");
        } while (num4 < arrAccount.length);
        System.out.println("\n");
        // Làm lại Q14
        int num5 = 0;
        do {
            System.out.println("Thông tin của Account thứ " + (num5+1) + " là: ");
            System.out.println("Email: " + arrAccount[num5].email);
            System.out.println("Full name: " + arrAccount[num5].fullName);
            System.out.println("Phòng ban: " + arrAccount[num5].departmentId.departmentName);
            System.out.println("\n");
            num5++;
        } while (num5<3);
        System.out.println("\n");

        // Làm lại Q15
        int num6 = 0;
        do {
            num6++;
            if(num6%2 == 0) {continue;}
            System.out.println(num6-1);
        } while (num6<=20);
    }
}
