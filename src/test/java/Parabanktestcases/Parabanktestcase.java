package Parabanktestcases;

import org.testng.annotations.Test;

import Parabankpageobject.Parabankregpage;

public class Parabanktestcase extends Parabankbaseclass {
	@Test
	public void Registration() {
		Parabankregpage prg=new Parabankregpage(driver);
		
		prg.Registerlink();
		log.info("Registration link activity is compeleted");
		prg.firstname(Firstname);
		log.info("Firstname is entered");
		prg.lastname(lastname);
		log.info("Lastname is entered");
		prg.address(Address);
		log.info("Address is entered");
		prg.city(city);
		log.info("City is entered");
		prg.state(state);
		log.info("State is entered");
		prg.zipcode(zipcode);
		log.info("Zipcode is entered");
		prg.number(phone);
		log.info("phonenumber is entered");
		prg.ssn(SSN);
		log.info("SSN is entered");
		prg.username(username);
		log.info("Username is entered");
		prg.password(passwordname);
		log.info("password is entered");
		prg.confirmp(confirm);
		log.info("confirm password is entered");
		prg.register();
		log.info("Registration button activity is compeleted");
	}

}
