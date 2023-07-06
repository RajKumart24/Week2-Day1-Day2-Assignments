package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		EdgeDriver driver = new EdgeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		
		//Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Step 6: Click on Create New Account button
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("TFirstName1");
		
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("TLastName");
		
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("8574653274");
		
		// Step 10: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("Testing123");
		
		// Step 11: Handle all the three drop downs
		WebElement Source = driver.findElement(By.id("day"));
		Select s1 = new Select(Source);
		s1.selectByValue("5");
		
		WebElement Source1 = driver.findElement(By.id("month"));
		Select s2 = new Select(Source1);
		s2.selectByIndex(3);	
		
		WebElement Source2 = driver.findElement(By.id("year"));
		Select s3 = new Select(Source2);
		s3.selectByVisibleText("2023");		
		
		// Step 12: Select the radio button "Female" 
		//            ( A normal click will do for this step) 
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();

	}

}
