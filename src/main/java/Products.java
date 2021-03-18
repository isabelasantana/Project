import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Products {
	
	private WebDriver driver;

	@Before
	public void start(){
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void end(){
		driver.quit();
	}
	
	@Test
	public void teste() {
		driver.get(" https://www.podium.com/");
		driver.findElement(By.className("blue-box")).click();
		driver.findElement(By.xpath("//*[@id='page']/nav/div[2]/div[1]/ul/li[1]/span")).click();
		driver.findElement(By.id("submenu-starter-button")).click();
		Assert.assertEquals("Podium",driver.getTitle());
	}
}
