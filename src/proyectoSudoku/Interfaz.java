/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSudoku;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Guillermo Veintemilla
 * Clase Interfaz
 */
public class Interfaz extends javax.swing.JFrame {

    Casilla[][] sudoku;
    private Integer[][] data = null;
    int huecos;
    Random numeroAzar = new Random();

    /**
     * Creates new form Interfaz
     */
    public Interfaz(Casilla[][] sudoku, int hue) {
        this.sudoku = sudoku;
        this.huecos = hue;
        initComponents();
        vaciar();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    /**
     * Metodo que pone los huecos en el jtable
     */
    public void vaciar() {
        MyTableModel miTabla = new MyTableModel();
        getjTable1().setModel(miTabla);

        //centrar los valores de las celdas
        for (int i = 0; i < 9; i++) {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            getjTable1().getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    /**
     * Metodo qeue mete un valor en una casilla del jtable
     * @param fila
     * @param columna
     * @param valor 
     */
    public void actualizarCasilla(int fila, int columna, int valor) {
        MyTableModel miTabla = new MyTableModel((fila - 1), (columna - 1), valor, data);
        jTable1.setModel(miTabla);
        //centrar los valores de las celdas
        for (int i = 0; i < 9; i++) {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    /**
     * Metodo que corrige si la tabla no esta bien conforme a los valores que debería
     */
    public void corregirTabla() {
        MyTableModel miTabla = new MyTableModel(data);
        jTable1.setModel(miTabla);
        //centrar los valores de las celdas
        for (int i = 0; i < 9; i++) {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        botonIntroducir = new javax.swing.JButton();
        botonComprobar = new javax.swing.JButton();

        setResizable(false);

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ));

        jButton1.setText("Resolver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        botonIntroducir.setText("Introducir numero");
        botonIntroducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIntroducirActionPerformed(evt);
            }
        });

        botonComprobar.setText("Comprobar");
        botonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComprobarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonIntroducir)
                                .addGap(18, 18, 18)
                                .addComponent(botonComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonIntroducir)
                    .addComponent(botonComprobar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción del boton resolver
     * @param evt 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Sudoku solucionar = new Sudoku(sudoku);
        InterfazSolucion i = new InterfazSolucion(solucionar.resolverSudoku(sudoku));
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * Acción del boton comprobar
     * @param evt 
     */
    private void botonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComprobarActionPerformed
        corregirTabla();
    }//GEN-LAST:event_botonComprobarActionPerformed

    /**
     * Accción del boton introducir numero
     * @param evt 
     */
    private void botonIntroducirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIntroducirActionPerformed
        InterfazNumero in = new InterfazNumero(this);
    }//GEN-LAST:event_botonIntroducirActionPerformed

    /**
     * Metodo que devuelve el data
     * @return the data
     */
    public Integer[][] getData() {
        return data;
    }

    /**
     * @return the jTable1
     */
    public javax.swing.JTable getjTable1() {
        return jTable1;
    }

    class MyTableModel extends AbstractTableModel {

        /**
         * Constructor del modelo para rellenar la tabla
         */
        public MyTableModel() {
            data = rellenarTabla();
        }

        /**
         * Contructor del modelo para corregir la tabla
         * @param datos 
         */
        public MyTableModel(Integer[][] datos) {
            data = corregirTabla();
        }

        /**
         * Constructor del modelo para introducir un numero en la tabla
         */
        public MyTableModel(int fila, int columna, int valor, Integer[][] solucionable) {
            data = insetarNumero(fila, columna, valor);
        }

        /**
         * Metodo que inserta un numero en data
         * @param f
         * @param c
         * @param valor
         * @return data
         */
        public Integer[][] insetarNumero(int f, int c, int valor) {
            if (getData()[f][c] == null) {
                data[f][c] = valor;
                JOptionPane.showMessageDialog(null, "Actualizado", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "No puedes cambiar el valor", "Error", JOptionPane.ERROR_MESSAGE);
            }
            return getData();
        }

        /**
         * Metodo que corrige los valores que estan mal en data
         * @return data
         */
        public Integer[][] corregirTabla() {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    if (data[i][j] == null) {
                        data[i][j] = null;
                    } else if (data[i][j] != sudoku[i][j].getValor()) {
                        data[i][j] = null;
                        JOptionPane.showMessageDialog(null, "El numero de la fila " + (i + 1) + " columna " + (j + 1) + " no es correcto", "", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "Casillas mal puestas vaciadas", "", JOptionPane.INFORMATION_MESSAGE);
            return data;
        }

        /**
         * Metodo que rellena la tabla con los huecos
         * @return data
         */
        public Integer[][] rellenarTabla() {
            Casilla[][] comodin;
            Sudoku solucionar;
            do {
                comodin = new Casilla[9][9];
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        comodin[i][j] = sudoku[i][j];
                    }
                }
                ArrayList<Integer> azar = new ArrayList<Integer>();
                for (int i = 0; i < 81; i++) {
                    azar.add(i + 1);
                }
                ArrayList<Integer> elegidos = new ArrayList<Integer>();
                int numElegido;
                for (int i = 0; i < huecos; i++) {
                    numElegido = numeroAzar.nextInt(azar.size());
                    elegidos.add(azar.get(numElegido).intValue());
                    Object o = (Object) azar.get(numElegido);
                    azar.remove(o);
                }
                int elegido = 0;
                int numFilas = 9;
                int numColumns = getColumnCount();
                data = new Integer[numFilas][numColumns];
                for (int fila = 0; fila < numFilas; fila++) {
                    for (int columna = 0; columna < numColumns; columna++) {
                        if (elegidos.contains((Object) elegido)) {
                            elegidos.remove((Object) elegido);
                            comodin[fila][columna] = null;
                        } else {
                            data[fila][columna] = comodin[fila][columna].getValor();
                            
                        }
                        elegido++;
                    }
                }
                solucionar = new Sudoku(comodin);
            } while (!solucionar.comprobarUnico(comodin));

            return getData();
        }

        /**
         * Cuenta las columnas
         *
         * @return numero de columnas
         */
        public int getColumnCount() {
            return 9;
        }

        /**
         * Cuenta las filas
         *
         * @return numero de filas
         */
        public int getRowCount() {
            return getData().length;
        }

        /**
         * Metodo que devuelve el nombre de la columna
         *
         * @param col numero de la columna
         * @return nombre de la columna
         */
        public String getColumnName(int col) {
            return "";
        }

        /**
         * Metodo que devuelve los datos de la tabla
         *
         * @param row numero fila
         * @param col numero columna
         * @return datos de la tabla
         */
        public Object getValueAt(int row, int col) {
            return getData()[row][col];
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonComprobar;
    private javax.swing.JButton botonIntroducir;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
