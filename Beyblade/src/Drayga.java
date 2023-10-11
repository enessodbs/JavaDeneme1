
public class Drayga extends Beyblade {

    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldiriGucu,String kutsalCanavar) {
        super(beybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        
        System.out.println("Kutsal Canavar Ad� : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {

        System.out.println(getBeybladeci() + " " + kutsalCanavar + " '� ortaya ��kar�yor");
        System.out.println(getBeybladeci() + " '�n Gizli Sald�r�s� : Kaplan Pen�esi");
    }

}
