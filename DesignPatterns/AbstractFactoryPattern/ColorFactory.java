package AbstractFactoryPattern;

public class ColorFactory extends AbstractFactory
{

	@Override
	public Vehicle getName(String vehicle)
	{
		return null;
	}

	@Override
	public Color getColor(String color)
	{
		switch(color)
		{
			case "Blue":
				return new Blue();
			case "Red":
				return new Red();
				
			default:
				return null;
		}
	}

}
