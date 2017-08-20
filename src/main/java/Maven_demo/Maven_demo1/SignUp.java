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
	public void sign() throws InterruptedException
	{
			
		Tracko.findElement(By.xpath("//*[@href='trackoweb/signup.html']")).click();
		//Tracko.findElement(By.id("sub_btn_signup")).click();
		Tracko.findElementByXPath("//input[@placeholder='Your name' and @name='name' and @id='name' and @type='text']").sendKeys("vinash");
		Tracko.findElementByXPath("//input[@type='email']").sendKeys("trisha12@gmail.com");
		Tracko.findElementByXPath("//input[@type='text' and @id='mobile']").sendKeys("9997884579");
        Tracko.findElementByXPath("//button[text()='Sign up']").click(); 
        Thread.sleep(8000);
        
	}



}