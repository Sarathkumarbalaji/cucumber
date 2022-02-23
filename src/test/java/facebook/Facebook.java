package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	WebDriver driver;
	@Given("User Launch fb Application")
	public void user_Launch_fb_Application() {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
	}

	@When("User Enters UserName and passWord")
	public void user_Enters_UserName_and_passWord() {
		driver.findElement(By.id("email")).sendKeys("Sarath");
		driver.findElement(By.id("pass")).sendKeys("123456789");
		WebElement element = driver.findElement(By.xpath("//*[contains(text(),'Facebook helps')]"));
		String text = element.getText();
		System.out.println(text);
		
	}

	@When("Clicks Login Page")
	public void clicks_Login_Page() {
		driver.findElement(By.name("login")).click();
	}

	@Then("Error Page Should be Displayed")
	public void error_Page_Should_be_Displayed() {
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}


}
