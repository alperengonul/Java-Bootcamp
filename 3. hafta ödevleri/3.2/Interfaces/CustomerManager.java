package Interfaces;

public class CustomerManager {
	
	//iş kodları
	
	private ICustomerDal _customerDal;
	
	public CustomerManager(ICustomerDal customerDal){
		_customerDal=customerDal;
	}
	
	public void Add() {
		_customerDal.Add();
	}
}
