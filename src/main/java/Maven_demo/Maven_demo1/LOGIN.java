package Maven_demo.Maven_demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LOGIN 
{
	ChromeDriver Tracko;

	public LOGIN(ChromeDriver tracko2) {
		Tracko=tracko2;
	}

	public void login()
	{
		Tracko.findElementByXPath("//input[@id='login-mobile']").sendKeys("9997884577");
		Tracko.findElementByXPath("//input[@id='login-password']").sendKeys("99978855");
		Tracko.findElementByXPath("//button[@id='sub_btn' and @type='submit']").click();


	}

}
