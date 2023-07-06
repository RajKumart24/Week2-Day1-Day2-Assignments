package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DuplidateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
		//ChromeDriver driver = new ChromeDriver(); 
		
		// 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// Maximise the window
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
//		  3. Click on Login Button using Class Locator
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

//		  10. Enter FirstName(Local) Field Using id Locator
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Test Local Name");
		  
//		  11. Enter Department Field Using any Locator of Your Choice
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Test Dept Name");
		  
//		  12. Enter Description Field Using any Locator of your choice 
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("Test Desc");
		  
//		  13. Enter your email in the E-mail address Field using the locator of your choice
		  driver.findElement(By.name("primaryEmail")).sendKeys("test@gmail.com");
		  
//		  14. Click on Create Button
		  driver.findElement(By.name("submitButton")).click();
		  
//        15. Get the Title of Resulting Page using driver.getTitle()
		  String Title = driver.getTitle();
		  System.out.println(Title);
		  
//        16. Click on Duplicate button
		  driver.findElement(By.partialLinkText("Duplicate")).click();
		  
//        17. Clear the CompanyName Field using .clear() And Enter new CompanyName
		  driver.findElement(By.id("createLeadForm_companyName")).clear();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TC Name2");
		  
//        18.Clear the FirstName Field using .clear() And Enter new FirstName
		  driver.findElement(By.id("createLeadForm_firstName")).clear();
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TF Name2");
		  
//        19.Click on Create Lead Button
		  driver.findElement(By.name("submitButton")).click();
		  
//        20. Get the Title of Resulting Page using driver.getTitle()		
		String Title2 = driver.getTitle();
		System.out.println(Title2);
	}

}
