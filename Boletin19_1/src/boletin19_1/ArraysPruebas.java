/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_1;

import java.util.Random;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class ArraysPruebas {

    private static final int INICIO = 1;
    private static final int FINAL = 50;
    public static final int DERECHO = 1;
    public static final int REVES = -1;
    static Random aleatorio = new Random(System.currentTimeMillis());

    public static int[] rellenarArrayAleatorio(int[] arrayNum) {

        for (int i = 0; i < arrayNum.length ; i++) {
            arrayNum[i] = numRandom(INICIO, FINAL);

        }
        return arrayNum;
    }

    private static int numRandom(int inicio, int fin) {
        int dev;
        dev = aleatorio.nextInt(fin - inicio) + inicio;

        return dev;
    }

    public static void visalizar(int[] arrayNum, int aumentos) {

        if (Math.abs(aumentos) == 1) {

            System.out.print("(");
            if (aumentos == 1) {
                for (int i = 0; i < arrayNum.length; i++) {
                    if (i < (arrayNum.length - 1)) {
                        System.out.print(arrayNum[i] + " , ");
                    } else {
                        System.out.println(arrayNum[i] + ")");

                    }
                }
            } else {
                
                
                for (int i = arrayNum.length-1; i !=-1; i--) {
                    
                    if (i != 0) {
                        System.out.print(arrayNum[i] + " , ");
                    } else {
                        System.out.println(arrayNum[i] + ")");

                    }

                }
            }
        }

    }

}
