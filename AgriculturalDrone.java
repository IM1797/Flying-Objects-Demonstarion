import Unmanned.UAV;

public class AgriculturalDrone extends UAV{
	//instance variables
		protected String agDroneBrand;
		protected int agDroneCap ;
		
	        //getter methods
		public String getDroneBrand () {
			return agDroneBrand;
		}
		public int getDroneCap () {
			return agDroneCap;
		}
		
		//setter methods
		public void setDroneBrand (String aBrand) {
			this.agDroneBrand = aBrand;
		}
		public void setDroneCap (int aDroneCap) {
			this.agDroneCap = aDroneCap;
		}
			
		//default constructor
		public AgriculturalDrone () {
			super();
			
			
		}
		
		public AgriculturalDrone ( double aWeight, double aUAVPrice, String aDroneBrand, int agDroneCap) {
			this.aPrice = aUAVPrice;
			this.agDroneBrand = aDroneBrand;
			this.agDroneCap = agDroneCap;
			
		}
		public AgriculturalDrone(AgriculturalDrone obj20) {
			
		}
		
		//copy constructor
		public void AgDrone (AgriculturalDrone anAg) {
			uavWeight = anAg.uavWeight;
			aPrice = anAg.aPrice;
			agDroneBrand = anAg.agDroneBrand;
			agDroneCap = anAg.agDroneCap;
		}
		//overwritten toString method
		public String toString () {
			return ("This "+getClass().getSimpleName()+" weighs "+uavWeight+" and is $"+aPrice+" dollars\n" +
					"\tand is a "+agDroneBrand+" and has capacity "+agDroneCap);
		}
		//equals method
		public boolean equals(AgriculturalDrone anAG) {
			if (anAG == null)
				return false;
			else if (anAG.getPrice() == 0.0)
				return false;
			else if (getClass() != anAG.getClass())
				return false;
			else {
				return (this.uavWeight == anAG.getWeight()) 
						&& (this.aPrice == anAG.getPrice())
						&& (this.agDroneBrand.equals(anAG.getDroneBrand())
						&& (this.agDroneCap == anAG.getDroneCap()));
			}

		}
		
}
