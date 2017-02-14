/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSudoku;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Guillermo Veintemilla
 * Clase Casilla que se equivale a cada celda del sudoku
 */
public class Casilla {

    int fila, columna, matriz;
    private int valor;
    private static Sudoku sudoku;
    Random numeroAzar = new Random();

    /**
     * Constructor Casilla
     * @param fila a la que pertenece
     * @param columna a la que pertenece
     * @param matriz a la que pertenece
     */
    public Casilla(int fila, int columna,int matriz) {
        this.fila = fila;
        this.columna = columna;
        this.matriz = matriz;
    }


    /**
     * Metodo que inserta un numero, utilizado para la generación de sudokus
     * @return true si ha insertado numero
     */
    public boolean insertar() {
        int numero;
        ArrayList<Integer> correctos = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            correctos.add(i, (i + 1));
        }
        correctos.retainAll(sudoku.filas[fila].devolver());
        //System.out.println(correctos.toString());
        correctos.retainAll(sudoku.columnas[columna].devolver());
        //System.out.println(correctos.toString());
        correctos.retainAll(sudoku.matrices[matriz].devolver());
        //System.out.println(correctos.toString());
        if (correctos.size() == 0) {
            return false;
        } else {
            numero = numeroAzar.nextInt(correctos.size());
            //System.out.println(correctos.get(numero));
            setValor(correctos.get(numero));
            sudoku.filas[fila].sacar(valor);
            sudoku.columnas[columna].sacar(valor);
            sudoku.matrices[matriz].sacar(valor);
            return true;
        }

    }
    
    /**
     * Metodo que insertar un numero, utilizado para solucionar y buscar
     * solución única en un sudoku
     * @return true si inserta numero
     */
    public boolean insertar2() {
        int numero;
        ArrayList<Integer> correctos = new ArrayList<Integer>();
        for (int i = 0; i < 9; i++) {
            correctos.add(i, (i + 1));
        }
        correctos.retainAll(sudoku.filas[fila].devolver());
        //System.out.println(correctos.toString());
        correctos.retainAll(sudoku.columnas[columna].devolver());
        //System.out.println(correctos.toString());
        correctos.retainAll(sudoku.matrices[matriz].devolver());
        //System.out.println(correctos.toString());
        if (correctos.size() == 1) {
            numero = numeroAzar.nextInt(correctos.size());
            //System.out.println(correctos.get(numero));
            setValor(correctos.get(numero));
            sudoku.filas[fila].sacar(valor);
            sudoku.columnas[columna].sacar(valor);
            sudoku.matrices[matriz].sacar(valor);
            return true;
        } else {
            return false;
        }

    }

    /**
     * Metodo que devuelve el valor de la Casilla
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * Metodo para cambiar el valor de la Casilla
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * Metodo que asigna la Casilla al sudoku
     * @param aSudoku the sudoku to set
     */
    public static void setSudoku(Sudoku aSudoku) {
        sudoku = aSudoku;
    }

}
