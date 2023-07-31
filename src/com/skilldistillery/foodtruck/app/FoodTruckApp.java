package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];
	private boolean quitEnterFoodTrucks;
	private boolean quitMainMenu;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.run();
	}

	public void run() {

		// initial app greeting
		initialMenu();

		// user is prompted to enter up to 5 food trucks or quit to main menu
		do {
			enterFoodTrucks();
		} while (!quitEnterFoodTrucks);

		// user enters main menu and loops through it until they type '4' to quit
		do {
			mainMenu();

		} while (!quitMainMenu);

		// farewell
		System.out.println("Thanks for using the Food Truck App. Goodbye!");

		sc.close();
	}

	public void initialMenu() {
		System.out.println("***********************************************************");
		System.out.println("*                                                         *");
		System.out.println("* \t\tWelcome to the Food Truck App!            *");
		System.out.println("*                                                         *");
		System.out.println("***********************************************************");
		System.out.println();
		System.out.println("Enter information about your favorite food trucks! You may enter up to 5 Food Trucks.");
	}

	public void enterFoodTrucks() {
		for (int i = 0; i < fleet.length; i++) {
			System.out.println();
			System.out.println("Type 'quit' to access Main Menu.");
			System.out.print("Enter the name of a Food Truck: ");
			String name = sc.nextLine();

			if (name.equalsIgnoreCase("quit")) {
				quitEnterFoodTrucks = true;
				return;
			}

			System.out.print("Enter the type of food : ");
			String type = sc.nextLine();

			System.out.print("Enter the rating (1-5): ");
			int rating = sc.nextInt();
			sc.nextLine();

			// create food trucks and assign user input + id
			fleet[i] = new FoodTruck(name, type, rating);
		}
	}

	public void mainMenu() {
		System.out.println();
		System.out.println("*********************************");
		System.out.println("***          Main Menu        ***");
		System.out.println("***     Choose Option (1-4)   ***");
		System.out.println("*********************************");
		System.out.println();
		System.out.println("1. Show All Food Trucks");
		System.out.println("2. Show Average Food Truck Rating");
		System.out.println("3. Show Highest-Rated Food Truck");
		System.out.println("4. Quit");
		System.out.print("Choose Option: ");
		int userChoice = sc.nextInt();
		sc.nextLine();

		userAnswer(userChoice);

	}

	public void userAnswer(int userChoice) {
		switch (userChoice) {
		default:
			System.out.println("ERROR: Invalid Input. Choose an option or type 4 to quit.");
			break;
		case 1:
			// display all food truck data
			displayTrucks();
			break;
		case 2:
			// calculate and display average food truck rating
			averageRating();
			break;

		case 3:
			// display highest rated food truck
			highestRating();
			break;

		case 4:
			quitMainMenu = true;
			break;

		}
	}

	public void displayTrucks() {
		for (FoodTruck foodTruck : fleet) {
			if (foodTruck != null) {
				System.out.println(foodTruck);
			}
		}
	}

	public void averageRating() {
		double sum = 0.0;
		double numberOfTrucks = 0.0;
		double averageRating = 0.0;
		for (FoodTruck foodTruck : fleet) {
			if (foodTruck != null) {
				sum = sum + foodTruck.getRating();
				numberOfTrucks++;
			}
		}
		averageRating = sum / numberOfTrucks;
		System.out.printf("Average Food Truck Rating: %.2f%n", averageRating);

	}

	public void highestRating() {
		int highestRating = 0;
		FoodTruck highestTruck = null;
		for (FoodTruck foodTruck : fleet) {
			if (foodTruck != null) {
				if (highestRating < foodTruck.getRating()) {
					highestRating = foodTruck.getRating();
					highestTruck = foodTruck;
				}
			}

		}
		System.out.println("The highest rated Food Truck is \n" + highestTruck);
	}
}
