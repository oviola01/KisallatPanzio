/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author Olajos Viola
 */
public class Macska extends Allat {
    
    private boolean tisztaAlom;

    public Macska(String tulajdonos, String elerhetoseg, String nev) {
        super(tulajdonos, elerhetoseg, nev);
        this.tisztaAlom = false;
    }

    public void setTisztaAlom(boolean tisztasag) {
        this.tisztaAlom = tisztasag;
    }

    @Override
    public String toString() {
        return "Macska{" + "tisztaAlom=" + tisztaAlom + '}';
    }

    
    
    
}
