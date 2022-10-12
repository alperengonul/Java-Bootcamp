public class CustomerManager {
    private Customer customer;
    private  IcrediManager  _creditmanager;
    public CustomerManager(Customer customer, IcrediManager credimanager){
        customer= customer;
        _creditmanager= credimanager;

    }
    public void Save() {
        System.out.println("Müşteri kaydedildi:");

    }
    public void Delete() {
        System.out.println("Müşteri silindi:");

    }
    public void GiveCredit(){
        _creditmanager.Calcute();
        System.out.println("kredi verildi");
    }
    }
