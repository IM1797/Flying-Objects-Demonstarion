import airp.Airplane;
import airp.FlyingObjects;

public class UAV extends FlyingObjects {

	//instance variables
	protected double uavWeight ;
	protected double aPrice ;
	
	
	//getter methods
	public double getWeight () {
		return uavWeight;
	}
	public double getPrice () {
		return aPrice;
	}
	
	
	//setter methods
	public void setWeight (double weight) {
		this.uavWeight = weight;
	}
	public void setPrice (double price) {
		this.aPrice = price;
	}
	
	//default constructor
	public UAV () {
		super();
		
		
	}
	//parametrized constructor
	public UAV ( double aWeight, double aUAVPrice ) {
		super();
		this.uavWeight = aWeight;
		this.aPrice = aUAVPrice;
	}
	//copy constructor
	public UAV (UAV aUAV) {
		super();
		uavWeight = aUAV.uavWeight;
		aPrice = aUAV.aPrice;
	}
	//toString overwritten
	public String toString() {
		return ("This " + getClass().getSimpleName() + " weighs " + uavWeight + " and is " + aPrice + " dollars.");
	}

	//equals method
	public boolean equals(UAV aUAV) {
		if (aUAV == null)
			return false;
		else if (aUAV.getPrice() == 0.0)
			return false;
		else if (getClass() != aUAV.getClass())
			return false;
		else {
			return (this.uavWeight == aUAV.getWeight() && (this.aPrice == aUAV.getPrice()));
		}

	}
}
