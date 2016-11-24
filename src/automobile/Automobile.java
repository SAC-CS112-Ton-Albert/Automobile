package automobile;


import java.util.Scanner;


public class Automobile {
   
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       
       CreateCar myCar = new CreateCar();
       
       
    int year;
    String make;
    String model;
    String color;
    String name;
    int numberOfGears;
    int cycle = 1;
    int currentSpeed = 10;
    int currentGear = 1;
 int replay = 0;
 int distance = 0;
    
        
    
    System.out.println("What is the name of your car?");
    name = input.next();
    
    System.out.println("What is the make of your car?");
    make = input.next();
    
    System.out.println("What is the model of your car?");
    model = input.next();
    
    System.out.println("What is the year of your car?");
    year = input.nextInt();
    
    System.out.println("What is the color of your car?");
    color = input.next();
    
    System.out.println("What is the number of gears in your car?");
    numberOfGears = input.nextInt();
    
    
do {     
    
    myCar.CarAttributes(year, make, model, name, numberOfGears, color, cycle);
    System.out.println("The name of your car is: " + myCar.returnName());
    System.out.println("The make of your car is: " + myCar.returnMake());
    System.out.println("The model of your car is: " + myCar.returnModel());
    System.out.println("The color of your car is: " + myCar.returnColor());
    System.out.println("The number of the gears of your car is: " + myCar.returnCarGears());
    System.out.println("The cycle of your car is: " +  (cycle) + ".");
    
if (cycle < numberOfGears) 
    currentSpeed = 10 * currentGear;
else
    currentSpeed = currentSpeed;
 
if (cycle < numberOfGears)
        cycle++;
else
	cycle = numberOfGears;

currentGear++;

System.out.println("Your speed is " + (currentSpeed) + ".");


 distance = distance + currentSpeed;


 System.out.println("Your distance is " + distance + ".");


 System.out.println("Would you like to retry the process? Enter 0 to quit; press any key to add another operating cycle.");
    replay = input.nextInt();
    
   } 
 while (replay != 0); }
   
}