
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibraryTest {
   public static void main(String []args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver", "D:\\SOFTWARES\\New folder\\Drivers\\chromedriver_win32\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("http://demo.guru99.com/V4/");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//input[@name='uid']")).sendKeys("bdshbfdshbfds");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("hjasdgbh");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//input[@name='btnLogin']")).click();
	   driver.switchTo().alert().accept();
	   Thread.sleep(1000);
	   driver.findElement(By.xpath(".//input[@name='btnReset']")).click();
	   driver.quit();
   }
}
