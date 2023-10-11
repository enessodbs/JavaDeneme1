
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        System.out.println("Beyblade'e Hoþgeldiniz...");
        System.out.println("Çýkýþ için q'ya basýnýz...");
        
        Scanner scanner = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("Hangi Beyblade'i üretmek istiyorsunuz?");
            System.out.println("Dranza\n"
                    + "Drayga\n"
                    + "Draciel\n"
                    + "Dragon\n");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")) {
                System.out.println("Programdan çýkýlýyor...");
                break;
            }else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if (beyblade == null) {
                    System.out.println("Lütfen Geçerli Bir Beyblade Ýsmi Giriniz...");
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
