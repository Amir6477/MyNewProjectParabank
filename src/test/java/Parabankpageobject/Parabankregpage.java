package Parabankpageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parabankregpage {
	
	WebDriver driver;
	public Parabankregpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Register']")
		WebElement linkRegister;	
	@FindBy(id="customer.firstName")
		WebElement firstname;	
	@FindBy(id="customer.lastName")
		WebElement lastname;	
	@FindBy(id="customer.address.street")
		WebElement address;
	@FindBy(id="customer.address.city")
		WebElement city;	
	@FindBy(id="customer.address.state")
		WebElement state;	
	@FindBy(id="customer.address.zipCode")
		WebElement zipcode;	
	@FindBy(id="customer.phoneNumber")
		WebElement number;	
	@FindBy(id="customer.ssn")
		WebElement SSN;	
	@FindBy(id="customer.username")
		WebElement username;	
	@FindBy(id="customer.password")
		WebElement password;	
	@FindBy(id="repeatedPassword")
		WebElement confirm;	
	@FindBy(xpath="//td/input[@class='button']")
		WebElement btnregister;
	
	public void Registerlink() {
		linkRegister.click();
	}
	public void firstname(String fname) {
		firstname.sendKeys(fname);
	}
	public void lastname(String lname) {
		lastname.sendKeys(lname);
	}
	public void address(String street) {
		address.sendKeys(street);
	}
	public void city(String cname) {
		city.sendKeys(cname);
	}
	public void state(String sname) {
		state.sendKeys(sname);
	}
	public void zipcode(String zcode) {
		zipcode.sendKeys(zcode);
	}
	public void number(String num) {
		number.sendKeys(num);
	}
	public void ssn(String Snum) {
		SSN.sendKeys(Snum);
	}
	public void username(String uname) {
		username.sendKeys(uname);
	}
	public void password(String pwd) {
		password.sendKeys(pwd);
	}
	public void confirmp(String cpwd) {
		confirm.sendKeys(cpwd);
	}
	public void register() {
		btnregister.click();
	}
}

