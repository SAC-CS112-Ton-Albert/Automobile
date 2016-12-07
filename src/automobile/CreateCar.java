package automobile;

/**
*
* @author albertton
*/


public class CreateCar {

    
	private int year;
	private String make;
	private String model; 
	private String color; 
	private String name;
        private String sound;
	private int numberOfGears;
	private int currentGear;
	private int operatingCycles;
	private int Speed;
	private int distance;  
    
	//creates car attributes
	public void Automobile (int caryear, String carmake, String carmodel, String carcolor, String carname, int cargears, int carcycle) {
	    
		this.year = caryear;
		this.make = carmake;
		this.model = carmodel;
		this.color = carcolor;
		this.name = carname;
		this.numberOfGears = cargears;
		this.operatingCycles = carcycle;

	}
    
	public void car (int carcycle) {
	
		operatingCycles = carcycle;
	    
		
		if (operatingCycles <= numberOfGears) 
                {
			currentGear = operatingCycles;
		}    
	    
		// Establish the current vehicle's speed
		Speed = currentGear * 10;
	    
		// Establish the current vehicle's distance traveled
		distance += Speed;
	    
		// Set the sound of the car.
		if (distance <= 10) 
                {
			sound = "purrrrrrrr";
		}
		if (distance > 10) 
                {
			sound = "vrooooooom";
                        
                if (distance < 100)  
                        sound = "vrooooooom";
		} 
		if (distance > 100) {
			sound = "sputter";
			
		}
	    
	}
    
    
	public int returnSpeed () {
		return this.Speed;
	}
    
	public String returnSound () {
		return this.sound;
	}
        
        public String returnName () {
		return this.name;
	}
    
	public int returnCurrentGear () {
		return this.numberOfGears;
	}
    
	public int returnDistance () {
		return this.distance;
	}
    
}
