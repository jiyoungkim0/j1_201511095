/*
 * @author kjy
 * @since 160404
 * 
 * Welcome! Here is hairsalon!
 */

package com.j1.w5;
abstract class Hair {
  String description="normal black long hair";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}

class Cut extends Hair{
  public Cut() {
    description="Cut";
  }
  public double cost(){
    return 9.99;
  }
}


abstract class CondimentDecorator extends Hair{
  public abstract String getDescription();
}

class WavePerm extends CondimentDecorator {
  Hair hair;
  public WavePerm(Hair h) { //It's you who is in my heart.
    hair=h;
  }
  public String getDescription() {
    return hair.getDescription()+", WavePerm";
  }
  public double cost() {
    return hair.cost() + 50.99;
  }
}

class RedDyeing extends CondimentDecorator {
  Hair hair;
  public RedDyeing(Hair h) { //It's you who is in my heart.
    hair=h;
  }
  public String getDescription() {
    return hair.getDescription()+", RedDyeing";
  }
  public double cost() {
    return hair.cost() + 50.99;
  }
}

class PinkDyeing extends CondimentDecorator {
  Hair hair;
  public PinkDyeing(Hair h) { //It's you who is in my heart.
    hair=h;
  }
  public String getDescription() {
    return hair.getDescription()+", PinkDyeing";
  }
  public double cost() {
    return hair.cost() + 50.99;
  }
}

public class HairSalon {
  public static void main(String args[]){
    Hair h = new Cut();
    Hair ph = new WavePerm(h); // ph = Wave Permed hair //
    Hair pph = new PinkDyeing(ph); //pph = pink Wave Permed hair//
    System.out.println(pph.getDescription());
    System.out.println(pph.cost()*1000+" won");
  }
}
