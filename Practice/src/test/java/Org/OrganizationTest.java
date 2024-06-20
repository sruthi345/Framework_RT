package Org;

import org.testng.annotations.Test;

public class OrganizationTest {
	@Test
	public void createOraganization1()
	{
		String url = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		String USERNMAE = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		
		System.out.println(url);
		System.out.println(BROWSER);
		System.out.println(USERNMAE);
		System.out.println(PASSWORD);
	}
	@Test
	public void createOraganization()
	{
		System.out.println("execute sucessfully");
	}
	

}
