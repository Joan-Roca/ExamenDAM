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
public class Sala implements Comparable{
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
