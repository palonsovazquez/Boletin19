/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_2;

import java.util.Collection;
import java.util.Random;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class GestorArraysNotas {

    private int numAlumnos = 30;
    private int notasProg[] = new int[numAlumnos];

    public void GenerarNotas() {
        Random aleatorio = new Random(System.currentTimeMillis());
        for (int i = 0; i < notasProg.length; i++) {
            //notasProg[i] = 5;
            notasProg[i] = aleatorio.nextInt(11);

        }
    }

    public int notaMaxima() {
        int maxima = 0;
        for (int aux : notasProg) {
            if (maxima < aux) {
                maxima = aux;
            }

        }

        return maxima;
    }

    public float notaMedia() {
        float sumador = 0;
        float media;
        for (int aux : notasProg) {
            sumador += aux;
        }
        media = sumador / notasProg.length;
        return media;

    }

    public void mostrar() {
        for (int aux : notasProg) {
            System.out.print(aux + ",");

        }
        System.out.print("\n");
    }

    public String aprovadosySuspensos() {
        int aprovados = 0, suspensos = 0;
        for (int aux : notasProg) {
            if (aux >= 5) {
                aprovados++;
            } else {
                suspensos++;
            }

        }

        return "aprovados= " + aprovados + "\nsuspensos" + suspensos;
    }
}
