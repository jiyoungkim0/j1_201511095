package com.j1.w14.addressbook;

public class Person {
 private String name;
 private String phoneNumber;

 Person(String name, String phoneNumber){
  this.name = name;
  this.phoneNumber = phoneNumber;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getPhoneNumber() {
  return phoneNumber;
 }

 public void setPhoneNumber(String phoneNumber) {
  this.phoneNumber = phoneNumber;
 }
}