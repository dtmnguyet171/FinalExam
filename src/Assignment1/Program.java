package Assignment1;

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
        System.out.println("In ra Department Name:");
        System.out.println(department1.departmentId + ": " + department1.departmentName);
        System.out.println(department2.departmentId + ": " + department2.departmentName);
        System.out.println(department3.departmentId + ": " + department3.departmentName);
        System.out.println("\n");
        // -------------Khoi tao gia tri cho Position-------------------------
        Position position1 = new Position();
        position1.positionId = 1;
        position1.positionName = PositionName.PM;

        Position position2 = new Position();
        position2.positionId = 2;
        position2.positionName = PositionName.SCRUMMASTER;

        Position position3 = new Position();
        position3.positionId = 3;
        position3.positionName = PositionName.TEST;

        System.out.println("In ra Position Name:");
        System.out.println(position1.positionId + ": " + position1.positionName);
        System.out.println(position2.positionId + ": " + position2.positionName);
        System.out.println(position3.positionId + ": " + position3.positionName);
        System.out.println("\n");

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

        System.out.println("In ra Department Name của mỗi Account:");
        System.out.println(account1.accountId + ": " + account1.departmentId.departmentName);
        System.out.println(account2.accountId + ": " + account2.departmentId.departmentName);
        System.out.println(account3.accountId + ": " + account3.departmentId.departmentName);
        System.out.println("\n");

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

        System.out.println("In ra Group Name:");
        System.out.println(group1.groupId + ": " + group1.groupName);
        System.out.println(group2.groupId + ": " + group2.groupName);
        System.out.println(group3.groupId + ": " + group3.groupName);
        System.out.println("\n");

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

        System.out.println("In ra Account Id của Group:");
        System.out.println(groupAccount1.groupId.groupId + ": " + groupAccount1.accountId.accountId);
        System.out.println(groupAccount2.groupId.groupId + ": " + groupAccount2.accountId.accountId);
        System.out.println(groupAccount3.groupId.groupId + ": " + groupAccount3.accountId.accountId);
        System.out.println("\n");

        // -------------------Khoi tao gia tri cho TypeQuestion-------------
        TypeQuestion type1 = new TypeQuestion();
        type1.typeId = 1;
        type1.typeName = TypeName.MULTIPLECHOICE;

        TypeQuestion type2 = new TypeQuestion();
        type2.typeId = 2;
        type2.typeName = TypeName.MULTIPLECHOICE;

        TypeQuestion type3 = new TypeQuestion();
        type3.typeId = 3;
        type3.typeName = TypeName.ESSAY;

        System.out.println("In ra Type Name:");
        System.out.println(type1.typeId + ": " + type1.typeName);
        System.out.println(type2.typeId + ": " + type2.typeName);
        System.out.println(type3.typeId + ": " + type3.typeName);

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

        System.out.println("In ra Category Name:");
        System.out.println(category1.categoryId + ": " + category1.categoryName);
        System.out.println(category2.categoryId + ": " + category2.categoryName);
        System.out.println(category3.categoryId + ": " + category3.categoryName);
        System.out.println("\n");

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

        System.out.println("In ra TypeName của mỗi Question:");
        System.out.println(question1.questionId + ": " + question1.typeId.typeName);
        System.out.println(question2.questionId + ": " + question2.typeId.typeName);
        System.out.println(question3.questionId + ": " + question3.typeId.typeName);
        System.out.println("\n");

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

        System.out.println("In ra nội dung của mỗi Answer:");
        System.out.println(answer1.answerId + ": " + answer1.content);
        System.out.println(answer2.answerId + ": " + answer2.content);
        System.out.println(answer3.answerId + ": " + answer3.content);
        System.out.println("\n");

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

        System.out.println("In ra Duration của mỗi Exam:");
        System.out.println(exam1.examId + ": " + exam1.duration);
        System.out.println(exam2.examId + ": " + exam2.duration);
        System.out.println(exam3.examId + ": " + exam3.duration);
        System.out.println("\n");

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

        System.out.println("In ra QuestionId của Exam:");
        System.out.println(examQuestion1.examId.examId + ": " + examQuestion1.questionId.questionId);
        System.out.println(examQuestion2.examId.examId + ": " + examQuestion2.questionId.questionId);
        System.out.println(examQuestion3.examId.examId + ": " + examQuestion3.questionId.questionId);
        System.out.println("\n");
    }
}
