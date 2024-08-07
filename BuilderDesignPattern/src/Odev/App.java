/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Odev;

/**
 *
 * @author Berk Kaya
 */
public class App {
    public static void main(String[] args) {
        Birlestir b=new Birlestir();
        
        ISekilOlusturucu kare=new Sekil1();
        ISekilOlusturucu besgen=new Sekil2();
        
        b.Sekilver(kare);
        b.Sekilver(besgen);
        
        kare.sekiller().Yazdir();
        System.out.println("-----------");
        besgen.sekiller().Yazdir();
        
        
    }
}
