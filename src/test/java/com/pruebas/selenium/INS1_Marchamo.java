package com.pruebas.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class INS1_Marchamo {
	
	//Prueba en el apartado de Marchamo

	private WebDriver driver;
	By registerLinkLocator = By.linkText("Servicios");
	By registerLinkLocator1 = By.linkText("Cliente");
	By registerLinkLocator2 = By.linkText("Marchamo");
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver107.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.grupoins.com/");
	}
	
	@Test
	public void testINSPage() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(registerLinkLocator).click();
		Thread.sleep(2000);
		driver.findElement(registerLinkLocator1).click();
		Thread.sleep(2000);
		driver.findElement(registerLinkLocator2).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$ContentPlaceHolder2$ddlTipoPlaca")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder2_ddlTipoPlaca > option:nth-child(23)")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder2_txtPlaca")).sendKeys("299845");
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$ContentPlaceHolder2$cmdUISubmit")).click();
	}
	
	@After
	public void finish() {
		driver.quit();
	}
}
