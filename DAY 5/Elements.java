package week3.day1;

public class Elements extends Button {
	
	public static void main(String[] args) {
		WebElement we = new WebElement();
		we.click();
		we.setText("Divya");
		Button bm = new Button();
		bm.click();
		bm.setText("ECE");
		bm.submit();
		TextField tf = new TextField();
		tf.click();
		tf.setText("Selenium");
		tf.getText();
		CheckBoxButton cb = new CheckBoxButton();
		cb.click();
		cb.setText("Java");
		cb.clickCheckButton();
		cb.submit();
		RadioButton rb = new RadioButton();
		rb.click();
		rb.setText("Testing");
		rb.selectRadioButton();
		rb.submit();
	}

}
