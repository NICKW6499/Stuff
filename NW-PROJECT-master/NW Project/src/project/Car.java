//Nicholis Wright
package project; //The goal is for this to work by the end of the semester there is some stuff for this check in it though
import java.util.Scanner;

	class Car {
	    private static String color;
	    private static String make;
	    private int year;
	    private boolean bluetooth;
	    private boolean sunroof;
	    
	    
	    
	    Car(){
	    	color = "silver";
	    	make = "ford";
	    	year = 1984;
	    	bluetooth = false;
	    	sunroof = true;
	    }
	    
	     Car (String color, String make, int year){//argument is all the stuff in parentheses
	    	Car.color = color;
	    	Car.make = make;
	    	this.year = year;
	    	this.bluetooth = false;
	    	this.sunroof = true;
	    	System.out.println("My car is a" + color + make + year);
	    }
	    
	    public static String getColor(){
	      return color;
	    }
	    
	    public static String getMake(){
	      return make;
	    }
	    
	    public void setColor(String color){//argument is String color
	      this.color=color;
	    }
	    
	    public void setMake(String make){
	      this.make=make;
	    }
	    public int getYear() {
	    	return year;
	    }
	    public boolean getBluetooth() {
	    	return bluetooth;
	    }
	    public boolean getSunroof() {
	    	return sunroof;
	    }
	    
	}