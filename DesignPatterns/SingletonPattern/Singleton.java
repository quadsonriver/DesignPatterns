package SingletonPattern;
/*
 * Will return instance of Singleton if exists, otherwise will create one.
 * Is static so that only one instance exists... this version is not thread safe however
 */

public class Singleton 
{
	private static Singleton instance;
		
	//this should be private to prevent applications calling into it
	private Singleton()
	{	}
	
	public static Singleton getInstance()
	{
		if(instance == null)
			instance = new Singleton();
		
		return instance;
	}
}
