package com.j1.w11;

public class HomeTheaterTestDrive {
  public static void main(String[] args){
    Amplifier amp = new Amplifier("Amplifier");
    Tuner tuner= new Tuner("Tuner",amp);
    DVDPlayer dvd = new DVDPlayer("DVD player",amp);
    Projector projector = new Projector("Projector",dvd);
    HTFacade ht = new HTFacade(amp,tuner,dvd,projector);
    ht.watchMovie("movie");
    ht.endMovie();
  }
}
