package randomString;
import java.util.*;
import java.util.stream.IntStream;

public class stringGen
{
	private int min, max;
	
	
	/**
	 * Constructor for the stringGen class
	 * By default the minimum is 2, maximum is 10
	 */
	public stringGen()
	{
		max = 10;
		min = 2;
	}
	
	
	public stringGen(final int strMax)
	{	
		max = strMax;
		min = 2;
	}
	
	public stringGen(final int strMin, final int strMax)
	{
		max = strMax;
		min = strMin;
	}
	
	
	
	/**
	 * Generates a random string by generating a random string length from a preset min and max
	 * Then generates a random character for each spot of the string
	 * @return - returns a random string
	 */
	
	
	public String generate()
	{
		Random randInt = new Random(System.currentTimeMillis() + System.nanoTime());
		int length;
		
		do{
			length = randInt.nextInt(max);
		}while(length < min);
		
		int randChar;
		String toReturn = null;
		for(int i = 0; i < length; i++)
		{
			do{
				randChar = randInt.nextInt(123);
			}while(!(randChar >= 65 && randChar <= 90) && !(randChar >= 97 && randChar <= 122));
			
			if(toReturn == null)
			{
				toReturn = Character.toString((char) randChar);
			}
			else
			{
				toReturn += Character.toString((char) randChar);
			}
			
		}
		return toReturn;
	}
	
	public String generateLowercase()
	{
		Random randInt = new Random(System.currentTimeMillis() + System.nanoTime());
		int length;
		
		do{
			length = randInt.nextInt(max);
		}while(length < min);
		
		int randChar;
		String toReturn = null;
		for(int i = 0; i < length; i++)
		{
			do{
				randChar = randInt.nextInt(123);
			}while(!(randChar >= 97 && randChar <= 122));
			
			if(toReturn == null)
			{
				toReturn = Character.toString((char) randChar);
			}
			else
			{
				toReturn += Character.toString((char) randChar);
			}
			
		}
		return toReturn;
	}
	
	public String generateUppercase()
	{
		Random randInt = new Random(System.currentTimeMillis() + System.nanoTime());
		int length;
		
		do{
			length = randInt.nextInt(max);
		}while(length < min);
		
		int randChar;
		String toReturn = null;
		for(int i = 0; i < length; i++)
		{
			do{
				randChar = randInt.nextInt(123);
			}while(!(randChar >= 65 && randChar <= 90));
			
			if(toReturn == null)
			{
				toReturn = Character.toString((char) randChar);
			}
			else
			{
				toReturn += Character.toString((char) randChar);
			}
			
		}
		return toReturn;
	}
	
}
