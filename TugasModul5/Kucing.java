package TugasModul5;

public class Kucing extends Hewan {
    String suara;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Kucing : " + suara);
    }
}
