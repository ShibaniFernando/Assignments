package week2.day4;

public class RadioButton extends ButtonSubClass {

	public void selectRadioButton() {
		System.out.println("Selecting the radio button");

	}
	public static void main(String[] args) {
		RadioButton r = new RadioButton();
		r.selectRadioButton();
		r.click();
		r.setText("Called from Radio button class");
		r.submit();

	}

}
