/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joan
 */
public class Examen_REPAS_C {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos cine
        Cinema oscars = new Cinema();
        //Añadimos a cine 4 salas
        oscars.addSala("Terror", 1);
        oscars.addSala("Ciencia-ficció", 2);
        oscars.addSala("Altres Generes", 3);
        oscars.addSala("Prueba", 4);
        //Creamos 3 peliculas
        Pelicula peli = new Pelicula("SAW","TeRRoR");
        Pelicula peli2 = new Pelicula("Interestelar","ciencia-ficció");
        Pelicula peli3 = new Pelicula("Indiana Jones","AlTrEs GeNErES");
        //Añadimos espectadores con el try/catch de nuestra excepcion
        try {
            oscars.afegirEspectador(1,"Pepe", "034534", peli );
            oscars.afegirEspectador(3,"Paco", "325523", peli2);
            oscars.afegirEspectador(2,"Mariano", "PP2343", peli3);
            oscars.afegirEspectador(5,"Jose", "234234", peli3);
            oscars.afegirEspectador(4, "Juan","325523", peli2);
            oscars.afegirEspectador(6,"Fulanito", "888975", peli);
        } catch (QueueException ex) {
            System.out.println(ex.getMessage());
        }
       
        
        //Sacamos espectadores de las colas
        oscars.avança_cua_clientSurtCaixer("Terror");
        oscars.avança_cua_clientSurtCaixer("ciencia-ficció");
        oscars.avança_cua_clientSurtCaixer("Altres generes");
        
        oscars.avança_cua_clientSurtCaixer("Terror");
        oscars.avança_cua_clientSurtCaixer("ciencia-ficció");
        oscars.avança_cua_clientSurtCaixer("Altres generes");
        
        //Imprimimos órdenes de espectadores
        System.out.println("#######ORDRE PER CP I NOM###########");
        System.out.println(oscars.registreEspectadors(new OrdreCPNom()));
        System.out.println("#######ORDRE PER TÍTOL DE PELÍCULA###########");
        System.out.println(oscars.registreEspectadors(new OrdreTitolPelicula()));
        
        //Aqui hacemos saltar nuestro try/catch en las 3 colas añadiendo 
        //demasiada gente
        for (int i = 7 ; i < 34 ; i++){
            try {
                oscars.afegirEspectador(i, "ExcepcionCola1", "432423", peli);
            } catch (QueueException ex) {
                System.out.println(ex.getMessage());
            }
        }
         for (int i = 34 ; i < 61 ; i++){
            try {
                oscars.afegirEspectador(i, "ExcepcionCola2", "432423", peli2);
            } catch (QueueException ex) {
                System.out.println(ex.getMessage());
            }
        }
         for (int i = 61 ; i < 88 ; i++){
            try {
                oscars.afegirEspectador(i, "ExcepcionCola3", "432423", peli3);
            } catch (QueueException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        //Lanzamos metodo grabar y leer fichero
        System.out.println("");
        System.out.println("***LISTADO ESPECTADORES DE HOY:***");
        oscars.gravaFitxer(oscars);
    }
    
}
