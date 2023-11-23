package com.andro.entity;

public class Car {
	private Long id;
	private String brand;
	private String type;
	private Fuel fuel;
	private int year;
	
	public Car(Long id, String brand, String type, Fuel fuel, int year) {
		super();
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.fuel = fuel;
		this.year = year;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Fuel getFuel() {
		return fuel;
	}
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", brand=" + brand + ", type=" + type + ", fuel=" + fuel + ", year=" + year + "]";
	}
	
	
	
	
}
