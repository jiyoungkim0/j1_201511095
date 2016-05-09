package com.j1.w10.adapter;

import java.util.*;

public class IteratorEnumerationTestDrive {
  public static void main (String args[]) {
    ArrayList ls = new ArrayList(Arrays.asList(args));
    Enumeration enumeration = new IteratorEnumeration(ls.iterator());
    while (enumeration.hasMoreElements()) {
      System.out.println(enumeration.nextElement());
    }
  }
}
