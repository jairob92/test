package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterUser extends Base {

	By singIngLocator = By.xpath("//a[@class='login']");
	By createAnAccountLocator = By.id("create-account_form");
	By emailAddressLocator = By.id("email_create");
	By registerButtonLocator = By.name("SubmitCreate");
	By registerInformatioLocator = By.className("//*[@id=\"noSlide\"]/h1");
	By genderMaleLocator = By.id("id_gender1");
	By genderFemaleLocator = By.id("id_gender2");
	By FirstNameLocator = By.id("customer_firstname");
	By LastNameLocator = By.id("customer_lastname");
	By passwdLocator = By.id("passwd");
	By ListDays = By.name("days");
	By ListMonths = By.name("months");
	By ListYears = By.name("years");
	By AddressLocator = By.id("address1");
	By SecondAddressLocator = By.id("address2");
	By StateLocator = By.id("id_state");
	By CityLocator = By.id("city");
	By ZipCodeLocator = By.id("postcode");
	By CountryLocator = By.id("id_country");
	By MobilePhoneLocator = By.id("phone_mobile");
	By ButtonRegisterLocator = By.id("submitAccount");
	By InfoAccountLocator = By.xpath("//p[@class='info-account']");

	public RegisterUser(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void registerUser() throws InterruptedException {
		click(singIngLocator);
		Thread.sleep(5000);
		if (isDisplayed(createAnAccountLocator)) {
			type("prueba22@gol.com", emailAddressLocator);
			click(registerButtonLocator);
			//if()
		} else {
			System.out.print("Pagina no existe");
		}
		Thread.sleep(5000);

		click(genderMaleLocator);
		type("Jairo", FirstNameLocator);
		type("Bermudez", LastNameLocator);
		type("12345", passwdLocator);
		SelectDropDownDay();
		SelectDropDownMonth();
		SelectDropDownYear();
		type("calle 20", AddressLocator);
		type("calle 30", SecondAddressLocator);
		type("Florida", CityLocator);
		SelectDropDownState();
		type("32583", ZipCodeLocator);
		type("311528962", MobilePhoneLocator);
		click(ButtonRegisterLocator);

	}

	public String SelectDropDownDay() {
		Select select = new Select(findElement(ListDays));
		select.selectByVisibleText("10  ");
		return getText(select.getFirstSelectedOption());

	}

	public String SelectDropDownMonth() {
		Select select = new Select(findElement(ListMonths));
		select.selectByVisibleText("December ");
		return getText(select.getFirstSelectedOption());

	}

	public String SelectDropDownYear() {
		Select select = new Select(findElement(ListYears));
		select.selectByVisibleText("1979  ");
		return getText(select.getFirstSelectedOption());

	}

	public String SelectDropDownState() {
		Select select = new Select(findElement(StateLocator));
		select.selectByVisibleText("Arizona");
		return getText(select.getFirstSelectedOption());

	}

	public String SelectDropDownCountry() {
		Select select = new Select(findElement(CountryLocator));
		select.selectByVisibleText("United States");
		return getText(select.getFirstSelectedOption());
	}

	public String registeredMessage() {
		WebElement p = findElement(InfoAccountLocator);
		return p.getText();
	}

}
