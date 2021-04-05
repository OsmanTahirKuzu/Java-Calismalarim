
import java.util.Scanner;


public class ATM {
    
    public void calıs(Hesap hesap){
        
        Login login = new Login();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bankamıza hoşgeldiniz...");
        System.out.println("****************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("****************************");
        int giris_hakki = 3;
        
        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş başarılı");
                break;
            }
            else{
                giris_hakki -=1;
           
                System.out.println("Kalan giriş hakkınız : " + giris_hakki);
            
                
            }
            if(giris_hakki == 0){
                    
                System.out.println("Giriş hakkınız kalmadı...");
                return;
                }
            }
        System.out.println("******************************");
        
        String islemler = "1.Bakiye\n"
                + "2.ParaÇek\n"
                + "3.ParaYatır\n"
                + "4.Çıkış için 'q' ya basın";
        System.out.println(islemler);
        System.out.println("********************************");

        while(true){
            
            System.out.println("işlemi seçiniz : ");
            String islem = scanner.nextLine();
            if(islem.equals("1")){
                System.out.println("bakiyeniz : " + hesap.getBakiye());
            }
            else if(islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else if(islem.equals("3")){
                System.out.println("Yatırmak istediğiniz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if(islem.equals("q")){
                System.out.println("işlem sonlandırılıyor...");
                break;
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
    
        }
    
    }
}
