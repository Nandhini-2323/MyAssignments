package amazonMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddBag {

	public static void main(String[] args) throws InterruptedException {
		// open the chrome and launch the amazon website
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		//Maximize the screen
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//locate the search tab and enter text
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		//click the search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		//print the total number of result
		String totalResult = driver.findElement(By.xpath("//div[@class='sg-col-inner']")).getText();
		System.out.println("The total number of result is "+totalResult);
		//locate the check box for brands
		driver.findElement(By.xpath("//i[@class = 'a-icon a-icon-checkbox']")).click();
		driver.findElement(By.xpath("//*[@id=\"p_123/418063\"]/span/a/div/label/i")).click();
		Thread.sleep(1000);
		//locate sort and select new arrivals
		driver.findElement(By.className("a-dropdown-label")).click();
		Thread.sleep(1000);
		//locate New Arrivals from the dropdwn
		driver.findElement(By.xpath("//li[@aria-labelledby = 's-result-sort-select_4']")).click();
		Thread.sleep(1000);
		//locate and Print the first resulting bag info (name, discounted price)
		String BagDetails = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/span/div/div/div[2]/div[1]/a/h2/span")).getText();
		System.out.println("The first resulting bag is "+BagDetails);
		Thread.sleep(1000);
		//to locate and print the discounted price of the bag
		String Bagprice = driver.findElement(By.xpath("//a[@aria-label='Price, product page']")).getText();
		System.out.println("The price of the bag is "+Bagprice);
		Thread.sleep(1000);
		//to close the window
		driver.close();

	}

}
