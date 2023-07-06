package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//EdgeDriver driver = new EdgeDriver();
		ChromeDriver driver = new ChromeDriver(); 
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// Step 4: Maximise the window
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
//		2. Enter username as demoSalesManager (Use : Attribute based)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
		
//		3. Enter password as crmsfa (Use : Attribute based)
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
        
//		4. Click on Login (Use : Attribute based)
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		5. Click on CRM/SFA (Use Partial Text based xpath)
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
//		6. Click on Leads(Use Text based)
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
//		* 7	Click Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		
//		* 8	Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("ssp");
		Thread.sleep(3000);
		
//		* 9	Click Find leads button
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		
//		* 10 Click on first resulting lead
		driver.findElement(By.xpath("//a[text()='10401']")).click();
		
//		* 11 Verify title of the page
		driver.findElement(By.xpath("//div[text()='View Lead']")).isDisplayed();
	    
//		* 12 Click Edit
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
//		* 13 Change the company name
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("CTS");
		
//		* 14 Click Update
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
//		* 15 Confirm the changed name appears
		driver.findElement(By.xpath("//span[contains(text(),'CTS')]")).isDisplayed();
		
//		* 16 Close the browser (Do not log out)
		driver.close();
	}

}
