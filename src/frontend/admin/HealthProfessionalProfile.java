/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.admin;

import backend.pojos.HealthProfessional;
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
public class HealthProfessionalProfile extends javax.swing.JFrame {

    private Logger log = Logger.getLogger(HealthProfessionalProfile.class);

    /**
     * Creates new form NewJFrame
     */
    public HealthProfessionalProfile(HealthProfessional hp) {
        
        initComponents();
        
        try {
            setFields(hp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(HealthProfessionalProfile.this,
                    e.getMessage(), "Erro ao carregar os dados do Profissional de saude", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setFields(HealthProfessional hp) {
        this.jLabelNamehp.setText(hp.getName());
        this.jLabelLastNamehp.setText(hp.getLastName());
        this.jLabelBithDatehp.setText(hp.getBirthDate());
        this.jLabelGenderhp.setText(hp.getGender());
        this.jLabelTelhp.setText(String.valueOf(hp.getNumTel()));
        this.jLabelNationalityhp.setText(hp.getNacionality());
        this.jLabelCChp.setText(String.valueOf(hp.getNumCC()));
        
        if (hp.getPicture().equals("profile")) {
            ImageIcon pic = new ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"));
            jLabelPhoto.setIcon(new ImageIcon(pic.getImage().getScaledInstance(
                    jLabelPhoto.getWidth(), jLabelPhoto.getHeight(), Image.SCALE_DEFAULT)));
        } else {
            jLabelPhoto.setIcon(new ImageIcon(getImageFromServer(hp.getPicture(), 90, 90)));
        }
    }

   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelHealthProfessionalProfile = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelBirthDate = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelCC = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelNationality = new javax.swing.JLabel();
        jLabelAdress = new javax.swing.JLabel();
        jLabelNIF = new javax.swing.JLabel();
        jLabelMaritalStatus = new javax.swing.JLabel();
        jLabelBloodType = new javax.swing.JLabel();
        jLabelInstitution = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jCheckBoxDevelopmentProfessional = new javax.swing.JCheckBox();
        jLabelNamehp = new javax.swing.JLabel();
        jLabelBithDatehp = new javax.swing.JLabel();
        jLabelTelhp = new javax.swing.JLabel();
        jLabelCChp = new javax.swing.JLabel();
        jLabelEmailhp = new javax.swing.JLabel();
        jLabelNIFhp = new javax.swing.JLabel();
        jLabelInstitutionhp = new javax.swing.JLabel();
        jLabelBloodTypehp = new javax.swing.JLabel();
        jLabelLastNamehp = new javax.swing.JLabel();
        jLabelGenderhp = new javax.swing.JLabel();
        jLabelNationalityhp = new javax.swing.JLabel();
        jLabelAdresshp = new javax.swing.JLabel();
        jLabelMaritalStatushp = new javax.swing.JLabel();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHealthProfessionalProfile.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelHealthProfessionalProfile.setText("Profissional de Saúde");
        jPanelInformation.add(jLabelHealthProfessionalProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanelInformation.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 90));

        jLabelName.setText("Nome:");
        jPanelInformation.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 55, -1, -1));

        jLabelBirthDate.setText("Data de nascimento:");
        jPanelInformation.add(jLabelBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 85, -1, -1));

        jLabelTel.setText("Nº Tel.:");
        jPanelInformation.add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 115, -1, -1));

        jLabelCC.setText(" Nº CC:");
        jPanelInformation.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 145, -1, -1));

        jLabelEmail.setText("Email:");
        jPanelInformation.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 175, -1, -1));

        jLabelLastName.setText("Apelido:");
        jPanelInformation.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 55, -1, -1));

        jLabelGender.setText("Sexo:");
        jPanelInformation.add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jLabelNationality.setText("Nacionalidade:");
        jPanelInformation.add(jLabelNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabelAdress.setText("Morada:");
        jPanelInformation.add(jLabelAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jLabelNIF.setText("  NIF:");
        jPanelInformation.add(jLabelNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 205, 30, -1));

        jLabelMaritalStatus.setText(" Estado Civil:");
        jPanelInformation.add(jLabelMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 205, -1, -1));

        jLabelBloodType.setText("  Grupo sanguíneo:");
        jPanelInformation.add(jLabelBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 265, -1, -1));

        jLabelInstitution.setText(" Instituição:");
        jPanelInformation.add(jLabelInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 235, -1, -1));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jButtonDelete.setText("Eliminar");
        jPanelInformation.add(jButtonDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jCheckBoxDevelopmentProfessional.setText("Profissional de desenvolvimento");
        jPanelInformation.add(jCheckBoxDevelopmentProfessional, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 230, -1));

        jLabelNamehp.setText("jLabel1");
        jPanelInformation.add(jLabelNamehp, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 44, 70, 30));

        jLabelBithDatehp.setText("jLabel2");
        jPanelInformation.add(jLabelBithDatehp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 84, 120, 20));

        jLabelTelhp.setText("jLabel3");
        jPanelInformation.add(jLabelTelhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 114, 50, 20));

        jLabelCChp.setText("jLabel4");
        jPanelInformation.add(jLabelCChp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 40, 20));

        jLabelEmailhp.setText("jLabel5");
        jPanelInformation.add(jLabelEmailhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 174, 50, 20));

        jLabelNIFhp.setText("jLabel6");
        jPanelInformation.add(jLabelNIFhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 50, 20));

        jLabelInstitutionhp.setText("jLabel7");
        jPanelInformation.add(jLabelInstitutionhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, 20));

        jLabelBloodTypehp.setText("jLabel8");
        jPanelInformation.add(jLabelBloodTypehp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 50, 20));

        jLabelLastNamehp.setText("jLabel9");
        jPanelInformation.add(jLabelLastNamehp, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 50, 20));

        jLabelGenderhp.setText("jLabel10");
        jPanelInformation.add(jLabelGenderhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 60, 20));

        jLabelNationalityhp.setText("jLabel11");
        jPanelInformation.add(jLabelNationalityhp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 60, 20));

        jLabelAdresshp.setText("jLabel12");
        jPanelInformation.add(jLabelAdresshp, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 70, 20));

        jLabelMaritalStatushp.setText("jLabel14");
        jPanelInformation.add(jLabelMaritalStatushp, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 50, 20));

        jLabelInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo_branco.jpg"))); // NOI18N
        jLabelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setMinimumSize(new java.awt.Dimension(680, 380));
        jLabelInformation.setPreferredSize(new java.awt.Dimension(680, 380));
        jPanelInformation.add(jLabelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelWallpaper.add(jPanelInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 380));

        jLabelwallpaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundos/fundo2.jpg"))); // NOI18N
        jPanelWallpaper.add(jLabelwallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new HealthProfessionalList().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JCheckBox jCheckBoxDevelopmentProfessional;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelAdresshp;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelBithDatehp;
    private javax.swing.JLabel jLabelBloodType;
    private javax.swing.JLabel jLabelBloodTypehp;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelCChp;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmailhp;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelGenderhp;
    private javax.swing.JLabel jLabelHealthProfessionalProfile;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelInstitution;
    private javax.swing.JLabel jLabelInstitutionhp;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLastNamehp;
    private javax.swing.JLabel jLabelMaritalStatus;
    private javax.swing.JLabel jLabelMaritalStatushp;
    private javax.swing.JLabel jLabelNIF;
    private javax.swing.JLabel jLabelNIFhp;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNamehp;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelNationalityhp;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelTelhp;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    // End of variables declaration//GEN-END:variables

    private Image getImageFromServer(String picture, int with, int heigth) {
        try {
            URL url = new URL("http://localhost/mu-pen-web/imagens/HealthProfessionals/" + picture.trim());
            log.debug("\n\tProfile Image: " + url.toString());
            BufferedImage image = ImageIO.read(url);
            ImageIcon pic = new ImageIcon(image);
            return pic.getImage().getScaledInstance(with, heigth, Image.SCALE_DEFAULT);
        } catch (MalformedURLException ex) {
            log.error(ex.getMessage());
            throw new RuntimeException("Erro ao carregar imagem");
        } catch (IOException ex) {
            log.error(ex.getMessage());
            throw new RuntimeException("Erro ao carregar imagem");
        }
    }
}
