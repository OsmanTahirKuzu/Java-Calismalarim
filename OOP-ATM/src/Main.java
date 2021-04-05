
public class Main {
    public static void main(String[] args){
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Osman Tahir", "244445", 1000);
        atm.calıs(hesap);
        System.out.println("İşlem sonlandırıldı...");
    }
}
