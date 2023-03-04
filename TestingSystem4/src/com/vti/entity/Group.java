package com.vti.entity;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public class Group {
    private int groupId;
    private String groupName;
    private Account creatorId;
    private LocalDate createDate;
    private Account[] accounts;
    private String[] usernames;

    @Override
    public String toString() {
        return "Group{" +
                "groupId=" + groupId +
                ", groupName='" + groupName + '\'' +
                ", creatorId=" + creatorId +
                ", createDate=" + createDate +
                ", accounts=" + Arrays.toString(accounts) +
                ", usernames=" + Arrays.toString(usernames) +
                '}';
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Account getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Account creatorId) {
        this.creatorId = creatorId;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }

    public String[] getUsernames() {
        return usernames;
    }

    public void setUsernames(String[] usernames) {
        this.usernames = usernames;
    }

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
