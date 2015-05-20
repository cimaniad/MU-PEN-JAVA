/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend.admin;

import backend.pojos.Admin;
import backend.ws.AdminWS;
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
public class AdminProfile extends javax.swing.JFrame {

    private Logger log = Logger.getLogger(AdminProfile.class);
    private AdminWS adminWS;
    private Admin a;

    /**
     * Creates new form AdminProfile
     */
    public AdminProfile(int idAdmin) {
        try {

            adminWS = new AdminWS();
            a = adminWS.getAdminById(idAdmin);
            initComponents();

            setFields(a);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(AdminProfile.this,
                    e.getMessage(), "Erro ao carregar os dados do Administrador", JOptionPane.ERROR_MESSAGE);
        }
    }

    public AdminProfile() {
    }

    private void setFields(Admin a) {
        this.jLabelNamea.setText(a.getName());
        this.jLabelLastNamea.setText(a.getLastName());
        this.jLabelBirthDatea.setText(a.getBirthDate());
        this.jLabelTela.setText(String.valueOf(a.getNumTel()));
        this.jLabelNationalitya.setText(a.getNationality());
        this.jLabelCCa.setText(String.valueOf(a.getNumCC()));
        this.jLabelEmaila.setText(a.getEmail());
        this.jLabelAdressa.setText(a.getAdress());
        this.jLabelBloodTypea.setText(a.getBloodGroup());

        if (a.getPicture().equals("profile")) {
            ImageIcon pic = new ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"));
            jLabelPhoto.setIcon(new ImageIcon(pic.getImage().getScaledInstance(
                    jLabelPhoto.getWidth(), jLabelPhoto.getHeight(), Image.SCALE_DEFAULT)));
        } else {
            jLabelPhoto.setIcon(new ImageIcon(getImageFromServer(a.getPicture(), 90, 90)));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelProfile = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelBirthDate = new javax.swing.JLabel();
        jLabelTel = new javax.swing.JLabel();
        jLabelCC = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jLabelNationality = new javax.swing.JLabel();
        jLabelAdress = new javax.swing.JLabel();
        jLabelBloodType = new javax.swing.JLabel();
        jLabelNamea = new javax.swing.JLabel();
        jLabelLastNamea = new javax.swing.JLabel();
        jLabelTela = new javax.swing.JLabel();
        jLabelBirthDatea = new javax.swing.JLabel();
        jLabelCCa = new javax.swing.JLabel();
        jLabelBloodTypea = new javax.swing.JLabel();
        jLabelNationalitya = new javax.swing.JLabel();
        jLabelAdressa = new javax.swing.JLabel();
        jLabelEmaila = new javax.swing.JLabel();
        jButtonEditProfile = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setMinimumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setMinimumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelProfile.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelProfile.setText("Administrador");
        jPanelInformation.add(jLabelProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));
        jPanelInformation.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 90, 90));

        jLabelName.setText("Nome:");
        jPanelInformation.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 55, -1, -1));

        jLabelBirthDate.setText("Data de nascimento:");
        jPanelInformation.add(jLabelBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 115, -1, -1));

        jLabelTel.setText("Nº Tel:");
        jLabelTel.setToolTipText("");
        jPanelInformation.add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 85, -1, -1));

        jLabelCC.setText(" Nº CC:");
        jPanelInformation.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 145, -1, -1));

        jLabelEmail.setText("Email:");
        jPanelInformation.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 145, -1, -1));

        jLabelLastName.setText("Apelido:");
        jPanelInformation.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(441, 55, -1, -1));

        jLabelNationality.setText("Nacionalidade:");
        jPanelInformation.add(jLabelNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 115, -1, -1));

        jLabelAdress.setText("Morada:");
        jPanelInformation.add(jLabelAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 175, -1, -1));

        jLabelBloodType.setText("         Grupo sanguíneo:  ");
        jPanelInformation.add(jLabelBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 85, 140, -1));

        jLabelNamea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNamea.setText("jLabel1");
        jPanelInformation.add(jLabelNamea, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 49, 180, 30));

        jLabelLastNamea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelLastNamea.setText("jLabel6");
        jPanelInformation.add(jLabelLastNamea, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 49, 180, 30));

        jLabelTela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTela.setText("jLabel2");
        jPanelInformation.add(jLabelTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 79, 180, 30));

        jLabelBirthDatea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBirthDatea.setText("jLabel3");
        jPanelInformation.add(jLabelBirthDatea, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 109, 180, 30));

        jLabelCCa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelCCa.setText("jLabel9");
        jPanelInformation.add(jLabelCCa, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 139, 180, 30));

        jLabelBloodTypea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelBloodTypea.setText("jLabel7");
        jPanelInformation.add(jLabelBloodTypea, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 79, 180, 30));

        jLabelNationalitya.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNationalitya.setText("jLabel8");
        jPanelInformation.add(jLabelNationalitya, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 109, 180, 30));

        jLabelAdressa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelAdressa.setText("jLabel5");
        jPanelInformation.add(jLabelAdressa, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 169, 180, 30));

        jLabelEmaila.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmaila.setText("jLabel4");
        jPanelInformation.add(jLabelEmaila, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 139, 180, 30));

        jButtonEditProfile.setText("Editar Perfil");
        jButtonEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditProfileActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonEditProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

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

    private void jButtonEditProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditProfileActionPerformed
        new AdminProfileEdit().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonEditProfileActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new AdminMenu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonEditProfile;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelAdressa;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelBirthDatea;
    private javax.swing.JLabel jLabelBloodType;
    private javax.swing.JLabel jLabelBloodTypea;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelCCa;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelEmaila;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLastNamea;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNamea;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelNationalitya;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelTela;
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
