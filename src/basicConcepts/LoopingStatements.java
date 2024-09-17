package basicConcepts;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void applyColorToBuilding()  // Task : Apply Color
	{
		System.out.println("Apply Color to Step 1");
		System.out.println("Apply Color to Step 2");
		System.out.println("Apply Color to Step 3");
		System.out.println("Apply Color to Step 4");
		System.out.println("Apply Color to Step 5");  //.............
	}
	
	// 1 .... 100   , first day : 1 - 50 - each  , second day : 51 - 100 - each
	
	//for(iterator; condition ; step size) {    Task     }
	@Test
	public void applyColorToAllSteps_FirstDay()  // 1 - 50
	{
		for(int iterator=1;iterator<=50;iterator = iterator + 1)  // iterator = 1 2 3 4 5 6 ...... , 1<50 , 2<50 , 3<50 .... 48<50 , 49<50 , 50<50->F  50<=50 -> T
		{
			System.out.println("Apply Color to Step :" + iterator );
		}
	}
	
	@Test
	public void applyColorToAllSteps_SecondDay()  // 1 - 50
	{
		for(int iterator=51;iterator<=100;iterator++)  
		{
			System.out.println("Apply Color to Step :" + iterator );
		}
	}
	
	
	@Test
	public void applyGreenColorToAllEvenSteps_FirstDay()  // 1 - 50
	{
		for(int i=2;i<=50;i = i + 2)  // iterator = 2 4 6 8
		{
			System.out.println("Apply Green Color to Step :" + i );
		}
	}
	
	@Test
	public void applyRedColorToAllOddSteps_SecondDay()  // 1 - 50   // Definite loop
	{
		for(int i=1;i<=50;i = i + 2)  // iterator = 1 3 5 7 9 ...
		{
			System.out.println("Apply Red Color to Step :" + i );
		}
	}
	@Test
	public void applyColorToEvenAndOdd()
	{
		for(int i=1;i<=50;i++)
		{
			int reminder = (i%2); // 1/0
			if(reminder == 0) // true - even
			{
				System.out.println("Apply Green Color to Step :"  + i);
			}
			else
			{
				System.out.println("Apply Red Color to Step :" + i);
			}
		}
	}
	
	//InDefinite loop
	@Test
	public void findStudent()   // std num = 22
	{
		for(int s=1;s<=100;s++)
		{
			System.out.println("Student Number :" + s);
			if(s==22)
			{
				System.out.println("Found the student");
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	


}
