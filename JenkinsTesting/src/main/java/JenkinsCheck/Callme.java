package JenkinsCheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Callme {
	
	
	@Test
	public void Executor(){
		System.setProperty("webdriver.chrome.driver", "D:\\eclipse-jee-oxygen-R-win32-x86_64\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");

	}
	
	
	@Test
	public void Hello(){
		System.out.println("Hello People");
	}
	
	@Test
	public void Bye(){
		System.out.println("Bye People");
	}

}
