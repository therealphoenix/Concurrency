package com.klindziuk.offlinelibrary.controller.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CommandTest extends BaseTest {
	
	@Test(priority = 0)
	public void epmtyCommandTest() {
		String command = setRequest("emptycommand.xml");
		String response = requester.sendRequest(command);
		String expected = "Cannot perform this operation.";
		Assert.assertEquals(response, expected);
	}
	
	@Test(priority = 1)
	public void wrongCommandTest() {
		String command = setRequest("wrongcommand.xml");
		String response = requester.sendRequest(command);
		String expected = "thiscommandisunsupported - this command unfortunately unsupported.";
		Assert.assertEquals(response, expected);
	}
}
