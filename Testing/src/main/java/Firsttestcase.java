import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttestcase {
	WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://admin:neal2023@app.nealthy.xyz/");
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("noreply.75way+2@gmail.com");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='Register_reactOtp__WYRXe']//input)[1]")).sendKeys("345676");
		
	}

}
