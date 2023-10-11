
public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squat_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squat_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("Burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equals("Pushup")) {
            pushupYap(sayi);
        } else if (hareketTuru.equals("Situp")) {
            situpYap(sayi);
        } else if (hareketTuru.equals("Squat")) {
            squatYap(sayi);
        } else {
            System.out.println("Geçersiz Hareket!");
        }
    }

    public void burpeeYap(int sayi) {
        if (burpee_sayisi == 0) {
            System.out.println("Yapacağınız Burpee kalmadı.");
        } else if (burpee_sayisi - sayi < 0) {
            System.out.println("Tebrikler fazla burpee yaptınız.");
            burpee_sayisi = 0;
            System.out.println("Kalan Burpee" + burpee_sayisi);
        } else {
            burpee_sayisi -= sayi;
            System.out.println("Kalan Burpee" + burpee_sayisi);
        }
    }

    public void pushupYap(int sayi) {
        if (pushup_sayisi == 0) {
            System.out.println("Yapacağınız Pushup kalmadı.");
        } else if (pushup_sayisi - sayi < 0) {
            System.out.println("Tebrikler fazla Pushup yaptınız.");
            pushup_sayisi = 0;
            System.out.println("Kalan Pushup" + pushup_sayisi);
        } else {
            pushup_sayisi -= sayi;
            System.out.println("Kalan Pushup" + pushup_sayisi);
        }
    }

    public void situpYap(int sayi) {
        if (situp_sayisi == 0) {
            System.out.println("Yapacağınız Situp kalmadı.");
        } else if (situp_sayisi - sayi < 0) {
            System.out.println("Tebrikler fazla Situp yaptınız.");
            situp_sayisi = 0;
            System.out.println("Kalan Situp" + situp_sayisi);
        } else {
            situp_sayisi -= sayi;
            System.out.println("Kalan Situp" + situp_sayisi);
        }
    }

    public void squatYap(int sayi) {
        if (squat_sayisi == 0) {
            System.out.println("Yapacağınız Squat kalmadı.");
        } else if (squat_sayisi - sayi < 0) {
            System.out.println("Tebrikler fazla Squat yaptınız.");
            squat_sayisi = 0;
            System.out.println("Kalan Squat" + squat_sayisi);
        } else {
            squat_sayisi -= sayi;
            System.out.println("Kalan Squat" + squat_sayisi);
        }
    }
    
    public boolean idmanbittiMi()
    {
        return(burpee_sayisi == 00) && (pushup_sayisi == 0) && (situp_sayisi == 00) && (squat_sayisi == 0); 
    }
}
