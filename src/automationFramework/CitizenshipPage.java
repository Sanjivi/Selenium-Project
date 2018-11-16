package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CitizenshipPage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exePath = "C:\\Shankari\\JavaWorkspace\\chromedriver.exe";
		System.out.println("Chrome ..."+exePath);
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://immi.homeaffairs.gov.au/help-support/tools/residence-calculator");
		String abd = "15/07/2015";
		//WebElement ABCD=
		String xy= driver.findElement(By.name("ctl00$PlaceHolderMain$DisplayCalculator$ResidencyCalculator$txtResiDate")).getText();
		//System.out.println(xy);

}
}
