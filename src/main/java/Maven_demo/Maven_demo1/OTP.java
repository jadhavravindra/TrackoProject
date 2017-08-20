package Maven_demo.Maven_demo1;

import org.openqa.selenium.chrome.ChromeDriver;

public class OTP {
	ChromeDriver Tracko;
	public OTP(ChromeDriver tracko2) {
		Tracko = tracko2;
	}
	public void otp() throws InterruptedException {
		  Tracko.findElementByXPath("//input[@id='otp']").sendKeys("123456");
	       // Tracko.findElementByXPath(" //button[@id='resendOtp_btn']").click();
	        Tracko.findElementByXPath("//button[@id='sub_btn_verify']").click();
	        //Tracko.switchTo().alert().accept();
	        Thread.sleep(8000);
	        Tracko.findElementByXPath("//button[@class='confirm']").click();
	        
	}
}
