package alertPopup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUp {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://183.82.125.5/nareshit/login.php");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("suresh");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		driver.findElement(By.name("txtPassword")).sendKeys("suresh123");
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(2000);
		System.out.println("Login completed");
		driver.findElement(By.linkText("Logout")).click();
		driver.close();
	}
}
