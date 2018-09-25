package Appium2;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class multitouchaction {

	public static void main(String[] args) throws IOException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName","47db12770104");
		dc.setCapability("platformName","android");
		dc.setCapability("platformversion","7.0");
		//dc.setCapability("deviceName","emulator-5554");
		//dc.setCapability("platformName","android");
		//dc.setCapability("platformversion","4.2.2");
		dc.setCapability("appPackage","com.vodqareactnative");
		dc.setCapability("appActivity","com.vodqareactnative.MainActivity");
		//Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k\"appium -a 0.0.0.0 -p 4723\"");
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver driver;
		while(2>1)
		{
			try {
				driver=new AndroidDriver(u,dc);
				break;
			}
			catch(Exception ex)
			{
			}}
		try
		{
			WebDriverWait w=new WebDriverWait(driver,20);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='LOG IN']")));
			driver.findElement(By.xpath("//*[@text='LOG IN']")).click();
			//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Slider']")));
			driver.findElement(By.xpath("//*[@text='Slider']")).click();
		//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Slider']")));
			
			WebElement e1=driver.findElement(By.xpath("//*[@content-desc='slider']"));
			int e1x1=e1.getLocation().getX();
			int e1y1=e1.getLocation().getY();
			int e1x2=e1x1+300;
			int e1y2=e1y1;
			TouchAction ta1=new TouchAction(driver);
			Duration d=Duration.of(10,ChronoUnit.SECONDS);
			ta1.press(e1x1,e1y1).waitAction(d).moveTo(e1x2,e1y2).release();
			WebElement e2=driver.findElement(By.xpath("//*[@content-desc='slider1']"));
			int e2x1=e2.getLocation().getX();
			int e2y1=e2.getLocation().getY();
			int e2x2=e2x1+300;
			int e2y2=e2y1;
			TouchAction ta2=new TouchAction(driver);
		//	Duration d1=Duration.of(10,ChronoUnit.SECONDS);
			ta2.press(e2x1,e2y1).waitAction(d).moveTo(e2x2,e2y2).release();
			MultiTouchAction ma=new MultiTouchAction(driver);
			ma.add(ta1).add(ta2).perform();
			w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='0']")));
             driver.closeApp();

			}
			catch(Exception ex)
			{
				System.out.println(ex.getMessage());
			}				
			Runtime.getRuntime().exec("taskkill /F /IM node.exe");
			Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

		}}