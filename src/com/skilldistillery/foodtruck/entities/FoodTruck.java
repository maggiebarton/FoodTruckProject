package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
	private String name;
	private String type;
	private int rating;
	private int id;
	private static int nextTruckId = 0;

	@Override
	public String toString() {
		//combined two strings with new lines after to read data easier (and it looks way cleaner)
		String one = "ID: " + id + "\t\tFood Truck Name: " + name+ "\n";
		String two = "Rating: " + rating + "\tType of Food: " + type + "\n";
		return one + two;
	
	}

	public FoodTruck(String name, String type, int rating) {
		this.name = name;
		this.type = type;
		this.rating = rating;
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
