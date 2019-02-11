/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin19_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorArraysNotas a = new GestorArraysNotas();
        a.GenerarNotas();
        a.mostrar();
        System.out.println("media= "+a.notaMedia());
        System.out.println(a.notaMaxima());
        char x = 65;
        System.out.println(x);
        a.GenerarNombres();
        
        
        for(String aux: a.getNomAlumnos()){
            System.out.println(aux);
        
        }
        System.out.println(a.getNotaAlumno(5));
        System.out.println(a.getNotaAlumno("AA"));
        System.out.println(a.listaAprovados());
    }
    
}
