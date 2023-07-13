package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
		WebElement optcheck=driver.findElement(By.xpath("//input[contains(text(),'B.Wagner')]//following-sibling::td[5]"));
	if(!optcheck.isSelected()) {
		optcheck.click();
	}
	
	}

}
