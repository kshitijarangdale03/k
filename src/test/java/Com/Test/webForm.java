package Com.Test;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import chapter3_WebDriver_Fundamentals.Base3;

public class webForm extends Base3{
	

	@Test
	public void textinput() {
	//1.insert data in text input
	WebElement textinput=driver.findElement(By.xpath("//input[@id='my-text-id']"));
    textinput.sendKeys("hello");
    }
	@Test
	public void password() {
	//1.insert data in text input
	WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("111111111111111");
    }
	@Test
	public void disabledInput() {
	
	WebElement D=driver.findElement(By.xpath("//input[@name='my-disabled']"));
	if(D.isEnabled()) {
		D.click();
		D.sendKeys("hi");
	}
	else {
		System.out.println("Disabled Input");}
    }
    
    
	@Test
	public void ReadOnlyInput() {
	
	WebElement D1=driver.findElement(By.xpath("//input[@value='Readonly input']"));
	System.out.println(D1.getText());
	}
	
	@Test
	public void dropdown() {
	WebElement dropdown=driver.findElement(By.xpath("//select[@class='form-select']"));
	dropdown.click();
	Select s=new Select(dropdown);
	s.selectByIndex(2);;
    }
	
	@Test
	public void datalist() {
	WebElement d= driver.findElement(By.xpath("//input[@name='my-datalist']"));//click on that field
	d.click();
	d.sendKeys("New York");}
	
	/*//2nd way but its not aplicable here ,get the list of elements in it
         List<WebElement> alloptions=driver.findElements(By.xpath("//input[@class='form-control'])[5]"));
	     System.out.println(alloptions.size());
	       //now to send value to this field use for loop 
	        for(int i=0;i<=alloptions.size()-1;i++) {
	          	if(alloptions.get(i).getText().contains("New York"));
	         	{
		        	alloptions.get(i).click();
			        break;
      }*/
	@Test
	public void fileInput() throws Exception {
		WebElement upload_file= driver.findElement(By.xpath("//input[@type='file']"));
		upload_file.click();
		//
		Robot rb=new Robot();
		 // copying File path to Clipboard
	    StringSelection str = new StringSelection("C:\\Users\\Shri\\Downloads\\DEM\\ut images\\2.jpg");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	
       }
	@Test
	public void CheckBox() {
	
	WebElement CB=driver.findElement(By.xpath("//input[@id='my-check-1']"));
	if(CB.isSelected()) {
		System.out.println("This field is already marked");
	}
	else {
		CB.click();
	}
	WebElement CB2=driver.findElement(By.xpath("//input[@id='my-check-1']"));
    CB2.click();
	}

@Test
public void RadioButton() {

WebElement RB=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
if(RB.isSelected()) {
	System.out.println("his field is already marked");
}
else {
	RB.click();
}
WebElement RB2=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
RB2.click();
}
@Test
	public void DatePicker() {

	WebElement DP=driver.findElement(By.xpath("//input[@name='my-date']"));
	DP.sendKeys("02/03/2022");
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	