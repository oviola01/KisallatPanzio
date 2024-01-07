/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author Olajos Viola
 */
public abstract class Allat {
    private String tulajdonos;
    private String elerhetoseg;
    private String nev;
    private boolean ellatva;

    public Allat(String tulajdonos, String elerhetoseg, String nev) {
        this.tulajdonos = tulajdonos;
        this.elerhetoseg = elerhetoseg;
        this.nev=nev;
        ellatva = false;
    }
    
    //tulajdonosi információk

    public String getTulajdonos() {
        return tulajdonos;
    }

    public String getElerhetoseg() {
        return elerhetoseg;
    }
    
    //ez a rész szerintem nem kell, mert értéket adunk a konstruktorban:

    /*
    public void setTulajdonos(String tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    public void setElerhetoseg(String elerhetoseg) {
        this.elerhetoseg = elerhetoseg;
    }
    */
    
    //állatinformáció:

    public String getNev() {
        return nev;
    }
    
    //bentlevőség kezelése:

    public void setEllatva(boolean kiadva) {
        this.ellatva = kiadva;
    }
    
    public boolean isEllatva() {
        return ellatva;
    }

    @Override
    public String toString() {
        return "Allat{" + "tulajdonos=" + tulajdonos + ", elerhetoseg=" + elerhetoseg + ", nev=" + nev + ", ellatva=" + ellatva + '}';
    }
    
    
    
}
