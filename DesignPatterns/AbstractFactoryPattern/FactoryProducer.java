package AbstractFactoryPattern;

/*
 * Factory producer is responsible for determining which factory to return based on input.
 */
public class FactoryProducer
{
	public static AbstractFactory getFactory(String factoryName)
	{
		switch(factoryName)
		{
			case "Vehicle":
				return new VehicleFactory();
			case "Color":
				return new ColorFactory();
				
			default:
				return null;
		}
	}
}
