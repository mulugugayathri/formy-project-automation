import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/autocomplete");
		WebElement autocomplete = driver.findElement(By.id("autocomplete"));
		Thread.sleep(500);
		autocomplete.sendKeys("1555 Park Blvd,Palo Alto,CA");
		WebElement autocompleteResult= driver.findElement(By.className("pac-container hdpi"));
		
		autocompleteResult.click();
		driver.quit();
		
				
	}

}
