package com.j1.w11.phonebook;

public interface ArrayInterface { 
  public void add(Object o); 
  public void add(int index, Object o); 
  public void removeAll();  
  public boolean remove(String name);  
  public boolean remove(int idx);  
  public int size();  
}