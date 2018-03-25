package AbstractFactoryPattern;

public class VehicleFactory extends AbstractFactory
{

	@Override
	public Vehicle getName(String vehicle)
	{
		switch(vehicle)
		{
			case "Car":
				return new Car();
			case "Truck":
				return new Truck();
			
			default:
				return null;
		}
	}

	@Override
	public Color getColor(String color)
	{
		return null;
	}

}
