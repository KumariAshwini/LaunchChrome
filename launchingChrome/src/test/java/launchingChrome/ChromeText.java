package launchingChrome;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeText {
@Test
public void chromeTest()
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
}
}
