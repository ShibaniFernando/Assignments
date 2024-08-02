package week3.day1;

public class JavaConnection extends MySqlConnection{
	

	public static void main(String[] args) {
		
		JavaConnection jc = new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
	}

	@Override
	public void connect() {
		System.out.println("The system is connected");
		
	}

	@Override
	public void disconnect() {
		System.out.println("The system is disconnected");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("The update is executed");
		
	}

	@Override
	public void executeQuery() {
		System.out.println("The abstract method is called");
		
	}

}
