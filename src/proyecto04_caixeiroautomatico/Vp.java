/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto04_caixeiroautomatico;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.JOptionPane;



import proyecto04_caixeiroautomatico.ContaBancaria;

/**
 *
 * @author WEB
 */
public class Vp extends javax.swing.JFrame {

    //ATRIBUTOS
    private ContaBancaria cliente;
    
    //METODOS
    //CONSTRUCTOR
    public Vp() {
        initComponents();
    }
    
    
    public Vp(ContaBancaria cliente) {
        
        this.cliente = cliente;
        initComponents();
    }

    //OUTROS MÉTODOS
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSair = new javax.swing.JButton();
        jButtonConsultarSaldo = new javax.swing.JButton();
        jButtonIngresarFondos = new javax.swing.JButton();
        jButtonRetirarFondos = new javax.swing.JButton();
        jButtonUltimosMovimientos = new javax.swing.JButton();
        jButtonInformacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSair.setText("SAÍR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonConsultarSaldo.setText("Consultar Saldo");
        jButtonConsultarSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarSaldoActionPerformed(evt);
            }
        });

        jButtonIngresarFondos.setText("Ingresar fondos");
        jButtonIngresarFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarFondosActionPerformed(evt);
            }
        });

        jButtonRetirarFondos.setText("Retirar fondos");
        jButtonRetirarFondos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRetirarFondosActionPerformed(evt);
            }
        });

        jButtonUltimosMovimientos.setText("Últimos movimientos");
        jButtonUltimosMovimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUltimosMovimientosActionPerformed(evt);
            }
        });

        jButtonInformacion.setText("Información");
        jButtonInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSair)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(jButtonRetirarFondos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonUltimosMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonIngresarFondos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngresarFondos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRetirarFondos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButtonUltimosMovimientos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButtonSair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        
        
        try {
            
            int num = cliente.traerMovimientos().length;
            
            FileWriter salida = new FileWriter("movimientos.txt");
            
            for(int i=0;i<num;i++){
                
                salida.write(cliente.traerMovimientos()[i]+"\n");

            }
            salida.close();
            System.exit(0);
            
        } catch (IOException ex) {
            Logger.getLogger(Vp.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonConsultarSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarSaldoActionPerformed
        ConsultarSaldo consultaSaldo = new ConsultarSaldo(cliente);
        consultaSaldo.setVisible(true);
        consultaSaldo.setTitle("Consulta de saldo");
        this.dispose();
    }//GEN-LAST:event_jButtonConsultarSaldoActionPerformed

    private void jButtonInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformacionActionPerformed
        
        Informacion info = new Informacion(cliente);
        info.setVisible(true);
        info.setTitle("Información");
        this.dispose();
    }//GEN-LAST:event_jButtonInformacionActionPerformed

    private void jButtonIngresarFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarFondosActionPerformed
        
        IngresarFondos ingresarFondos = new IngresarFondos(cliente);
        ingresarFondos.setVisible(true);
        ingresarFondos.setTitle("Ingreso de fondos");
        this.dispose();
    }//GEN-LAST:event_jButtonIngresarFondosActionPerformed

    private void jButtonRetirarFondosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRetirarFondosActionPerformed
        RetirarFondos retirarFondos = new RetirarFondos(cliente);
        retirarFondos.setVisible(true);
        retirarFondos.setTitle("Retirar fondos");
        this.dispose();
    }//GEN-LAST:event_jButtonRetirarFondosActionPerformed

    private void jButtonUltimosMovimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUltimosMovimientosActionPerformed
        UltimosMovimientos ultimosMovimientos = new UltimosMovimientos(cliente);
        ultimosMovimientos.setVisible(true);
        ultimosMovimientos.setTitle("Ultimos movimientos");
        this.dispose();
    }//GEN-LAST:event_jButtonUltimosMovimientosActionPerformed

    public void gardar_movimientos() throws IOException{
     
         FileWriter ficheiro = new FileWriter("movimientos.txt");
         
         
         ficheiro.write("hola\n");
         
         ficheiro.close();
     
     }
    
    
    /***
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Vp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultarSaldo;
    private javax.swing.JButton jButtonInformacion;
    private javax.swing.JButton jButtonIngresarFondos;
    private javax.swing.JButton jButtonRetirarFondos;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonUltimosMovimientos;
    // End of variables declaration//GEN-END:variables
}
