package basicConcepts;

import java.util.ArrayList;
import java.util.Collections;

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
	
	//Declaration , Assignment , size , add elements , read the elements 
	
	//ArrayList<GenericType>  objectName = new ArrayList<GenericType>();
	
	//primitive data types : int , boolean , char   -> Integer , Boolean , Character
	
	//java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 5   , java.lang.IndexOutOfBoundsException: Index 5 out of bounds for length 5
	
	//Interface : List ,  ArrayList -> class  , ArrayList implements List
	
	@Test
	public void workWithArrayList()
	{
		ArrayList<Integer>  numbers = new ArrayList<Integer>();		
		int count = numbers.size();
		System.out.println("Intial count :"+ count);
		numbers.add(44);   numbers.add(66); numbers.add(24);  numbers.add(88);  numbers.add(12);
		numbers.add(444);   numbers.add(266); numbers.add(2224);  numbers.add(881);  numbers.add(1432);
		numbers.add(414);   numbers.add(566); numbers.add(2654);  numbers.add(898);  numbers.add(102);
		System.out.println("Second count :" + numbers.size());
		//numbers.get(0);
		
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));  // i=0 - get(0)  , i=1  get(1) , i=2 get(2) , i=3  get(3) .....
		}
		
		numbers.remove(4);
		
		System.out.println("count after removing :"+ numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));  // i=0 - get(0)  , i=1  get(1) , i=2 get(2) , i=3  get(3) .....
		}
		
		numbers.add(6, 666);
		numbers.add(7, 777);
		
		System.out.println("count after inserting :"+ numbers.size());
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));  // i=0 - get(0)  , i=1  get(1) , i=2 get(2) , i=3  get(3) .....
		}
		
		Collections.sort(numbers);
		System.out.println("elements after sorting  --------- :");
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));  // i=0 - get(0)  , i=1  get(1) , i=2 get(2) , i=3  get(3) .....
		}
		
		Collections.sort(numbers, Collections.reverseOrder());
		System.out.println("elements after reverse sorting  --------- :");
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));  // i=0 - get(0)  , i=1  get(1) , i=2 get(2) , i=3  get(3) .....
		}
		
		//System.out.println("-----1------- : "+numbers.get(0));
		//System.out.println("-----2------- : "+numbers.get(1));
		//System.out.println("-----3------- : "+numbers.get(2));
		//System.out.println("-----4------- : "+numbers.get(3));
		//System.out.println("-----5------- : "+numbers.get(4));
		//System.out.println("-----6------- : "+numbers.get(5));
		//numbers.get(-1);  
		//numbers.get(4);
		//numbers.get(5);
		
	}
	
	
	
	
	
	
	
	
	

}
