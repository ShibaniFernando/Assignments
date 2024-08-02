package week2.day4;

public class SafariClass extends BrowserClassSuper {
	public void readerMode() {
		System.out.println("The readeer mode is on");
	}

	public void fullScreenMode() {
		System.out.println("Full screen is opened");
	}

	public static void main(String[] args) {
		SafariClass s = new SafariClass();
		s.openURL();
		s.readerMode();
		s.fullScreenMode();
		s.closeBrowser();
		s.navigateBack();
		System.out.println(s.browserName);
		System.out.println(s.browserVersion);

	}

}
