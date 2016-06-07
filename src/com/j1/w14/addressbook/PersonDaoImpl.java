package com.j1.w14.addressbook;

import java.util.ArrayList;

public class PersonDaoImpl implements PersonDao {
  ArrayList<Person> person; 
  public PersonDaoImpl() {
    person = new ArrayList<Person>();
    Person person1 = new Person("hyunchae", "010-9683-0000");
    Person person2 = new Person("joonyoung", "010-0000-0000");  
    person.add(person1);
    person.add(person2);
  }
  public ArrayList<Person> getAllPerson() {
  return person;
  }  
  public void getPhoneNumber(String name) {
    for (Person search : person) {
      if(search.getName() == name) {
        System.out.println(name+"'s phone number is "+search.getPhoneNumber());
      }
    }
  }  
  public void plusPerson(Person person) {
    this.person.add(person);
  } 
  public void erasePerson(String name) {
    int i=0;
    
    for (Person search : person) {
      if (search.getName() == name) {
        person.remove(i);
      }
      i+=1;
    }
  }
  public void printAddressBook() {
    System.out.println("AddressBook--------------------------------------");
  for(Person person : this.getAllPerson()) {
    System.out.println("[Name : "+person.getName()+", Phone Number : "+person.getPhoneNumber()+"]");
  }
  System.out.println("-------------------------------------------------\n");
  }

  public ArrayList<Person> getAllPersons() {
    return person;
  }
}