package inheritanceByObject;

public class ReusableComponents   //parent class , its like a service provider
{
	//Delete all temp records / clear the data base
	//Open an empty browser 
	String empName = "Ravi";
	
	/*
	 * public ReusableComponents() // service provider {
	 * System.out.println("Delete all temp records / clear the data base");
	 * System.out.println("Open an empty google chrome browser"); //Hard coded value
	 * //System.out.println("Emloyee Name :" + empName); }
	 */
	
	public ReusableComponents(String browserName)   // service provider
	{
		System.out.println("Delete all temp records / clear the data base");
		System.out.println("Open an empty browser :"+ browserName); //Hard coded value
		//System.out.println("Emloyee Name :" + empName);
	} 
	
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
