package Maven_demo.Maven_demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Product_Details {
	ChromeDriver Tracko;
	public Product_Details(ChromeDriver tracko2) {
		Tracko=tracko2;
	}
	public void product_detail() throws InterruptedException
	{
		Thread.sleep(5000);
		Tracko.findElementByXPath("//a[@href='product_details.html?modelId=1' and @class='btn btn-sm btn-block btn-cta-primary']").click();
		
		Thread.sleep(5000);
		Tracko.findElementByXPath("//a[@class='btn btn-block btn-cta-primary']").click();
         Thread.sleep(5000);
		Select drop= new Select(Tracko.findElement(By.xpath("//select[@id='cmbPlans']")));
	    
		//drop.selectByVisibleText("Maharashtra");
		//drop.selectByValue("Maharashtra");
		drop.selectByIndex(1);

		Thread.sleep(5000);
		Tracko.findElementByXPath("//input[@id='qid']").sendKeys("1");
		Thread.sleep(5000);
		Tracko.findElementByXPath("//input[@id='vehicle_0']").sendKeys("4578");
		Thread.sleep(5000);
		//Tracko.findElementByXPath("//button[@class='btn btn-primary' and @type='button' and @onclick='saveContinueOrder();']").click();
		Tracko.findElementByXPath("//button[@onclick='saveCheckoutOrder();']").click();

	}
}
