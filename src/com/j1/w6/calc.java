/*
 * @author jyk
 * @since 160413
 * 
 */
package com.j1.w6;

import java.util.Scanner;

public class calc {
  public static void main(String[] args) {
    double i1,i2;
    double value=0;
    String operation;
    Scanner num = new Scanner(System.in);
    
    System.out.println("Enter first input number.");
    i1 = num.nextDouble();
    
    System.out.println("Enter second input number.");
    i2 = num.nextDouble();
    
    Scanner op = new Scanner(System.in);
    System.out.println("Enter operation");
    operation=op.next();
    
    switch(operation) {
      case "+":
      System.out.println("Result is "+(i1+i2));
      break;
       
      case "-":
      System.out.println("Result is "+(i1-i2));
      break;
       
      case "*":
      System.out.println("Result is "+(i1*i2));
      break;
        
      case "/":
      if(i2 ==0){
        System.out.println("Error");
      }
      else{
        System.out.println("Result is "+(i1/i2));
      }
      break;
        
      default:
      System.out.println("Written operation is none");
    }
  }
}