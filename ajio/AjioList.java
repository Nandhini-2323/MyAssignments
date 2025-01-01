package ajio;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioList {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate and enter the text in search in search box
		driver.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		//locate the gender checkbox and click men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		//locate the  "Category" click "Fashion Bags" 
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(1000);
		//Print the count of the items found. 
		String count = driver.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("The count of bags found are "+count);
		Thread.sleep(1000);
		
		
		//Get the list of brand of the products displayed in the page and print the list.
		
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='contentHolder']/child::div[@class='brand']"));
		System.out.println("-------------------------------");
		System.out.println("The brands are:");
		for(int i=0;i<brand.size();i++) {
			WebElement bName = brand.get(i);
			String brandName= bName.getAttribute("aria-label");
			System.out.println(brandName);
		}
		int sizeBrand=brand.size();
		System.out.println("Total number of brands are "+sizeBrand);
		
		//Get the list of names of the bags and print it 
		
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='contentHolder']/child::div[@class='nameCls']"));
		//print the name of the bag
		System.out.println("---------------------------------");
		for(int i=0;i<brand.size();i++) {
				WebElement bname = bagname.get(i);
				String bag = bname.getAttribute("aria-label");
				System.out.println(bag);
		}
		int sizeBagName= bagname.size();
		System.out.println("Total bags number of bags are " +sizeBagName);
	}
}
