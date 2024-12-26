package delAccount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
	public static void main(String Args[]) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		//open the url
		driver.get("http://leaftaps.com/opentaps/");
		//maximise the window
		driver.manage().window().maximize();
		//adding implicitly waiting time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//locate and enter the user name
		WebElement usernameField = driver.findElement(By.id("username"));
		//enter input
		usernameField.sendKeys("demosalesmanager");
		//locate the password and enter 
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click the login button
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(1000);
		//locate the link CRMSFA and click
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(1000);
		//locate the leads tab and click
		driver.findElement(By.linkText("Leads")).click();
		//locating the find leads link
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//capture and print the first element
		String firstLead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']")).getText();
		System.out.println(" The first lead is "+firstLead);
		//click the firstlead 
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).click();
		Thread.sleep(1000);
		//locate and click  delete button
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		Thread.sleep(1000);
		//to locate the find leads link and check for deleted lead
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
		//to enter the captured lead and check
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLead);
		Thread.sleep(1000);
		//locate and click find lead button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//getting the verification message for deletion
		String result=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
		System.out.println(result);
		//close the browser
		driver.close();
		
	
		
		
		
		
	}

}
