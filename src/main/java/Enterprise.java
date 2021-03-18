import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Enterprise {
	
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
		driver.findElement(By.xpath("//*[@id='page']/nav/div[2]/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id='panel-2519-0-0-0']/div/div/section[1]/div/div/div[1]/div[4]/a")).click();
		driver.findElement(By.xpath("//*[@id='colophon']/section/div[1]/div[2]/div[3]/a[1]")).click();
		
	}
}
