package pvrBooking;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PvrMovie {

	public static void main(String[] args) throws InterruptedException {
		// load the Pvr webpage
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.pvrcinemas.com/");
		//Maximize the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate cinema button
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		//locate cinema 
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(1000);
		//locate and select the theatre
		driver.findElement(By.xpath("//span[contains(text(),'INOX Lido Mall, Ulsoor Bengaluru')]")).click();
		Thread.sleep(1000);
		//locate and select date
		driver.findElement(By.xpath("//span[contains(text(),'Tomorrow')]")).click();
		Thread.sleep(1000);
		//locate and select movie name
		driver.findElement(By.xpath("(//span[text()='VIDUTHALAI PART 2'])[2]")).click();
		Thread.sleep(1000);
		//locate to select time slot
		driver.findElement(By.xpath("//span[contains(text(),'10:00 AM')]")).click();
		Thread.sleep(1000);
		//locate Submit button
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		Thread.sleep(1000);
		//locate and accept the pop up button
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		Thread.sleep(1000);
		//locate and accept the pop up button for terms and conditions
		driver.findElement(By.xpath("//button[@class='sc-iBPTVF eafRB reject-terms']")).click();
		Thread.sleep(1000);
		//locate the required seat and click
		driver.findElement(By.id("EX.EXECUTIVE|G:13")).click();
		Thread.sleep(1000);
		//to print the seat information
		String seatNo = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("BOOKING SUMMARY");
		System.out.println("The selected seat is " +seatNo);
		//to print grand total
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-prices']/h6")).getText();
		System.out.println("The Grand total is "+grandTotal);
		//locate the proceed button and click
		driver.findElement(By.xpath("//button[@class='sc-kfzCjt dzvwYk btn-proceeded']")).click();
		Thread.sleep(1000);
		//print the title of the page
		System.out.println(driver.getTitle());
		//close the Browser
		driver.close();

	}

}
