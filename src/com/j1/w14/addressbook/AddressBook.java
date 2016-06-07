package com.j1.w14.addressbook;

import java.util.ArrayList;

public class AddressBook {
 public static void main(String[] args) {
  PersonDao personDao = new PersonDaoImpl();
  personDao.printAddressBook();
  
  Person person01 = new Person("Jiyoung", "010-2215-0000");
  personDao.plusPerson(person01);
  personDao.printAddressBook();
  
  personDao.erasePerson("joonyoung");
  personDao.printAddressBook();
  
  personDao.getPhoneNumber("hyunchae");
 }
}