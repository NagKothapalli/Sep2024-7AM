package heirachialInheritance;

import org.junit.Test;
//              child               parent             - SIMPLE INHERITANCE
public class TestCases_M1 extends ReusableComponents
{
	
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
	
	

}
