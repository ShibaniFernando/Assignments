package week2.day4;

public class ButtonSubClass extends WebElementClass {
	public void submit() {
		System.out.println("Submit button");

	}

	public static void main(String[] args) {
		ButtonSubClass b= new ButtonSubClass();
		b.submit();
		b.click();
		b.setText("Called from Sub class button");

	}

}
