public class Quadcopter extends Helicopter {

	 //instance variables
	 
	protected int quadSpeed;

	//getter methods
	 
	 
	public int getSpeed() {
	return quadSpeed;
	}

	 //setter methods 
	public void setSpeed(int speed) {
		this.quadSpeed = speed;
	}

	 //default constructor
	 
	public Quadcopter() {
		super();
		

	}

	 //parameter constructor
	public Quadcopter(String aBrand, double aPrice, int anHP, int numCylinder, int serviceDate, int numPassenger,
			int speedMAX) {
		
		this.heliCylinder = numCylinder;
		this.heliServiceYear = serviceDate;
		this.heliPassenger = numPassenger;
		this.quadSpeed = speedMAX;
	}

	//copy constructor
	public Quadcopter(Quadcopter aQuad) {
		
		heliCylinder = aQuad.heliCylinder;
		heliServiceYear = aQuad.heliServiceYear;
		heliPassenger = aQuad.heliPassenger;
		quadSpeed = aQuad.quadSpeed;

	}

	//toString overwritten
	public String toString() {
		return ("This " + heliServiceYear + " " + getClass().getSimpleName() + " is made by " + planeBrand + " and is " + planeHP + " horsepower\n"
				+ "\tand has " + heliCylinder + " cylinders and can carry " + heliPassenger + " passengers\n"
				+ "\twith a MAX speed of " + quadSpeed + " Km/Hr");
	}
	//equals methods
	public boolean equals(Quadcopter aQuad) {
		if (aQuad == null)
			return false;
		else if (aQuad.getPrice() == 0.0)
			return false;
		else if (getClass() != aQuad.getClass())
			return false;
		else {
			return (this.planeBrand.contentEquals(aQuad.getBrand()) 
					&& (this.planeHP == aQuad.getHP())
					&& (this.aPrice == aQuad.getPrice()) 
					&& (this.heliCylinder == aQuad.getCylinder())
					&& (this.heliServiceYear == aQuad.getDate()) 
					&& (this.heliPassenger == aQuad.getPassenger())
					&& (this.quadSpeed == aQuad.getSpeed()));
		}
	}





}
