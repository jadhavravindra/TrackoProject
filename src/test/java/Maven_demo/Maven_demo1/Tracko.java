package Maven_demo.Maven_demo1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Tracko {
	ChromeDriver Tracko;
	String name="Paresh";
	String Email;
	String Mobile;
	String Otp="123456";
	String password="Test@123";
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		Tracko = new ChromeDriver();
		Tracko.get("https://dev.tracko.co.in/");
		Tracko.manage().window().maximize();
	}

	@Test(priority=1)
	public void f() throws InterruptedException 
	{
		
		Utility_Package ref = new Utility_Package();      //utility package
		int num1=ref.randomNum();
		
		Email="Paresh"+num1+"2@gmail.com";
		
		int num2=ref.randomNum();
		Mobile="95"+num2+"874395";
				
		
		SignUp signup=new SignUp(Tracko);				//for Sign up
		signup.sign(name,Email,Mobile,Otp,password);

		


		OTP O=new OTP(Tracko);						//for OTP
		O.otp(Otp);

		

		SET_PASSWORD SP=new SET_PASSWORD(Tracko);		//for Set Password
		SP.Set_Pass(password);
		
		LOGIN l = new LOGIN(Tracko);
		l.login(Email,password,Mobile);


		/*LOGIN L=new LOGIN(Tracko);					//for Login
        L.login();
		 */

		Product_Details PD=new Product_Details(Tracko);	//for product details
		System.out.println("this is in product details");
		PD.product_detail();

		Delivery_Address DA=new Delivery_Address(Tracko);     //For Address details
		DA.delivery_address();

	}
	@AfterClass
	public void afterClass() {
		System.out.println("Hii This is after test ");  
	}
}
