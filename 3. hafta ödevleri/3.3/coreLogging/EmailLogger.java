package kodlama.io.coreLogging;

public class EmailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Logged to email : " + data);
	}

}
