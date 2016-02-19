/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.Comparator;
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
    
    //Metodo que nos devuelve el espectador que sale del cajero, según el género
    //de pelicula que le enviamos(recordar que cada sala tiene un genero)
    public Espectador avança_cua_clientSurtCaixer(String genere){
        Sala salaux = buscarSala(genere);
        Espectador esaux = this.getLlista().get(salaux).getLlista().pop();
        this.getLlistaEspectadors().add(esaux);
        return esaux;
    }
    
    //Metodo que nos devuelve el orden de Espectadores según que clase 
    //comparator le enviemos
     public String registreEspectadors(Comparator order){
       TreeSet espectadorsaux = null;
       
       if (order!=null){
        espectadorsaux = new TreeSet<Espectador>(order);
       }else{
        espectadorsaux = new TreeSet<Espectador>();
       }     
       
        String res ="";
        Espectador aux = null; 
        Iterator it = this.getLlistaEspectadors().iterator();
        
        while (it.hasNext()){
             espectadorsaux.add(it.next());      
        }

        it = espectadorsaux.iterator();
        
        while (it.hasNext()){
             aux = (Espectador) it.next();
             res += aux.toString()+"\n";
        }
        
        return res;           
        
    }
    
    //Añadimos espectador
    public void afegirEspectador(int codi,String nom, String cp, Pelicula pelicula) throws QueueException{
        //creamos un espectador(falta codi)
        Espectador esp1 = new Espectador(codi,nom,cp,pelicula);
        //Buscar la sala que li toca
        Sala salaIndicada = buscarSala(pelicula.getGenere());
        //Trobar el caixer relacionat amb la sala
        Caixer caixerIndicat = this.getLlista().get(salaIndicada);
        //Afegir l'espectador al caixer;
        if (caixerIndicat.getLlista().size()>25) throw new QueueException(caixerIndicat.getNom(),esp1);
        caixerIndicat.getLlista().push(esp1);
        //Afegirm el espectador que ha passat pel cinema
        
    }
}
