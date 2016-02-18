/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

//import generics.*;
import java.util.LinkedList;

/**
 *
 * @author tanreb123456
 */
//T es un comodin para un elemento
public class Cua<T> {
    //atributos
    private LinkedList<T> llistat;
    //constructor
    public Cua( ) {
        this.setLlistat(new  LinkedList<T>());
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
        this.getLlistat().addLast(element);
    }
    
    //metodo que comprueba que la cola no esté vacía y retorna el último elemento de esta además de borrarlo
    //El último de la lista es el primero que se introdujo
    public T pop(){
       T element=null;
        if(!this.buida())
          element=this.getLlistat().removeFirst();
        return element;
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
