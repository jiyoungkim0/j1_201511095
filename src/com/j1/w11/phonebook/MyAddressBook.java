package com.j1.w11.phonebook;

public class MyAddressBook { 
  public static void main(String[] args) { 
    MyArray array = new MyArray(); 
    array.add(new AddressBook(1,"JY","Icheon", "010-2215-****")); 
    array.add(new AddressBook(2,"ED","Jeju", "010-****-****")); 
    array.add(new AddressBook(3,"CH","Degu", "010-****-****")); 
    array.printAll(); 
    System.out.println("----------------------"); 
    array.search("JY"); 
    System.out.println("----------------------"); 
    array.remove("ED"); 
    array.printAll();    
  } 
} 