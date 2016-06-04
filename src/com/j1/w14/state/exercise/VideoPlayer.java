package com.j1.w14.state.exercise.video;

public class VideoPlayer{
  State screenOnState;
  State screenSleepingState;
  State videoPlayState;
  State videoPauseState;
  
  State state = screenOnState;
  
  public VideoPlayer(){
    screenOnState = new ScreenOnState(this);
    screenSleepingState = new ScreenSleepingState(this);
    videoPlayState = new VideoPlayState(this);
    videoPauseState = new VideoPauseState(this);
    
    state = screenOnState;
  }
  public void sleepingScreen(){
    state.sleepingScreen();
  }
  public void timeOut(){
    state.timeOut();
  }
  public void stopButton(){
    state.stopButton();
  }
  public void playButton(){
    state.playButton();
  }
  void setState(State state){
    this.state = state;
  }
  public State getState(){
    return state;
  }
  public State getScreenOnState(){
    return screenOnState;
  }
  public State getScreenSleepingState(){
    return screenSleepingState;
  }
  public State getVideoPlayState(){
    return videoPlayState;
  }
  public State getVideoPauseState(){
    return videoPauseState;
  }
  public String toString() {
    StringBuffer result = new StringBuffer();
    result.append("Screen now... " + state + "\n");
    return result.toString();
  }
}