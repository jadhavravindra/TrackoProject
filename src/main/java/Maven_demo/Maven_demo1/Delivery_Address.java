package Maven_demo.Maven_demo1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Delivery_Address {
	ChromeDriver Tracko;
	public Delivery_Address(ChromeDriver tracko2) {
		Tracko=tracko2;
		System.out.println("this is second time bhayi");
	}
	public void delivery_address()
	{
		Tracko.findElementByXPath("//input[@id='billingStreet']").sendKeys("warje");    // for address
		Tracko.findElementByXPath("//*[@id='billingCity']").sendKeys("Pune");
		Select State=new Select(Tracko.findElementByXPath("//*[@id='billingState']"));
		State.selectByIndex(1);
		Tracko.findElementByXPath("//*[@id='billingPincode']").sendKeys("443456");
		Tracko.findElementByXPath("//*[@id='copyAddress']").click();

	}
	

}
