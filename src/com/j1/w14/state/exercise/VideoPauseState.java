package com.j1.w14.state.exercise.video;

public class VideoPauseState implements State{
  VideoPlayer videoPlayer;
  
  public VideoPauseState(VideoPlayer videoPlayer){
    this.videoPlayer = videoPlayer;
  }
  public void sleepingScreen(){
    System.out.println("Screen is not sleeping");
  }
  public void timeOut(){
    System.out.println("timeover.... sleeping");
    videoPlayer.setState(videoPlayer.getScreenSleepingState());
  }
  public void stopButton(){
    System.out.println("You already push stopButton...");
  }
  public void playButton(){
    System.out.println("playButton ... playing");
    videoPlayer.setState(videoPlayer.getVideoPlayState());
  }
  public String toString(){
    return "VideoPauseState";
  }
}