package week3.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		ChromeDriver d= new ChromeDriver();
		d.get("https://www.irctc.co.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		d.findElement(By.xpath("//li[@id='flight']")).click();
		
		// to get the window handles
		Set<String> windowHandles = d.getWindowHandles();
		System.out.println(windowHandles);
		
		//to iterate the set using get() we are changing set to list
		List<String> windowList= new ArrayList<String>(windowHandles);
		
		//switching to the child window where 0 is the parent window
		d.switchTo().window(windowList.get(1));
		
		//getting the title from the child window
		String ChildPageTitle = d.getTitle();
		System.out.println(ChildPageTitle);
		
		//Switching to parent window
		d.switchTo().window(windowList.get(0)).close();
		
		
		
	}

}
