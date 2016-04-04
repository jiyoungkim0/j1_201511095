/*
 * @author kjy
 * @since 160404
 * Let's make caramel macchiato!
 */

package com.j1.w5;

abstract class Beverage {
  String description="Unknown beverage";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}

class Espresso extends Beverage{
  public Espresso() {
    description="Espresso";
  }
  public double cost(){
    return 2.50;
  }
}

abstract class CondimentDecorator extends Beverage{
  public abstract String getDescription();
}

class whippedMilk extends CondimentDecorator {
  Beverage beverage;
  public whippedMilk(Beverage b){
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription() + " + whippedMilk";
  }
  public double cost() {
    return beverage.cost() + 1.20;
  }
}

class caramelSyrup extends CondimentDecorator {
  Beverage beverage;
  public caramelSyrup(Beverage b){
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription() + " + caramelSyrup";
  }
  public double cost() {
    return beverage.cost() + .70;
  }
}

class caramelSauce extends CondimentDecorator {
  Beverage beverage;
  public caramelSauce(Beverage b){
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription() + " + caramelSauce";
  }
  public double cost() {
    return beverage.cost() + .30;
  }
}

public class caramelMacchiato {
  public static void main(String args[]){
    Beverage b = new Espresso();
    Beverage wme = new whippedMilk(b); //wme = whippedMilk Espresso //
    Beverage cwme=new caramelSyrup(wme); //cwme = caramelSyrup whippedMilk Espresso//
    Beverage ccwme = new caramelSauce(cwme); //ccwme = caramelSauce caramelSyrup whippedMilk Espresso

    System.out.println(ccwme.getDescription());
    System.out.println("$ "+ccwme.cost());
  }
}