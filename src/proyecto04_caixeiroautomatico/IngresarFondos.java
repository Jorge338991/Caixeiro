
package proyecto04_caixeiroautomatico;

import javax.swing.JOptionPane;


public class IngresarFondos extends javax.swing.JFrame {
    //ATRIBUTOS
    private ContaBancaria cliente;
    
    //METODOS
    //CONSTRUCTORES
    public IngresarFondos() {
        initComponents();
    }
    public IngresarFondos(ContaBancaria cliente) {
        this.cliente = cliente;
        initComponents();
    }
            


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAtras = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextFieldCantidade = new javax.swing.JTextField();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAtras.setText("ATRAS");
        jButtonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtrasActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("INGRESO DE FONDOS");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Teclee a cantidade que desexa ingresar:");

        jTextFieldCantidade.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextFieldCantidade.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 315, Short.MAX_VALUE)
                        .addComponent(jButtonAtras))
                    .addComponent(jTextField1)
                    .addComponent(jTextField2)
                    .addComponent(jTextFieldCantidade))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jButtonCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonAceptar)
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldCantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelar)
                    .addComponent(jButtonAceptar))
                .addGap(31, 31, 31)
                .addComponent(jButtonAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtrasActionPerformed
        Vp Vp1 = new Vp(cliente);
        Vp1.setVisible(true);
        Vp1.setTitle("CAIXEIRO AUTOMÁTICO");
        this.dispose();
    }//GEN-LAST:event_jButtonAtrasActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        Vp Vp1 = new Vp(cliente);
        Vp1.setVisible(true);
        Vp1.setTitle("CAIXEIRO AUTOMÁTICO");
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        int decision = JOptionPane.showConfirmDialog(null, "¿Está segura/o que desexa continuar ingresando? "+jTextFieldCantidade.getText()+" €", "Ingresar fondos:", JOptionPane.YES_NO_OPTION);
        System.out.println(decision);
        
        if(decision == 0){//se vale 0 e que aceptou.
            
           try{ 
           
                double cantidade = Double.parseDouble(jTextFieldCantidade.getText());//collemos a cadena introducida e convertimos textoa  double
                
                if(cantidade <=0 || cantidade%10 != 0){
                    
                    JOptionPane.showMessageDialog(null, "A cantidade introducida é erronea, revise que sexa cantidade positiva e múltipo de 10");
                    jTextFieldCantidade.setText("");//vaciamos textfield para que quede listo para ingresar a nova cantidade
                
                    
                }else if(cantidade>0 && cantidade%10 == 0){
                    cliente.setSaldo((cliente.getSaldo()+cantidade));
                    cliente.ingresarFondos(cantidade);
                    JOptionPane.showMessageDialog(null,"A operación realizouse con éxito");
                    Vp Vp1 = new Vp(cliente);
                    Vp1.setVisible(true);
                    Vp1.setTitle("CAIXEIRO AUTOMÁTICO");
                    this.dispose();
                     
                }
                
                
                
           }
           catch(NumberFormatException error){
               
               JOptionPane.showConfirmDialog(null,"ERROR. Revise a cantidade introducida e volva intentalo.","ERROR o itentar realizar o ingreso",JOptionPane.YES_OPTION);
               jTextFieldCantidade.setText("");

           }
            
        }else{//se vale 1 e que cancelou e se vale calquera outra cousa foi un fallo.
            System.out.println("cancelada");
            jTextFieldCantidade.setText("");
        }
    }//GEN-LAST:event_jButtonAceptarActionPerformed


    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarFondos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonAtras;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldCantidade;
    // End of variables declaration//GEN-END:variables
}
