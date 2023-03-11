package com.vti.entity;

import com.vti.utils.Scannerutils;

import java.util.ArrayList;
import java.util.List;

public class VietnamesePhone extends Phone{
    List<Contact> contactList = new ArrayList<>();
    @Override
    public void insertContact(String name, String phone) {
        Contact contact = new Contact(phone,name);
        contactList.add(contact);
        System.out.println(contactList);
    }

    @Override
    public void removeContact(String name) {
        contactList.removeIf(contact -> contact.getName().equals(name));
        System.out.println(contactList);
    }

    @Override
    public void updateContact(String name, String newPhone) {
        for (Contact contact : contactList){
            if (name.equals(contact.getName())){
                contact.setNumber(newPhone);
            }
        }
        System.out.println(contactList);
    }

    @Override
    public void searchContact(String name) {
        for (Contact contact : contactList){
            if (name.equals(contact.getName())){
                System.out.println(contact);
            }
        }
    }


}
