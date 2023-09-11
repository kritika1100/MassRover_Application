package com.example.demo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarsPhotos {
   private long id;
   private int sol;
   public Camera camera;
   @JsonProperty("img_src")
   private String imgSrc;
   @JsonProperty("earth_date")
   private String earthDate;
   public Rover rover;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public int getSol() {
	return sol;
}
public void setSol(int sol) {
	this.sol = sol;
}
public Camera getCamera() {
	return camera;
}
public void setCamera(Camera camera) {
	this.camera = camera;
}
public String getImgSrc() {
	return imgSrc;
}
public void setImgSrc(String imgSrc) {
	this.imgSrc = imgSrc;
}
public String getEarthDate() {
	return earthDate;
}
public void setEarthDate(String earthDate) {
	this.earthDate = earthDate;
}
public Rover getRover() {
	return rover;
}
public void setRover(Rover rover) {
	this.rover = rover;
}
@Override
public String toString() {
	return "MarsPhotos [id=" + id + ", sol=" + sol + ", camera=" + camera + ", imgSrc=" + imgSrc + ", earthDate="
			+ earthDate + ", rover=" + rover + "]";
}
   
  
   
}
