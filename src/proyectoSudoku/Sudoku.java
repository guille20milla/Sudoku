/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSudoku;

import java.util.Random;

/**
 *
 * @author Guillermo Veintemilla Clase Sudoku
 */
public class Sudoku {

    Casilla[][] sudoku;
    Fila filas[];
    Columna columnas[];
    Matriz matrices[];

    /**
     * Constructor Sudoku vacio
     */
    public Sudoku() {
    }

    /**
     * Constructor Sudoku mediante casillas
     *
     * @param sudo
     */
    public Sudoku(Casilla[][] sudo) {
        this.sudoku = sudo;
    }

    /**
     * Construye las 9 filas, 9 columnas y 9 matricez que contiene el sudoku
     */
    public void construir() {
        filas = new Fila[9];
        columnas = new Columna[9];
        matrices = new Matriz[9];
        for (int i = 0; i < filas.length; i++) {
            filas[i] = new Fila();
            columnas[i] = new Columna();
            matrices[i] = new Matriz();
        }

    }

    /**
     * Metodo que resuelve el sudoku a partir de unos numeros dados
     *
     * @param sudoku
     * @return solucion
     */
    public Casilla[][] resolverSudoku(Casilla[][] sudoku) {
        Casilla[][] solucion = new Casilla[9][9];
        construir();
        for (int fila = 0; fila < 9; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                if (sudoku[fila][columna] != null) {
                    solucion[fila][columna] = sudoku[fila][columna];
                    filas[fila].sacar(sudoku[fila][columna].getValor());
                    columnas[columna].sacar(sudoku[fila][columna].getValor());
                    matrices[comprobarMatriz(fila, columna)].sacar(sudoku[fila][columna].getValor());
                }
            }
        }
        boolean repetir;
        do {
            repetir = false;
            for (int fila = 0; fila < 9; fila++) {
                for (int columna = 0; columna < 9; columna++) {
                    if (solucion[fila][columna] == null || solucion[fila][columna].getValor() == 0) {
                        Casilla cas = new Casilla(fila, columna, comprobarMatriz(fila, columna));
                        cas.setSudoku(this);
                        if (!cas.insertar2()) {
                            repetir = true;
                        }
                        solucion[fila][columna] = cas;
                    }
                }
            }
        } while (repetir);

        return solucion;
    }

    /**
     * Metodo que comprueba si el sudoku tiene una solución única o no
     *
     * @param sudoku
     * @return true si tiene solución única
     */
    public boolean comprobarUnico(Casilla[][] sudoku) {
        Casilla[][] solucion = new Casilla[9][9];
        construir();
        for (int fila = 0; fila < 9; fila++) {
            for (int columna = 0; columna < 9; columna++) {
                if (sudoku[fila][columna] != null) {
                    solucion[fila][columna] = sudoku[fila][columna];
                    filas[fila].sacar(sudoku[fila][columna].getValor());
                    columnas[columna].sacar(sudoku[fila][columna].getValor());
                    matrices[comprobarMatriz(fila, columna)].sacar(sudoku[fila][columna].getValor());
                }
            }
        }
        boolean repetir, meteNumero;
        do {
            repetir = false;
            meteNumero = false;
            for (int fila = 0; fila < 9; fila++) {
                for (int columna = 0; columna < 9; columna++) {
                    if (solucion[fila][columna] == null || solucion[fila][columna].getValor() == 0) {
                        Casilla cas = new Casilla(fila, columna, comprobarMatriz(fila, columna));
                        cas.setSudoku(this);
                        if (!cas.insertar2()) {
                            repetir = true;
                        } else {
                            meteNumero = true;
                            solucion[fila][columna] = cas;
                        }
                    }
                }
            }

        } while (repetir && meteNumero);

        if (!repetir) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Metodo que genera un sudoku completo y válido
     *
     * @return sudoku
     */
    public Casilla[][] generarSudoku() {
        int error;
        boolean valido = false;
        boolean completado = false;
        do {
            sudoku = new Casilla[9][9];
            error = 0;
            construir();
            do {
                for (int fila = 0; fila < sudoku.length; fila++) {
                    if (!completarFila(fila)) {
                        error++;
                        //System.out.println("****************************ERRORES**********************************" + error);
                        reiniciarFila(fila);
                        fila--;
                        if (error == 5) {
                            valido = false;
                            break;
                        }
                    }
                }
                completado = true;
                if (error == 5) {
                    valido = false;
                    //System.out.println("¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿¿REINICIO??????????????????????????????????????????");
                } else {
                    valido = true;
                }
            } while (!completado && error < 5);

        } while (!valido);
        return sudoku;
    }

    /**
     * Metodo que va rellenando la fila y comprueba si es correcta
     *
     * @param fila
     * @return true si es una fila correcta
     */
    public boolean completarFila(int fila) {
        boolean filaCorrecta = true;
        for (int columna = 0; columna < sudoku.length; columna++) {
            Casilla cas = new Casilla(fila, columna, comprobarMatriz(fila, columna));
            //System.out.println("Fila: " + fila + " Columna: " + columna + " Matriz: " + comprobarMatriz(fila, columna));
            cas.setSudoku(this);
            if (!cas.insertar()) {
                filaCorrecta = false;
                break;
            }
            sudoku[fila][columna] = cas;
        }
        return filaCorrecta;
    }

    /**
     * Metodo que comienza de nueva la fila si no estaba bien completada
     *
     * @param fila
     */
    public void reiniciarFila(int fila) {
        try {
            for (int columna = 0; columna < 9; columna++) {
                filas[fila].meter(sudoku[fila][columna].getValor());
                columnas[columna].meter(sudoku[fila][columna].getValor());
                matrices[comprobarMatriz(fila, columna)].meter(sudoku[fila][columna].getValor());
            }
        } catch (Exception e) {
        }
    }

    /**
     * Metodo que comprueba en que matriz esta colocada la casilla
     * correspondiente a la fila y columna dados
     *
     * @param fila
     * @param columna
     * @return matriz
     */
    public int comprobarMatriz(int fila, int columna) {

        if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3) {
            return 0;
        } else if (fila >= 0 && fila < 3 && columna >= 3 && columna < 6) {
            return 1;
        } else if (fila >= 0 && fila < 3 && columna >= 6 && columna < 9) {
            return 2;
        } else if (fila >= 3 && fila < 6 && columna >= 0 && columna < 3) {
            return 3;
        } else if (fila >= 3 && fila < 6 && columna >= 3 && columna < 6) {
            return 4;
        } else if (fila >= 3 && fila < 6 && columna >= 6 && columna < 9) {
            return 5;
        } else if (fila >= 6 && fila < 9 && columna >= 0 && columna < 3) {
            return 6;
        } else if (fila >= 6 && fila < 9 && columna >= 3 && columna < 6) {
            return 7;
        } else {
            return 8;
        }

    }
}
