/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.io.Serializable;

/**
 *
 * @author Joan
 */
public class Pelicula implements Serializable{
    private static final long serialVersionUID = -1521562249089144388L;
    
    private String nom;
    private String genere;

    public Pelicula(String nom, String genere) {
        this.setNom(nom);
        this.setGenere(genere);
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "nom=" + nom + ", genere=" + genere + '}';
    }
   
}
