package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppLoginTest {
	WebDriver driver;
	String ExpectedText="Hello KhbSaiSri!";
	@Given("I am on the HotelApp login page")
	public void i_am_on_the_hotel_app_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/index.php");
	    driver.manage().window().maximize();
	}

	@When("user Enter username as {string}")
	public void user_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("user Enter password as {string}")
	public void user_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
		
	    
	}

	@When("user click on the login button")
	public void user_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	}
	
	@Then("user gets login successful message")
	public void user_gets_login_successful_message() {
	    // Write code here that turns the phrase above into concrete actions
		String Actualgreeting=driver.findElement(By.id("username_show")).getAttribute("value");
		//Assert.assertEquals(ExpectedText,Actualgreeting);
	}






}
