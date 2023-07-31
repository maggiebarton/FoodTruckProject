# FoodTruckProject


## Overview
Welcome to the Food Truck App! Users can store data for up to five of their favorite Food Trucks using the "Enter Food Trucks Menu." In the Main Menu, users can display all their saved Food Trucks, calculate and display the average rating of all their Food Trucks, and/or display the highest Rated Food Truck. Users can type 'quit' in the Enter Trucks Menu and type '4' in the Main Menu to quit the menu or app, respectively.


## Lessons Learned
I think the biggest Lesson Learned on this project was dealing with "null" Objects in my array at any time. I struggled with the logic for the average rating and highest rating methods because initially I was including FoodTruck Objects in the entire array, even if they didn't exist. I declared and initialized the FoodTruck fleet array to hold 5 trucks, so if a user only entered two, I still had 3 "null" FoodTruck Objects that were being included in my calculations. It made sense for me to use:

	if (FoodTruck foodTruck != null){
		
		}

in the displayTrucks method, because I didn't want to see "null" Trucks. Including this logic for the averageRating and highestRating was crucial for my sysouts to display correctly and avoid compiler errors.

Also, I included a heavy use of methods in this project. I was proud of this work, because it's something I wanted to to in my previous project and I accomplished it here. My code is readable, troubleshooting was easier, and honestly, it just looks better.

Furthermore, while building this project I was really thinking about how the user will interact with the app. This was extremely helpful in design. From simple things like explicitly stating instructions, to more "behind the scenes" actions like ignoring case when users type 'quit.'

I would've liked to include a unique case in the Enter Food Trucks Menu that accounted for when a user types 'quit' for the first Food Truck. They have no Food Truck data stored, so the app renders useless in this situation. The user should get a message that says something like, "You don't have any Food Trucks. Goodbye!," and the Main Menu is bypassed to quit the app. I got close on this one but it still wasn't working exactly right, so this functionality is not present in my final project. I also would've liked to find a way for the user to go back and enter more Food Trucks from the Main Menu if they entered less than 5 Food Trucks the first time around. This one was more challenging to wrap my head around.

## Technologies Used
- Eclipse
- Java
- Git
- GitHub