/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend.administrador;



/**
 *
 */
public class RegistarProfissional extends javax.swing.JFrame {

    /**
     * Creates new form RegistarProfissionalDeDesenvolvimento
     */
    public RegistarProfissional() {
        initComponents();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelFundoRegistar = new javax.swing.JPanel();
        jComboBoxSexo = new javax.swing.JComboBox();
        jLabelUtente = new javax.swing.JLabel();
        jLabelApelido = new javax.swing.JLabel();
        jTextFieldNacionalidade = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jButtonRegistar = new javax.swing.JButton();
        jTextFieldMorada = new javax.swing.JTextField();
        jLabelTel = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();
        jButtonFoto = new javax.swing.JButton();
        jLabelFoto = new javax.swing.JLabel();
        jComboBoxSangue = new javax.swing.JComboBox();
        jLabelCC = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jLabelTipo = new javax.swing.JLabel();
        jLabelNIF = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldApelido = new javax.swing.JTextField();
        jLabelMorada = new javax.swing.JLabel();
        jLabelSangue = new javax.swing.JLabel();
        jTextFieldUtente = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelEstadoCivil = new javax.swing.JLabel();
        jLabelDataNasc = new javax.swing.JLabel();
        jComboBoxEstadoCivil = new javax.swing.JComboBox();
        jTextFieldCC = new javax.swing.JTextField();
        jLabelNacionalidade = new javax.swing.JLabel();
        jTextFieldNIF = new javax.swing.JTextField();
        jTextFieldinstituicao = new javax.swing.JTextField();
        jLabelInstituicao = new javax.swing.JLabel();
        jTextFieldTipo1 = new javax.swing.JTextField();
        jCheckBoxProfDesen = new javax.swing.JCheckBox();
        jDateNascimento = new com.toedter.calendar.JDateChooser();
        jLabelFundoRegistar = new javax.swing.JLabel();
        jLabelFundoPag = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanelFundoRegistar.setBackground(new java.awt.Color(204, 204, 204));
        jPanelFundoRegistar.setMaximumSize(new java.awt.Dimension(600, 400));
        jPanelFundoRegistar.setLayout(null);

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Feminino", "Masculino" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });
        jPanelFundoRegistar.add(jComboBoxSexo);
        jComboBoxSexo.setBounds(526, 62, 139, 20);

        jLabelUtente.setText("Nº Utente:");
        jPanelFundoRegistar.add(jLabelUtente);
        jLabelUtente.setBounds(470, 149, 52, 14);

        jLabelApelido.setText("Apelido:");
        jPanelFundoRegistar.add(jLabelApelido);
        jLabelApelido.setBounds(483, 37, 39, 14);
        jPanelFundoRegistar.add(jTextFieldNacionalidade);
        jTextFieldNacionalidade.setBounds(307, 205, 139, 20);

        jLabelNome.setText("Nome:");
        jPanelFundoRegistar.add(jLabelNome);
        jLabelNome.setBounds(272, 37, 31, 14);

        jLabelSexo.setText("Sexo:");
        jPanelFundoRegistar.add(jLabelSexo);
        jLabelSexo.setBounds(494, 65, 28, 14);

        jButtonRegistar.setText("Registar");
        jButtonRegistar.setMaximumSize(new java.awt.Dimension(75, 25));
        jButtonRegistar.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonRegistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistarActionPerformed(evt);
            }
        });
        jPanelFundoRegistar.add(jButtonRegistar);
        jButtonRegistar.setBounds(300, 320, 170, 50);
        jPanelFundoRegistar.add(jTextFieldMorada);
        jTextFieldMorada.setBounds(307, 90, 358, 20);

        jLabelTel.setText("Nº Tel.:");
        jPanelFundoRegistar.add(jLabelTel);
        jLabelTel.setBounds(263, 119, 37, 14);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.setMaximumSize(new java.awt.Dimension(75, 25));
        jButtonVoltar.setMinimumSize(new java.awt.Dimension(75, 25));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });
        jPanelFundoRegistar.add(jButtonVoltar);
        jButtonVoltar.setBounds(500, 320, 170, 50);

        jButtonFoto.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButtonFoto.setText("Inserir Foto");
        jButtonFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFotoActionPerformed(evt);
            }
        });
        jPanelFundoRegistar.add(jButtonFoto);
        jButtonFoto.setBounds(39, 140, 100, 25);

        jLabelFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"))); // NOI18N
        jPanelFundoRegistar.add(jLabelFoto);
        jLabelFoto.setBounds(50, 60, 80, 80);

        jComboBoxSangue.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A-", "AB+", "AB-", "O+", "O-" }));
        jPanelFundoRegistar.add(jComboBoxSangue);
        jComboBoxSangue.setBounds(307, 236, 139, 20);

        jLabelCC.setText("Nº C.C:");
        jPanelFundoRegistar.add(jLabelCC);
        jLabelCC.setBounds(263, 146, 40, 22);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        jPanelFundoRegistar.add(jTextFieldNome);
        jTextFieldNome.setBounds(307, 34, 139, 20);
        jPanelFundoRegistar.add(jTextFieldTel);
        jTextFieldTel.setBounds(307, 116, 139, 20);

        jLabelTipo.setText("Tipo:");
        jPanelFundoRegistar.add(jLabelTipo);
        jLabelTipo.setBounds(500, 210, 30, 14);

        jLabelNIF.setText("  NIF:");
        jPanelFundoRegistar.add(jLabelNIF);
        jLabelNIF.setBounds(273, 177, 30, 14);

        jLabelEmail.setText("  E-mail:");
        jPanelFundoRegistar.add(jLabelEmail);
        jLabelEmail.setBounds(483, 119, 39, 14);
        jPanelFundoRegistar.add(jTextFieldApelido);
        jTextFieldApelido.setBounds(526, 34, 139, 20);

        jLabelMorada.setText("Morada:");
        jPanelFundoRegistar.add(jLabelMorada);
        jLabelMorada.setBounds(263, 93, 40, 14);

        jLabelSangue.setText("Grupo Sanguíneo:  ");
        jPanelFundoRegistar.add(jLabelSangue);
        jLabelSangue.setBounds(213, 239, 92, 14);
        jPanelFundoRegistar.add(jTextFieldUtente);
        jTextFieldUtente.setBounds(526, 146, 139, 20);
        jPanelFundoRegistar.add(jTextFieldEmail);
        jTextFieldEmail.setBounds(526, 116, 139, 20);

        jLabelEstadoCivil.setText("Estado Civil:");
        jPanelFundoRegistar.add(jLabelEstadoCivil);
        jLabelEstadoCivil.setBounds(464, 177, 59, 14);

        jLabelDataNasc.setText("Data de Nascimento:");
        jPanelFundoRegistar.add(jLabelDataNasc);
        jLabelDataNasc.setBounds(203, 60, 100, 24);

        jComboBoxEstadoCivil.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro", "Casado", "Divorciado" }));
        jPanelFundoRegistar.add(jComboBoxEstadoCivil);
        jComboBoxEstadoCivil.setBounds(527, 174, 138, 20);
        jPanelFundoRegistar.add(jTextFieldCC);
        jTextFieldCC.setBounds(307, 146, 139, 20);

        jLabelNacionalidade.setText("  Nacionalidade:");
        jPanelFundoRegistar.add(jLabelNacionalidade);
        jLabelNacionalidade.setBounds(224, 208, 79, 14);
        jPanelFundoRegistar.add(jTextFieldNIF);
        jTextFieldNIF.setBounds(307, 174, 139, 20);

        jTextFieldinstituicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldinstituicaoActionPerformed(evt);
            }
        });
        jPanelFundoRegistar.add(jTextFieldinstituicao);
        jTextFieldinstituicao.setBounds(530, 240, 130, 20);

        jLabelInstituicao.setText("Instituição:");
        jPanelFundoRegistar.add(jLabelInstituicao);
        jLabelInstituicao.setBounds(470, 240, 54, 14);

        jTextFieldTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipo1ActionPerformed(evt);
            }
        });
        jPanelFundoRegistar.add(jTextFieldTipo1);
        jTextFieldTipo1.setBounds(527, 205, 138, 20);

        jCheckBoxProfDesen.setText("Profissional de Desenvolvimento");
        jCheckBoxProfDesen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxProfDesenActionPerformed(evt);
            }
        });
        jPanelFundoRegistar.add(jCheckBoxProfDesen);
        jCheckBoxProfDesen.setBounds(303, 270, 190, 23);
        jPanelFundoRegistar.add(jDateNascimento);
        jDateNascimento.setBounds(310, 60, 140, 20);

        jLabelFundoRegistar.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabelFundoRegistar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jPanelFundoRegistar.add(jLabelFundoRegistar);
        jLabelFundoRegistar.setBounds(0, 0, 680, 390);

        jPanel1.add(jPanelFundoRegistar);
        jPanelFundoRegistar.setBounds(10, 100, 680, 390);

        jLabelFundoPag.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanel1.add(jLabelFundoPag);
        jLabelFundoPag.setBounds(0, 0, 710, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jButtonRegistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFotoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldinstituicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldinstituicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldinstituicaoActionPerformed

    private void jTextFieldTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipo1ActionPerformed

    private void jCheckBoxProfDesenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxProfDesenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxProfDesenActionPerformed

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
            java.util.logging.Logger.getLogger(RegistarProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarProfissional.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistarProfissional().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFoto;
    private javax.swing.JButton jButtonRegistar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JCheckBox jCheckBoxProfDesen;
    private javax.swing.JComboBox jComboBoxEstadoCivil;
    private javax.swing.JComboBox jComboBoxSangue;
    private javax.swing.JComboBox jComboBoxSexo;
    private com.toedter.calendar.JDateChooser jDateNascimento;
    private javax.swing.JLabel jLabelApelido;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEstadoCivil;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelFundoPag;
    private javax.swing.JLabel jLabelFundoRegistar;
    private javax.swing.JLabel jLabelInstituicao;
    private javax.swing.JLabel jLabelMorada;
    private javax.swing.JLabel jLabelNIF;
    private javax.swing.JLabel jLabelNacionalidade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelSangue;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JLabel jLabelUtente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelFundoRegistar;
    private javax.swing.JTextField jTextFieldApelido;
    private javax.swing.JTextField jTextFieldCC;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMorada;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldNacionalidade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldTel;
    private javax.swing.JTextField jTextFieldTipo1;
    private javax.swing.JTextField jTextFieldUtente;
    private javax.swing.JTextField jTextFieldinstituicao;
    // End of variables declaration//GEN-END:variables



}
