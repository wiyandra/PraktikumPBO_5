package TugasModul5;

public class Anjing extends Hewan {
    String suara;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Suara Anjing : " + suara);
    }
}
