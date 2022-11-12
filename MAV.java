import Unmanned.UAV;

public class MAV extends UAV{

	//instance variables
	protected String microAVModel ;
	protected double microAVSize ;
	
	//gette methods
	public String getModel () {
		return microAVModel;
	}
	public double getSize () {
		return microAVSize;
	}
	
	//setter methods
	public void setModel (String model) {
		this.microAVModel = model;
	}
	public void setSize (double aSizeAV) {
		this.microAVSize = aSizeAV;
	}
	
	//default constructor
	public MAV () {
		super();
		
		
	}
	//parametrized constructor
	public MAV ( double aWeight, double aUAVPrice, String modelAV, double sizeAV) {
		this.uavWeight = aWeight;
		this.aPrice = aUAVPrice;
		this.microAVModel = modelAV;
		this.microAVSize = sizeAV;
		
	}
	//copy construcrtor
	public MAV (MAV aMicroAV ) {
		uavWeight = aMicroAV.uavWeight;
		aPrice = aMicroAV.aPrice;
		microAVModel = aMicroAV.microAVModel;
		microAVSize = aMicroAV.microAVSize;
	}
	//overwritten toString
	public String toString () {
		return ("This "+getClass().getSimpleName()+" weighs "+uavWeight+" and is $"+aPrice+" dollars\n"+
				"\tand is a "+microAVModel+" and is size "+microAVSize);
	}
	//equals method
	public boolean equals(MAV aMicroAV) {
		if (aMicroAV == null)
			return false;
		else if (aMicroAV.getPrice() == 0.0)
			return false;
		else if (getClass() != aMicroAV.getClass())
			return false;
		else {
			return (this.uavWeight == aMicroAV.getWeight()) 
					&& (this.aPrice == aMicroAV.getPrice())
					&& (this.microAVModel.equals(aMicroAV.getModel())
					&& (this.microAVSize == aMicroAV.getSize()));
		}

	}

}
