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
String sound;
int numberOfGears;
int currentGear = 1;
int operatingCycles = 1;
int speed = 0;
int distance = 0;  
int replay = 0; //for the retry
   
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
   
   myCar.Automobile(year, make, model, color, name,numberOfGears, operatingCycles);
   myCar.car(operatingCycles);
   System.out.println("Name: " + myCar.returnName());
   System.out.println("Speed: " + myCar.returnSpeed());
   System.out.println("Current Gear: " + myCar.returnCurrentGear());
   System.out.println("Sound: " + myCar.returnSound());
   

currentGear++;


System.out.println("Your speed is " + (myCar.returnSpeed()) + ".");


System.out.println("Your distance is " + (myCar.returnDistance()) + ".");

System.out.println("Your car's sound is " +myCar.returnSound() + ".");

System.out.println("Would you like to retry the process? Enter 0 to quit; press any key to add another operating cycle.");
replay = input.nextInt();
   
  }
while (replay != 0); }
  
}