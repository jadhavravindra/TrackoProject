package Maven_demo.Maven_demo1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tracko {
	ChromeDriver Tracko;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		Tracko = new ChromeDriver();
		Tracko.get("https://dev.tracko.co.in/");
		Tracko.manage().window().maximize();
	}

	@Test
	public void f() throws InterruptedException 
	{
		SignUp signup=new SignUp(Tracko);				//for Sign up
		signup.sign();

		


		OTP O=new OTP(Tracko);						//for OTP
		O.otp();

		

		SET_PASSWORD SP=new SET_PASSWORD(Tracko);		//for Set Password
		SP.Set_Pass();
		
		LOGIN l = new LOGIN(Tracko);
		l.login();


		/*LOGIN L=new LOGIN(Tracko);					//for Login
        L.login();
		 */

		Product_Details PD=new Product_Details(Tracko);	//for product details
		PD.product_detail();

		Delivery_Address DA=new Delivery_Address(Tracko);     //For Address details
		DA.delivery_address();

	}
	@AfterClass
	public void afterClass() {
		System.out.println("Hii This is after test ");  
	}
}
