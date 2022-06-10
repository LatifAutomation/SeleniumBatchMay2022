package Basics;

public class FirefoxDriver {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D://Selenium_setup_May_2022/geckodriver.exe");
		
		FirefoxDriver driver=new FirefoxDriver();

	}

}
