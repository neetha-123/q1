package PKG;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("WebDriver.chrome.driver", "G:\\selenium automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.facebook.com/signup");
driver.findElement(By.name("firstname")).sendKeys("neetha");
driver.findElement(By.name("lastname")).sendKeys("george");
driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
driver.findElement(By.name("reg_passwd__")).sendKeys("neetha");
Select day= new Select(driver.findElement(By.name("birthday_day")));
day.selectByValue("20");
Select month = new Select(driver.findElement(By.name("birthday_month")));
month.selectByIndex(9);
Select year = new Select(driver.findElement(By.name("birthday_year")));
year.selectByVisibleText("2015");
driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
driver.findElement(By.name("websubmit")).click();
	}
}
