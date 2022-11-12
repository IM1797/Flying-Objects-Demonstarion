// -----------------------------------------------------
// Assignment 2
// Part 1
// Written by: Mehrdod Ilhompur 40078633 and David R Cronin 28840024
// -----------------------------------------------------
package helicop;
/**
 * @author Mehrdod 
 */
import airp.Airplane;

public class Helicopter extends Airplane {
	//Declaring instance variables for Helicopter
		protected int heliCylinder;
		protected int heliServiceYear;
		protected int heliPassenger;

		
		 //The getter methods
		 
		public int getCylinder() {
			return heliCylinder;
		}

		public int getDate() {
			return heliServiceYear;
		}

		public int getPassenger() {
			return heliPassenger;
		}

		
		 //Setter methods
		 
		public void setCylinder(int cylinder) {
			this.heliCylinder = cylinder;
		}

		public void setDate(int date) {
			this.heliServiceYear = date;
		}

		public void setPassenger(int passenger) {
			this.heliPassenger = passenger;
		}

		
		 //The default constructor for Helicopter
		 
		public Helicopter() {
			super();
			
		}

		
		 //The parameter constructor for Helicopter
		 
		public Helicopter(String aBrand, double aPrice, int anHP, int numCylinder, int serviceDate, int numPassenger) {
			super();
			this.planeBrand = aBrand;
			this.aPrice = aPrice;
			this.planeHP = anHP;
			this.heliCylinder = numCylinder;
			this.heliServiceYear = serviceDate;
			this.heliPassenger = numPassenger;
		}

		//The copy constructor for Airplane
		
		public Helicopter(Helicopter aHeli) {
			super();
			
			heliCylinder = aHeli.heliCylinder;
			heliServiceYear = aHeli.heliServiceYear;
			heliPassenger = aHeli.heliPassenger;

		}

		//Overwritten toString for Helicopter
		
		public String toString() {
			return ("This " + heliServiceYear + " " + getClass().getSimpleName() + " is made by " + planeBrand + " and is " + planeHP + " horsepower\n"
					+ "\tand has " + heliCylinder + " cylinders and can carry " + heliPassenger + " passengers.");
		}
	 		//Equals method comparing Helicopter objects
		 
		public boolean equals(Helicopter aHeli) {
			if (aHeli == null)
				return false;
			else if (aHeli.getPrice() == 0.0)
				return false;
			else if (getClass() != aHeli.getClass())
				return false;
			else {
				return (this.planeBrand.contentEquals(aHeli.getBrand())
						&& (this.planeHP == aHeli.getHP())
						&& (this.aPrice == aHeli.getPrice())
						&& (this.heliCylinder == aHeli.getCylinder())
						&& (this.heliServiceYear == aHeli.getDate())
						&& (this.heliPassenger == aHeli.getPassenger()));
			}
		}






}