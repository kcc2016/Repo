package pkg;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetupAndTearDown {
	@BeforeTest
	public void start() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		Thread.sleep(60000);
	}

	@AfterTest
	public void stop() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(30000);
//		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
