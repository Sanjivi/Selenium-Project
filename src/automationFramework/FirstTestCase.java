
package automationFramework;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class FirstTestCase {
 
	public static void main(String[] args) throws InterruptedException{
		
		// Create a new instance of the Chrome driver
		String exePath = "C:\\Shankari\\JavaWorkspace\\chromedriver.exe";
		System.out.println("Chrome ..."+exePath);
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nab.com.au");
		driver.findElement(By.cssSelector("#menu-logo-container .active [href='#']")).click();
		Thread.sleep(5000);
		
	
	
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");

        // Close the driver
        driver.quit();
    }

}


 
