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
public class dniGest {

    private static final String cadena = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calcularLetra(long dni) {
        Character letra = null;
        
          letra =  cadena.charAt((int)dni%23);
            
        

        return letra;
    }


    
    
}
