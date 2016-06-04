package com.j1.w14.state.exercise.video;

public class ScreenSleepingState implements State{
  VideoPlayer videoPlayer;
  
  public ScreenSleepingState(VideoPlayer videoPlayer){
    this.videoPlayer = videoPlayer;
  }
  public void sleepingScreen(){
    System.out.println("sleeping. so video stop");
  }
  public void timeOut(){
    System.out.println("timeover ...sleeping.");
  }
  public void stopButton(){
    System.out.println("You already push stopButton...");
  }
  public void playButton(){
    System.out.println("playButton ... playing");
    videoPlayer.setState(videoPlayer.getVideoPlayState());
  }
  public String toString(){
    return "ScreenSleepingState";
  }
}