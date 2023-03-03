package Assignment;


import java.util.Date;

public class Exercise2 {
    public static void main(String[] args) {
        question1();
    }

    public static void question1(){
        Account[] arrAccount = new Account[5];
        for (int i=0; i<arrAccount.length; i++) {
            Assignment.Account account = new Account();
            account.email = "Email " + (i+1);
            account.userName = "User name " + (i+1);
            account.fullName = "Full name " + (i+1);
            account.createDate = new Date();
            arrAccount[i] = account;
            System.out.println("Thông tin Account thứ " + (i+1));
            System.out.println("Email: " + account.email);
            System.out.println("Username: " + account.userName);
            System.out.println("Fullname: " + account.fullName);
            System.out.println("Create Date: " + account.createDate);
        }
    }
}
