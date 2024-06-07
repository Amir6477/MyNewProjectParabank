package Parabankutilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readingdata {
	Properties pro;
	public Readingdata() {
		
		File F=new File("C:\\Users\\amirk\\eclipse-workspace\\Parabankreg\\Configuration\\Data.properties");
		
		try { //converted to reading mode
			
			FileInputStream fis=new FileInputStream(F);
			pro = new Properties();
			pro.load(fis); //load file 
			
		}catch(Exception e) { //exception proper
			e.printStackTrace(); 
		}
		
	}
	
	public String getappurl() {		
		String Url=pro.getProperty("AppURL");
		return Url;
	}
	public String getfirst() {
		
		String fname=pro.getProperty("Firstname");
		return fname;
	}
	public String getlast() {
		
		String lname=pro.getProperty("Lastname");
		return lname;
	}
	public String getaddress() {
		String Adrs=pro.getProperty("Address");
		return Adrs;
	}
	public String getcity() {
		String city=pro.getProperty("City");
		return city;
	}
	public String getstate() {
		String state=pro.getProperty("State");
		return state;
	}
	public String getzcode() {
		String zcode=pro.getProperty("Zipcode");
		return zcode;
	}
	public String getphone() {
		String phn=pro.getProperty("Phone");
		return phn;
	}
	public String getSSN() {
		String ssn=pro.getProperty("SSN");
		return ssn;
	}
	public String getuname() {
		String uname=pro.getProperty("Username");
		return uname;
	}
	public String getpwd() {
		String Pname=pro.getProperty("Password");
		return Pname;
	}
	public String getcpasd() {
		String cpwd=pro.getProperty("Confirm");
		return cpwd;
	}
}
