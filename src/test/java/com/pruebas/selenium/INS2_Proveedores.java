package com.pruebas.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class INS2_Proveedores {
	
	//Prueba en el apartado de Red de Proveedores

	private WebDriver driver;
	By registerLinkLocator = By.linkText("Servicios");
	By registerLinkLocator1 = By.linkText("Cliente");
	By registerLinkLocator2 = By.linkText("Red de Proveedores");
	
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
		driver.findElement(By.xpath("//*[@id=\"content-prod-items\"]/div[1]/a/div/div[1]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$cphPrincipal$ddlProvincia")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#cphPrincipal_ddlProvincia > option:nth-child(4)")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$cphPrincipal$ddlCanton")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#cphPrincipal_ddlCanton > option:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$cphPrincipal$ddlClasificacion")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#cphPrincipal_ddlClasificacion > option:nth-child(10)")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$cphPrincipal$ddlEspecialidad")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#cphPrincipal_ddlEspecialidad > option:nth-child(1)")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("ctl00$cphPrincipal$btnBuscar")).click();
		Thread.sleep(5000);
		driver.get("https://www.grupoins.com/red-proveedores/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"content-prod-items\"]/div[2]/a/div/div[1]/img")).click();
		Thread.sleep(20000);
		driver.get("https://www.grupoins.com/red-proveedores/");
		driver.get("https://www.grupoins.com/");
	}
	
	@After
	public void finish() {
		driver.quit();
	}
}
