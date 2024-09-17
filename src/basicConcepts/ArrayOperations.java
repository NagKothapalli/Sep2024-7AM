package basicConcepts;

import org.junit.Test;

public class ArrayOperations {
	
	int roll1 = 22;  int roll2 = 24 ; int roll3 = 56 ;   int roll4 = 12 ; //.........
	
	//known facts - 7 wonders , 7 continents 
	
	// Modifier  DataType  name = value ;
	
	public int stdNum = 22;
	
	// Modifier DataType[] name = { values ......} ;
	
	public int[] stdNums = {22,25,12,14,16};  // instance
	
	//Declare , Assignment , Length , Read , write
	
	@Test
	public void fixedArray_integer()
	{
		int[] numbers = {22,25,12,14,16};  // local variable
		
		int len = numbers.length;
		
		System.out.println("Array length :" + len);
		
		for(int i=1;i<=numbers.length;i++)   // i = 1 2 3 4 5
		{
			System.out.println(numbers[i]); // i= 0 1  2 3 4 .....
		}
		
	}
	
	@Test
	public void fixedArray_string()
	{
		//int[] numbers = {22,25,12,14,16};  // local variable
		
		String[] names = {"Ram","Rahim","Raj","John"};
		
		int len = names.length;
		
		System.out.println("Array length :" + len);
		
		for(int i=0;i<names.length;i++)   // i = 1 2 3 4 5
		{
			System.out.println(names[i]); // i= 0 1  2 3 4 .....
		}
		
		//reading from array
		
		String name = names[0];
		
		//writing in to array
		
		names[0]  = "Ramesh";
		
		for(int i=0;i<names.length;i++)
		{
			names[i]  = "Ramesh"+i;
			System.out.println(names[i]);
		}
		
		
	}
	
	//Dynamic Array
	
	//Modifier  DataType[]  name = new DataType[size];
	
	@Test
	public void dynamicArray_integer()
	{
		//int[] numbers = {22,25,12,14,16};  // local variable
		
		int[] numbers = new int[10];
		
		int len = numbers.length;
		
		System.out.println("Array length :" + len);
		
		for(int i=1;i<=numbers.length;i++)   // i = 1 2 3 4 5
		{
			System.out.println(numbers[i]); // i= 0 1  2 3 4 .....
		}
		
	}
	
	@Test
	public void dynamicArray_string()
	{
		//int[] numbers = {22,25,12,14,16};  // local variable
		
		//String[] names = {"Ram","Rahim","Raj","John"};
		
		String[] names = new String[10];
		
		int len = names.length;
		
		System.out.println("Array length :" + len);
		
		for(int i=0;i<names.length;i++)   // i = 1 2 3 4 5
		{
			System.out.println(names[i]); // i= 0 1  2 3 4 .....
		}
		
		//reading from array
		
		String name = names[0];
		
		//writing in to array
		
		names[0]  = "Ramesh";
		
		for(int i=0;i<names.length;i++)
		{
			names[i]  = "Ramesh"+i;
			System.out.println(names[i]);
		}
		
		
	}
	
	//List - ArrayList
	
	
	
	
	

}
