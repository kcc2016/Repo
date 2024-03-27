package pkg;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class EdgeTest {
	@Test
	public void test() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("MicrosoftEdge");
		URL url = new URL("http://localhost:4444/wd/hub");

		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		String title = driver.getTitle();
		System.out.println("MICROSOFT EDGE: " + title);

		Thread.sleep(2000);
		driver.quit();
	}
}
