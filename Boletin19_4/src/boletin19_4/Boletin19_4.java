/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_4;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin19_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long dni = 985666236;
        
        System.out.println("la letra del dni: "+ dni +" es "+ dniGest.calcularLetra(dni));
    }
    
}
