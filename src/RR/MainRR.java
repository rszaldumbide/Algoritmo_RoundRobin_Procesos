/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RR;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rszaldumbide
 */
public class MainRR extends javax.swing.JFrame {

    metodosRR m;
    private int cantidad, contador=0, fila = 0, filaCola = 0;
    private double uMenor = 0, pMenor;
    private DefaultTableModel rafaga, resultado, proceso;
    private String [][] matrizVerificacion, matriztmp, matrizPRI;
    private boolean existeProceso = false;
    private String nMenor="";
    private int []Tf;
    private int quantum;;
    
    public MainRR() {
        initComponents();
        m=new metodosRR(); 
        this.setExtendedState(MAXIMIZED_BOTH);
        ((DefaultTableCellRenderer) tblProcesos.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) tblRafagaDeTiempo.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        ((DefaultTableCellRenderer) tblResultados.getTableHeader().getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
    }  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlALGORITMOFIFO = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcantidadProcesos = new javax.swing.JTextField();
        btnAgregarProceso = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        pnlTABLAPROCESOS = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProcesos = new ColorColumnas();
        btnResultados = new javax.swing.JButton();
        btnGraficar = new javax.swing.JButton();
        lblValorRafaga = new javax.swing.JLabel();
        pnlResultados = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblResultados = new ColorColumnas();
        lblPromedioTT = new javax.swing.JLabel();
        lblPromedioW = new javax.swing.JLabel();
        lblPromedioP = new javax.swing.JLabel();
        pnlRafaga = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblRafagaDeTiempo = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1540, 879));

        pnlALGORITMOFIFO.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ALGORITMO ROUND ROBIN");

        jLabel2.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cantidad de Procesos:");

        btnAgregarProceso.setBackground(new java.awt.Color(102, 102, 255));
        btnAgregarProceso.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnAgregarProceso.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProceso.setText("Mostrar Procesos");
        btnAgregarProceso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAgregarProceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProcesoActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(102, 102, 255));
        btnReset.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnReset.setForeground(new java.awt.Color(255, 255, 255));
        btnReset.setText("Limpiar");
        btnReset.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(102, 102, 255));
        btnSalir.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlALGORITMOFIFOLayout = new javax.swing.GroupLayout(pnlALGORITMOFIFO);
        pnlALGORITMOFIFO.setLayout(pnlALGORITMOFIFOLayout);
        pnlALGORITMOFIFOLayout.setHorizontalGroup(
            pnlALGORITMOFIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlALGORITMOFIFOLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAgregarProceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(342, 342, 342))
            .addGroup(pnlALGORITMOFIFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlALGORITMOFIFOLayout.setVerticalGroup(
            pnlALGORITMOFIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlALGORITMOFIFOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlALGORITMOFIFOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtcantidadProcesos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarProceso)
                    .addComponent(btnReset)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlTABLAPROCESOS.setBackground(new java.awt.Color(0, 0, 0));
        pnlTABLAPROCESOS.setPreferredSize(new java.awt.Dimension(750, 350));

        jLabel5.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TABLA DE LOS PROCESOS DENTRO DE LISTO");

        tblProcesos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PROCESOS", "TIEMPO LLEGADA (L)", "TIEMPO EJECUCION (U)", "QUANTUM (Q)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProcesos.setColumnSelectionAllowed(true);
        tblProcesos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblProcesos);
        tblProcesos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        btnResultados.setBackground(new java.awt.Color(102, 102, 255));
        btnResultados.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnResultados.setForeground(new java.awt.Color(255, 255, 255));
        btnResultados.setText("MOSTRAR RESULTADOS");
        btnResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultadosActionPerformed(evt);
            }
        });

        btnGraficar.setBackground(new java.awt.Color(102, 102, 255));
        btnGraficar.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        btnGraficar.setForeground(new java.awt.Color(255, 255, 255));
        btnGraficar.setText("GRAFICAR");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        lblValorRafaga.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblValorRafaga.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnlTABLAPROCESOSLayout = new javax.swing.GroupLayout(pnlTABLAPROCESOS);
        pnlTABLAPROCESOS.setLayout(pnlTABLAPROCESOSLayout);
        pnlTABLAPROCESOSLayout.setHorizontalGroup(
            pnlTABLAPROCESOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTABLAPROCESOSLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTABLAPROCESOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(pnlTABLAPROCESOSLayout.createSequentialGroup()
                        .addComponent(btnResultados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGraficar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblValorRafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlTABLAPROCESOSLayout.setVerticalGroup(
            pnlTABLAPROCESOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTABLAPROCESOSLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pnlTABLAPROCESOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblValorRafaga, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addGroup(pnlTABLAPROCESOSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnResultados)
                        .addComponent(btnGraficar)))
                .addContainerGap())
        );

        pnlResultados.setBackground(new java.awt.Color(0, 0, 0));
        pnlResultados.setPreferredSize(new java.awt.Dimension(750, 350));

        jLabel6.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("RESULTADOS DEL PROCESO RR");

        jLabel3.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PROMEDIOS:");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tblResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Procesos", "Tiempo Llegada", "Tiempo Ejecucion", "Tiempo Finalizado", "T", "W", "P"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblResultados.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(tblResultados);

        lblPromedioTT.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblPromedioTT.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioTT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPromedioW.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblPromedioW.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioW.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblPromedioP.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        lblPromedioP.setForeground(new java.awt.Color(255, 255, 255));
        lblPromedioP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnlResultadosLayout = new javax.swing.GroupLayout(pnlResultados);
        pnlResultados.setLayout(pnlResultadosLayout);
        pnlResultadosLayout.setHorizontalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addGroup(pnlResultadosLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPromedioTT, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPromedioW, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPromedioP, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlResultadosLayout.setVerticalGroup(
            pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblPromedioP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPromedioTT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPromedioW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlRafaga.setBackground(new java.awt.Color(0, 0, 0));

        jLabel9.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("RAFAGA DE TIEMPO");

        tblRafagaDeTiempo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblRafagaDeTiempo.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tblRafagaDeTiempo);

        javax.swing.GroupLayout pnlRafagaLayout = new javax.swing.GroupLayout(pnlRafaga);
        pnlRafaga.setLayout(pnlRafagaLayout);
        pnlRafagaLayout.setHorizontalGroup(
            pnlRafagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRafagaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRafagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlRafagaLayout.setVerticalGroup(
            pnlRafagaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRafagaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlALGORITMOFIFO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRafaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pnlTABLAPROCESOS, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(pnlALGORITMOFIFO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlTABLAPROCESOS, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addComponent(pnlResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlRafaga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1553, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProcesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProcesoActionPerformed
        // TODO add your handling code here:
        try{
            Quantum();
            cantidad=Integer.parseInt(txtcantidadProcesos.getText());
            if(cantidad>0){
                m.imprimirMatriz(m.MatrizChar(cantidad), cantidad, tblProcesos );
                centrarTablaInicial();
                llenadoQuantum();
            }else{
                JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 0");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAgregarProcesoActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        try{
            proceso = (DefaultTableModel)tblProcesos.getModel();
            resultado = (DefaultTableModel)tblResultados.getModel();
            rafaga = (DefaultTableModel)tblRafagaDeTiempo.getModel();
            
            proceso.setRowCount(0);
            resultado.setRowCount(0);
            rafaga.setRowCount(0);
            rafaga.setColumnCount(0);

            lblPromedioP.setText("");
            lblPromedioTT.setText("");
            lblPromedioW.setText("");
            lblValorRafaga.setText("");

            txtcantidadProcesos.setText("");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultadosActionPerformed
    
    try{
        int inicio=Integer.parseInt(tblProcesos.getValueAt(0, 1).toString());
        proceso = (DefaultTableModel)tblProcesos.getModel();
        cantidad=Integer.parseInt(txtcantidadProcesos.getText());
        
        //imprimir la matriz de resultados
        m.imprimirMatriz(m.MatrizString(cantidad), cantidad, tblResultados);
        //aplicamos los calculos de la tabla
        calculosTabla();
        //se escribe los resultados en los labels
        lblPromedioTT.setText("T: "+promedioT());
        lblPromedioW.setText("W: "+promedioW());
        lblPromedioP.setText("P: "+promedioP());
        
        if(inicio!=0){
            lblValorRafaga.setText("La rafaga es igual a: "+(calculoRafaga()-inicio));
        }else{
            lblValorRafaga.setText("La rafaga es igual a: "+calculoRafaga());
        }
        
        centrarTablasCalculos();
        
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnResultadosActionPerformed

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        // TODO add your handling code here:
        try{
            int inicio=Integer.parseInt(tblProcesos.getValueAt(0, 1).toString());
            m.imprimirMatrizRafaga(m.MatrizString(cantidad+1), cantidad, (calculoRafaga()+1), tblRafagaDeTiempo);
            matrices();
            
            //imprimir la primera columna en la rafaga
            for(int i=0; i<cantidad; i++){
                tblRafagaDeTiempo.setValueAt(tblProcesos.getValueAt(i, 0), i, 0);               
            }
            
            llenadoRafaga1(); //LINEAS SALTADAS
            centrarTablaRafaga();
            
            for(int i=0; i<(calculoRafaga()+1); i++){
                tblRafagaDeTiempo.getColumnModel().getColumn(i).setCellRenderer(new colorCelda());      
            }
            
            if(inicio!=0){
                lblValorRafaga.setText("La rafaga es igual a: "+(calculoRafaga()-inicio));
            }else{
                lblValorRafaga.setText("La rafaga es igual a: "+calculoRafaga());
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnGraficarActionPerformed
   
    private void Quantum(){   
        do{
            quantum=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el quantum:"));
            if(quantum<=0){
                JOptionPane.showMessageDialog(null, "El quantum debe ser mayor a 0");
            }
        }while(quantum<=0);
    }
    
    private void llenadoQuantum(){
        for(int i=0; i<cantidad; i++){
            tblProcesos.setValueAt(quantum, i, 3);
        }
    }
    
    //LLENAR LA GRAFICA
    private void llenadoRafaga1(){
        String tiempoLlegada=matriztmp[0][1];
        cogerMenor(tiempoLlegada);
        int Recorre=Integer.parseInt(tiempoLlegada);
        double Valor=0;
        double cotadorQ = 0;

        while(existeProceso==true){
            Valor=uMenor;
            while(Valor>0) {
                String pNombre = nMenor;
                tblRafagaDeTiempo.setValueAt(nMenor, fila, Recorre + 1);
                Valor--;
                matrizVerificacion[filaCola][1] = String.valueOf(Valor);
                Recorre++;
                cotadorQ++;
                if(Valor==0){
                    matrizVerificacion[filaCola][3] = "No listo";
                    cotadorQ = 0;
                }
                
                cogerMenor(String.valueOf(Recorre));
                if (cotadorQ==quantum && matrizVerificacion[filaCola][3].equals("Listo")) {
                    matrizVerificacion[filaCola][3] = "X";
                    cogerColaListos(matrizVerificacion[filaCola][0], matrizVerificacion[filaCola][1], matrizVerificacion[filaCola][2]);
                    cotadorQ = 0;
                }
                recorrer();
                if(!pNombre.equals(nMenor)){
                    break;
                }
            }
        }
    }
    
    private void matrices(){
        
        matrizVerificacion= new String[cantidad][4];
        matriztmp = new String[cantidad][4];
        matrizPRI = new String[cantidad][calculoRafaga()+1];
        //almacenamos los valores de la primera tabla en una matriz
        for(int i=0; i<cantidad; i++) {
            tblRafagaDeTiempo.setValueAt(tblProcesos.getValueAt(i, 0), i, 0);
            matriztmp[i][0]= tblProcesos.getValueAt(i, 0).toString();//nombre
            matriztmp[i][1]= tblProcesos.getValueAt(i, 1).toString();//l
            matriztmp[i][2]= tblProcesos.getValueAt(i, 2).toString();//u
            matriztmp[i][3]= "Listo";//estado
            matrizPRI[i][0]= tblProcesos.getValueAt(i, 0).toString();
        }
    }
    
    public void cogerColaListos(String a, String b, String c) {
        String[][] matrizColaTemp = matrizVerificacion;
        matrizVerificacion = new String[matrizColaTemp.length + 1][4];
        for (int i=0; i<matrizColaTemp.length; i++) {
            matrizVerificacion[i][0] = matrizColaTemp[i][0];
            matrizVerificacion[i][1] = matrizColaTemp[i][1];
            matrizVerificacion[i][2] = matrizColaTemp[i][2];
            matrizVerificacion[i][3] = matrizColaTemp[i][3];
        }

        matrizVerificacion[contador][0] = a;
        matrizVerificacion[contador][1] = b;
        matrizVerificacion[contador][2] = c;
        matrizVerificacion[contador][3] = "Listo";
        contador++;

    }
    
    private void cogerMenor(String tiempoLlegada){
        try{
            for(int i=0; i<matriztmp.length; i++) {
                if(matriztmp[i][1].equalsIgnoreCase(tiempoLlegada)){
                    matrizVerificacion[contador][0] = matriztmp[i][0];
                    matrizVerificacion[contador][1] = matriztmp[i][2];
                    matrizVerificacion[contador][2] = String.valueOf(i);
                    matrizVerificacion[contador][3] = "Listo";
                    contador ++;
                }
            }
            recorrer();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    private void recorrer(){
        try{
            existeProceso = false;
            for(int i=0; i<contador; i++) {
                nMenor=matrizVerificacion[i][0];
                uMenor=Double.parseDouble(matrizVerificacion[i][1]);
                fila=Integer.parseInt(matrizVerificacion[i][2]);
                if(matrizVerificacion[i][3].equalsIgnoreCase("Listo")){
                    existeProceso = true;
                    filaCola=i;
                    break;
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private int calculoRafaga(){ 
        cantidad=Integer.parseInt(txtcantidadProcesos.getText());
        int tmp, rafaga=0, rafaga2;
        
        int inicio=Integer.parseInt(tblProcesos.getValueAt(0, 1).toString());
        
        if(inicio!=0){
            for(int i=0; i<cantidad; i++){
                tmp = Integer.parseInt(tblProcesos.getValueAt(i, 2).toString());
                rafaga=tmp+rafaga;
                }
            rafaga2=inicio+rafaga;
        }else{
            for(int i=0; i<cantidad; i++){
                tmp = Integer.parseInt(tblProcesos.getValueAt(i, 2).toString());
                rafaga=tmp+rafaga;
                }
            rafaga2=rafaga;
        } 
        return rafaga2;
    }
    
    private void calculosTabla(){
        
        DefaultTableModel resultados = (DefaultTableModel)tblResultados.getModel();
        int res=0;
        double L, U, T, W, tf2;
        double P;
        String proceso;
          
        tiempoFinalizacion();
        for(int i=0; i<Tf.length; i++){
            resultados.setValueAt(Tf[i], i, 3);
        }
        
        for(int i=0; i<cantidad; i++){
        //llenar los datos de la tabla inicial a la de resultados
            proceso=tblProcesos.getValueAt(i, 0).toString();
            resultados.setValueAt(proceso, i, 0);
            L = Math.round(Double.parseDouble(tblProcesos.getValueAt(i, 1).toString()));
            U = Math.round(Double.parseDouble(tblProcesos.getValueAt(i, 2).toString()));
            resultados.setValueAt((int)(L), i, 1);                
            resultados.setValueAt((int)(U), i, 2);

            //Tiempo de trabajo
            tf2=Math.round(Double.parseDouble(tblResultados.getValueAt((i), 3).toString()));
            T=Math.round(tf2-L);
            resultados.setValueAt((int)(T), i, 4);

            //Tiempo de espera
            T=Math.round(Double.parseDouble(tblResultados.getValueAt((i), 4).toString()));
            W=Math.round(T-U);
            resultados.setValueAt((int)(W), i, 5);

            //tiempo P
            P=(T/U);
            res=round(P);
            resultados.setValueAt(res, i, 6);
        }  
    }
    
    private void tiempoFinalizacion(){

        Tf=new int[cantidad];
        //primero for para recorrer los procesos
        for(int p=0; p<cantidad; p++){ 
            //un for que recorra las columnas e ir tomando la posicion de la columna
            for (int col = 1; col < tblRafagaDeTiempo.getColumnCount(); col++) {
                if (tblRafagaDeTiempo.getValueAt(p, col) != null) {
                    if (tblRafagaDeTiempo.getValueAt(p, col).equals("A")) {
                        Tf[0] = col;
                    }else
                        if(tblRafagaDeTiempo.getValueAt(p, col).equals("B")) {
                        Tf[1] = col;
                    }else
                        if(tblRafagaDeTiempo.getValueAt(p, col).equals("C")) {
                        Tf[2] = col;
                    }else
                        if(tblRafagaDeTiempo.getValueAt(p, col).equals("D")) {
                        Tf[3] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("E")) {
                        Tf[4] = col;
                    }else 
                        if(tblRafagaDeTiempo.getValueAt(p, col).equals("F")) {
                        Tf[5] = col;
                    }else 
                        if(tblRafagaDeTiempo.getValueAt(p, col).equals("G")) {
                        Tf[6] = col;
                    }else 
                        if(tblRafagaDeTiempo.getValueAt(p, col).equals("H")) {
                        Tf[7] = col;
                    }else
                        if(tblRafagaDeTiempo.getValueAt(p, col).equals("I")) {
                        Tf[8] = col;
                    }else 
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("J")) {
                        Tf[9] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("K")) {
                        Tf[10] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("L")) {
                        Tf[11] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("M")) {
                        Tf[12] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("N")) {
                        Tf[13] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("O")) {
                        Tf[14] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("P")) {
                        Tf[15] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("Q")) {
                        Tf[16] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("R")) {
                        Tf[17] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("S")) {
                        Tf[18] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("T")) {
                        Tf[19] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("U")) {
                        Tf[20] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("V")) {
                        Tf[21] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("W")) {
                        Tf[22] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("X")) {
                        Tf[23] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("Y")) {
                        Tf[24] = col;
                    }else
                        if (tblRafagaDeTiempo.getValueAt(p, col).equals("Z")) {
                        Tf[25] = col;
                    }
                }
            }
        }
    }
    
    private int round(double d){ 
        double dAbs = Math.abs(d); 
        int i = (int) dAbs; 
        double result = dAbs - (double) i; 
        if(result<0.5){ 
            return d<0 ? -i : i;
        }else{ 
            return d<0 ? -(i+1) : i+1; 
        }
    }
    
    private int promedioT(){
        int res=0;
        double tmp, promedioT=0, suma=0;
        for(int i=0; i<cantidad; i++){
            tmp = Double.parseDouble(tblResultados.getValueAt(i, 4).toString());
            suma=tmp+suma;
            promedioT=suma/cantidad;
        } 
        res=round(promedioT);
        
        return res;
    }
    
    private int promedioW(){
        int res=0;
        double tmp, promedioW=0, suma=0;
        for(int i=0; i<cantidad; i++){
            tmp = Double.parseDouble(tblResultados.getValueAt(i, 5).toString());
            suma=tmp+suma;
            promedioW=suma/cantidad;
        }
        res=round(promedioW);
        
        return res;
    }
    
    private int promedioP(){
        int res=0;
        double tmp, promedioP=0, suma=0;
        for(int i=0; i<cantidad; i++){
            tmp = Math.round(Integer.parseInt(tblResultados.getValueAt(i, 6).toString()));
            suma=Math.round(tmp+suma);    
            promedioP=(suma/cantidad); 
        }
        res=round(promedioP);
        
        return res;
    }
    
    private void centrarTablaInicial(){

        for(int i=0; i< 4; i++){
            if(i==0){
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                tblProcesos.getColumnModel().getColumn(i).setCellRenderer(tcr);   
            }else{
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                tblProcesos.getColumnModel().getColumn(i).setCellRenderer(tcr);  
            }   
        }          
    }
    
    private void centrarTablasCalculos(){

        for(int i=0; i< 7; i++){
            if(i==0){
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                tblResultados.getColumnModel().getColumn(i).setCellRenderer(tcr);  
            }else{
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                tblResultados.getColumnModel().getColumn(i).setCellRenderer(tcr); 
            } 
        } 
    }
    
    private void centrarTablaRafaga(){
        //centrar los valores de las tablas   
        for(int i=0; i< (calculoRafaga()+1); i++){
            if(i==0){
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                tblRafagaDeTiempo.getColumnModel().getColumn(i).setCellRenderer(tcr); 
            }else{
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.CENTER);
                tblRafagaDeTiempo.getColumnModel().getColumn(i).setCellRenderer(tcr);
            }
        }             
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainRR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainRR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainRR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainRR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainRR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarProceso;
    private javax.swing.JButton btnGraficar;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResultados;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblPromedioP;
    private javax.swing.JLabel lblPromedioTT;
    private javax.swing.JLabel lblPromedioW;
    private javax.swing.JLabel lblValorRafaga;
    private javax.swing.JPanel pnlALGORITMOFIFO;
    private javax.swing.JPanel pnlRafaga;
    private javax.swing.JPanel pnlResultados;
    private javax.swing.JPanel pnlTABLAPROCESOS;
    private javax.swing.JTable tblProcesos;
    public javax.swing.JTable tblRafagaDeTiempo;
    private javax.swing.JTable tblResultados;
    private javax.swing.JTextField txtcantidadProcesos;
    // End of variables declaration//GEN-END:variables
}
