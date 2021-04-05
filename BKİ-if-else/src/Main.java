
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("boyunuz : ");
        double boy = scanner.nextDouble();
        System.out.println("kilonuz : ");
        double kilo = scanner.nextDouble();
        //65    1,5
        double bki = kilo/(boy*boy);
        
        if(bki < 18.5){
            System.out.println("Zayıf");
            }
        else if(bki < 25){
            System.out.println("Normal");
        }
        else if(bki < 30){
            System.out.println(bki + "Fazla kilolu");
        }
        else{
            System.out.println("obez");
        }
    }
}
