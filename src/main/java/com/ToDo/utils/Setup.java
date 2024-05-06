package com.todo.utils;

import java.io.IOException;

import org.testng.annotations.*;

public class Setup extends BasePage {

	public Setup() throws IOException {
		super();
	}
	@Parameters({"browser"})
	@BeforeMethod
	public void setupTest(String browser) {
		initialization(browser);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
