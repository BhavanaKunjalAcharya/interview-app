package demotc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Openchrome {


	public static void main(String[] args) {
		
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bkunjal\\Desktop\\Softwares\\chromedriver_win32\\chromedriver.exe");

		// Initialize browser
		WebDriver driver=new ChromeDriver();
		
		// Open facebook
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();

		
	}

}