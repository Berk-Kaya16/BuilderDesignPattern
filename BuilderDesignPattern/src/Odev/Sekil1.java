/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Odev;

/**
 *
 * @author Berk Kaya
 */
public class Sekil1 implements ISekilOlusturucu{//Concrete Builder Class
    private Sekil Kare;
    public Sekil1() {
        Kare=new Sekil("Kare");
    }
    
    @Override
    public Sekil sekiller() {
        return Kare;
    }   

    @Override
    public void kenarSayısıOlustur() {
        Kare.setKenarsayısı(4);
    }

    @Override
    public void kenarKalınlıgıOlustur() {
        Kare.setKenarkalınlıgı(1);
    }

    @Override
    public void kenarUzunluguOlustur() {
        Kare.setKenaruzunlugu(2);
    }

    @Override
    public void renkOlustur() {
        Kare.setRenk("Siyah");
    }

    @Override
    public void icRenkOlustur() {
        Kare.setIcrenk("Gri");
    }
    
}
