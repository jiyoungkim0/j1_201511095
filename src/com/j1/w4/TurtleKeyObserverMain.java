package com.j1.w4;

import ch.aplu.turtle.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

class TurtleKeyListener extends Turtle {
  public TurtleKeyListener() {
    TurtleKeyAdapter tka = new TurtleKeyAdapter();
    addKeyListener(new KeyAdapter() {
      public void keyPressed(KeyEvent e) {
      int keyCode=e.getKeyCode();
      switch(keyCode) {
        case KeyEvent.VK_UP:
          setStatusText("forward 30");
          forward(30);
          break;
        case KeyEvent.VK_DOWN:
          setStatusText("back 30");
          back(30);
          break;
        case KeyEvent.VK_RIGHT:
          setStatusText("right 30");
          right(30);
          break;
        case KeyEvent.VK_LEFT:
          setStatusText("left 30");
          left(30);
          break;
        case KeyEvent.VK_Q:
          setStatusText("q pressed and exiting");
          break;
        case KeyEvent.VK_W:
          setStatusText("forward 45");
          forward(45);
          break;
        case KeyEvent.VK_S:
          setStatusText("back 45");
          back(45);
          break;
        case KeyEvent.VK_D:
          setStatusText("right 45");
          right(45);
          break;
        case KeyEvent.VK_A:
          setStatusText("left 45");
          left(45);
          break;
        }
      }
    });
  }
}

public class TurtleKeyObserverMain {
  public static void main(String[] args) {
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(30); /*30 is pixel */
    t.setStatusText("Press any key!");
  }
}