package automobile;


public class CreateCar implements Runnable {

	public int caryear;
        public int cargear = 0; 
        public int operatingCycle = 0;
        public int currentSpeed = 0;
        public int currentGear = 0;
	public String carmake = "";
        public String carmodel = "";
        public String carcolor = "";
        public String carname = "";
	public float distance = 0;

	public CreateCar(int year, String make, String model, String color, String name, int gear) {
		caryear = year;
		carmake = make;
		carmodel = model;
		carname = name;
		cargear = gear;
		carcolor = color;
	}

	public void setYear(int year) 
        { 
		caryear = year;
	}

	public void setMake(String make) 
        {
		carmake = make;
	}

	public void setModel(String model)
        {
		carmodel = model;
	}

	public void setColor(String color) 
        { 
		carcolor = color;
	}

	public void setName(String name) 
        { 
		carname = name;
	}

	public void setGears(int gear) { 
		cargear = gear;
	}

	public void setOperatingCycle(int operatingCycle) { 
		if (operatingCycle <= cargear)
			currentGear = operatingCycle;

		
	}

	public int getYear() { 
		return caryear;
	}

	public String getMake() { // allows user to get make of car
		return carmake;
	}

	public String getModel() { // allows user to get model of car
		return carmodel;
	}

	public String getColor() { // allows user to get color of car
		return carcolor;
	}

	public String getName() { // allows user to get name of car
		return carname;
	}

	public int getGear() { 
		return cargear;
	}

	public int getOperatingCycle() { 
		return operatingCycle;
	}

	public int currentGear() { 
		if (operatingCycle > cargear) { 
			currentGear = cargear;
		} else {
			currentGear = operatingCycle;
		}
		return currentGear;
	}

	public int getSpeed() { 
		return currentSpeed;
	}

	public synchronized float getDistance() throws Exception { // returns distance

		if (distance < 10)
			System.out.println("Purr.");
		else
			System.out.println("Vroom.");
		if (distance > 100) {
			System.out.println("Sputter.");
		}
		return distance;
	}

	public String toString() { // prints string of info based on Object
		return "\n" + "Name: " + carname + "\nYear: " + caryear + "\nMake: " + carmake + "\nModel: " + carmodel
				+ "\nColor: " + carcolor + "\nNumber of gears: " + cargear;
                                        

	}

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

	
	
}