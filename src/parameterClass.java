import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class parameterClass {

	static WebDriver driver = new ChromeDriver();
	Assertion myAssert = new Assertion ();
	Random rand = new Random();

	
	String Website = "https://www.almosafer.com/en";
	String ExpectedLanguageArabic = "العربية";
	String ExpectedLanguageEnglish = "English";
	String ExpectedCurrency ="SAR";
	String ExpectedContactNumber ="+966554400000";
	boolean ActualValueOfQitafIfIsThere ;
	String ExpectedSelectedTabHotel = "false";



}
