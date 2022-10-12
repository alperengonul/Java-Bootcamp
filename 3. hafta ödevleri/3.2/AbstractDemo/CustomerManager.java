package AbstractDemo;

public class CustomerManager {
	BaseDatabaseManager _baseDatabaseManager;
	
	public CustomerManager(BaseDatabaseManager baseDatabaseManager){
		_baseDatabaseManager = baseDatabaseManager;
	}
	public void getCustomers() {
		_baseDatabaseManager.getData();
	}
}
