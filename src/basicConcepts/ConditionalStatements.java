package basicConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	
	@Test
	public void compareNumbers_if()
	{
		int num1 = 22;  // local variable
		int num2 = 22;
		
		// if(expression -> boolean : true / false) {  Task   }
		
		if(num1==num2)   // = : assignment      == : relational operator
		{
			//true
			System.out.println("Both the Numbers are equal");
		}
		
	}
	
	@Test
	public void compareNumbers_ifelse()
	{
		int num1 = 22; //fixed
		int num2 = 25; //local variable
		
		// if(expression -> boolean : true / false) {  Task   }
		
		if(num1==num2)   // = : assignment      == : relational operator
		{
			//true
			System.out.println("Both the Numbers are equal");
		}
		else
		{
			//false
			System.out.println("Both the Numbers are not equal");
		}
		
	}
	
	@Test
	public void compareNumbers_ifelse_test() //TTD : Test Driven Development / Unit Testing / White box / Glass box
	{
		compareNumbers_ifelse(66,66);   // 4/8 =50 %
		compareNumbers_ifelse(46,66);   // 4 / 8 = 50 %
	}
	
	// Dev code
	public void compareNumbers_ifelse(int num1,int num2)
	{
		// if(expression -> boolean : true / false) {  Task   }
		System.out.println("First Number :" + num1);
		System.out.println("Second Number :" + num2);
		if(num1==num2)   // = : assignment      == : relational operator
		{
			//true
			System.out.println("Both the Numbers are equal");
		}
		else
		{
			//false
			System.out.println("Both the Numbers are not equal");
		}
		
	}
	
	// Write a program to read two integers as inputs and perform addition if they are equal , if not perform subtraction
	@Test
	public void performAdditionAndSubtraction_test()
	{
		performAdditionAndSubtraction(44,44);
		performAdditionAndSubtraction(88,34);
	}
	
	public void performAdditionAndSubtraction(int a,int b)
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		if(a==b)   // = : assignment      == : relational operator
		{
			//true
			int sum = a+b;
			System.out.println("Both the Numbers are equal , SUM :"+ sum);
		}
		else
		{
			//false
			int diff = a-b;
			System.out.println("Both the Numbers are not equal , Difference :" + diff);
		}
		
	}
	
	// Write a program to read two integers as inputs and perform addition if they are equal , perform subtraction if a>b , do multiplication if a<b
	@Test
	public void multipleDecisions_unittest()
	{
		multipleDecisions(56,22);  // 33 %
		multipleDecisions(22,66);  // 33 %
		multipleDecisions(44,44); // 33 %
	}
	public void multipleDecisions(int a , int b)
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		
		if(a==b)
		{
			//true
			int sum = a+b;
			System.out.println("Both the Numbers are equal , SUM :"+ sum);
		}
		else if(a>b)
		{
			//true
			int diff = a-b;
			System.out.println("First Num is above Second Number , Difference :" + diff);
		}
		else if(a<b)
		{
			//true
			int prod = a*b;
			System.out.println("First Number is below Second Number , Product :" + prod);
		}
	}
	
	// Write a program to read two integers as inputs and do the below task if and only if both the inputs are above 10
	
	//Task : perform addition if they are equal , perform subtraction if a>b , do multiplication if a<b
	@Test
	public void logicalOperators_unitTest()
	{
		logicalOperators(46,14);
		logicalOperators(6,8);
		logicalOperators(44,9);
		logicalOperators(4,16);
		logicalOperators(-6,34);		
		logicalOperators(22,22);		
		logicalOperators(16,54);
	}
	public void logicalOperators(int a,int b)
	{
		System.out.println("First Number :" + a);
		System.out.println("Second Number :" + b);
		//   T         T     -> T        TT -> T ,  TF/FT/FF -> F
		if((a>10) && (b>10)) // && : Logical operator
		{
			//true   // Nested if condition
			if(a==b)  // == , > , < : Relational Operators
			{
				//true
				int sum = a+b;  // + , - , * : Arithmetic Operators
				System.out.println("Both the Numbers are equal , SUM :" + sum);
			}
			else if(a>b)
			{
				//true
				int diff = a-b;  //   = : Assignment Operator
				System.out.println("First Num is above Second Number , Difference :" + diff);
			}
			else if(a<b)
			{
				//true
				int prod = a*b;
				System.out.println("First Number is below Second Number , Product :" + prod);
			}
			
		}
		else
		{
			//false
			System.out.println("Both the given numbers or any of them might be below 10");
		}
	}
	
	// givenNumber % 2  -> reminder , if reminder = 0 then EVEN 
	
	//Write a program to read a number as input and find out that number is EVEN / ODD 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
