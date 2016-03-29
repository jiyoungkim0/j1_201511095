package com.j1.w4;

import ch.aplu.turtle.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Point2D;

class TurtleMouseListener extends Turtle {
  public TurtleMouseListener() {
    addMouseListener(new MouseAdapter(){
      public void mousePressed(MouseEvent e){
        Point2D.Double p;
        p=toTurtlePos(e.getPoint());
        double d;
        double w;
        d=distance(p);
        w=towards(p);
        heading(w);
        forward(d);
        setStatusText("moving to "+p.toString());
      }
    });
    addMouseMotionListener(new MouseMotionAdapter(){
      public void mouseDragged(MouseEvent e){
        Point2D.Double p;
        p=toTurtlePos(e.getPoint());
        moveTo(p);
        setStatusText("dragging to "+p.toString());
      }
    });
    addMouseListener(new MouseAdapter(){
      public void mouseReleased(MouseEvent e){
        setStatusText("Released!");
      }
    });
  }
}
public class TurtleMouseObserverMain {
  public static void main(String[] args){
    TurtleMouseListener t = new TurtleMouseListener();
    t.addStatusBar(30);
    t.setStatusText("Click or drag!");
  }
}