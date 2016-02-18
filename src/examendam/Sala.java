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
public class Sala {
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

    
}
