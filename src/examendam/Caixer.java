/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.LinkedList;

/**
 *
 * @author Joan
 */
public class Caixer {
    //Cola de espectadores
    private Cua<Espectador> llista;
    
    //constructor
    public Caixer() {
        this.setLlista(new Cua<Espectador>());
    }
    
    //getters setters
    public Cua<Espectador> getLlista() {
        return llista;
    }

    public void setLlista(Cua<Espectador> llista) {
        this.llista = llista;
    }
    
    //METODOS//  
    //Entra en la cola del cajero
    public void entrarCua(Espectador esp){
        this.getLlista().push(esp);
    }
    //Sale de la cola del cajero. Retorna el espectador y lo elimina de la cola.
    public Espectador sortirCaixer(){
        return this.getLlista().pop();
    }
    
    @Override
    public String toString() {
        return this.getLlista().toString();
    }
}

