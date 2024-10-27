package edu.northeastern.csye6200;

public class TV {

	int channel;
	int volumeLevel;
	boolean on;
	TV(){
		channel=1;
		volumeLevel=1;
		on=false;
	}
	public void turnOn() {
		on = true;
	}
	public void turnOff() {
		on = false;
	}
}
