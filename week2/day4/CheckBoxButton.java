package week2.day4;

public class CheckBoxButton extends ButtonSubClass {
	public void clickCheckButton() {
		System.out.println("The button is checked");

	}

	public static void main(String[] args) {
	CheckBoxButton c=new CheckBoxButton();
	c.clickCheckButton();
	c.submit();
	c.setText("Called from CheckBoxButton class");
	c.click();
	}

}
