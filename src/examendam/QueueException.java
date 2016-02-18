/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

/**
 *
 * @author enric
 */
public class QueueException extends Exception{
    String nomCua;
    Espectador espectador;

    public QueueException(String nomCua,Espectador espec) {
        this.setNomCua(nomCua);
        this.setEspectador(espec);
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public String getNomCua() {
        return nomCua;
    }

    public void setNomCua(String nomCua) {
        this.nomCua = nomCua;
    }
    
    @Override
    public String getMessage(){
        return "ERROR, MASSA GENT A LA CUA DE LA SALA"+this.getNomCua()+" El client de nom "+this.getEspectador().getNom()+" i codi "+this.getEspectador().getCodi()+" no pot passar";
    }
}
