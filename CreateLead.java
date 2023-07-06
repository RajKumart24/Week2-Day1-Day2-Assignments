package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EdgeDriver driver = new EdgeDriver();
		//ChromeDriver driver = new ChromeDriver(); 
		
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
        
//		3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
//		4. Click on CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
//		5. Click on Leads Button
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
//		   6. Click on create Lead Button
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();  
		
//		   7. Enter CompanyName using id Locator
		   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Company Name");
		   
//		   8. Enter FirstName using id Locator
		   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Test First Name");
		   
//		   9. Enter LastName using id Locator
		   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Test Last Name");
		   
//		   10. Select value as Employee in Source Using SelectbyVisible text
		   WebElement source1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		   Select s1 = new Select(source1);
		   s1.selectByVisibleText("Employee");
		   
//		   11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		   WebElement source2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		   Select s2 = new Select(source2);
		   s2.selectByValue("9001");
		   
		   
//		   13. Select value as Corporation in OwnerShip field Using SelectbyIndex
		   WebElement source3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		   Select s3 = new Select(source3);
		   s3.selectByIndex(4);
		   
//		   14. Select value as India in Country Field Using SelectbyVisibletext
		   WebElement source4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		   Select s4 = new Select(source4);
		   s4.selectByVisibleText("India");
		   
		   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8596526374");
		   
//		   15. Click on create Lead Button Using name Locator
		   driver.findElement(By.name("submitButton")).click();
		   
//		   16. Get the Title of the resulting Page
		   String GetTitle = driver.getTitle();
		   System.out.println(GetTitle);
	}

}
