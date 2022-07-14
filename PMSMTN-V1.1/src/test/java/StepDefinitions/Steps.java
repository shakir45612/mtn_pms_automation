package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver = null;

	@Given("^user is on login page$")
	public void user_is_on_login_page() {
		System.out.println("Login page is available");
		
		String projectPath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/driver/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://pms-ui.my.mtn.com/");
		
		
	}

	@When("^user enter(.*)and(.*)$")
	public void user_enter_userid_and_password(String userid, String password) throws InterruptedException {
		
		driver.findElement(By.id("email")).sendKeys(userid);
		driver.findElement(By.id("password")).sendKeys(password);
		
		Thread.sleep(1000);
	}

	@And("clicks on publish")
	public void clicks_on_publish() {
		System.out.println("Enter on Publish button");
		driver.findElement(By.className("Button_primary__doGup Button_base__mtuBw")).click();
		
	}

	@Then("user is naviagted to PMS dashboard")
	public void user_is_naviagted_to_pms_dashboard() {
		System.out.println("Navigated to the PMS dashboard");
	}


}
