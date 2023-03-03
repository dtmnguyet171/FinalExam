package com.vti.entity;

import java.time.LocalDate;
import java.util.Date;

public class Group {
    int groupId;
    String groupName;
    Account creatorId;
    LocalDate createDate;
    Account[] accounts;
    String[] usernames;

    public Group() {
    }

    public Group(String groupName, Account creatorId, LocalDate createDate, Account[] accounts) {
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = createDate;
        this.accounts = accounts;
    }

    public Group(String groupName, Account creatorId, LocalDate createDate, String[] usernames) {
        this.groupName = groupName;
        this.creatorId = creatorId;
        this.createDate = createDate;
        this.usernames = usernames;
        Account[] accounts = new Account[usernames.length];
        for (int i = 0; i < usernames.length; i++) {
            accounts[i] = new Account(usernames[i]);
        }
    }
}
