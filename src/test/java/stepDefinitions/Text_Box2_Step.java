package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Text_Box2_Step {
WebDriver driver;
	
	@Given("User is on the WebPage")
	public void user_is_on_the_web_page() {
	    driver=WebDriverManager.chromedriver().create();
	    driver.get("file:///C:/Users/hr/Desktop/firstpage.html");
	}

	@When("User enters valid inputs {string}, {string}, {string} in the respective texboxes")
	public void user_enters_inputs_in_the_respective_texboxes(String Name, String Address, String MyStory) {
	    driver.findElement(By.id("box1")).sendKeys(Name);
	    driver.findElement(By.id("box2")).sendKeys(Address);
	    driver.findElement(By.id("box3")).sendKeys(MyStory);
	}
	@Then("User clicks the Submit btn")
	public void user_clicks_the_submit_btn() {
	    driver.findElement(By.xpath("/html/body/form/ul/div[4]/input")).click();
	    boolean b=driver.findElement(By.xpath("/html/body/div/p")).isDisplayed();
		System.out.println(b);
		if(b==true) {
			System.out.println("user entered valid input");
		}
		driver.quit();
		
	}
	@Then("User calculate and assert max CharLimit of the Name, Address and My story textboxes")
	public void get_Max_CharLimit() {
		WebElement Name_textBox=driver.findElement(By.id("box1"));
		
		String Name_maxLimit=Name_textBox.getAttribute("maxlength");
		System.out.println(Name_maxLimit);
	
		if (Name_maxLimit.equals("30")) {
			System.out.println("Maximum Char limit for Name texbox is:"+Name_maxLimit);
		}
		WebElement Address_textBox=driver.findElement(By.id("box2"));
		
		String Address_maxLimit=Address_textBox.getAttribute("maxlength");
		System.out.println(Address_maxLimit);
	
		if (Address_maxLimit.equals("50")) {
			System.out.println("Maximum Char limit for Address texbox is:"+Address_maxLimit);
		}
		
		WebElement My_Story_textBox=driver.findElement(By.id("box3"));
		
		String My_Story_maxLimit=My_Story_textBox.getAttribute("maxlength");
		System.out.println(My_Story_maxLimit);
	
		if (My_Story_maxLimit.equals("200")) {
			System.out.println("Maximum Char limit for My Story texbox is:"+My_Story_maxLimit);
		}
		}
	
}
