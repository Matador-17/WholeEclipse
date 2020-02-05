import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class ClassReview extends CommonMethods {
	public static final String Practice_URL = "https://the-internet.herokuapp.com/";

	public static void main(String[] args) throws InterruptedException {

		// initializing the browser and URL
		setUp("chrome", Practice_URL);
		// creating a list of all links that begin with (<a)
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		// getting total number of links on the current webpage using .size method to
		// turn all our links to an intger and storing them in an int variable to be
		// used later.
		int numberOfAllLinks = allLinks.size();
		// printing out number of links
		System.out.println(numberOfAllLinks);
		// looping through links and associating them with their respective
		// href(hyperlink)
		for (WebElement links : allLinks) {
			System.out.println(links.getText() + " = " + links.getAttribute("href"));
		}
		// closing browser
		//driver.quit();
	}
}
