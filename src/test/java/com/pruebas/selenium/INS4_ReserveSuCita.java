package com.pruebas.selenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class INS4_ReserveSuCita {
	
	//Prueba en el apartado de Reserve su cita

    private WebDriver driver;
    By registerLinkLocator = By.linkText("Servicios");
	By registerLinkLocator1 = By.linkText("Cliente");
	By registerLinkLocator2 = By.linkText("Reserve su cita");
	
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
		driver.findElement(By.id("ID")).sendKeys("118830750");
		Thread.sleep(2000);
		driver.findElement(By.id("FirstName")).sendKeys("Melanie");
		Thread.sleep(2000);
		driver.findElement(By.id("LastName")).sendKeys("Picado");
		Thread.sleep(2000);
		driver.findElement(By.id("Phone")).sendKeys("86242591");
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("melaniepicado30@gmail.com");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div/div/form/div[7]/div[4]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div/div/form/div[7]/div/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div[2]/form/div/div/div/div/div/div[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div/div/div[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"idReq\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div[2]/form/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div/div/div[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div/div/div/div[2]/div/div/div/div[2]/button[26]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div[2]/form/div[1]/div/div/div/div/div/div[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div[2]/form/div[2]/div/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[1]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("site")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("option:nth-child(3)")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/main/div/div/div[2]/div/div[2]/div/div[3]/div/div/div[2]/div[3]/div/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div/div[2]/button[2]")).click();
		Thread.sleep(2000);
		driver.get("https://www.grupoins.com/");
	}
	
	@After
	public void finish() {
		driver.quit();
	}
}
