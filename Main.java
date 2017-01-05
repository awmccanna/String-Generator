package randomString;
import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		
		Scanner kb = new Scanner(System.in);
		System.out.println("How many strings would you like to generate?");
		int numStrs = Integer.parseInt(kb.nextLine());
		System.out.println("Generating and printing random strings");
		stringGen generator = new stringGen(10);
		String[] randoms = new String[numStrs];
		for(int i = 0; i < numStrs; i++)
		{
			randoms[i] = generator.generate();
			
		}
		
		for(int j = 0; j < numStrs; j++)
		{
			System.out.println(randoms[j]);
		}
		
		System.out.println();
		System.out.println("Lower case strings:");
		
		for(int i = 0; i < numStrs; i++)
		{
			randoms[i] = generator.generateLowercase();
			
		}
		
		for(int j = 0; j < numStrs; j++)
		{
			System.out.println(randoms[j]);
		}
		System.out.println();
		System.out.println("Upper case strings:");
		
		for(int i = 0; i < numStrs; i++)
		{
			randoms[i] = generator.generateUppercase();
			
		}
		
		for(int j = 0; j < numStrs; j++)
		{
			System.out.println(randoms[j]);
		}	
	}

}
