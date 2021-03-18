import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {
	
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
		Assert.assertEquals("Messaging Tools for Local Business | Customer Review Software, Webchat, Payments | Podium", driver.getTitle());
	}

}
