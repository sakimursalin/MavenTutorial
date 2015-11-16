package com.maven.package_1.MavenTest2;


import org.testng.annotations.Test;

public class TC_004_verifyShoppingEvenAfterLogInFailed {
	
		
	@Test (priority=1, groups = {"Regression"}) //If signin failed still client can purchase
	public static void logIn() {
		System.out.println("LogIn failed but not a Showstopper");
	}

	@Test (priority=2, ignoreMissingDependencies = true, groups = {"Regression"})
	public static void sds() {
		TC_002_verifyLogInLogOut.method2ForTC2();
		System.out.println("Executed TC 003: purchasing");
	}	
	
	@Test (dependsOnMethods = {"logIn"}, priority=3, groups = {"Regression"})
	public static void	logOut() {
		TC_002_verifyLogInLogOut.logInLogOut();
	}

}
