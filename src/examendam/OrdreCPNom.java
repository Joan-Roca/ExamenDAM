package examendam;

import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enric
 */
public class OrdreCPNom implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Espectador esp1 = (Espectador) o1;
        Espectador esp2 = (Espectador) o2;
        if (!esp1.getCp().equals(esp2.getCp())) return esp1.getCp().compareTo(esp2.getCp());
        if (!esp1.getNom().equals(esp2.getNom()))return esp1.getNom().compareTo(esp2.getNom());
        return esp1.getCodi()-esp2.getCodi();
        }
    }
    

