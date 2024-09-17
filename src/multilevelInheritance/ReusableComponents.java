package multilevelInheritance;

public class ReusableComponents
{
	//********************************************Reusable Components********************************************************
	
	protected void launchApplication() // email
	{
		System.out.println("RC : Launch Gmail Application - RC");
		//15 lines of code to do this activity
	}
	
	void loginToApplication()
	{
		System.out.println("RC : Login to Gmail Application");
	}
	
	void logoutFromApplication()
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
	
	void send()
	{
		System.out.println("RC : Send an Email");
	}
	
	public void open()
	{
		System.out.println("RC : Open an Email");
	}	
	
	void reply()
	{
		System.out.println("RC : Reply to an Email");
	}
	
	protected void forward()
	{
		System.out.println("RC : Forward an Email");
	}
	
	public void delete()
	{
		System.out.println("RC : Delete an Email");
	}
	

}
