package com.j1.w11.phonebook;

public class AddressBook { 
  private int no; 
  private String name; 
  private String addr; 
  private String tel; 

  public AddressBook(int no, String name, String addr, String tel) { 
    this.no = no; 
    this.name = name; 
    this.addr = addr; 
    this.tel = tel; 
  } 

  public String toString() { 
    String a = no + " : "; 
    a += name + ","; 
    a += addr + ","; 
    a += tel; 

    return a; 
  } 

  public String getName() { 
    return this.name; 
  } 
}