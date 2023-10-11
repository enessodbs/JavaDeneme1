
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("İdman Programına Hoşgeldiniz...");

        String idmanlar = "Geçerli Hareketler (Burpee - Pushup - Situp - Squat)";
             
        
        System.out.println(idmanlar);
        
        System.out.println("Bir İdman Oluşturun");
        
        System.out.println("Burpee Sayısı: ");
        int Burpee = scanner.nextInt();
        System.out.println("Pushup Sayısı: ");
        int Pushup = scanner.nextInt();
        System.out.println("Situp Sayısı: ");
        int Situp = scanner.nextInt();
        System.out.println("Squat Sayısı: ");
        int Squat = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(Burpee,Pushup,Situp,Squat);
        
        System.out.println("İdmanınız Başlıyor");
        
        while(idman.idmanbittiMi() == false)
        {
            System.out.println("Hareket Türü: ");
            String tur = scanner.nextLine();
            System.out.println("Bu hareketten kaç tekrar yapacaksınız?");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            
            idman.hareketYap(tur, sayi);
            
           
        }
        
    }
}
