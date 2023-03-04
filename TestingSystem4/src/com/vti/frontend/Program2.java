package com.vti.frontend;

import com.vti.entity.Account1;
import com.vti.entity.Date;

public class Program2 {
    public static void main(String[] args) {
        Account1 account = new Account1("N02","Nguyet",300000);
        account.transferTo(account,20000);
        System.out.println(account);

        Date date = new Date(17,01,2002);
        System.out.println(date.isLeapYear());
    }
}
