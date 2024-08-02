package week2.day4;

public class ChromeClass extends BrowserClassSuper {

	public void openIncognito() {
		System.out.println("Open incognition");
	}

	public void clearCache() {
		System.out.println("The cache is cleared");
	}

	public static void main(String[] args) {

		ChromeClass c = new ChromeClass();
		c.openURL();
		c.openIncognito();
		c.clearCache();
		c.closeBrowser();
		c.navigateBack();
		System.out.println(c.browserName);
		System.out.println(c.browserVersion);
	}

}
