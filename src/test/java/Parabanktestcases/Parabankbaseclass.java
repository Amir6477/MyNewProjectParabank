package Parabanktestcases;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Parabankbaseclass {
	
	Parabankutilities.Readingdata Rd=new Parabankutilities.Readingdata();
	
	public String AppURL=Rd.getappurl();
	public String Firstname=Rd.getfirst();
	public String lastname=Rd.getlast();
	public String Address=Rd.getaddress();
	public String city=Rd.getcity();
	public String state=Rd.getstate();
	public String zipcode=Rd.getzcode();
	public String phone=Rd.getphone();
	public String SSN=Rd.getSSN();
	public String username=Rd.getuname();
	public String passwordname=Rd.getpwd();
	public String confirm=Rd.getcpasd();
											
	public static WebDriver driver;
	public static Logger log;
	
	@BeforeClass
	public void OpenApp() {
		
		driver = new EdgeDriver();
		
		driver.get(AppURL);
		driver.manage().window().maximize();
		
		log=Logger.getLogger(driver.getClass());
		PropertyConfigurator.configure("log4j.properties");
	}
	@AfterClass
	public void CloseApp() {
		driver.close();
	}


	public String captureScreen(String name) throws IOException {
	String timeStamp=new SimpleDateFormat("dd.MM.yyyy.hh.mm.ss").format(new Date());

	TakesScreenshot ts=(TakesScreenshot)driver;

	File src=ts.getScreenshotAs(OutputType.FILE);

	//system.getProperty("user.dir")
	String target=(System.getProperty("user.dir")+"\\Screenshots\\"+name+"_"+timeStamp+".png");

	try {
		FileUtils.copyFile(src, new File(target));
	}catch(Exception e) {
		e.printStackTrace();
	}

	log.info("screenshot is taken");
	return target;
	
	}

}
