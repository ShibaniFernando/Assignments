package week2.day4;

public class BrowserClassSuper {
	String browserName="Chrome";
	float browserVersion=2.34f;

	public void openURL() {
		System.out.println("Website is opened");
	}

	public void closeBrowser() {
		System.out.println("Browser closed");
	}

	public void navigateBack() {
		System.out.println("We are navigating back");
	}

	public static void main(String[] args) {
		BrowserClassSuper b = new BrowserClassSuper();
		b.openURL();
		b.closeBrowser();
		b.navigateBack();
		System.out.println(b.browserName);
		System.out.println(b.browserVersion);

	}

}
