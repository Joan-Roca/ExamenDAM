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
public class Espectador {
    private int codi;
    private String nom;
    private String cp;
    private Pelicula pelicula;

    public Espectador(String nom, String cp, Pelicula pelicula) {
        this.setCodi(codi);
        this.nom = nom;
        this.cp = cp;
        this.pelicula = pelicula;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Espectador{" + "codi=" + codi + ", nom=" + nom + ", cp=" + cp + ", pelicula=" + pelicula + '}';
    }
    
}
