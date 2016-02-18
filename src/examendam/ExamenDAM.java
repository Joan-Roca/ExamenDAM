/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

/**
 *
 * @author Joan
 */
public class ExamenDAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cinema oscars = new Cinema();
        oscars.addSala("Terror", 1);
        oscars.addSala("Ciencia-ficció", 2);
        oscars.addSala("Altres Generes", 3);
        oscars.addSala("Prueba", 4);
        
        Pelicula peli = new Pelicula("SAW","TeRRoR");
        Pelicula peli2 = new Pelicula("Interestelar","ciencia-ficció");
        Pelicula peli3 = new Pelicula("Indiana Jones","AlTrEs GeNErES");
        
        oscars.afegirEspectador("Pepe", "034534", peli );
        oscars.afegirEspectador("Paco", "325523", peli2);
        oscars.afegirEspectador("Mariano", "PP2343", peli3);
        
    }
    
}
