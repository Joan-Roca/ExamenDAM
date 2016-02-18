/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.Objects;

/**
 *
 * @author Joan
 */
public class Espectador implements Comparable {

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.codi;
        hash = 83 * hash + Objects.hashCode(this.nom);
        hash = 83 * hash + Objects.hashCode(this.cp);
        hash = 83 * hash + Objects.hashCode(this.pelicula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Espectador other = (Espectador) obj;
        if (this.codi != other.codi) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.cp, other.cp)) {
            return false;
        }
        if (!Objects.equals(this.pelicula, other.pelicula)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Espectador aux = (Espectador) o;
        return aux.getCodi() - this.getCodi();
    }

}
