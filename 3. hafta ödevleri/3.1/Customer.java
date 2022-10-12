public class Customer {
    public Customer() {
        System.out.println("müşteri nesnesi başlatıldı");
    }

    public int Id;
    public String Firstname;
    public int NationalIdentity;
    public String TaxtNumber;
    public String City;


    public void Save(){
        System.out.println("müşteri kaydedildi");
    }

}
