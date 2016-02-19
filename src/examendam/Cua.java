/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

//import generics.*;
import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author tanreb123456
 */
//T es un comodin para un elemento
public class Cua<T> implements Serializable{
    private static final long serialVersionUID = 8050653341692030079L;
    
    //atributos
    private LinkedList<T> llistat;
    private int espectadors;
    //constructor
    public Cua( ) {
        this.setLlistat(new  LinkedList<T>());
    }

    public int getEspectadors() {
        return espectadors;
    }

    public void setEspectadors(int espectadors) {
        this.espectadors = espectadors;
    }
    //getters y setters
    public LinkedList<T> getLlistat() {
        return llistat;
    }

    public void setLlistat(LinkedList<T> llistat) {
        this.llistat = llistat;
    }
    
    //metodo al que le pasamos un elemento y lo pone al final de la cola
    public void push(T element){
        this.setEspectadors(this.getEspectadors()+1);
        this.getLlistat().addLast(element);
    }
    
    //metodo que comprueba que la cola no esté vacía y retorna el último elemento de esta además de borrarlo
    //El último de la lista es el primero que se introdujo
    public T pop(){
       T element=null;
        if(!this.buida())
          element=this.getLlistat().removeFirst();
            this.setEspectadors(this.getEspectadors()-1);
        return element;
    }
    
   public int size(){
       return this.getEspectadors();
   }
   //metodo que coge la cola y retorna true si esta vacía 
   public boolean buida(){
        boolean buida=false;
        if(this.getLlistat().isEmpty()){ buida=true;}
        return buida;        
    }
    
    @Override
    public String toString(){
        String text="";
        for(T element:this.getLlistat())
            text=text+element.toString()+"\n";
        return text;        
    }
    
}
