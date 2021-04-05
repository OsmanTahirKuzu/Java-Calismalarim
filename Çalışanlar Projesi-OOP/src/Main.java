
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        while(true){
        String islemler = "İşlemler\n"
                + "1.Yazılımcı işlemleri \n"
                + "2.Yönetici işlemleri\n"
                + "Çıkış için q ya basın.\n";
        
        
        
            System.out.println("*****************************");
        System.out.println(islemler);
        System.out.println("*****************************");        
        
        islemler = scanner.nextLine();
            if(islemler.equals("q")){
                System.out.println("Program sonlandırılıyor...");
                break ;
            }
            else if(islemler.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Osman Tahir" , "Kuzu" ,562494,"C,Java,Python");
                while(true){
                String yazilimci_islem = "1.Format at\n"
                                        +"2.Bilgileri göster\n"
                                        + "Çıkış için q ya basın.";
                
                        
                
                    System.out.println(yazilimci_islem);
                    yazilimci_islem = scanner.nextLine();
                    
                    if(yazilimci_islem.equals("q")){
                        System.out.println("yazilimci işleminden çıkış yapılıyor...");
                        break;
                    }
                    else if(yazilimci_islem.equals("1")){
                        System.out.println("işletim sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);
                        
                    }
                    else if(yazilimci_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                        
                    }
                   
                    else{
                        System.out.println("geçersiz işlem...");
                        
                    }
                }
            }
                            
            else if(islemler.equals("2")){
                Yonetici yonetici = new Yonetici("Mustafa" , "Kuzu" , 456865 , 10);
                 while(true){ 
                String yonetici_islem = "1.Zam yap\n"
                                        +"2.Bilgileri göster\n"
                                        + "Çıkış için q ya basın.";
               
                
                     System.out.println(yonetici_islem);
                yonetici_islem = scanner.nextLine();
                    if(yonetici_islem.equals("q")){
                        System.out.println("Yönetici işlemlerinden çıkış yapılıyor...");
                        break;}
                    else if(yonetici_islem.equals("1")){
                        System.out.println("zam miktarı : ");
                        int zam = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zam);
                        
                    }
                    else if(yonetici_islem.equals("2")){
                        yonetici.bilgileriGoster();
                        
                    }
                    
                    
                    else{
                        System.out.println("geçersiz işlem...");
                        
                    }
                }
            
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }
        System.out.println("Program sonlandırıldı...");
        
    }
}
