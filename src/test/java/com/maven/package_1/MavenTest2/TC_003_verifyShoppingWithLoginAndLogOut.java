package com.maven.package_1.MavenTest2;

import org.testng.annotations.Test;

public class TC_003_verifyShoppingWithLoginAndLogOut {

		@Test (groups = {"Regression", "Performance"})
		public static void verifyShopping() {
			TC_002_verifyLogInLogOut.method1ForTC2();//sigin should work otherwise it would be a showstopper
			TC_002_verifyLogInLogOut.method2ForTC2();
			System.out.println("Executed TC 003: purchasing");
			TC_002_verifyLogInLogOut.logInLogOut();
		}

}
