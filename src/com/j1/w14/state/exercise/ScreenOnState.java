package com.j1.w14.state.exercise.video;

public class ScreenOnState implements State{
  VideoPlayer videoPlayer;
  
  public ScreenOnState(VideoPlayer videoPlayer){
    this.videoPlayer = videoPlayer;
  }
  public void sleepingScreen(){
    System.out.println("Screen is not sleeping");
  }
  public void timeOut(){
    System.out.println("timeover.... sleeping");
  }
  public void stopButton(){
    System.out.println("stopButton... stop");
    videoPlayer.setState(videoPlayer.getVideoPauseState());
  }
  public void playButton(){
    System.out.println("playButton ... playing");
    videoPlayer.setState(videoPlayer.getVideoPlayState());
  }
  public String toString(){
    return "ScreenOnState";
  }
}