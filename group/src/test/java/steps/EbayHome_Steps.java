package steps;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EbayHome_Steps 
{
	WebDriver driver;
	@Given("I am on Ebay Home Page")
	public void i_am_on_ebay_home_page() {
System.out.println("I am at Ebay Home Page");
System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://www.ebay.com");
driver.manage().window().maximize();
	 
	}

	@When("I click on Advance Link")
	public void i_click_on_advance_link() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("I clicked on Advance Link");
	    driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
	}

	@Then("I navigate to Advanced Search page")
	public void i_navigate_to_advanced_search_page() {
	    System.out.println("I navigate to Advanced Search Page");
	    String expUrl = "https://www.ebay.com/sch/ebayadvsearch";
	    String actUrl = driver.getCurrentUrl();
	    
	    if(!expUrl.equals(actUrl)) {
	    	fail("You fail your test");
	    } else {
	    	System.out.println("Todo chidori");
	    	driver.quit();
	    }
	}
	
	
	
}
