package com.pbo;

public class SelisihBilangan extends Bilangan {

    public void tampilHasilSelisih() {
        System.out.println(String.format("Hasil Selisih = %d - %d = %d",getX(), getY(), (getX() - getY())));
    }

}
