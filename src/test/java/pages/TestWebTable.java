package pages;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.pages.PageObject;

public class TestWebTable extends PageObject {


	public void WebTableTesting() {

		String path = System.getProperty("user.dir");
		System.out.println(path);
		String FilePath = path + "\\Data\\countries_with_link.html";
		System.out.println(FilePath);

		//	getDriver().get("file:///C:/Users/Swati/Desktop/Automation/countries_with_link.html");
		getDriver().get(FilePath);
		waitABit(2000);

		// td - column ; tr - row


		//get table heading
		WebElement TableHeading = getDriver().findElement(By.xpath("//h2")); // or "//body/h2"
		System.out.println("Table Heading is  - " + TableHeading.getText());

		//count number of rows
		List <WebElement> noOfRows = getDriver().findElements(By.xpath("//tbody/tr"));
		System.out.println("noOfRows - " + noOfRows.size());
		System.out.println();

		//get number of columns and title in header
		List <WebElement> noOfCols = getDriver().findElements(By.xpath("//thead/tr/th"));
		System.out.println("noOfCols - " + noOfCols.size());
		System.out.println();


		System.out.println("getting the header details");
		// getting the header details - using //thead/tr/th
		for (int i=0; i<noOfCols.size(); i++) {
			System.out.println(noOfCols.get(i).getText());
		}

		System.out.println();
		System.out.println("Get each row data");

		//first row - //tbody/tr[1]/td
		// second row - //tbody/tr[2]/td
		List<WebElement> rowdata = getDriver().findElements(By.xpath("//tbody/tr[1]/td"));
		for (int i=0; i<noOfCols.size(); i++) {
			System.out.println(rowdata.get(i).getText());
		}

		// for Country - //tbody/tr/td[1]
		//for Capital - //tbody/tr/td[2]
		//for Currency - //tbody/tr/td[3]
		//for language - //tbody/tr/td[4]
		//for Wikipedia link -//tbody/tr/td[5]

		System.out.println();
		System.out.println("Get each column data");
		List<WebElement> coldata = getDriver().findElements(By.xpath("//tbody/tr/td[1]"));
		for (int i=0; i<noOfRows.size(); i++) {
			System.out.println(coldata.get(i).getText());
		}
		
		getDriver().close();

	}


	public void WebTableTestingWithValidations(String Country, String Language, String Currrency, String WikipediaPage) {

		String path = System.getProperty("user.dir");
		System.out.println(path);
		String FilePath = path + "\\Data\\countries_with_link.html";
		System.out.println(FilePath);
		getDriver().get(FilePath);
		waitABit(2000);
		
		List <WebElement> noOfRows = getDriver().findElements(By.xpath("//tbody/tr"));
		System.out.println("noOfRows - " + noOfRows.size());
		System.out.println();
		
		List<WebElement> listOfCountries = getDriver().findElements(By.xpath("//tbody/tr/td[1]"));

		for (int i=0; i<=noOfRows.size(); i++) {

			String countryName = listOfCountries.get(i).getText();

			if (countryName.equals(Country)) {

				System.out.println(countryName);
				
				// to get Language details
				String beforecounterForLanguage = "//tbody/tr[";
				String aftercounterForLanguage = "]/td[4]";
				WebElement language = getDriver().findElement(By.xpath(beforecounterForLanguage + (i+1)+ aftercounterForLanguage));
				System.out.println("Language is " + language.getText());
				Assert.assertEquals(Language, language.getText());
				System.out.println();
				
				// to get currency details
				String beforecounter = "//tbody/tr[";
				String aftercounter = "]/td[3]";
				WebElement currency = getDriver().findElement(By.xpath(beforecounter + (i+1)+ aftercounter));
				System.out.println("currency is " + currency.getText());
				Assert.assertEquals(Currrency, currency.getText());
				System.out.println();
				
				
				// to click on the Wiki link
				String beforecounterWiki = "//tbody/tr[";
				String aftercounterWiki = "]/td[5]/a";
				WebElement listOfWiki = getDriver().findElement(By.xpath(beforecounterWiki +(i+1)+ aftercounterWiki));
				listOfWiki.click();
				waitABit(3000);
				System.out.println("url is " + getDriver().getCurrentUrl());
				System.out.println("page name is  " + getDriver().getTitle());
				Assert.assertEquals(WikipediaPage, getDriver().getTitle());
				
				System.out.println();
				
				break;
			}
		}

		getDriver().close();


	}

}
