package week3.day2;

public abstract class DataConnection implements DatabaseConnection {

	public void disconnect() {
		System.out.println("Disconnected");	
	}
	
	public abstract void executeUpdate();
		
}
