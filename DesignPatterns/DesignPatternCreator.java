import AbstractFactoryPattern.AbstractFactory;
import AbstractFactoryPattern.FactoryProducer;
import FactoryPattern.VehicleFactory;
import SingletonPattern.Singleton;

public class DesignPatternCreator 
{
	public static void main(String[] args) 
	{
		System.out.println("Starting Singleton Pattern");
		doSingleton();
		System.out.println();
		
		System.out.println("Starting Factory Pattern");
		doFactory();
		System.out.println();
		
		System.out.println("Starting Abstract Factory Pattern");
		doAbstractFactory();
		System.out.println();
	}



	public static void doSingleton()
	{
		System.out.println(" Creating Singleton Instance 'one'");
		Singleton one = Singleton.getInstance();
		
		System.out.println(" Creating Singleton Instance 'two'");
		Singleton two = Singleton.getInstance();
		
		System.out.println(" >> Singleton one: " + one);
		System.out.println(" >> Singleton two: " + two);
		System.out.println(" >> Singleton one and two are equal: " + (one == two));
	}
	
	public static void doFactory()
	{
		String car = "Car";
		String truck = "Truck";
		String bus = "Bus";
		String unknown = "unknown";
		
		System.out.println(" Vehicle Type: " + car);
		System.out.println(" >> Factory returns: " + VehicleFactory.getVehicle(car).getName());
		
		System.out.println(" Vehicle Type: " + truck);
		System.out.println(" >> Factory returns: " + VehicleFactory.getVehicle(truck).getName());
		
		System.out.println(" Vehicle Type: " + bus);
		System.out.println(" >> Factory returns: " + VehicleFactory.getVehicle(bus).getName());

		System.out.println(" Vehicle Type: " + unknown);
		System.out.println(" >> Factory returns: " + VehicleFactory.getVehicle(unknown));
	}

	private static void doAbstractFactory()
	{
		AbstractFactory factory = FactoryProducer.getFactory("Vehicle");
		
		System.out.println(" Creating Vehicle Factory");
		System.out.println(" >> Car: " + factory.getName("Car").getVehicleName());
		System.out.println(" >> Truck: " + factory.getName("Truck").getVehicleName());
		
		factory = FactoryProducer.getFactory("Color");
		System.out.println(" Creating Color Factory");
		System.out.println(" >> Blue: " + factory.getColor("Blue").getColorName());
		System.out.println(" >> Red: " + factory.getColor("Red").getColorName());
	}
}
