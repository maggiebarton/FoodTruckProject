package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {
		// get input from user
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the name of the Food Truck: ");
			String name = sc.nextLine();
			System.out.print("Enter the type of food : ");
			String type = sc.nextLine();
			System.out.print("Enter the rating on (1-5): ");
			int rating = sc.nextInt();
			sc.nextLine();

			// create food trucks and assign user input
			FoodTruck truck = new FoodTruck();
			truck.setName(name);
			truck.setType(type);
			truck.setRating(rating);
			fleet[i] = truck;
		}
		sc.close();
	}

}
