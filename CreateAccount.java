package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		EdgeOptions options = new EdgeOptions();
		EdgeDriver driver = new EdgeDriver();
		
//		 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		
//		2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
//		3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		4. Click on CRM/SFA (Use Partial Text based xpath)
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
//		5. Click on Accounts Button
		driver.findElement(By.xpath("//a[text()='Accounts']")).click();
		
	   
//		   6. Click on Create Account
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		    
//		   7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElement(By.xpath("(//input[@name='accountName'])[2]")).sendKeys("Debit Limited Acc2");
		   
//		   8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester");
		   
//		   9. Enter LocalName Field Using Xpath Locator
		driver.findElement(By.xpath("//input[@name='groupNameLocal']")).sendKeys("Test Local Name1");
		
//		   10. Enter SiteName Field Using Xpath Locator
		  driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Test Site Name1");
		  
//		   11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		   driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("20");
		   
//		   12. Select Industry as ComputerSoftware
		  WebElement source =  driver.findElement(By.name("industryEnumId"));
		   Select S1 = new Select(source);
		   S1.selectByValue("IND_SOFTWARE");
		   Thread.sleep(1000);
		   
//		   13. Select OwnerShip as S-Corporation using SelectByVisibletext
		   WebElement source1 = driver.findElement(By.name("ownershipEnumId"));
		   Select S2 = new Select(source1);
		   S2.selectByVisibleText("S-Corporation");
		   Thread.sleep(1000);
		   
//		   14. Select Source as Employee using SelectByValue
		   WebElement source2 = driver.findElement(By.name("dataSourceId"));
		   Select S3 = new Select(source2);
		   S3.selectByValue("LEAD_EMPLOYEE");
		   Thread.sleep(1000);
		   
//		   15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		   WebElement source3 = driver.findElement(By.id("marketingCampaignId"));
		   Select S4 = new Select(source3);
		   S4.selectByIndex(6);
		   Thread.sleep(1000);
		   
//		   16. Select State/Province as Texas using SelectByValue 
		   WebElement source4 = driver.findElement(By.id("generalStateProvinceGeoId"));
		   Select S5 = new Select(source4);
		   S5.selectByValue("TX");
		   Thread.sleep(1000);
		   
//		   17. Click on Create Account using Xpath Locator

		   driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}
