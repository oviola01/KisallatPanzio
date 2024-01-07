/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import modell.Nyul;
import modell.Macska;
import modell.Panzio;

/**
 *
 * @author Olajos Viola
 */
public class KisallatPanzio {
    
    private Panzio panzio;

    public static void main(String[] args) {
        new KisallatPanzio();
    }

    public KisallatPanzio() {
            panzio=new Panzio(2);
            panzio.bevesz(new Macska("Kiss András", "+36301234567", "Kormika"));
            panzio.bevesz(new Nyul("Nagy Emőke", "+36309876543", "Lili"));
            //kiírjuk, milyen állatok vannak kerültek be:
            bentlevoAllatokatKiir();
            
            System.out.println("Ideje ellátni az állatokat!");
            panzio.ellat();
            //kiírjuk az állatok ellátás utáni állapotát
            bentlevoAllatokatKiir();
            
            System.out.println("Nagy Emőke jött a nyuszijáért!");
            panzio.kiad("Nagy Emőke");
            //kiírjuk, kik maradtak itt:
            System.out.println("Itt maradt:");
            bentlevoAllatokatKiir();

        }
        
    private void bentlevoAllatokatKiir() {
        for (String allat : panzio.getAllatokAdatai()) {
            if(allat != null){
                System.out.println(allat);
            }
        }
    }
    
}
