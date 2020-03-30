package org.test1;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Gmail {
	static WebDriver d;

@BeforeTest
public void launch() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\jegan\\eclipse-workspace\\TestNgReport\\div\\chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://mail.google.com/");
}
@Parameters({"user"})
@Test
public void Test(String s1) throws InterruptedException{
	d.findElement(By.id("identifierId")).sendKeys(s1);
	d.findElement(By.id("identifierNext")).click();
	Thread.sleep(3000);
	}
@Parameters({"pass"})
@Test
public void test1(String s2) {
	d.findElement(By.name("password")).sendKeys(s2);
	d.findElement(By.id("passwordNext")).click();
}
@AfterTest
public void kill() throws InterruptedException {
Thread.sleep(3000);
d.quit();
}
}