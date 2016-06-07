package com.j1.w14.addressbook;

import java.util.ArrayList;

public interface PersonDao {
 public ArrayList<Person> getAllPersons();
 
 public void getPhoneNumber(String name);
 public void erasePerson(String name);
 public void plusPerson(Person person);
 
 public void printAddressBook();
}