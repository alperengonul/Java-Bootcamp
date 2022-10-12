public class CreditManager {
    public void Calculate(int creditType){
        if(creditType==1){ // esnaf kredi kodu

        }
        if (creditType==2){ // ogretmen

        }
        System.out.println("hesaplandı");

    }
    public void Save() {
        System.out.println("Kredi verildi");
    }

}
    interface IcrediManager {
    void Calcute();
    void Save();
    }
    abstract class BaseCrediManager implements IcrediManager{
    public abstract void Calculate();
    public void Save(){
        System.out.println("kaydedildi");
    }
    }
