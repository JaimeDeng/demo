package practice;

public class Car {
	private int maxSpeed;
	private String color;
	private String brand;
	private int year;
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void info() {
		System.out.println("車子最高時速: " + maxSpeed + "\n車色: " + color);
		System.out.println("廠牌: " + brand + "\n年分: " + year);
	}
	
	
}
