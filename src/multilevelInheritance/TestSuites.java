package multilevelInheritance;

import org.junit.Test;
//              A-child    extends B-immediate parent  extends C - grand parent
public class TestSuites extends TestCases
{
	@Test
	public void smokeSuite() //BVT : Build Validation Test
	{
		System.out.println("Test Suite : SMOKE");
		//loginToApplication();
		composeAndSendAnEmail();
		replyToAnEmail();
	}
	
	@Test
	public void regressionSuite()
	{
		System.out.println("Test Suite : REGRESSION");
		composeAndSendAnEmail();
		replyToAnEmail();
		forwardAnEmail();
		deleteAnEmail();
	}

}
