package Appium2;

		import java.io.IOException;
		import java.net.URL;
        import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
		import org.openqa.selenium.remote.CapabilityType;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import io.appium.java_client.android.AndroidDriver;
		
		public class ebay3 {

			public static void main(String[] args) throws IOException
			{
				DesiredCapabilities dc=new DesiredCapabilities();
				dc.setCapability(CapabilityType.BROWSER_NAME,"");
				// For Higher version
				dc.setCapability("deviceName","47db12770104");
				dc.setCapability("platformName","android");
				dc.setCapability("platformversion","7.0");
				// For Lower version
				//dc.setCapability("deviceName","emulator-5554");
				//dc.setCapability("platformName","android");
				//dc.setCapability("platformversion","4.2.2");
				dc.setCapability("appPackage","com.ebay.mobile");
				dc.setCapability("appActivity","com.ebay.mobile.activities.MainActivity");
				 
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
				//automation
				try
				{
					//get packagename
					String p=driver.getCurrentPackage();
					String a=driver.currentActivity();
					System.out.println(p+""+a);
					String x=driver.getRemoteAddress().getPath();
					System.out.println(x);
					String y=driver.getRemoteAddress().getProtocol();
					System.out.println(y);
					int z=driver.getRemoteAddress().getPort();
					System.out.println(z);
					String h1=driver.getRemoteAddress().getHost();
					System.out.println(h1);
					
					//mobile date and time using appium
					String x1=driver.getDeviceTime();
					System.out.println(x1);
					
					//get platform name
					String y1=driver.getPlatformName();
					System.out.println(y1);
					
				    //getdisplaydensity
					long i=driver.getDisplayDensity();
					System.out.println(i);
					//screen orientation
					System.out.println(driver.getOrientation());
					driver.rotate(ScreenOrientation.PORTRAIT);
					
					WebDriverWait w=new WebDriverWait(driver,30);
					driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Home']")).click();
					WebDriverWait t=new WebDriverWait(driver,100);
					t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Search for anything']")));
				    
					driver.findElement(By.xpath("//*[@text='Search for anything']")).sendKeys("65 inch TV");
					Thread.sleep(5000);
					
					driver.findElement(By.xpath("//*[@text='led tv 65 inch']")).click(); 
					Thread.sleep(5000);
		
					driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
					Thread.sleep(5000);
						
					driver.findElement(By.xpath("//*[@text='Notifications']")).click();
					Thread.sleep(5000);
					//get notifications
					driver.openNotifications();
					driver.findElement(By.xpath("//*[@content-desc='Clear all notifications.']")).click();
					
					driver.findElement(By.xpath("//*[@text='Messages']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Watching']")).click();
				    Thread.sleep(5000);
					
					driver.findElement(By.xpath("//*[@text='Saved']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Purchases']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Bids & Offers']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Selling']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Categories']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Deals']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Settings']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Help']")).click();
					Thread.sleep(5000);									
				}
				catch(Exception ex) 
				{
			            System.out.println(ex.toString());
			        }
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

		}

	}


		
		