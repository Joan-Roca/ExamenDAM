/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Joan
 */
public class Cinema {
    private TreeMap<Sala,Caixer> llista;
    public TreeSet<Espectador> llistaEspectadors;  

    public Cinema(TreeMap<Sala, Caixer> llista, TreeSet<Espectador> llistaEspectadors) {
        this.setLlista(new TreeMap<Sala,Caixer>());
        this.setLlistaEspectadors(new TreeSet<Espectador>());
    }

    public TreeMap<Sala, Caixer> getLlista() {
        return llista;
    }

    public void setLlista(TreeMap<Sala, Caixer> llista) {
        this.llista = llista;
    }

    public TreeSet<Espectador> getLlistaEspectadors() {
        return llistaEspectadors;
    }

    public void setLlistaEspectadors(TreeSet<Espectador> llistaEspectadors) {
        this.llistaEspectadors = llistaEspectadors;
    }
    
    public void afegirEspectador(String nom, String cp, Pelicula pelicula){
        //esto esta a medias
        Espectador esp1 = new Espectador(nom,cp,pelicula);
        
        Sala sal1 = new Sala(esp1.getPelicula().getGenere());
        
        //Caixer caix1 = new Caixer(this.getLlistaEspectadors());
        //this.getLlista().put(sal1, caix1);       
    }
}
