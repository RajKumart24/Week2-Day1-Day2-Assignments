package week2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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

//		7	Click Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		
//		8	Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		
//		9	Enter phone number
		driver.findElement(By.name("phoneNumber")).sendKeys("8596526374");
		
//		10	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
//		11	Capture lead ID of First Resulting lead
		
//		12	Click First Resulting lead
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		
//		13	Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		
//		14	Click Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		
//		15	Enter captured lead ID
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("8596526374");
		
//		16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
//		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		driver.findElement(By.xpath("//div[text()='No records to display']"));
		Thread.sleep(3000);
//		18	Close the browser (Do not log out)
		driver.close();
	}

}
