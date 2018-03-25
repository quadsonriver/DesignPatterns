package FactoryPattern;

/*
 * Returns a Vehicle based on the supplied criteria.
 * Will return null if no matching value is found.
 * 
 * The factory is responsible for deciding which subclass is returned
 * 
 * Vehicle Interface --> Car,Truck,Bus sub-classes
 * Vehicle Factory --> In: String || Out: Vehicle
 */
public class VehicleFactory 
{
	public static Vehicle getVehicle(String criteria)
	{
		switch(criteria)
		{
			case "Car":
				return new Car();
			case "Truck":
				return new Truck();
			case "Bus":
				return new Bus();
			
			default:
				return null;
		}
	}
}
