package caixa;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 *
 * @author Mauricio
 */
public class Form extends javax.swing.JFrame {
    
    List <Senha> password;
    List <Cliente> atendimento;
    
    int cont, i, atend;
    
    private void requestPassword(int x, String t){
    //Iterator<Senha> itr = password.iterator();
        for(i = 0; i < password.size(); i++){
            if(password.get(i).getSenha().contains(t)){
                lbSenha.setText(password.get(i).getSenha()+"-"+password.get(i).getCont());
                lbCaixa.setText("CAIXA "+ x);
                password.remove(i);
                return;
            }
        }
    
        if(password.size() > 0){
            lbSenha.setText(password.get(0).getSenha()+"-"+password.get(0).getCont());
            lbCaixa.setText("CAIXA "+ x);
            password.remove(0);
        }
                
    }
    
    public Form() {
        initComponents();
        setLocationRelativeTo(null);
        cont = 0;
        password = new ArrayList<Senha>();
    
    }
    
    
    
    public void Atend() {
        atendimento = new ArrayList<Cliente>();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnComum = new javax.swing.JButton();
        btnRapido = new javax.swing.JButton();
        btnPrioritario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfSenha = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnCaixa1 = new javax.swing.JButton();
        btnCaixa2 = new javax.swing.JButton();
        btnCaixa3 = new javax.swing.JButton();
        btnCaixa4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        lbCaixa = new javax.swing.JLabel();
        tfCliente = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setText("Escolha seu tipo de atendimento");

        btnComum.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnComum.setText("Comum");
        btnComum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComumActionPerformed(evt);
            }
        });

        btnRapido.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnRapido.setText("Rápido");
        btnRapido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRapidoActionPerformed(evt);
            }
        });

        btnPrioritario.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btnPrioritario.setText("Prioritário");
        btnPrioritario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrioritarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Sua senha é:");

        tfSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfSenha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfSenha.setToolTipText("");
        tfSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnComum)
                        .addGap(18, 18, 18)
                        .addComponent(btnRapido)
                        .addGap(18, 18, 18)
                        .addComponent(btnPrioritario))
                    .addComponent(jLabel4)
                    .addComponent(tfSenha))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComum)
                    .addComponent(btnRapido)
                    .addComponent(btnPrioritario))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnCaixa1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnCaixa1.setText("Caixa 1");
        btnCaixa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa1ActionPerformed(evt);
            }
        });

        btnCaixa2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnCaixa2.setText("Caixa 2");
        btnCaixa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa2ActionPerformed(evt);
            }
        });

        btnCaixa3.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnCaixa3.setText("Caixa 3");
        btnCaixa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa3ActionPerformed(evt);
            }
        });

        btnCaixa4.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        btnCaixa4.setText("Caixa 4");
        btnCaixa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaixa4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCaixa1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaixa2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCaixa3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCaixa4)))
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaixa1)
                    .addComponent(btnCaixa2))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCaixa3)
                    .addComponent(btnCaixa4))
                .addGap(44, 44, 44))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Para Clientes:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setText("Para Caixas:");

        lbSenha.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbSenha.setText("C-0");

        lbCaixa.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lbCaixa.setText("CAIXA 1");

        tfCliente.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        tfCliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfCliente.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(lbSenha)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(401, 401, 401)
                                .addComponent(lbCaixa))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbCaixa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(tfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCaixa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa3ActionPerformed
            requestPassword(3, "R");
    }//GEN-LAST:event_btnCaixa3ActionPerformed

    private void tfSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaActionPerformed

    private void btnRapidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRapidoActionPerformed
            cont++;
            Senha Senha = new Senha("R", cont);
            password.add(Senha);
            
            tfSenha.setText(Senha.getSenha() + "-" + String.valueOf(Senha.getCont()));
    }//GEN-LAST:event_btnRapidoActionPerformed

    private void btnComumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComumActionPerformed
            cont++;
            atend = cont;
            Senha Senha = new Senha("C", cont);
            Cliente Cliente = new Cliente ("C", atend);
            password.add(Senha);
            atend = cont;
            System.out.println(Cliente.toString());
            //System.out.println(Cliente.getCliente() + "-" + String.valueOf(Cliente.getAtend()));
            tfSenha.setText(Senha.getSenha() + "-" + String.valueOf(Senha.getCont()));
    }//GEN-LAST:event_btnComumActionPerformed

    private void btnPrioritarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrioritarioActionPerformed
            cont++;
            Senha Senha = new Senha("P", cont);
            password.add(Senha);
            tfSenha.setText(Senha.getSenha() + "-" + String.valueOf(Senha.getCont()));
    }//GEN-LAST:event_btnPrioritarioActionPerformed

    private void btnCaixa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa1ActionPerformed
        requestPassword(1, "P");
    }//GEN-LAST:event_btnCaixa1ActionPerformed

    private void btnCaixa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa2ActionPerformed
        requestPassword(2, "R");
    }//GEN-LAST:event_btnCaixa2ActionPerformed

    private void btnCaixa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaixa4ActionPerformed
        requestPassword(4, "C");
    }//GEN-LAST:event_btnCaixa4ActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaixa1;
    private javax.swing.JButton btnCaixa2;
    private javax.swing.JButton btnCaixa3;
    private javax.swing.JButton btnCaixa4;
    private javax.swing.JButton btnComum;
    private javax.swing.JButton btnPrioritario;
    private javax.swing.JButton btnRapido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbCaixa;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JTextField tfCliente;
    private javax.swing.JTextField tfSenha;
    // End of variables declaration//GEN-END:variables
}
