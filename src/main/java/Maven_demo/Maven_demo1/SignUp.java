package Maven_demo.Maven_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	
	Utility_Package ref=new Utility_Package();
	int xyz=ref.randomNum();


	ChromeDriver Tracko;
	public SignUp(ChromeDriver tracko2) {
		Tracko=tracko2;

			}
	public void sign(String name,String Email,String Mobile,String Otp,String password ) throws InterruptedException
	{
			
		Tracko.findElement(By.xpath("//*[@href='trackoweb/signup.html']")).click();
		//Tracko.findElement(By.id("sub_btn_signup")).click();
		Tracko.findElementByXPath("//input[@placeholder='Your name' and @name='name' and @id='name' and @type='text']").sendKeys(name);
		Tracko.findElementByXPath("//input[@type='email']").sendKeys(Email);
		Tracko.findElementByXPath("//input[@type='text' and @id='mobile']").sendKeys(Mobile);
        Tracko.findElementByXPath("//button[text()='Sign up']").click(); 
        Thread.sleep(8000);
        
	}



}