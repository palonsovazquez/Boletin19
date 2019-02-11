/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19_3;

import static java.nio.file.Files.list;
import java.util.ArrayList;
import static java.util.Collections.list;

import java.util.Random;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class GestorArraysNotas {

    private int numAlumnos = 30;
    private ArrayList<String> nomAlumnos = new ArrayList<String>();
    private int notasProg[] = new int[numAlumnos];

    public int getNumAlumnos() {
        return numAlumnos;
    }

    public int getNotaAlumno(int posicion) {
        return notasProg[posicion];

    }

    public Integer getNotaAlumno(String nombre) {
        Integer posicion = null;
        boolean encontrado = false;
        for (int i = 0; i < notasProg.length || !encontrado; i++) {
            if (nombre.equals(nomAlumnos.get(i))) {
                posicion = i;
                encontrado = true;
            }

        }

        return notasProg[posicion];

    }

    public void setNumAlumnos(int numAlumnos) {
        this.numAlumnos = numAlumnos;
    }

    public ArrayList<String> getNomAlumnos() {
        return nomAlumnos;
    }

    public void setNomAlumnos(ArrayList<String> nomAlumnos) {
        this.nomAlumnos = nomAlumnos;
    }

    public int[] getNotasProg() {
        return notasProg;
    }

    public void setNotasProg(int[] notasProg) {
        this.notasProg = notasProg;
    }

    /**
     * Este metodo genera nombres con este patron AA,AB,AC,AD... no esta
     * preparado para generar nombres de mayores a ZZ (rompe)
     */
    public void GenerarNombres() {
        char primeraLetra, segundaLetra;
        char[] abecedario = new char[25];
        for (int i = 0; i < 25; i++) {
            abecedario[i] = (char) (i + 65);

        }
        System.out.println("nomAlumnos.size " + nomAlumnos.size());
        for (int i = 0; i < numAlumnos; i++) {

            primeraLetra = (char) ((i / 26) + 65); //  la 
            segundaLetra = (char) ((i % 26) + 65);
            System.out.println(String.valueOf(primeraLetra) + segundaLetra);
            nomAlumnos.add(i, String.valueOf(primeraLetra) + String.valueOf(segundaLetra));

        }

    }

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

    public String listaAprovados() {
        String strAux = "Aprobados: ";
        for (int i = 0; i < numAlumnos; i++) {
            if (notasProg[i] >= 5) {
                strAux = strAux.concat(nomAlumnos.get(i));
                if (i < numAlumnos-1) {
                    strAux = strAux.concat(",");
                }
             else {
                strAux = strAux.concat(".");
            }}

        }

        return strAux;
    }
}
