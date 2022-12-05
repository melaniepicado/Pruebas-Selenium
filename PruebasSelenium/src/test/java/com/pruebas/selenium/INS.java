package com.pruebas.selenium;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class INS {
	
	//Prueba en el apartado de Avalúos
	
	private WebDriver driver;
	By registerLinkLocator = By.linkText("Servicios");
	By registerLinkLocator1 = By.linkText("Cliente");
	By registerLinkLocator2 = By.linkText("Avalúos");
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
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
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$tabDatosAdicionales$TabPanel1$ddlProvincia")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_tabDatosAdicionales_TabPanel1_ddlProvincia > option:nth-child(7)")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$tabDatosAdicionales$TabPanel1$btnConsultar")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_tabDatosAdicionales_TabPanel2_grvTalleres_ctl02_lnkNombre")).click();
	}
	
	
}
