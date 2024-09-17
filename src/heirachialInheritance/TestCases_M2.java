package heirachialInheritance;

import org.junit.Test;
//              child               parent             - SIMPLE INHERITANCE
public class TestCases_M2 extends ReusableComponents // 1 , 2
{
	
	//***********************************Test Cases*****************************************************
	
	@Test
	public void forwardAnEmail()  // Test Case 3
	{
		System.out.println("Test Case :Forward an Email");
		//1.launch gmail application  2.Login to Application 3.open  4.forward 5.logout 6.close
		launchApplication();
		loginToApplication();
		open();
		forward();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void deleteAnEmail()  // Test Case 4
	{
		System.out.println("Test Case :Delete an Email");
		//1.launch gmail application  2.Login to Application 3.open  4.delete 5.logout 6.close
		launchApplication();
		loginToApplication();
		open();
		delete();
		logoutFromApplication();
		closeApplication();
	}
	

}
