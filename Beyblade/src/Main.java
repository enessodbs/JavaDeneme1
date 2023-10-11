
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Beyblade'e Ho�geldiniz...");
        System.out.println("��k�� i�in q'ya bas�n�z...");
        
        Scanner scanner = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Hangi Beyblade'i �retmek istiyorsunuz?");
            System.out.println("Dranza\n"
                    + "Drayga\n"
                    + "Draciel\n"
                    + "Dragon\n");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan ��k�l�yor...");
                break;
            }else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if (beyblade == null) {
                    System.out.println("L�tfen Ge�erli Bir Beyblade �smi Giriniz...");
                }else
                {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                    
                    
                }
            }
        }
    }
}
