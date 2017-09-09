package Maven_demo.Maven_demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class SET_PASSWORD {
	ChromeDriver Tracko;
	int xyz;
	public SET_PASSWORD(ChromeDriver tracko2) {
		Tracko=tracko2;
	}
	public void Set_Pass(String password) throws InterruptedException
	{

		//Utility_Package ref=new Utility_Package();
		//int xyz=ref.randomNum();

	Tracko.findElementByXPath("//input[@id='password']").sendKeys(password);
    Tracko.findElementByXPath("//input[@id='repassword']").sendKeys(password);
    Tracko.findElementByXPath("//button[@id='sub_btn_setpass']").click();
    Thread.sleep(8000);
	}

}
