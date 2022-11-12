// -----------------------------------------------------
// Assignment 2
// Part 1 
// Written by: Mehrdod Ilhompur 40078633 and David R Cronin 28840024
// -----------------------------------------------------
package multi;
/**
 * 
 * 
 * 
 * @author Mehrdod
 * 
 */
import helicop.Helicopter;

public class Multirotor extends Helicopter {
	  //Declaring additional instance variable for MultiRotor class
	 
		 public int multiRotors;

		//getter methods
		public int getRotors() {
			return multiRotors;
		}

		//setter method
		public void setRotors(int rotors) {
			this.multiRotors = rotors;
		}

		//default constructor
		public Multirotor() {
			super();
			

		}
		//The parameter constructor for MultiRotor
		public Multirotor(String aBrand, double aPrice, int anHP, int numCylinder, int serviceDate, int numPassenger,
				int numRotors) {
			super();
			this.planeBrand = aBrand;
			this.aPrice = aPrice;
			this.planeHP = anHP;
			this.heliCylinder = numCylinder;
			this.heliServiceYear = serviceDate;
			this.heliPassenger = numPassenger;
			this.multiRotors = numRotors;
		}

		//copy constructor
		public Multirotor(Multirotor aMulti) {
			super();
			planeBrand = aMulti.planeBrand;
			aPrice = aMulti.aPrice;
			planeHP = aMulti.planeHP;
			heliCylinder = aMulti.heliCylinder;
			heliServiceYear = aMulti.heliServiceYear;
			heliPassenger = aMulti.heliPassenger;
			multiRotors = aMulti.multiRotors;
		}

		//Overwritten toString for MultiRotor
		 
		public String toString() {
			return ("This " + heliServiceYear + " " + getClass().getSimpleName() + " is made by " + planeBrand + " and is " + planeHP + " horsepower\n"
					+ "\tand has " + heliCylinder + " cylinders and can carry " + heliPassenger + " passengers\n"
					+ "\tand has " + multiRotors + " rotors.");
		}
		 //Equals method for MultiRotor
		 
		public boolean equals(Multirotor aMulti) {
			if (aMulti == null)
				return false;
			else if (aMulti.getPrice() == 0.0)
				return false;
			else if (getClass() != aMulti.getClass())
				return false;
			else {
				return (this.planeBrand.contentEquals(aMulti.getBrand())
						&& (this.planeHP == aMulti.getHP())
						&& (this.aPrice == aMulti.getPrice())
						&& (this.heliCylinder == aMulti.getCylinder())
						&& (this.heliServiceYear == aMulti.getDate())
						&& (this.heliPassenger == aMulti.getPassenger())
						&& (this.multiRotors == aMulti.getRotors()));
			}
		}

	}

