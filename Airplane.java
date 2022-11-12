// -----------------------------------------------------
// Assignment 2
// Part 1 
// Written by: Mehrdod Ilhompur 40078633 and David R Cronin 28840024
// -----------------------------------------------------
 package airp;
/**
 * 
 * @author Mehrdod
 *
 */
public class Airplane extends FlyingObjects {
		
		//  Declaring instance variables for Airplane
		 
		protected String planeBrand ;
		protected double aPrice ;
		protected int planeHP ;
		
	
		 //The getter methods
		public String getBrand () {
			return planeBrand;
		}
		public String getSimpleName () {
			return getClass().getName();
		}
		public double getPrice () {
			return aPrice;
		}
		public int getHP () {
			return planeHP;
		}
		
		//Setter methods 
		public void setBrand (String brand) {
			this.planeBrand = brand;
		}
		
		public void setPrice (double price) {
			this.aPrice = price;
		}
		public void setHP (int aHP) {
			this.planeHP = aHP;
		}
	
		//The default constructor for Airplane
		 
		public Airplane () {
			super();
		
		}
	
		 //The parameter constructor for Airplane
		public Airplane ( String aBrand, double aPrice, int anHP ) {
			super();
		
			this.planeBrand = aBrand ;
			this.aPrice = aPrice ;
			this.planeHP = anHP ;
		}
	
		//The copy constructor for Airplane
		 
		public Airplane(Airplane aPlane) {
			super();
			planeBrand=aPlane.planeBrand;
			aPrice = aPlane.aPrice;
			planeHP = aPlane.planeHP;
		}
		//Overwritten toString method for Airplane
		public String toString () {
			return ("This "+getClass().getSimpleName()+" is made by "+planeBrand+" and is "+planeHP+" horsepower.");
		}
		
		//Equals methods comparing Airplane objects
		 
		public boolean equals(Airplane aPlane) {
			if (aPlane == null)
				return false;
			else if (aPlane.getPrice() == 0.0)
				return false;
			else if (getClass() != aPlane.getClass())
				return false;
			else {
				return (this.planeHP == aPlane.getHP() 
						&& (this.planeBrand.contentEquals(aPlane.getBrand()))
						&& (this.aPrice == aPlane.getPrice()));
			}

		}
}