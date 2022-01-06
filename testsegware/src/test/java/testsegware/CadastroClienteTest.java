package testsegware;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CadastroClienteTest {

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
				System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://advantageonlineshopping.com/#/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void cadastroTest() throws InterruptedException {
		
		driver.findElement(By.id("menuUser")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]")).click();
		driver.findElement(By.name("usernameRegisterPage")).sendKeys("Alexandre");
		driver.findElement(By.name("emailRegisterPage")).sendKeys("test@test.com.br");
		driver.findElement(By.name("passwordRegisterPage")).sendKeys("Test@123");
		driver.findElement(By.name("confirm_passwordRegisterPage")).sendKeys("Test@123");
		
		Thread.sleep(3000);
		driver.findElement(By.name("i_agree")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("register_btnundefined")).click();
		
		
	}

}
