package week2.assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		EdgeDriver driver = new EdgeDriver();
		

		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		
		WebElement source = driver.findElement(By.className("ui-selectonemenu"));
		Select sec = new Select(source);
		List<WebElement> options = sec.getOptions();
		int size = options.size();
		System.out.println(size);
		
		for (int i=0;i<=options.size();i++)
		{
			Thread.sleep(2000);
			
			if(i==1)
			{
			options.get(i).click();
			}
		}
		
		driver.findElement(By.xpath("(//label[text()='Select Country']/following::span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label[text()='Select City']/following::span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='PostMan']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Show Options']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Playwright']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//label[text()='Select Language']/following::span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")).click();
		driver.findElement(By.xpath("//li[text()='English']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[text()='Select Values']/following::span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
		driver.findElement(By.xpath("//li[text()='Two']")).click();
		
		
		
		driver.close();
		
		
		
		
			 
	}

}
