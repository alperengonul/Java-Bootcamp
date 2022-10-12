package Polymorphism;

public class Main {

	public static void main(String[] args) {
		
		//BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
		
		//for (BaseLogger baseLogger : loggers) {
		//	baseLogger.Log("Logladımmm");
		//}
		
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.Add();

}
}
