package TugasModul5_Kompleks;

public class Kucing extends HewanDarat {
    String suara;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Kucing : " + suara);
    }
}
