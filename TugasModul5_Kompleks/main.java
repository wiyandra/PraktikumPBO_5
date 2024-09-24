package TugasModul5_Kompleks;

public class main {
    public static void main (String[] args) {
        Kucing bleki = new Kucing();
        bleki.nama = "Bleki Si Kucing Ganas";
        bleki.jenis = "Kucing Jadi-Jadian";
        bleki.suara = "Rawrrr";
        bleki.tinggal = "Daratan";
        
        Anjing muso = new Anjing();
        muso.nama = "Muso Lucu";
        muso.jenis = "Anjing Chihuhua";
        muso.suara = "Guk Guk Meow";
        muso.tinggal = "Daratan";
        
        bleki.tampilkanInfo();
        muso.tampilkanInfo();
    }
}
