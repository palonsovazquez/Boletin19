/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin19_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorArraysNotas a = new GestorArraysNotas();
        a.GenerarNotas();
        a.mostrar();
        System.out.println(a.aprovadosySuspensos());
        System.out.println("media= "+a.notaMedia());
        System.out.println(" nota maxima"+a.notaMaxima());
    }
    
}
