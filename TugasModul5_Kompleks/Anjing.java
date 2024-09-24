package TugasModul5_Kompleks;

public class Anjing extends HewanDarat {
    String suara;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Anjing : " + suara);
    }
}
