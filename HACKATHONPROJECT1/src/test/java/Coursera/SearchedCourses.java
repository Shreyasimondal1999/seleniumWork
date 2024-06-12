package Coursera;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SearchedCourses {
 public WebDriver driver ;
 public ScreenShot screenshot;
 public SearchedCourses(WebDriver driver){
	 this.driver=driver;
 }
 //locator
 By SearchElementNames =By.xpath("//a[@data-click-key='search.search.click.search_card']/h3");
 
 By ratings = By.xpath("//div[@class='product-reviews css-pn23ng']/descendant::p[1]");
 
 By learningDurations = By.xpath("//div[@class='cds-CommonCard-metadata']/descendant::p[1]");
 
 By MoreLanguageButton = By.xpath("//button[@data-track-component='expand_filter_items_button_language']");
 
  By EnglishLanguageCheckBox = By.id("cds-react-aria-17");
  By BeginnerLevelCheckBox = By.xpath("//span[text()='Beginner']");
 
 By Languages = By.xpath("//div[@class ='css-q5d1os']//div[@class='cds-checkboxAndRadio-labelText']/span/span");
 
 By Levels = By.xpath("//label[text()='Level']/following-sibling::div//div[@class='css-nsxeb5']//div/span/span");
 
 By searchedCourses = By.cssSelector("div.cds-CommonCard-clickArea");
 //Actions

 public void ClickCheckBoxes() {
	 JavascriptExecutor js =  (JavascriptExecutor)driver;
	 WebElement LanguagecheckBox = driver.findElement(EnglishLanguageCheckBox);
	 js.executeScript("arguments[0].click();",LanguagecheckBox );
	 System.out.println("Clicking on language check box");
      // to take screen shot thread.sleep is used
	 try {
	     Thread.sleep(2000);
		 }catch(Exception e) {
			 System.out.println(toString());
		 }
	 try {
	 screenshot.GetScreenShotOfWholePage(driver, "LanguageCheckBox");
	 }
	 catch(IOException e) {
		 System.out.println(e.toString());
	 }

	 
	 WebElement LevelcheckBox = driver.findElement(BeginnerLevelCheckBox);
	 js.executeScript("arguments[0].click();",LevelcheckBox );
	 System.out.println("Clicking on level check box");
	// to take screen shot thread.sleep is used
	 try {
	     Thread.sleep(2000);
		 }catch(Exception e) {
			 System.out.println(toString());
		 }
	 try {
	 screenshot.GetScreenShotOfWholePage(driver, "LevelcheckBox");
	 }
	 catch(IOException e) {
		 System.out.println(e.toString());
	 }

 }
 public void ShowDataOfSearchedElements() {
	 List<WebElement> searchedDatas = driver.findElements(SearchElementNames);
	 List<WebElement> Ratings= driver.findElements(ratings);
	 List<WebElement> LearningDurations= driver.findElements(learningDurations);
	List<WebElement> searchedcourses= driver.findElements(searchedCourses);
	 System.out.println("--------------------------------------------");
	 System.out.println("The First two searched courses are : ");
	 int count =1;
	 int listIndex=0;
     for (WebElement element : searchedDatas) {
	  if(count<=2) {
		  System.out.print(count+") ");
		System.out.println(element.getText());
		 System.out.println("The Rating for this course is : ");
		 System.out.println(Ratings.get(listIndex).getText());
		 System.out.println("The searched course Learning Duration is : ");
		 //splitting with space upto 5 times to get course duration 
		 System.out.println(LearningDurations.get(listIndex).getText().split(" ",5)[4]);
		 try {
			 Thread.sleep(2000);
		 screenshot.GetScreenShotOfTheParticularElement(searchedcourses.get(listIndex), "SearchedCourseNo"+count);
		 }
		 catch(Exception e ) {
			 System.out.println(e.toString());
		 }
		 count++;
		 listIndex++;
		 System.out.println("--------------------------------------------");
	}
	else {
		break;
	}
	 
   }
 
 }
 
 
public void DisplayLanguages() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();",driver.findElement(MoreLanguageButton));
	List<WebElement> languageList = driver.findElements(Languages);
	System.out.println("--------------------------------------------");
	System.out.println("Total Language available "+ languageList.size());
	System.out.println("Languages are: ");
	
	for(WebElement ele : languageList) {
		//splitting with left parenthesis to get the language name only
		System.out.println(ele.getText().split("\\(")[0]);
	}
	System.out.println("--------------------------------------------");
	 
}
public void DisplayLevels() {
	List<WebElement> levelList = driver.findElements(Levels);
	System.out.println("--------------------------------------------");
	System.out.println("Total Levels available "+ levelList.size());
	System.out.println("Levels are: ");
	for(WebElement ele : levelList) {
		//splitting with space to get the level name only
		System.out.println(ele.getText().split(" ")[0]);
	}
	System.out.println("--------------------------------------------");
	 
}
}
