package basicConcepts;

import org.junit.Test;

public class StringOperations
{
	
	
	String b = "  Selenium with JAVA     ";
	
	@Test
	public void basicStringOperations()
	{
		int len = a.length();
		System.out.println("String length :" + len);
		String aT = a.trim();
		System.out.println("String after trimimg :" + aT);
		System.out.println("String length after trim :" + aT.length());		
		String aL = a.trim().toLowerCase();
		System.out.println("String in lowercase :" + aL);		
		String aU = a.trim().toUpperCase();
		System.out.println("String in Uppercase :" + aU);
	}
	@Test      // Both of them must be same inn length , same in character sequence , same in case
	public void stringComparision()
	{
		//boolean output = a.trim().toLowerCase().equals(b.trim().toLowerCase());
		boolean output = a.trim().equalsIgnoreCase(b.trim());
		if(output == true)
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}
	}
	
	String c = "JAVA";
	@Test
	public void stringContains()
	{
		if(a.trim().toLowerCase().contains(c.trim().toLowerCase()))
		{
			System.out.println("String A contains C");
		}
		else
		{
			System.out.println("String C is not there in A");
		}
		
	}
	
	@Test
	public void stringConcatenation()
	{
		String d = a.concat(b);
		System.out.println(d);
	}
	
	String a = "    Selenium With Java           ";
	
	//split
	@Test
	public void stringSplit()
	{
		String[] output = a.trim().split(" ");
		//index value for array will begin from 0 [ 0 1 2 ]
		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(output[2]);
	}
	
	//java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
	
	@Test
	public void stringSplit2()
	{
		String[] output = a.trim().split(" ");
		//index value for array will begin from 0 [ 0 1 2 ]
		int len = output.length;
		
		for(int i=0;i<=len;i++)  //  3  - 0 1 2 3
		{
			System.out.println(output[i]); // i = 0 , 1 , 2 ....
		}
	}
	
	
	//we will meet tomorrow , may be my network issue
	
	
	
	
	
	
	
	
	
	
	
	

}
