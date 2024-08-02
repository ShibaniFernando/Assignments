package week2.day4;

public class EdgeClass extends BrowserClassSuper {
	public void takeSnap() {
		System.out.println("Screenshot taken");
	}

	public void clearCookies() {
		System.out.println("Clearing cookies");
	}

	public static void main(String[] args) {
		EdgeClass e = new EdgeClass();
		e.openURL();
		e.takeSnap();
		e.clearCookies();
		e.closeBrowser();
		e.navigateBack();
		System.out.println(e.browserName);
		System.out.println(e.browserVersion);

	}

}
