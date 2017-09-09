package Maven_demo.Maven_demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN 
{
	ChromeDriver Tracko;

	public LOGIN(ChromeDriver tracko2) {
		Tracko=tracko2;
	}

	public void login(String Email,String password,String Mobile)
	{
		Tracko.findElementByXPath("//input[@id='login-mobile']").sendKeys(Mobile);
		Tracko.findElementByXPath("//input[@id='login-password']").sendKeys(password);
		Tracko.findElementByXPath("//button[@id='sub_btn' and @type='submit']").click();


	}

}
