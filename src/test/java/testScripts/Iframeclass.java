package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
			String strlbr=driver.findElement(By.xpath("//label/span")).getText();
			System.out.println("Label from the main page: "+ strlbr);
			//main page to frame1
			driver.switchTo().frame("frame1");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello Welcome");
			//frame1 to frame 3
			driver.switchTo().frame("frame3");
			driver.findElement(By.id("a")).click();
			//frame 3 to frame1
			
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//input[@type='text']")).clear();
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome Back");
			
			//frame 1 to mainpage
			
			driver.switchTo().defaultContent();
			
			//mainpage to frame2
			
			System.out.println(driver.findElement(By.xpath("//label/span")).getText());
			
			

	}

}
