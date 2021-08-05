import org.openqa.selenium.chrome.ChromeDriver;


public class Launch_Browser {
	public static void main(String[] args)
	{
		String value = "./Softwares/chromedriver.exe";
		String key = "webdriver.chrome.driver";
		System.setProperty(key, value);
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
		
	}

}
