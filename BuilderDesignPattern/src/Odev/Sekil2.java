/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Odev;

/**
 *
 * @author Berk Kaya
 */
public class Sekil2 implements ISekilOlusturucu{//Concrete Builder Class
    private Sekil besGen;

    public Sekil2() {
        besGen=new Sekil("Besgen");
    }

    @Override
    public Sekil sekiller() {
        return besGen;
    }

    @Override
    public void kenarSayısıOlustur() {
        besGen.setKenarsayısı(5);
    }

    @Override
    public void kenarKalınlıgıOlustur() {
        besGen.setKenarkalınlıgı(2);
    }

    @Override
    public void kenarUzunluguOlustur() {
        besGen.setKenaruzunlugu(3);
    }

    @Override
    public void renkOlustur() {
        besGen.setRenk("Pembe");
    }

    @Override
    public void icRenkOlustur() {
        besGen.setIcrenk("Mor");
    }
    
}
