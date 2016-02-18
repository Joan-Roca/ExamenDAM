/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author Joan
 */
public class Cinema {
    private TreeMap<Sala,Caixer> llista;
    public TreeSet<Espectador> llistaEspectadors;  

    //constructor
    public Cinema() {
        this.setLlista(new TreeMap<Sala,Caixer>());
        this.setLlistaEspectadors(new TreeSet<Espectador>());
        //Crear les sales
    }      
    
    //getters setters
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
    
    //METODOS
    //Metodo para crear sala y asociarla al cajero
    public void addSala(String genero, int num){
       //Creamos la sala
       Sala salaux = new Sala(num,genero);
       //Creamos cajero
       Caixer caixaux = new Caixer("Caixer de la sala numero "+num);
       //Ponemos la sala y caja en la lista TreeMap
       this.getLlista().put(salaux, caixaux);
       //*Num es para ayudar a ver lo que hace, no es necesario
    }
    
    //Metodo que le pasamos el genero y nos devuelve la sala que lo tiene
    public Sala buscarSala(String genere){
        Sala res = null;
        Iterator it = this.getLlista().keySet().iterator();
        while (it.hasNext()){
            Sala aux = (Sala) it.next();
            if (aux.getGenere().equalsIgnoreCase(genere)) res=aux;
        }
        return res;
    }
    
    //Añadimos espectador
    public void afegirEspectador(String nom, String cp, Pelicula pelicula){
        //creamos un espectador(falta codi)
        Espectador esp1 = new Espectador(nom,cp,pelicula);
        //Buscar la sala que li toca
        Sala salaIndicada = buscarSala(pelicula.getGenere());
        //Trobar el caixer relacionat amb la sala
        Caixer caixerIndicat = this.getLlista().get(salaIndicada);
        //Afegir l'espectador al caixer;
        caixerIndicat.getLlista().push(esp1);
        //Afegirm el espectador que ha passat pel cinema
        this.getLlistaEspectadors().add(esp1);
        
        System.out.println("Espectador amb nom "+ esp1.getNom()+" afegit al "+caixerIndicat.getNom());
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.Iterator;
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
       Caixer caixaux = new Caixer("Caixer de la sala numero "+num);
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
    
    public Sala buscarSala(String genere){
        Sala res = null;
        Iterator it = this.getLlista().keySet().iterator();
        while (it.hasNext()){
            Sala aux = (Sala) it.next();
            if (aux.getGenere().equalsIgnoreCase(genere)) res=aux;
        }
        return res;
    }
    
    public Espectador avança_cua_clientSurtCaixer(String genere){
        Sala salaux = buscarSala(genere);
        return this.getLlista().get(salaux).getLlista().pop();
    }
    
    public void afegirEspectador(String nom, String cp, Pelicula pelicula){
        // ***REVISAR**** Lo del cajero no lo tengo claro
        //creamos un espectador(falta codi)
        Espectador esp1 = new Espectador(nom,cp,pelicula);
        //Buscar la sala que li toca
        Sala salaIndicada = buscarSala(pelicula.getGenere());
        //Trobar el caixer relacionat amb la sala
        Caixer caixerIndicat = this.getLlista().get(salaIndicada);
        //Afegir l'espectador al caixer;
        caixerIndicat.getLlista().push(esp1);   
        caixerIndicat.getLlista().push(esp1);
        //Afegirm el espectador que ha passat pel cinema
        this.getLlistaEspectadors().add(esp1);
        
        System.out.println("Espectador amb nom "+ esp1.getNom()+" afegit al "+caixerIndicat.getNom());
        
        //creamos sala con el genero de la pelicula del espectador
        //Sala sal1 = new Sala(esp1.getPelicula().getGenere());
        //creamos un cajero
        //asignamos la sala y el cajero al TreeMap
       // this.getLlista().put(sal1, caix1);       
    }
}
