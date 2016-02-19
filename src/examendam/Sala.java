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
public class Sala implements Comparable, Serializable{
    private static final long serialVersionUID = 6274445185158061266L;
    
    private int numero;
    private String genere;

    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    

    public Sala(int numero,String genere) {
        this.setGenere(genere);
        this.setNumero(numero);
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public int compareTo(Object o) {
        Sala aux = (Sala) o;
        return this.getNumero()-aux.getNumero();
    }

    
}
