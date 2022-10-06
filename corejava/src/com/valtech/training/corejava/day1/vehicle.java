package com.valtech.training.corejava.day1;

public abstract class vehicle 
{

	public  void start() {
        System.out.println("start button pressed........");
    }
    public  void stop() {
        System.out.println("stop button pressed..........");
    
}
    public abstract void accelerate();
    
    public abstract void applyBreak();
    
    public void driveSomeDistance() {
        start();
        accelerate();
        applyBreak();
        stop();
    }
    public static void main(String[] arg) {
        vehicle  v = new ElectricScooter();
        v.driveSomeDistance();
    
    }
}

