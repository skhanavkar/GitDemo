import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Assert;

public class login_Section {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("WebDriver.Chrome.driver", "Users/swapnajakhanavkar/Documents/Swapnaja");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr555154");
		driver.findElement(By.name("password")).sendKeys("quvytYs");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds (15));
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.faktor-iframe-wrapper")));
		driver.findElement(By.xpath("//*[@id=\"close\"]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("btnLogin")).click();
		System.out.println(driver.getTitle());
		String match = "Guru99 Bank ManagerHomePage.";
		if (match.equalsIgnoreCase(driver.getTitle())) {
			
			System.out.println("Match found");
		}
		else {
			System.out.println("Match is not found");
			
		}
		driver.close();
	}

	

}
