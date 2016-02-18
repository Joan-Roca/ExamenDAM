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

    public Cinema() {
        this.setLlista(new TreeMap<Sala,Caixer>());
        this.setLlistaEspectadors(new TreeSet<Espectador>());
        //Crear les sales
    }
    
    public void addSala(String genero, int num){
        //Crear Sala i asociarli un caixer
       Sala salaux = new Sala(num,genero);
       Caixer caixaux = new Caixer();
       this.getLlista().put(salaux, caixaux);
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
        // ***REVISAR**** Lo del cajero no lo tengo claro
        //creamos un espectador(falta codi)
        Espectador esp1 = new Espectador(nom,cp,pelicula);
        
        //creamos sala con el genero de la pelicula del espectador
        //Sala sal1 = new Sala(esp1.getPelicula().getGenere());
        //creamos un cajero
        Caixer caix1 = new Caixer();
        //asignamos la sala y el cajero al TreeMap
       // this.getLlista().put(sal1, caix1);       
    }
}
