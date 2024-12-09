package week3.day2;

public class JavaConnection extends DataConnection{
	
	@Override
	public void connect() {
		System.out.println("Connected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("Execution Updated");
		
	}
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}


}
