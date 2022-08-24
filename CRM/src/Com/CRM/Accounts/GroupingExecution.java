package Com.CRM.Accounts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupingExecution {
	
	
	@Test(groups = "smokegrp")
	public void smoke1() {
		Reporter.log("smoke1", true);
	}

	@Test(groups = "ftgrp")
	public void ft1() {
		Reporter.log("ft1", true);
	}
	
	@Test(groups = "smokegrp")
	public void smoke2() {
		Reporter.log("smoke2", true);
	}
	
	@Test(groups = "smokegrp")
	public void smoke3() {
		Reporter.log("smoke3", true);
	}
	
	@Test(groups = "itgrp")
	public void it1() {
		Reporter.log("it1", true);
	}
	
	@Test(groups = "smokegrp")
	public void smoke4() {
		Reporter.log("smoke4", true);
	}
	
	@Test(groups = "ftgrp")
	public void ft2() {
		Reporter.log("ft2", true);
	}
	
	@Test(groups = "itgrp")
	public void it2() {
		Reporter.log("it2", true);
	}
}
