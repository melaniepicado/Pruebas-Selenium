package com.pruebas.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class INS3_SedesYPuntosDeServicio {
	
	//Prueba en el apartado de Sedes Y Puntos de Servicio

    private WebDriver driver;
    By registerLinkLocator = By.linkText("Sedes y Puntos de Servicio");
    By registerLinkLocator1 = By.xpath("//*[@id=\"content-prod-items\"]/div[2]");
    By registerLinkLocator3 = By.xpath("//*[@id=\"content-prod-items\"]/div[1]");
    By registerLinkLocator4 = By.xpath("//*[@id=\"content-prod-items\"]/div[3]");
	
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
		driver.findElement(registerLinkLocator3).click();
		Thread.sleep(2000);
		driver.findElement(By.id("acordeon-0")).click();
		//driver.findElement(By.id("filter")).sendKeys("Heredia");
		Thread.sleep(2000);
		//driver.findElement(By.id("acordeon-8")).click();
		//Thread.sleep(2000);
		driver.get("https://www.grupoins.com/sedes-del-ins-y-puntos-de-servicio/");
		Thread.sleep(2000);
		driver.findElement(registerLinkLocator1).click();
		Thread.sleep(2000);
		driver.findElement(By.id("acordeon-0")).click();
		//driver.findElement(By.id("filter")).sendKeys("Coronado");
		Thread.sleep(2000);
		//driver.findElement(By.id("acordeon-2")).click();
		driver.get("https://www.grupoins.com/sedes-del-ins-y-puntos-de-servicio/");
		Thread.sleep(2000);
		driver.findElement(registerLinkLocator4).click();
		Thread.sleep(2000);
		driver.findElement(By.id("acordeon-0")).click();
		Thread.sleep(2000);
		driver.get("https://www.grupoins.com/sedes-del-ins-y-puntos-de-servicio/");
		driver.get("https://www.grupoins.com/");
	}
	
	@After
	public void finish() {
		driver.quit();
	}
}
