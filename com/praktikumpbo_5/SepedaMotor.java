package com.praktikumpbo_5;

public class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        System.out.println("==========");
        super.tampilkanInfo();
        System.out.println("Jenis Mesin : " + jenisMesin);
    }
}
