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
        
        oscars.afegirEspectador(1,"Pepe", "034534", peli );
        oscars.afegirEspectador(3,"Paco", "325523", peli2);
        oscars.afegirEspectador(2,"Mariano", "PP2343", peli3);
        oscars.afegirEspectador(5,"Jose", "234234", peli3);
        oscars.afegirEspectador(4,"Juan", "325523", peli2);
        oscars.afegirEspectador(6,"Fulanito", "888975", peli);
        
        oscars.avança_cua_clientSurtCaixer("Terror");
        oscars.avança_cua_clientSurtCaixer("ciencia-ficció");
        oscars.avança_cua_clientSurtCaixer("Altres generes");
        
        oscars.avança_cua_clientSurtCaixer("Terror");
        oscars.avança_cua_clientSurtCaixer("ciencia-ficció");
        oscars.avança_cua_clientSurtCaixer("Altres generes");
        
        
        System.out.println("#######ORDRE PER CP I NOM###########");
        System.out.println(oscars.registreEspectadors(new OrdreCPNom()));
        System.out.println("#######ORDRE PER TÍTOL DE PELÍCULA###########");
        System.out.println(oscars.registreEspectadors(new OrdreTitolPelicula()));
        
    }
    
}
