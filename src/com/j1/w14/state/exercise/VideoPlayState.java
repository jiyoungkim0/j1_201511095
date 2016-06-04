package com.j1.w14.state.exercise.video;

public class VideoPlayState implements State{
  VideoPlayer videoPlayer;
  
  public VideoPlayState(VideoPlayer videoPlayer){
    this.videoPlayer = videoPlayer;
  }
  public void sleepingScreen(){
    System.out.println("Screen is not sleeping");
  }
  public void timeOut(){
    System.out.println("not timeover.... not sleeping");
  }
  public void stopButton(){
    System.out.println("stopButton ... stop");
    videoPlayer.setState(videoPlayer.getVideoPauseState());
  }
  public void playButton(){
    System.out.println("You already push playButton...");
  }
  public String toString(){
    return "VideoPlayState";
  }
}