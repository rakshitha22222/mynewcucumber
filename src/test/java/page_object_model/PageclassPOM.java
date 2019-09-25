package page_object_model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageclassPOM {
	WebDriver driver;
	By lnc=By.linkText("Log in");
	By uname=By.name("Email");
    By pwd=By.name("Password");
    By lin=By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");
    By lout=By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
    public PageclassPOM(WebDriver driver) {
    	this.driver=driver;
    }
    public void clicklink() {
    	driver.findElement(lnc).click();
    	
    }
    
    public void typeuname(String username) {
    	driver.findElement(uname).sendKeys("rakshithamanj@gmail.com");
    	
    }
    
    public void typepassword(String password) {
    	driver.findElement(pwd).sendKeys("rakshitha");
    }
    public void clickonloginlyn() {
    	driver.findElement(lin).click();
    }
    
    public void clickonlogoutlou() {
    	driver.findElement(lout).click();
    }
}
