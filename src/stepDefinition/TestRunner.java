package stepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class TestRunner {
	WebDriver driver;
	@Given("^open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();   
	}
	@When("^enter usename and password$")
	public void enter_usename_and_password() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("kumar62922@gmail.com");
	     driver.findElement(By.name("Password")).sendKeys("Dks@7139");	
	    
	}

	@Then("^User should be able to login$")
	public void user_should_be_able_to_login() throws Throwable {
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();  
	}
	@Given("^open chrome and start the chrome browser$")
	public void open_chrome_and_start_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();   
	}
	@When("^enter the invalid crdendials$")
	public void enter_the_invalid_crdendials() throws Throwable {
		driver.findElement(By.id("Email")).sendKeys("kumar62922@gmail.com");
	     driver.findElement(By.name("Password")).sendKeys("Dks7139");	 
	}
	@Then("^User should not  be able to login$")
	public void user_should_not_be_able_to_login() throws Throwable {
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	}
}
