package week2.day4;

public class TextFieldSubClass extends WebElementClass {
	public void getText() {
		System.out.println("Enter the text:");

	}

	public static void main(String[] args) {
		TextFieldSubClass t= new TextFieldSubClass();
		t.getText();
		t.click();
		t.setText("Called from Sub class textField");

	}

}
