package basicConcepts;

import org.junit.Test;

public class GmailWithJunit
{
	//Naming conventions - member of a class
	
	// it can start with _ , $ , a-z , A-Z
	
	// it should follow camelCasing 
	
	// constructor name must be same as class name , so we need not follow camelCasing only for constructor of a class
	
	//no blank space within the name of the member
	
	int _num;    int $num;   int num;   int Num;  
	
	int stdNum;
	
	int stdNum1;
	
	int std1Num;
	
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
	
	//********************************************Reusable Components********************************************************
	
	private void launchApplication()
	{
		System.out.println("RC : Launch Gmail Application");
		//15 lines of code to do this activity
	}
	
	void loginToApplication()
	{
		System.out.println("RC : Login to Gmail Application");
	}
	
	public void logoutFromApplication()
	{
		System.out.println("RC : Logout From Application");
	}
	
	protected void closeApplication()
	{
		System.out.println("RC : Close the Application");
	}
	
	public void compose()
	{
		System.out.println("RC : Compose an Email");
	}
	
	public void send()
	{
		System.out.println("RC : Send an Email");
	}
	
	public void open()
	{
		System.out.println("RC : Open an Email");
	}	
	
	public void reply()
	{
		System.out.println("RC : Reply to an Email");
	}
	
	public void forward()
	{
		System.out.println("RC : Forward an Email");
	}
	
	public void delete()
	{
		System.out.println("RC : Delete an Email");
	}
	
	
	
	

}
