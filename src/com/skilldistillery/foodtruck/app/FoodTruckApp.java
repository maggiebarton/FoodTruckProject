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
		String name;

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter the name of the Food Truck: ");
			name = sc.nextLine();
			if (name.equals("quit")) {
				break;
			} else {

				System.out.print("Enter the type of food : ");
				String type = sc.nextLine();
				System.out.print("Enter the rating (1-5): ");
				int rating = sc.nextInt();
				sc.nextLine();

				// create food trucks and assign user input
				FoodTruck truck = new FoodTruck();
				truck.setName(name);
				truck.setType(type);
				truck.setRating(rating);
				fleet[i] = truck;
			}

		}

		displayMenu();
		System.out.print("Choose Option: ");
		String userChoice = sc.nextLine();

		sc.close();
	}

	public void displayMenu() {
		System.out.println();
		System.out.println("*********************************");
		System.out.println("***       Food Truck Menu     ***");
		System.out.println("***     Choose Option (1-4)   ***");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1. Show All Food Trucks");
		System.out.println("2. Show Average Food Truck Rating");
		System.out.println("3. Show Highest-Rated Food Truck");
		System.out.println("4. Quit");

	}
}
