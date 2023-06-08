
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases extends parameterClass {
	@BeforeTest
	public void preTest() {
		driver.get(Website);
		driver.manage().window().maximize();
	}

	@Test(description = "Test Number 1", priority = 1)
	public void Check_Default_Language() {
		String ActualLanguage = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
				.getText();
		// System.out.println(ActualLanguage);
		myAssert.assertEquals(ActualLanguage, ExpectedLanguageArabic);
	} // ______________________________________________________________________________

//	@Test(description = "Test Number 2", priority = 2)
//	public void Check_Currency() {
//		String ActualCurrency = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/div[1]/div/button")).getText();
//		// System.out.println(ActualCurrency);
//		myAssert.assertEquals(ActualCurrency, ExpectedCurrency);
//	}// ______________________________________________________________________________
//
//	@Test(description = "Test Number 3", priority = 3)
//	public void Check_Contact_Number() {
//		String AcutalContactNumber = driver
//				.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[2]/strong")).getText();
//		myAssert.assertEquals(AcutalContactNumber, ExpectedContactNumber);
//	}// ______________________________________________________________________________
//
//	@Test(description = "Test Number 4 ", priority = 4)
//	public void Check_Qitaf_Logo_IfISThere() {
//		WebElement FooterContainsQitafLogo = driver.findElement(By.tagName("footer"));
//		List<WebElement> ListOfSVG = FooterContainsQitafLogo.findElements(By.tagName("svg"));
//		// System.out.println(ListOfSVG.size());
//		for (int i = 0; i < ListOfSVG.size(); i++) {
//			String CheckAttribute = ListOfSVG.get(i).getAttribute("data-testid");
//			if (CheckAttribute == null) {
//				continue;
//			} else if (CheckAttribute.equals("Footer__QitafLogo")) {
//				ActualValueOfQitafIfIsThere = true;
//			}
//
//		}
//		myAssert.assertEquals(ActualValueOfQitafIfIsThere, true);
//	}// ______________________________________________________________________________
//
//	@Test(description = "Test Number 5 ", priority = 5)
//	public void Hotel_Tab_Is_Not_Selected() {
//		WebElement HotelTab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
//		String ActualSelectedTab = HotelTab.getAttribute("aria-selected");
//		myAssert.assertEquals(ActualSelectedTab, ExpectedSelectedTabHotel);
//	}// ______________________________________________________________________________
//
//	@SuppressWarnings("deprecation")
//	@Test(description = "Test Number 6", priority = 6)
//	public void Check_The_Depature_Date() {
//		Date todayTime = new Date();
//		// System.out.println(todayTime);
//		// LocalDate CurrentDatePlusOne = LocalDate.now().plusDays(1);
//		// System.out.println(CurrentDatePlusOne);
//
//		int ActualDayOfTheMonth = todayTime.getDate();
//		String ActualDepartureDate = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[1]/span[2]"))
//				.getText();
//		int IntegerDepartureDate = Integer.parseInt(ActualDepartureDate);
//		myAssert.assertEquals(IntegerDepartureDate, ActualDayOfTheMonth + 1);
//	}// ______________________________________________________________________________
//
//	@SuppressWarnings("deprecation")
//	@Test(description = "Test Number 7", priority = 7)
//	public void Check_The_Return_Date() {
//		Date todayTime = new Date();
//		int ActualDayOfTheMonth = todayTime.getDate();
//		String ActualDepartureDate = driver.findElement(By.xpath(
//				"//*[@id=\"uncontrolled-tab-example-tabpane-flights\"]/div/div[2]/div[1]/div/div[3]/div/div/div/div[2]/span[2]"))
//				.getText();
//		int IntegerDepartureDate = Integer.parseInt(ActualDepartureDate);
//		myAssert.assertEquals(IntegerDepartureDate, ActualDayOfTheMonth + 2);
//
//	}// ______________________________________________________________________________
//
//	@Test(description = "Test Number 8", priority = 8, invocationCount = 15)
//	public void Check_Random_Language() {
//		String[] RandomLanguage = { "https://www.almosafer.com/en", " https://www.almosafer.com/ar" };
//		int myIndex = rand.nextInt(0, 2);
//		driver.get(RandomLanguage[myIndex]);
//
//		System.out.println(RandomLanguage[myIndex]);
//		if (driver.getCurrentUrl().contains("ar")) {
//			String lang = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//					.getText();
//			myAssert.assertEquals(lang, ExpectedLanguageEnglish);
//		} else {
//			String lang = driver.findElement(By.xpath("//*[@id=\"__next\"]/header/div/div[1]/div[2]/div/a[1]"))
//					.getText();
//			myAssert.assertEquals(lang, ExpectedLanguageArabic);
//		}
//	}// ______________________________________________________________________________

	@Test(description = "Test Number 9", priority = 9)
	public void Search_For_Hotels() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); // wait 3 seconds before show the error -
																			// because some element need time to loaded

		String[] RandomLanguage = { "https://www.almosafer.com/en", " https://www.almosafer.com/ar" };
		int myIndex = rand.nextInt(0, 2);
		driver.get(RandomLanguage[myIndex]);

		String[] Arabic_Countries = { " دبي", "جدة" };
		int Arabic_Index = rand.nextInt(0, 2);
		String[] English_Countries = { " Dubai", "Jeddah", "Riyadh" };
		int English_Indexes = rand.nextInt(0, 3);

		if (driver.getCurrentUrl().contains("ar")) {
			WebElement Hotel_Tab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			Hotel_Tab.click();
			Thread.sleep(1000);
			WebElement Search_Hotel_Bar = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));
			Search_Hotel_Bar.sendKeys(Arabic_Countries[Arabic_Index] + Keys.ARROW_DOWN);
			Thread.sleep(1000);
			WebElement Search_Hotel_Button = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			Search_Hotel_Button.click();

		} else {
			WebElement Hotel_Tab = driver.findElement(By.xpath("//*[@id=\"uncontrolled-tab-example-tab-hotels\"]"));
			Hotel_Tab.click();
			Thread.sleep(2000);
			WebElement Search_Hotel_Bar = driver.findElement(By.xpath(
					"//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[1]/div/div/div/div/input"));

			Search_Hotel_Bar.sendKeys(English_Countries[English_Indexes] + Keys.ARROW_DOWN);
			Thread.sleep(1000);
			WebElement Search_Hotel_Button = driver.findElement(
					By.xpath("//*[@id=\"uncontrolled-tab-example-tabpane-hotels\"]/div/div/div/div[4]/button"));
			Search_Hotel_Button.click();

		}

	}

	@Test(description = "Test Number 10", priority = 10)
	public void Randomly_Select_Number_ofVisitors() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement NumberOfVisitors = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[3]/div/select"));
		Select MySelector = new Select(NumberOfVisitors);
		int MyIndex = rand.nextInt(0, 2);
		MySelector.selectByIndex(MyIndex);
	}

	@Test(description = "Test Number 11", priority = 11)
	public void Search_Hotel() throws InterruptedException {
		WebElement Search_Button = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/section[2]/div/section/div/div/div/div/div[4]/button"));
		Search_Button.click();
	}

	@Test(description = "Test Number 12", priority = 12)
	public void DoneSearching() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		// Thread.sleep(15000);
		WebElement SearchResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/section/span"));
		String TextOfSearchResult = SearchResult.getText();
		boolean ActualResultInTheWebsite = TextOfSearchResult.contains("found") || TextOfSearchResult.contains("وجدنا");
		Assert.assertEquals(ActualResultInTheWebsite, true);
	}

	@Test(description = "Test Number 13", priority = 13)
	public void Sorting_Lowest_To_Highest_Price() throws InterruptedException {
		WebElement LowestPrice_Button = driver
				.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]/section[1]/div/button[2]"));
		Thread.sleep(3000);
		LowestPrice_Button.click();
		
		WebElement RightSide = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div[2]"));
		List <WebElement> ThePrices = RightSide.findElements(By.className("Price__Value"));
			String  PriceForTheFirstItem = ThePrices.get(0).getText();
			String  PriceForTheLastItem = ThePrices.get(ThePrices.size()-1).getText();

			int FirstItemInt = Integer.parseInt(PriceForTheFirstItem);
			int LastItemInt = Integer.parseInt(PriceForTheLastItem);
			assertEquals(FirstItemInt < LastItemInt, true);

			
		

	}

}
