// -----------------------------------------------------
// Assignment 2
// Part 1 
// Written by: Mehrdod Ilhompur 40078633 and David R Cronin 28840024
// -----------------------------------------------------
/**
 * 
 * @author Mehrdod
 */
package airp;
import helicop.Helicopter;
import helicop.Quadcopter;
import multi.Multirotor;
import Unmanned.UAV;
import drone.AgriculturalDrone;
import drone.MAV;

 
public class FlyObjDriver {

	public static void main(String[] args) {
		// Welcome
				System.out.println("Welcome to Flying Objects demonstration program of seven\n"
						+"classes in five packages with interlocking variables and methods");
				System.out.println("The newly created Flying Objects will be place in an array.\n");

		// Initializing an array of size 50 to contain FlyingObjects
				System.out.println("Initializing an array of size 50 to contain FlyingObjects");
				FlyingObjects[] objArray = new FlyingObjects[50];
				System.out.println("An array of size "+objArray.length+" has been created");
				
		// testing constructors and copiers
				System.out.println("Creating two objects and loading them into the array");
				FlyingObjects obj0 = new FlyingObjects();
				objArray[0] = obj0;
				objArray[0] = obj0;
				Multirotor obj22 = new Multirotor("DragFly", 987.65, 82, 4, 2017, 1, 4);
				objArray[22] = obj22;
				
				System.out.println("Object 22 get class : \t" + objArray[22].getClass());
				System.out.println("Object 22 get simple name : \t" + objArray[22].getClass().getSimpleName());
				System.out.println("\n\n");

				Airplane obj1 = new Airplane();
				Airplane obj2 = new Airplane("Cessna", 2400, 235);
				Airplane obj3 = new Airplane(obj2);

				Helicopter obj4 = new Helicopter();
				Helicopter obj5 = new Helicopter("Bell", 300.0, 475, 8, 2001, 8);
				Helicopter obj6 = new Helicopter(obj5);

				Quadcopter obj7 = new Quadcopter();
				Quadcopter obj8 = new Quadcopter("DraganFly", 99.0, 40, 1, 2011, 0, 88);
				Quadcopter obj9 = new Quadcopter(obj8);

				Multirotor obj10 = new Multirotor();
				Multirotor obj11 = new Multirotor("Custom", 999.9, 85, 2, 2018, 1, 8);
				Multirotor obj12 = new Multirotor(obj11);

				UAV obj13 = new UAV();
				UAV obj14 = new UAV(10, 89.0);
				UAV obj15 = new UAV(obj14);

				MAV obj16 = new MAV();
				MAV obj17 = new MAV(78.9, 95.0, "Fungus", 4);
				MAV obj18 = new MAV(obj17);

				AgriculturalDrone obj19 = new AgriculturalDrone();
				AgriculturalDrone obj20 = new AgriculturalDrone(78.9, 95.0, "Fungus", 4);
				AgriculturalDrone obj21 = new AgriculturalDrone(obj20);
				
		// setting the prices differently
				obj1.setPrice(25.25);
				obj3.setPrice(6.35);
				obj4.setPrice(26.35);
				obj7.setPrice(27.45);
				obj6.setPrice(125.5);
				obj10.setPrice(28.55);
				obj13.setPrice(29.65);
				obj16.setPrice(252.75);
				obj17.setPrice(5.75);
				obj19.setPrice(253.75);
				obj12.setPrice(1025.5);

		// loading the object array
				objArray[1] = obj1;
				objArray[2] = obj2;
				objArray[3] = obj3;
				objArray[4] = obj4;
				objArray[5] = obj5;
				objArray[6] = obj6;
				objArray[7] = obj7;
				objArray[8] = obj8;
				objArray[9] = obj9;
				objArray[10] = obj10;
				objArray[11] = obj11;
				objArray[12] = obj12;
				objArray[13] = obj13;
				objArray[14] = obj14;
				objArray[15] = obj15;
				objArray[16] = obj16;
				objArray[17] = obj17;
				objArray[18] = obj18;
				objArray[19] = obj19;
				objArray[20] = obj20;
				objArray[21] = obj21;
				

		// printing out groups of 3 array objects with appropriate toString
				System.out.println("===> Printing out the array objects with corresponding toString\n"
						+"Objects with each of 3 constructors are created and loaded into the array\n"
						+"The prices have been adjusted (duplicates from copy and default constructors)\n");
				for (int i = 1; i < objArray.length; i++) {
					if (objArray[i] == null)
						break;
					System.out.println(objArray[i].toString());
					if ((i % 3) == 0)
						System.out.println("\n");

				}

		// printing out the array objects with index, simple name and price
				System.out.println("\n===> Printing out the array objects with index, simple name and price\n");
				for (int i = 0; i < objArray.length; i++) {
					if (objArray[i] == null)
						break;
					System.out.println(i + "\t" + objArray[i].getClass().getSimpleName() + "\t\t" + objArray[i].getPrice());
				}

		// testing the equals method
				System.out.println("\n===> Demonstrating the equals method:");
				System.out.println("\nObj 14 = 15 returns: " + obj14.equals(obj15));
				System.out.println("14 "+objArray[14].toString()+"\n"+"15 "+objArray[15].toString());
				System.out.println("\nObj 10 = 15 returns: " + obj10.equals(obj15));
				System.out.println("10 "+objArray[10].toString());
				System.out.println("\nObj 18 = 16 returns: " + obj18.equals(obj16));
				System.out.println("18 "+objArray[18].toString()+"\n"+"16 "+objArray[16].toString());
				
		// Bubble sort array on price

				for (int i = 0; i < objArray.length; i++) {
					for (int j = 0; j < objArray.length - 1 - i; j++) {
						if (objArray[j + 1] == null)
							break;
						if (objArray[j].getPrice() <  objArray[j + 1].getPrice()) {
							FlyingObjects temp = objArray[j];
							objArray[j] = objArray[j + 1];
							objArray[j + 1] = temp;
						}
					}
				}
		// printing out the two highest prices
				System.out.println("\n===> Printing out the two highest prices\n");
				System.out.println(objArray[0].toString() + "\n\tand price is " + objArray[0].getPrice());
				System.out.println(objArray[1].toString() + "\n\tand price is " + objArray[1].getPrice());

		// printing out the sorted array objects by price
				System.out.println("\n===> Printing out the array objects with index, tag name and price\n");
				for (int i = 0; i < objArray.length; i++) {
					if (objArray[i] == null)
						break;
					System.out.println(i + "\t" + objArray[i].getClass().getSimpleName()+"\t"+objArray[i].getPrice());
				}
				

				
			// end of main	
			}
			
		
	}


