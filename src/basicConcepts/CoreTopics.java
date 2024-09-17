package basicConcepts;

//Signature : CLASS

	//Modifier[opt]  class  Name{  members : variables / functions       }

//Access Modifiers : private , default , public , protected

//class - 1
public class CoreTopics   
{
	//Members : Variables / Functions
	
	//Signature :  Variable
	
	//Modifier[opt]  DataType  Name ;  - Declaration 
	
	//Modifier[opt]  DataType  Name = value ;   - Assignment
	
	public int stdNum = 22 ; // 22 , 24 , 27 ,34, 56, 00 .... 99  , 000 - 999
	
	private char stdGrade  = 'A' ;
	
	double stdPercentage = 94.54; // by default it will take package level visibility
	
	private boolean stdResult = true ; // false
	
	protected String stdName = "David"; // non static / instance variables
	
	//Non Access Modifier : static , final 
	
	//Modifier[opt]  DataType  Name = value ;
	//Access : private , default , public , protected
	//Non Access : static , final
	
	public static final String collegeName = "JNTU";  // static 
	
	//Signature : Function
	
	//Modifier[opt]  ReturnType  Name(){   body   }
	
	//Modifier[opt]  ReturnType  Name(arguments[opt]){   body   }
	                                // inputs
	//psvm
	public static void main(String[] args)   // S - CR 
	{
		System.out.println("Welcome to Java");
		addition();
		addition(20,40);
		addition(250,40);
		addition(12,44,66);
		addition(12,4774,66);
		addition(12,44,6326);
	}
	// no output - 0    no input - 0   : 00
	public static void  addition()   // S1
	{
		int sum = 22+66; // int + int = int		
		System.out.println(sum);
		System.out.println("Sum of two numbers : " + sum);
	}
	
	// 01 , 10 , 11
	public static void  addition(int a, int b) // method overloading   S2
	{
		int sum = a+b; // int + int = int
		System.out.println("Sum of two numbers : " + sum);
	}
	
	public static void  addition(int x, int y,int z) // method overloading    S3
	{
		int sum = x+y+z; // int + int = int
		System.out.println("Sum of three numbers : " + sum);
	}
	
	
	
	
		

}


//In a given java file we can have only one public class , name of the public class and file name must be same 

class Amazon    // Amazon.java
{
	
}

















class FlipKart
{
	
}