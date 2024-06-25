package org.Runnerfile;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\Featurefie",glue="org.Stepdefn")


     public class Adactinrunner {
	
     public static WebDriver driver ;
     
     @BeforeClass
     public static void Run() {
		driver = new ChromeDriver();

	}
	
	
	
	
	
	
	
}