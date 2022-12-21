package com.Runner_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Utility_Files.Base_class;

public class Runnerclass extends Base_class{

	public static void main(String[] args) {
 browserlaunch("chrome");
 urllaunch("https://adactinhotelapp.com/index.php");
max();
WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
sendvalues(findElement, "Jayanth00");
WebElement findElement2 = driver.findElement(By.xpath("//input[@type='password']"));
sendvalues(findElement2, "Jayanth@00");
WebElement findElement3 = driver.findElement(By.xpath("//input[@type='Submit']"));	
click(findElement3);
WebElement findElement4 = driver.findElement(By.xpath("//select[@name='location']"));
index(findElement4, 3);
WebElement findElement5 = driver.findElement(By.xpath("//select[@name='hotels']"));
visibletext(findElement5, "Hotel Sunshine");
WebElement findElement6 = driver.findElement(By.xpath("//select[@name='room_type']"));
visibletext(findElement6, "Deluxe");
WebElement findElement7 = driver.findElement(By.xpath("//select[@name='room_nos']"));
value(findElement7, "2");
WebElement findElement8 = driver.findElement(By.xpath("//input[@type='text']"));
sendvalues(findElement8, "16/12/2022");
WebElement findElement9 = driver.findElement(By.xpath("//input[@type='text']"));	
sendvalues(findElement9, "18/12/2022");	
WebElement findElement10 = driver.findElement(By.xpath("//select[@name='adult_room']"));	
index(findElement10, 2);	
WebElement findElement11 = driver.findElement(By.xpath("//select[@name='child_room']"));	
index(findElement11, 0);
WebElement findElement12 = driver.findElement(By.xpath("//input[@type='submit']"));	
click(findElement12);	
WebElement findElement13 = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));	
click(findElement13);	
WebElement findElement14 = driver.findElement(By.xpath("//input[@type='submit']"));	
click(findElement14);	
WebElement findElement15 = driver.findElement(By.xpath("//input[@name='first_name']"));	
sendvalues(findElement15, "Jayanth")	;
WebElement findElement16 = driver.findElement(By.xpath("//input[@name='last_name']"));	
sendvalues(findElement16, "v")	;
WebElement findElement17 = driver.findElement(By.xpath("//textarea[@name='address']"));	
sendvalues(findElement17, "4/43 lalitha thirumana mandapam, kuparapalayam main road, kaliyanoor")	;
WebElement findElement18 = driver.findElement(By.xpath("//input[@name='cc_num']"));	
sendvalues(findElement18, "7434 7547 2343 2002")	;
WebElement findElement19 = driver.findElement(By.xpath("//select[@name='cc_type']"));	
index(findElement19, 2);
WebElement findElement20 = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
visibletext(findElement20, "March");
WebElement findElement21 = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
visibletext(findElement21, "2022");
WebElement findElement22 = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
sendvalues(findElement22, "333");
WebElement findElement23 = driver.findElement(By.xpath("//input[@type='button']"));
click(findElement23);
WebElement findElement24 = driver.findElement(By.xpath("//a[text()='Booked Itinerary']"));
click(findElement24);
WebElement findElement25 = driver.findElement(By.xpath("//input[@name='ids[]']"));
click(findElement25);
WebElement findElement26 = driver.findElement(By.xpath("//input[@name='cancelall']"));
click(findElement26);
driver.switchTo().alert().accept();
	
	
	
	}

}
