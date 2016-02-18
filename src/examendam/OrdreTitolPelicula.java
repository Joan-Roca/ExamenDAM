/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examendam;

import java.util.Comparator;

/**
 *
 * @author marc
 */
public class OrdreTitolPelicula implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        int ret = 0;
        Espectador es1 = (Espectador)o1;
        Espectador es2 = (Espectador)o2;
        
        if(es1.getPelicula().getNom()!= es2.getPelicula().getNom()){
            ret = -(es1.getPelicula().getNom().compareTo(es2.getPelicula().getNom()));
        } else { 
            ret = es1.getCodi()-es2.getCodi();
        }
        
        return ret;
    }
    
}
