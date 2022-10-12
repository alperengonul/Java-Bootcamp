package Polymorphism;

public class CustomerManager  {
	private BaseLogger _baseLogger;
	
	public CustomerManager(BaseLogger logger) {
		_baseLogger = logger;
	}
	
	
	public void Add() {
		_baseLogger.Log("loglandı kanka");
		System.out.println("Müşteri Eklendi");
	}

}
