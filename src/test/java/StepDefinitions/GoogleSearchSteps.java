package StepDefinitions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver = null;
	
	@Given("browser is open")
	public void browser_is_open() {

		System.out.println("Inside Step- browser is open");
		
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("Project path is :"+projectPath);
		
		System.setProperty("webdriver.chrome.driver","C:\\Downloads\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
		//driver.manage().window().maximize();
		
		
	}	
	

	@And("user is on google search page")
	public void user_is_on_google_search_page() {

		System.out.println("Inside Step- user is on google search page");
		driver.navigate().to("https://google.com");
	}

	@When("user enters a text in search page")
	public void user_enters_a_text_in_search_page() throws InterruptedException {

		System.out.println("Inside Step- user enters a text in search page");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		Thread.sleep(3000);
		
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {

		System.out.println("Inside Step- hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {

		System.out.println("user is navigated to search results");
		driver.getPageSource().contains("Online Cources");
		
		driver.close();
		driver.quit();
	}

}
