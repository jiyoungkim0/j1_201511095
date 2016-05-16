package com.j1.w11.phonebook;

public class MyArray implements ArrayInterface { 
  Object[] myArray ; 
  public MyArray() { 
    myArray = new Object[0]; 
  } 
  public MyArray(int i) { 
    if (i < 0)  throw new IllegalArgumentException(); 
    myArray = new Object[i]; 
  } 
  public int size() { 
    for(int i=0;i<myArray.length;i++) { 
      if(myArray[i]==null) return i; 
    } 
    return myArray.length; 
  } 

  public void ensureCapacity(int minCapacity)  { 
    Object[] newArray = new Object[minCapacity]; 
    System.arraycopy(myArray, 0, newArray, 0, size()); 
    myArray = newArray;    
  } 

  public void add(Object  s) { 
    ensureCapacity(size() + 1); 
    myArray[size()] = s; 
  } 
  public void add(int index, Object  s) { 
    int size = size(); 
    if (index > size){ 
      System.out.println("Invalid Index..."); 
    } 
    else { 
      if (size == myArray.length) ensureCapacity(size + 1); 
      if(index<size) { 
        for(int i=size;i>index;i--) { 
          myArray[i] = myArray[i-1]; 
        } 
        myArray[index]=s; 
      } 
    } 
  } 
  public boolean remove(int idx) { 
    int size = size(); 
    if(idx<size) { 
      myArray[idx]=null; 
      for(int i=idx;i<size-1;i++) { 
        myArray[i] = myArray[i+1]; 
        myArray[i+1] = null; 
      } 
      ensureCapacity(size-1); 
      return true; 
    } 
    return false; 
  } 
  public boolean remove(String name) { 
    int i=0, idx=0, size=0; 
    size = size(); 
    for(i = 0; i < size; i++) {  
      AddressBook book = (AddressBook)myArray[i];  
      if (book.getName().equals(name)){  
        idx = i; 
        break; 
      }  
    }  
    if (i == size) { 
      System.out.println("Data Not Found...."); 
      return false; 
    } 
    if(idx<size) { 
      myArray[idx]=null; 
      for(i=idx;i<size-1;i++) { 
        myArray[i] = myArray[i+1]; 
        myArray[i+1] = null; 
      } 
      ensureCapacity(size-1); 
      return true; 
    } 
    return false; 
  } 
  public void removeAll() { 
    Object[] myArray = new Object[0]; 
  } 

  public void printAll(){ 
    for(int i=0;i<size();i++) { 
      System.out.println(myArray[i]); 
    } 
  } 

  public void search(String name)  {  
    int size = size(); 
    for(int i = 0; i < size; i++) {  
      AddressBook book = (AddressBook)myArray[i];  
      if (book.getName().equals(name)){  
        System.out.println(book);;  
      }  
    }  
  }  
} 