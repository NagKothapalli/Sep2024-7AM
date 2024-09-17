package tCases;

import org.junit.Test;

import rComponents.ReusableComponents;
//              child               parent             - SIMPLE INHERITANCE
public class TestCases extends ReusableComponents
{
	//method overriding
	public void launchApplication() //mobile
	{
		System.out.println("RC : Launch Gmail Application - TestCases");
		//15 lines of code to do this activity
	}
	//***********************************Test Cases*****************************************************
	@Test  //Non Static , no return type other void , no inputs , it should be public 
	public void composeAndSendAnEmail()  // Test Case 1
	{
		System.out.println("Test Case : Compose And Send an Email");
		//1.launch gmail application  2.Login to Application 3.Compose  4.send 5.logout 6.close
		launchApplication();
		loginToApplication();
		compose();
		send();
		logoutFromApplication();
		closeApplication();
	}
	@Test
	public void replyToAnEmail()  // Test Case 2
	{
		System.out.println("Test Case :Reply to an Email");
		//1.launch gmail application  2.Login to Application 3.open  4.reply 5.logout 6.close
		launchApplication();
		loginToApplication();
		open();
		reply();
		logoutFromApplication();
		closeApplication();
	}
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
