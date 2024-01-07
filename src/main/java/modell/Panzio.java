/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author Olajos Viola
 */
public class Panzio {
    private Allat[] szobak;
    private int foglalt;
    private boolean nyitva;

    public Panzio() {
        this(10);
    //max férőhely, alapértelmezettként ezt hozza létre
    }

    public Panzio(int qty) {
        //több panzió üzemeltetésénél megadható, hogy mekkora a befogadóképesség az adott panzióban
        foglalt=0;
        szobak=new Allat[qty];
        nyitva=true;
    }

    //bentlévő állatok:
    public Allat[] getSzobak() {
        return szobak;
    }
    
    public String[] getAllatokAdatai(){
        String[] szobak=new String[this.szobak.length];
        for (int i=0; i<foglalt; i++){
            Allat allatka = this.szobak[i];
            if(allatka != null){ 
                szobak[i]="gazdi: "+allatka.getTulajdonos();
                szobak[i]+=" ("+allatka.getElerhetoseg()+"), ";
                szobak[i]+="állat neve: "+allatka.getNev()+", ";
                szobak[i]+=allatka.isEllatva() ? "ellátva" : "még nincs ellátva";
            }
        }
        return szobak;
    }
    
    //tevékenységek:
    
    public void bevesz(Allat allat){
        if(nyitva==true){
            if(foglalt<szobak.length){
                szobak[foglalt++]=allat;
            } else{
                System.out.println("Nincs több szabad szoba!");
            }
        } else{
            zarvatabla();
        }
    }
    
    public void ellat(){
        if(nyitva==true){
            for (Allat allat : szobak) {
                if(allat != null){
                    allat.setEllatva(true);
                   if(allat instanceof Macska){
                       ((Macska)allat).setTisztaAlom(true);              
                   }
                }
            }
        } else{
            zarvatabla();
        }
    }
    
    public Allat kiad(String tulajdonos){
        if(nyitva==true){
            int i=0;
            //megnézzük, elhelyezésre került-e az adott szobában ilyen nevű gazditól állat, ha nem, megyek tovább
            while(szobak[i]==null || i<foglalt && !(szobak[i].getTulajdonos().equals(tulajdonos))){
                i++;
            }
            if(i<foglalt){
                //ha megtaláltam a kisállatot:
                Allat allat=this.szobak[i];
                String allatNev=allat.getNev();
                System.out.println(String.format("%s kiadva a tulajdonos, %s részére!", allatNev, tulajdonos));
                szobak[i] = null;
                return allat;
            }else{
                System.out.println("Ilyen nevű gazdi nem adott be kisállatot!");
            }
        } else {
                zarvatabla();        
        }
        return null;
    }

    private void zarvatabla(){
        System.out.println("Sajnos a panzió jelenleg zárva!");
    }
}
