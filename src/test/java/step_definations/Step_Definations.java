package step_definations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Definations {
	
	WebDriver driver;

	@Given("User is able to acess login page")
	public void user_is_able_to_acess_login_page() {
		try {
	   System.out.println("Navigate to website URL..");
	   String path = System.getProperty("user.dir");
	   System.setProperty("webdriver.gecko.driver",path+"/geckodriver.exe");
	   driver = new FirefoxDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	   
	   
	   
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
		try {
		System.out.println("validate login page..");
		driver.get("https://www.google.com/");
		WebElement inputBox = driver.findElement(By.xpath("//input[@name=\"q\"]"));
		boolean dis = inputBox.isDisplayed();
		System.out.println("Is displayed: "+dis);
		
		inputBox.sendKeys("linkedin");
		
		inputBox.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		
		WebElement linkedin = driver.findElement(By.xpath("//*[contains(text(),\"LinkedIn: Log In or Sign Up\")]"));
		System.out.println("found text is :"+linkedin.getText());
		Thread.sleep(5000);
		
		
		
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Enter username and password..");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("click on login button...");
	}

	@When("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("user is on home page..validate home page");
	}

	@When("user access menu test data")
	public void user_access_menu_test_data() {
		System.out.println("access your menu test data..");
	}

	@When("user clicks on logout")
	public void user_clicks_on_logout() {
		System.out.println("User clicks on logout button..");
	}

	@Then("user logged out of application and back to login page")
	public void user_logged_out_of_application_and_back_to_login_page() {
		System.out.println("User logged out successfully..and user is on home page..");
		driver.close();
	}

	
}
