/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSudoku;

import java.util.ArrayList;

/**
 *
 * @author Guillermo Veintemilla
 * Clase abstracta Valores
 */
public class Valores {
    
    ArrayList<Integer> valores;
    
    /**
     * Metodo que mete un numero al array de valores posibles
     * @param n numero a meter
     */
    public void meter(int n){
        valores.add(n);
    }
    
    /**
     * Metodo que saca un numero al array de valores posibles
     * @param n numero a sacar
     */
    public void sacar(int n){
        Object valor = (Object)n;
        valores.remove(valor);
    }
    
    /**
     * Metodo que genera un array del 1 al 9 para los valores posibles
     */
    public void generar(){
        valores = new ArrayList<Integer>();
        for(int i=0;i<9;i++){
            valores.add(i,(i+1));
        }
    }
    
    /**
     * Metodo que devuelve el array de valores posibles
     * @return valores
     */
    public ArrayList<Integer> devolver(){
        return valores;
    }
    
}
