package tw.org.iii.myjava;

public class Bike extends Object {
	private double speed;
	private int gear; 
	private int color;
	static int count;
	
	// Constructor :建構式/建構子/建構方法
	Bike(){
		System.out.println("Bike()");
		setColor(3);
		count++;
	}
	Bike(int color){
		setColor(color);
		count++;
	}
	
	@Override
	public String toString() {
		return "BradBike";
	}
	
	private void setColor(int color) {
		this.color = color;
	}
	
	int getColor() {return color;}
	
	void upSpeed() {
		speed = speed<1?1:speed*(1.2+gear);
	}
	// Overload
	void upSpeed(int v) {
		speed = speed<1?2:speed*v;
	}
	void upSpeed(double v) {
		speed = speed<1?2:speed*v;
	}
	
	void downSpeed() {
		speed = speed<1?0:speed*0.7;
	}
	
	void setGear(int gear) {
		if (gear >=0 || gear <=24) {
			this.gear = gear;
		}
	}
	
	
	double getSpeed() {
		return speed;
	}
	
}