/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_1;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin19_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int[] arrayNum = new int[6];
         
         ArraysPruebas.rellenarArrayAleatorio(arrayNum);
         ArraysPruebas.visalizar(arrayNum, ArraysPruebas.DERECHO);
         ArraysPruebas.visalizar(arrayNum, ArraysPruebas.REVES);
    }
    
}
