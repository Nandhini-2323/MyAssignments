package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver=new ChromeDriver(); 
			driver.get("http://leaftaps.com/opentaps/"); 
			//maximize the window
			driver.manage().window().maximize();
			//locate username field
			WebElement usernameField = driver.findElement(By.id("username"));
			//enter input
			usernameField.sendKeys("demosalesmanager");
			//locate password field and enter password as crmsfa
			driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
			//locate login button and click
			driver.findElement(By.className("decorativeSubmit")).click();
			//to get title of webpage
			String title = driver.getTitle();
			System.out.println("Title is "+title);
			//locate the CRM/SFA link and click
			driver.findElement(By.linkText("CRM/SFA")).click();
			System.out.println(driver.getTitle());
			//locate the leads tab and click
			driver.findElement(By.linkText("Leads")).click();
			//locate the create Lead link and click
			driver.findElement(By.linkText("Create Lead")).click();
			//locate companyname field and enter Testleaf
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			//locate first name and enter first name as nandhini
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
			//locate last name and enter v
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
			//locate the source dropdown element
			//step1: locate the dropdown element

			WebElement sourceEle = driver.findElement(By.id("createLeadForm_dataSourceId"));
			//step2: Create object for Select class and pass the WebElement reference into the argument
			Select sourceDD = new Select(sourceEle);
			//step3: using method to select value from the dropdown
			sourceDD.selectByIndex(5);
			//locate the marketing campaign and select ecommerce
			WebElement marketingEle = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select marketingDD = new Select(marketingEle);
			marketingDD.selectByValue("9000");
			//locate the industry dropdown and select general services
			WebElement industryEle = driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select industryDD = new Select(industryEle);
			industryDD.selectByVisibleText("General Services");


			//locate the create lead button and click
//			driver.findElement(By.className("smallSubmit")).click();
			driver.findElement(By.name("submitButton")).click();
			
			System.out.println(driver.getTitle());
			//locate the leadId and retrive the text
			String companyNameAndLeadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
			System.out.println(companyNameAndLeadId);
			
		}




	}


