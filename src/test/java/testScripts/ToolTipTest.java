package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				Actions actions=new Actions(driver);
				driver.get("https://jqueryui.com/tooltip/");
				driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
				WebElement age =driver.findElement(By.id("age"));
				actions.moveToElement(age).perform();
				String str=driver.findElement(By.cssSelector(".ui-tooltip-content")).getText();
				System.out.println();
				

	}

}
