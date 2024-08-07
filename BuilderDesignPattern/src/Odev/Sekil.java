/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Odev;

/**
 *
 * @author Berk Kaya
 */
public class Sekil {//Product class
   private String sekilad;
   private String renk;
   private String icrenk;
   private int kenarsayısı;
   private int kenaruzunlugu;
   private int kenarkalınlıgı;

    public Sekil(String sekilad) {
        setSekilad(sekilad);
    }

    public String getSekilad() {
        return sekilad;
    }

    public void setSekilad(String sekilad) {
        this.sekilad = sekilad;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getIcrenk() {
        return icrenk;
    }

    public void setIcrenk(String icrenk) {
        this.icrenk = icrenk;
    }

    public int getKenarsayısı() {
        return kenarsayısı;
    }

    public void setKenarsayısı(int kenarsayısı) {
        this.kenarsayısı = kenarsayısı;
    }

    public int getKenaruzunlugu() {
        return kenaruzunlugu;
    }

    public void setKenaruzunlugu(int kenaruzunlugu) {
        this.kenaruzunlugu = kenaruzunlugu;
    }

    public int getKenarkalınlıgı() {
        return kenarkalınlıgı;
    }

    public void setKenarkalınlıgı(int kenarkalınlıgı) {
        this.kenarkalınlıgı = kenarkalınlıgı;
    }
    public void Yazdir(){
        System.out.println("Şekil Adı :"+getSekilad());
        System.out.println("Kenar Sayısı :"+getKenarsayısı());
        System.out.println("Kenar Uzunluğu :"+getKenaruzunlugu());
        System.out.println("Kenar Kalınlığı :"+getKenarkalınlıgı());
        System.out.println("Renk :"+getRenk());
        System.out.println("İç Renk :"+getIcrenk());
    }
    
}
