package page_object_model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver" , "C:\\Users\\training_b6B.01.16\\Desktop\\BrowerDrivers\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	PageclassPOM PObject= new PageclassPOM(driver);
	driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	PObject.clicklink();
	String username=null;
	PObject.typeuname(username);
    String password=null;
    PObject.typepassword(password);
    PObject.clickonloginlyn();
    System.out.println("title of the page is " +driver.getTitle());
    PObject.clickonlogoutlou();
}
}