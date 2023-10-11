
public class BeybladeFabrikasi {

    public Beyblade beybladeUret(String beyblade_turu) {
        switch (beyblade_turu) {
            case "Dragon":
                return new Dragon("Takao", 800, 300, "Mavi Ejderha", "Kutsal Canavarla Konu�ma");
            case "Dranza":
                return new Dranza("K�rm�z� Anka Ku�u", "Kai", 600, 400);
            case "Drayga":
                return new Drayga("Rei",800,250,"Beyaz Kaplan");
            case "Draciel":
                return new Draciel("Max",400,1000,"Kara Kaplumba�a");
            default:
                return null;
        }
        
    }
}
