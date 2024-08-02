package week2.day4;

public class LoginPage extends BasePage{

	@Override
	public void performCommonTasks() {
		System.out.println("This method is called from LoginPage");
		super.performCommonTasks();
	}
	public static void main(String[] args) {
		LoginPage l= new LoginPage();
		l.findElement();
		l.enterText();
		l.clickElement();
		l.performCommonTasks();

	}

}
