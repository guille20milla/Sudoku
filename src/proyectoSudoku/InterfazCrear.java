/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoSudoku;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Guillermo Veintemilla
 * Clase InterfazCrear
 */
public class InterfazCrear extends javax.swing.JFrame {

    private Integer[][] data = new Integer[9][9];
    
    /**
     * Creates new form InterfazCrear
     */
    public InterfazCrear() {
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTable1 = new javax.swing.JTable();
        botonIntroducir = new javax.swing.JButton();
        botonSolucionar = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();
        botonResolver = new javax.swing.JButton();

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

        botonIntroducir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonIntroducir.setText("Introducir numero");
        botonIntroducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIntroducirActionPerformed1(evt);
            }
        });

        botonSolucionar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botonSolucionar.setText("Comprobar solucion unica");
        botonSolucionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSolucionarActionPerformed(evt);
            }
        });

        botonReiniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonReiniciar.setForeground(new java.awt.Color(255, 0, 0));
        botonReiniciar.setText("Reiniciar");
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        botonResolver.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonResolver.setForeground(new java.awt.Color(0, 204, 0));
        botonResolver.setText("Resolver");
        botonResolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonResolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonResolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonReiniciar)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonIntroducir)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(botonSolucionar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(botonIntroducir)
                        .addGap(29, 29, 29)
                        .addComponent(botonSolucionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonReiniciar)
                            .addComponent(botonResolver))))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción del boton introducir un numero
     * @param evt 
     */
    private void botonIntroducirActionPerformed1(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIntroducirActionPerformed1
        InterfazNumeroCreacion in = new InterfazNumeroCreacion(this);
    }//GEN-LAST:event_botonIntroducirActionPerformed1

    /**
     * Acción del boton solucionar
     * @param evt 
     */
    private void botonSolucionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSolucionarActionPerformed
        Sudoku solucionar = new Sudoku(pasarACasillas(getData()));
        if(solucionar.comprobarUnico(pasarACasillas(getData()))){
            JOptionPane.showMessageDialog(null, "Este sudoku tiene solución única", "", JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "No hay solucion única", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonSolucionarActionPerformed

    /**
     * Acción del boton reiniciar
     * @param evt 
     */
    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_botonReiniciarActionPerformed

    /**
     * Acción del metodo resolver
     * @param evt 
     */
    private void botonResolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonResolverActionPerformed
        Sudoku solucionar = new Sudoku(pasarACasillas(getData()));
        if(solucionar.comprobarUnico(pasarACasillas(getData()))){
            InterfazSolucion i = new InterfazSolucion(solucionar.resolverSudoku(pasarACasillas(getData())));
        }else{
            JOptionPane.showMessageDialog(null, "No se puede resolver porque no hay solucion única", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_botonResolverActionPerformed


    /**
     * Metodo que pasa del data a un sudoku
     * @param datos
     * @return 
     */
    public Casilla[][] pasarACasillas(Integer[][] datos){
        Casilla[][] sudoku= new Casilla[9][9];
        Sudoku sudo = new Sudoku();
        for(int fila=0;fila<9;fila++){
            for(int columna =0;columna<9;columna++){
                if(datos[fila][columna]!=null){
                    Casilla cas = new Casilla(fila,columna,sudo.comprobarMatriz(fila, columna));
                    cas.setValor(datos[fila][columna]);
                    sudoku[fila][columna]=cas;
                }
                
            }
        }
        return sudoku;
    }
    /**
     * Metodo para introducir un numero en la tabla
     * @param fila
     * @param columna
     * @param valor 
     */
    public void actualizarCasilla(int fila, int columna, int valor) {
        MyTableModel miTabla = new MyTableModel((fila - 1), (columna - 1), valor, getData());
        jTable1.setModel(miTabla);
        //centrar los valores de las celdas
        for (int i = 0; i < 9; i++) {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }
    
    /**
     * Metodo para vaciar el sudoku
     */
    public void reiniciar(){
        MyTableModel miTabla = new MyTableModel();
        jTable1.setModel(miTabla);
        //centrar los valores de las celdas
        for (int i = 0; i < 9; i++) {
            DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
            tcr.setHorizontalAlignment(SwingConstants.CENTER);
            jTable1.getColumnModel().getColumn(i).setCellRenderer(tcr);
        }
    }
    
    class MyTableModel extends AbstractTableModel {

        
        public MyTableModel(){
            Integer[][] nuevo = new Integer[9][9];
            data=nuevo;
        }
        /**
         * Constructor del modelo
         */
        public MyTableModel(int fila, int columna, int valor, Integer[][] solucionable) {
            data = insetarNumero(fila, columna, valor);
        }

        /**
         * Metodo para insertar un numero
         * @param f
         * @param c
         * @param valor
         * @return data
         */
        public Integer[][] insetarNumero(int f, int c, int valor) {
            if (getData()[f][c] == null) {
                data[f][c] = valor;
                JOptionPane.showMessageDialog(null, "Insertado", "", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Ya has insertado un numero en esta celda", "Error", JOptionPane.ERROR_MESSAGE);
            }
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
    private javax.swing.JButton botonIntroducir;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonResolver;
    private javax.swing.JButton botonSolucionar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the data
     */
    public Integer[][] getData() {
        return data;
    }
}
