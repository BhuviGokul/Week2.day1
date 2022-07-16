package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		// launch the browser
		ChromeDriver driver=new ChromeDriver();

		//Launching the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize the drive
		driver.manage().window().maximize();

		//Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click on Login Button using Class Locator

		driver.findElement(By.className("decorativeSubmit")).click();

		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();

		//Click on Create Lead 
		driver.findElement(By.linkText("Create Lead")).click();

		//Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");

		//Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Bhuvi");

		//Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gokul");

		//Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("BG");

		//Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");

		//Enter Description Field Using any Locator of your choice
		driver.findElement(By.name("description")).sendKeys("iam from coimbatore, working in cognizant for past 5year");

		//Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.name("primaryEmail")).sendKeys("bhuvanvenkat05@gmail.com");

		//Select State/Province as NewYork Using Visible Text
		WebElement country=driver.findElement(By.name("generalCountryGeoId"));

		Select city= new Select(country);

		city.selectByVisibleText("Australia");

		//Click on Create Button
		driver.findElement(By.name("submitButton")).click();

		//Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String title=driver.getTitle();

		if(title.equals("View Lead | opentaps CRM")) {

			System.out.println(title);
		}


	}

}
