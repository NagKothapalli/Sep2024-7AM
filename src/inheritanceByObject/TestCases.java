package inheritanceByObject;

import org.junit.Test;
//              child               parent             - SIMPLE INHERITANCE
public class TestCases //extends ReusableComponents
{
	//Modifier  ClassName  objectName = new Constructor();
	int stdNum = 22;
	String stdName = "Ram";
	//public ReusableComponents   rc = new ReusableComponents(); //default constructor of RC 
	
	public ReusableComponents   rc = new ReusableComponents("edge");
	
	
	//Execution Sequence : Instance variables loaded -> Constructor of the class -> Function called
	//***********************************Test Cases*****************************************************
	@Test  //Non Static , no return type other void , no inputs , it should be public 
	public void composeAndSendAnEmail()  // Test Case 1
	{
		System.out.println("Test Case : Compose And Send an Email");
		//1.launch gmail application  2.Login to Application 3.Compose  4.send 5.logout 6.close
		//launchApplication();		
		rc.launchApplication();
		rc.loginToApplication();
		rc.compose();
		rc.send();
		rc.logoutFromApplication();
		rc.closeApplication();		
	}
	@Test
	public void replyToAnEmail()  // Test Case 2
	{
		System.out.println("Test Case :Reply to an Email");
		//1.launch gmail application  2.Login to Application 3.open  4.reply 5.logout 6.close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.reply();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void forwardAnEmail()  // Test Case 3
	{
		System.out.println("Test Case :Forward an Email");
		//1.launch gmail application  2.Login to Application 3.open  4.forward 5.logout 6.close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.forward();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	@Test
	public void deleteAnEmail()  // Test Case 4
	{
		System.out.println("Test Case :Delete an Email");
		//1.launch gmail application  2.Login to Application 3.open  4.delete 5.logout 6.close
		rc.launchApplication();
		rc.loginToApplication();
		rc.open();
		rc.delete();
		rc.logoutFromApplication();
		rc.closeApplication();
	}
	

}
