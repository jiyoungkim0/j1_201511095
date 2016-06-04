package com.j1.w14.state.exercise.video;

public class VideoPlayerTestDrive{
  public static void main(String[] args){
    VideoPlayer videoPlayer = new VideoPlayer();
    System.out.println(videoPlayer);
    
    videoPlayer.playButton();
    videoPlayer.stopButton();
    videoPlayer.timeOut();
    System.out.println(videoPlayer);
    System.out.println("**************");
    
    videoPlayer.playButton();
    videoPlayer.sleepingScreen();
    System.out.println(videoPlayer);
  }
}