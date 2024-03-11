package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", 
				glue = "steps", 
				dryRun = false, 
				tags = "@regressivos",
				monochrome = true, 
				snippets = SnippetType.CAMELCASE, 
				plugin = {"pretty", "html:target/cucumber-report.html" }
)

public class Executa extends Drivers {
	
	
	public static void abrirNavegador() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationteststore.com/");
	}
	
	@AfterClass
	public static void fecharNavegador() {
		driver.quit();
		
	}
	


}
