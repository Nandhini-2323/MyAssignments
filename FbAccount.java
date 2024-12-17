package faceBook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class FbAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//To open the facebook login page
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://en-gb.facebook.com/");
		//to maximise the browser window
		driver.manage().window().maximize();
		//wait for the web page elements to fully load
		Thread.sleep(1000);
		//locate create new account and click
		driver.findElement(By.linkText("Create new account")).click();
		//locate firstname and enter
		driver.findElement(By.name("firstname")).sendKeys("vijay");
		//locate surname and enter the surname
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		//locate date in date of birth dropdown and select
		WebElement dateOB = driver.findElement(By.name("birthday_day"));
		//create object to class and pass webElement 
		Select doB = new Select(dateOB);
		//select the date
		doB.selectByIndex(14);
		//locate birthmonth from drop down
		WebElement monthDD = driver.findElement(By.name("birthday_month"));
		Select doB1 = new Select(monthDD);
		doB1.selectByIndex(2);
		//locate birthyear from dropdown
		WebElement yeardd = driver.findElement(By.name("birthday_year"));
		Select doB2 = new Select(yeardd);
		doB2.selectByValue("1988");
		//locate gender checkbox
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		//locate mobileNumber or email-id and enter email-id
		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
		//locate password and enter  password
		driver.findElement(By.name("reg_passwd__")).sendKeys("AaBbCcDd@1234");
		//locate submit button and click
		driver.findElement(By.name("websubmit")).click();
		//locte the security code and enter
		driver.findElement(By.id("recovery_code_entry")).sendKeys("123456");
		
		

		

	}

}
