package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com/");
		WebElement schbox=driver.findElement(By.name("q"));
		schbox.sendKeys("Java tutorial");
    List <WebElement> items= driver.findElements(By.xpath("(//ul[@class='G43f7e])[1]//li//descendant::div[@class='wM6W7d']"));
    System.out.println("Items:"+ items.size());
    for(int i=0;i<items.size();i++)
    {
    	System.out.println(items.get(i).getText());
    	if(items.get(i).getText().equalsIgnoreCase("Java tutorial pdf")) {
    		items.get(i).click();
    		break;
    	}
    	
    }
	}

}
