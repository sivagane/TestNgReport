package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.beust.jcommander.Parameter;

public class DependonMethods {
	 static WebDriver d;
	 
	@Test(groups="facebook")
    public void launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\TestNgReport\\div\\chromedriver.exe");
		 d=new ChromeDriver();
		 d.get("https:\\www.facebook.com");
		}
	@Test(groups="facebook")
	public void test1() {
		d.findElement(By.id("email")).sendKeys("sivag918@gmail.com");
		}
	@Test(groups="facebook")
	public void test2() {
		d.findElement(By.id("pass")).sendKeys("08091990");
	}
	@Test(groups="facebook1")
	public void test3() {
		d.findElement(By.id("email")).sendKeys("Hello@gmail.com");
	}
    @Test(groups="facebook1")
    public void test4() {
	d.findElement(By.id("pass")).sendKeys("12345");
    }
    @Test(dependsOnGroups= {"facebook"})
	public void btn() {
		d.findElement(By.id("loginbutton")).click();
		System.out.println("Program Executed");
		}
	
	
}