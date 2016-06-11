package com.j1.w14.proxy;

import java.io.*;
  
public interface State extends Serializable {
 public void insertQuarter();
 public void ejectQuarter();
 public void turnCrank();
 public void dispense();
}
