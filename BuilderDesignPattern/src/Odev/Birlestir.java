/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Odev;

/**
 *
 * @author Berk Kaya
 */
public class Birlestir {//Diroctor Class
    public void Sekilver(ISekilOlusturucu sekilci){
        sekilci.icRenkOlustur();
        sekilci.renkOlustur();
        sekilci.kenarKalınlıgıOlustur();
        sekilci.kenarSayısıOlustur();
        sekilci.kenarUzunluguOlustur();
    }
}
