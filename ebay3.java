package Appium2;

		import java.io.IOException;
		import java.net.URL;
		import java.time.Duration;
		import java.time.temporal.ChronoUnit;
		import java.util.List;
		import java.util.concurrent.TimeUnit;
		import java.io.File;
        import java.io.FileInputStream;
        import java.util.Date;
		import jxl.*;
		import java.io.File;
		import java.io.IOException;
		import java.util.Hashtable;
		 
		import jxl.Sheet;
		import jxl.Workbook;
		import jxl.read.biff.BiffException;

        import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.remote.CapabilityType;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

		import io.appium.java_client.MobileElement;
		import io.appium.java_client.TouchAction;
		import io.appium.java_client.android.AndroidDriver;
		import io.appium.java_client.android.AndroidKeyCode;
		import io.appium.java_client.android.Connection;

		public class ebay3 {

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
				dc.setCapability("appPackage","com.ebay.mobile");
				dc.setCapability("appActivity","com.ebay.mobile.activities.MainActivity");
				//Runtime.getRuntime().exec("npm clear cache --f");
				//Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 192.168.1.9 -p 5555\"");
				//URL u=new URL("http://192.168.1.9:5555/wd/hub");
				 
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
					String FilePath = "D:\\data\\Book1.xls";
					FileInputStream fs = new FileInputStream(FilePath);
					Workbook wb = Workbook.getWorkbook(fs);

					// TO get the access to the sheet
					Sheet sh = wb.getSheet("Sheet1");

					// To get the number of rows present in sheet
					int totalNoOfRows = sh.getRows();

					// To get the number of columns present in sheet
					int totalNoOfCols = sh.getColumns();

					for (int row = 0; row < totalNoOfRows; row++) {

						for (int col = 0; col < totalNoOfCols; col++) {
							System.out.print(sh.getCell(col, row).getContents() + "\t");
							//ReadExcelFile DT = new ReadExcelFile();
							//DT.readExcel();
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
					
					//iver.findElement(By.xpath("//*[contains(@resource-id,'com.android.systemui:id/clear_all_button']")).click();
					//Thread.sleep(5000);
					//driver.findElement(By.xpath("//*[@content_desc='Vodafone Play']")).click();
					WebDriverWait w=new WebDriverWait(driver,30);
					//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content_desc='Vodafone Play']")));
				//	w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Home']")));
					driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
					Thread.sleep(5000);
					driver.findElement(By.xpath("//*[@text='Home']")).click();
					WebDriverWait t=new WebDriverWait(driver,100);
					t.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='Search for anything']")));
				    // driver.findElement(By.xpath("//*[@text='Search for anything']")).click(); 
					//Thread.sleep(10000);
					driver.findElement(By.xpath("//*[@text='Search for anything']")).sendKeys("65 inch TV");
					Thread.sleep(5000);
					 driver.findElement(By.xpath("//*[@text='led tv 65 inch']")).click(); 
					//Thread.sleep(5000);
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
						Thread.sleep(5000);
						driver.findElement(By.xpath("//*[@text='Home']")).click();
					//	driver.findElement(By.xpath("//*[@class='android.widget.TextView']")).click();
					//	List<WebElement>l=driver.findElementsByAccessibilityId("menu_search");
						//l.get(1).click();
						//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@resource-id,'home')]")));
						//driver.findElement(By.id("//*[contains(@resource-id,'home')]")).click();
						//com.ebay.mobile:id/home
					//	driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
						Thread.sleep(5000);
					//	driver.findElement(By.xpath("//*[@text='Home']")).click();
				//	 driver.findElement(By.xpath("//*[@text='Home']")).click();

				//	driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
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
				
					//WebElement ele = driver.findElement(By.id("com.vodafone.vodafoneplay:id/search_src_text"));
					//ele.sendKeys("z");
					//Thread.sleep(5000);
					//driver.findElementByAccessibilityId("search_src_text").click();
					//driver.findElementByAccessibilityId("search_src_text").sendKeys("test");
				//	driver.hideKeyboard();
					
					//Thread.sleep(5000);
					//driver.findElement(By.xpath("//*[contains(@resource-id,'com.vodafone.vodafoneplay:id/viewpager_right_arrow')]")).click();
					//driver.findElementByAccessibilityId("viewpager_right_arrow");
				  // List<WebElement> l=driver.findElementsByAccessibilityId("viewpager_right_arrow");
				//   l.get(0).click();
				 //  l.get(6).click();
					
				}
					}
				}
				catch(Exception ex) 
				{
			            System.out.println(ex.toString());
			        }
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");

		}


	}


		
		