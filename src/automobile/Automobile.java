package automobile;

/**
*
* @author albertton
*/


import java.util.Scanner;

public class Automobile{

	public static void main(String[] args) throws Exception {

		CreateCar Truck = new CreateCar(1999, "Toyota", "Tacoma", "Blue", "Trucky McTruckerson", 3);

		CreateCar Van = new CreateCar(2001, "Toyota", "Sienna", "Burgendy", "Vann", 4);

		CreateCar Sportcar = new CreateCar(1996, "Toyota", "Celica", "Red", "Fancy Pants Sport Car", 6);

		Scanner input = new Scanner(System.in); // new scanner object input

		System.out.println("How many dice would you like to roll?");

		int diceNumber = input.nextInt(); 
                
		int RaceCycles = Dice.ThrowDice(diceNumber);

		String RaceStatus = ""; 

		try {

			Thread t1 = new Thread(Truck); // instantiates new thread t1
			t1.start();

			Thread t2 = new Thread(Van); // instantiates new thread t2
			t2.start();

			Thread t3 = new Thread(Sportcar); // instantiates new thread
												// t3
			t3.start();

			System.out.println("");

			float carSum = (Truck.getDistance() + Van.getDistance() + Sportcar.getDistance());

			System.out.println("Total distance = " + carSum + ".");

			System.out.println("Goodbye!");

		} catch (Exception e) {
			System.out.println("Warning");
		}
        }
        
}

   