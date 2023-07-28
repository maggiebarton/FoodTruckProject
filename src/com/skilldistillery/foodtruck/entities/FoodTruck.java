package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private String type;
	private int rating;
	private int id;
	private static int nextTruckId =0;
	
	@Override
	public String toString() {
		return "FoodTruck [name=" + name + ", type=" + type + ", rating=" + rating + ", id=" + id + "]";
	}
	
	public FoodTruck() {
		id = nextTruckId;
		nextTruckId++;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}

	

}
