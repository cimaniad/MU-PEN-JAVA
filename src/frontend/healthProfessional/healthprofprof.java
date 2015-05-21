/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.healthProfessional;

import backend.pojos.HealthProfessional;
import backend.ws.HealthProfessionalWS;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class healthprofprof extends javax.swing.JFrame {

    private Logger log = Logger.getLogger(HealthProfessionalProfile.class);
    private HealthProfessionalWS hpWS;
    private HealthProfessional hp;

    public healthprofprof(int idHealthProfessional) {

        try {
            initComponents();
            hpWS = new HealthProfessionalWS();
            hp = hpWS.getHealthProfessionalById(idHealthProfessional);
//            setFields(hp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(healthprofprof.this,
                    e.getMessage(), "Erro ao carregar os dados do Profissional de Saúde", JOptionPane.ERROR_MESSAGE);
        }
    }

    healthprofprof() {
    }

//    private void setFields(HealthProfessional hp) {
//        this.jTextFieldName.setText(hp.getName());
//        this.jTextFieldGender.setText(hp.getLastName());
//        this.jTextFieldBirthDate.setText(hp.getBirthDate());
//        this.jTextFieldGender.setText(hp.getGender());
//        this.jTextFieldMaritalStatus.setText(String.valueOf(hp.getNumTel()));
//        this.jTextFieldBloodGroup.setText(hp.getNacionality());
//        this.jTextFieldNacio.setText(hp.getAdress());
//        this.jTextFieldAdress.setText(hp.getEmail());
//        this.jTextFieldInstitution.setText(String.valueOf(hp.getNumCC()));
//        this.jTextFieldNIF.setText(String.valueOf(hp.getNif()));
//        this.jTextFieldMaritalStatus.setText(hp.getMaritalStatus());
//        this.jTextFieldLastName.setText(hp.getBloodGroup());
//        this.jTextFieldInstitution.setText(hp.getInstitution());
//
//        if (hp.getPicture().equals("profile")) {
//            ImageIcon pic = new ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"));
//            jLabelPhoto.setIcon(new ImageIcon(pic.getImage().getScaledInstance(
//                    jLabelPhoto.getWidth(), jLabelPhoto.getHeight(), Image.SCALE_DEFAULT)));
//        } else {
//            jLabelPhoto.setIcon(new ImageIcon(getImageFromServer(hp.getPicture(), 90, 90)));
//        }
//
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper1 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Profissional de Saúde");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 150, 30));

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, -1));

        jButton2.setText("Voltar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, -1, -1));

        jLabelInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jLabelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setMinimumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setPreferredSize(new java.awt.Dimension(680, 380));
        add(jLabelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 650, 330));

        jLabelwallpaper1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        add(jLabelwallpaper1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 720, 510));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new HealthProfessionalEdit(hp).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new HealthProfessionalMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JLabel jLabelwallpaper1;
    // End of variables declaration//GEN-END:variables
}
