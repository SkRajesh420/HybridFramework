package com.mindtree.reusableComponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import com.mindtree.exceptions.UtilityException;
import com.mindtree.utilities.ExcelSheetRead;

public class Base extends ExcelSheetRead {

	public Base() throws UtilityException, Exception {
		super();
	}

	static public WebDriver driver;

	public static WebDriver initialize() throws Exception {
		if (driver == null) {
			if (get.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + get.getProperty("path"));
				EdgeOptions opt = new EdgeOptions();
				//opt.addArguments("--disable-notifications");
				driver = new EdgeDriver(opt);
			}
		}
		return driver;
	}
}
