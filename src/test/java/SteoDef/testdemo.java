package SteoDef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testdemo {

WebDriver driver=null;
  @Given("^the  login page is opened$")
  public void the_login_page_is_opened() throws Throwable {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\training_b6B.01.16\\Desktop\\BrowserDrivers\\chromedriver.exe");
   driver= new ChromeDriver();
   driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
   driver.manage().window().maximize();
   
  }
 @When("^user click on signin link$")
  public void user_click_on_signin_link()  {
   driver.findElement(By.linkText("SignIn")).click();
   System.out.println("the title of the page is"+driver.getTitle());
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      
  }
 @When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
  public void user_enters_and(String username, String password)  {
   
   driver.findElement(By.name("userName")).sendKeys(username);
   driver.findElement(By.id("password")).sendKeys(password);
   driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   
  }

 @Then("^message displayed Login Successfully$")
  public void message_displayed_Login_Successfully()  {
   System.out.println("login success ");
  }

}
