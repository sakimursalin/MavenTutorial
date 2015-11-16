package com.maven.package_1.MavenTest2;


import org.testng.annotations.Test;

public class TC_002_verifyLogInLogOut {

	
	@Test (priority=1, groups = "Smoke")
	public static void method1ForTC2() {
		System.out.println("SignIn Executed: Otherwise it would be a Showstopper");
	}
	
	@Test(priority=2, dependsOnMethods = {"method1ForTC2"}, groups ="Regression")
	public static void method2ForTC2() {
		System.out.println("Navigation through browser");
	}
	
	@Test(priority =3, dependsOnMethods = {"method1ForTC2"}, groups ={"Smoke", "Regression"})
	public static void logInLogOut() {
		System.out.println("SignOut has been Executed successfully");
	}	
	
	
}
