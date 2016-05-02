package com.j1.w9;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Calc{
  static String a="",b="", sign="";
  static int c=0;
  public static void main(String[] args){
    Frame frame = new Frame("JY Calc");
    frame.addWindowListener(new EventHandler());

    final TextField textfield = new TextField(10);
    textfield.setText("");
    textfield.setEditable(false);
    
    frame.setSize(300,300);
    frame.setLocation(100,100);
    frame.add("North",textfield);
    
    Panel numPanel = new Panel();
    Button[] button = null;
    numPanel.setLayout(new GridLayout(4,4,4,4));
    numPanel.setBackground(Color.white);
    frame.add("Center",numPanel);

    String numBox[]= { "7","8","9","/",
                    "4","5","6","*",
                    "1","2","3","-",
                    "0",".","+","="};
    button = new Button[numBox.length];
    for(int i= 0; i<numBox.length;i++){
          button[i] = new Button(numBox[i]);
          button[i].setForeground(Color.black);
          numPanel.add(button[i]);
    }
    frame.setResizable(false);
    frame.setVisible(true);


//숫자 9 버튼
    button[2].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a= a+"9";
          textfield.setText(a);
        }
        else{ 
          b=b+ "9";
          textfield.setText(b);
        }
      }
    }
    );  
    
//숫자 8 버튼
    button[1].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="8";
          textfield.setText(a);
        }
        else{ 
          b= "8";
          textfield.setText(b);
        }
       }
    });
    
//숫자 7 버튼
    button[0].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="7";
          textfield.setText(a);
        }
        else{ 
          b= "7";
          textfield.setText(b);
        }
      }
    });   

//숫자 6 버튼
    button[6].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="6";
          textfield.setText(a);
        }
        else{ 
          b= "6";
          textfield.setText(b);
        }
      }
    });
 //숫자 5 버튼
    button[5].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="5";
          textfield.setText(a);
        }
        else{ 
          b= "5";
          textfield.setText(b);
        }
      }
    });
 //숫자 4 버튼
    button[4].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="4";
          textfield.setText(a);
        }
        else{ 
          b= "4";
          textfield.setText(b);
        }
      }
    });
 //숫자 3 버튼
    button[10].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="3";
          textfield.setText(a);
        }
        else{ 
          b= "3";
          textfield.setText(b);
        }
      }
    });
 //숫자 2 버튼
    button[9].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="2";
          textfield.setText(a);
        }
        else{ 
          b= "2";
          textfield.setText(b);
        }
      }
    });
 //숫자 1 버튼
    button[8].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="1";
          textfield.setText(a);
        }
        else{ 
          b= "1";
          textfield.setText(b);
        }
      }
    });
 //숫자 0 버튼
    button[12].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");  
        if (a.equals("")){
          a="0";
          textfield.setText(a);
        }
        else{ 
          b= "0";
          textfield.setText(b);
        }
      }
    });
 // + 버튼
    button[14].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");
        sign="+";
        textfield.setText(sign);
      }
    });
 // - 버튼
    button[11].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");
        sign="-";
        textfield.setText(sign);
      }
    });
 // * 버튼
    button[7].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");
        sign="*";
        textfield.setText(sign);
      }
    });
 // / 버튼
    button[3].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");
        sign="/";
        textfield.setText(sign);
      }
    });

// = 버튼 +-*/
    button[15].addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        textfield.setText("");
        if (sign.equals("+")){
          c=Integer.parseInt(a) + Integer.parseInt(b);
        }
        else if (sign.equals("-")){
          c=Integer.parseInt(a) - Integer.parseInt(b);
        }
        else if (sign.equals("*")){
          c=Integer.parseInt(a) * Integer.parseInt(b);
        }
        else{
          c=Integer.parseInt(a) / Integer.parseInt(b);
        }  

        textfield.setText(Integer.toString(c));
        a="";
        b="";
      }
    });
      
   
  }
}

class EventHandler implements WindowListener{
  public void windowOpened(WindowEvent e) {}
  public void windowClosing(WindowEvent e) {         
    e.getWindow().setVisible(false);
    e.getWindow().dispose();
    System.exit(0);
  }
  public void windowClosed(WindowEvent e) {}
  public void windowIconified(WindowEvent e) {}
  public void windowDeiconified(WindowEvent e) {}
  public void windowActivated(WindowEvent e) {}
  public void windowDeactivated(WindowEvent e) {}
}
