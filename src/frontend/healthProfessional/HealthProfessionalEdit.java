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
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;
import sun.misc.BASE64Encoder;


/**
 *
 * @author jorge
 */
public class HealthProfessionalEdit extends javax.swing.JFrame {

    private Logger log = Logger.getLogger(frontend.admin.HealthProfessionalProfile.class);
    private HealthProfessional hp;
    private BufferedImage pic = null;
    
    /**
     * Creates new form NewJFrame
     */
    public HealthProfessionalEdit(HealthProfessional hp) {
        initComponents();
        this.hp = hp;
        try {
            setFields(hp);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frontend.healthProfessional.HealthProfessionalEdit.this,
                    e.getMessage(), "Erro ao carregar o seu perfil", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setFields(HealthProfessional hp) {
        this.jTextFieldName.setText(hp.getName());
        this.jTextFieldLastName.setText(hp.getLastName());
//        this.jDateChooserBirth.setDate(hp.getBirthDate());
        this.jComboBoxGender.setSelectedItem(hp.getGender());
        this.jTextFieldTel.setText(String.valueOf(hp.getNumTel()));
        this.jTextFieldNationality.setText(hp.getNacionality());
        this.jTextFieldCC.setText(String.valueOf(hp.getNumCC()));
        this.jTextFieldEmail.setText(hp.getEmail());
        this.jTextFieldAdress.setText(hp.getAdress());
        this.jTextFieldNIF.setText(String.valueOf(hp.getNif()));
        this.jComboBoxMaritalStatus.setSelectedItem(hp.getMaritalStatus());
        this.jTextFieldInstitution.setText(hp.getInstitution());
        this.jComboBoxBloodType.setSelectedItem(hp.getBloodGroup());

        if (hp.getPicture().equals("profile")) {
            ImageIcon pic = new ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"));
            jLabelPhoto.setIcon(new ImageIcon(pic.getImage().getScaledInstance(
                    jLabelPhoto.getWidth(), jLabelPhoto.getHeight(), Image.SCALE_DEFAULT)));
        } else {
            jLabelPhoto.setIcon(new ImageIcon(getImageFromServer(hp.getPicture(), 90, 90)));
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

        jPanelWallpaper = new javax.swing.JPanel();
        jPanelInformation = new javax.swing.JPanel();
        jLabelHealthProfessionalEdit = new javax.swing.JLabel();
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
        jButtonEdit = new javax.swing.JButton();
        jButtonBack = new javax.swing.JButton();
        jComboBoxGender = new javax.swing.JComboBox();
        jComboBoxBloodType = new javax.swing.JComboBox();
        jComboBoxMaritalStatus = new javax.swing.JComboBox();
        jCheckBoxDevelopmentProfessional = new javax.swing.JCheckBox();
        jDateChooserBirth = new com.toedter.calendar.JDateChooser();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldTel = new javax.swing.JTextField();
        jTextFieldCC = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldNationality = new javax.swing.JTextField();
        jTextFieldAdress = new javax.swing.JTextField();
        jTextFieldNIF = new javax.swing.JTextField();
        jTextFieldInstitution = new javax.swing.JTextField();
        jButtonEditPhoto = new javax.swing.JButton();
        jLabelInformation = new javax.swing.JLabel();
        jLabelwallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(705, 520));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelWallpaper.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanelWallpaper.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelInformation.setMaximumSize(new java.awt.Dimension(680, 380));
        jPanelInformation.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelHealthProfessionalEdit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelHealthProfessionalEdit.setText("Editar Profissional de Saúde");
        jPanelInformation.add(jLabelHealthProfessionalEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabelPhoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fotos/perfil.PNG"))); // NOI18N
        jPanelInformation.add(jLabelPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabelName.setText("Nome:");
        jPanelInformation.add(jLabelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 55, -1, -1));

        jLabelBirthDate.setText("Data de nascimento:");
        jPanelInformation.add(jLabelBirthDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 85, -1, -1));

        jLabelTel.setText("Nº Tel.:");
        jPanelInformation.add(jLabelTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 115, -1, -1));

        jLabelCC.setText(" Nº CC:");
        jPanelInformation.add(jLabelCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 145, -1, -1));

        jLabelEmail.setText("Email:");
        jPanelInformation.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 145, -1, -1));

        jLabelLastName.setText("Apelido:");
        jPanelInformation.add(jLabelLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 55, -1, -1));

        jLabelGender.setText("Sexo:");
        jPanelInformation.add(jLabelGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 85, -1, -1));

        jLabelNationality.setText("Nacionalidade:");
        jPanelInformation.add(jLabelNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 115, -1, -1));

        jLabelAdress.setText("Morada:");
        jPanelInformation.add(jLabelAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 175, -1, -1));

        jLabelNIF.setText("  NIF:");
        jPanelInformation.add(jLabelNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 205, 30, -1));

        jLabelMaritalStatus.setText(" Estado Civil:");
        jPanelInformation.add(jLabelMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 205, -1, -1));

        jLabelBloodType.setText("  Grupo sanguíneo:");
        jPanelInformation.add(jLabelBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 265, -1, -1));

        jLabelInstitution.setText(" Instituição:");
        jPanelInformation.add(jLabelInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 235, -1, -1));

        jButtonEdit.setText("Editar");
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));

        jButtonBack.setText("Voltar");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });
        jPanelInformation.add(jButtonBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, -1, -1));

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", " " }));
        jPanelInformation.add(jComboBoxGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 170, -1));

        jComboBoxBloodType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "O+", "O-", "A+", "A-", "B+", "B-", "AB+", "AB-" }));
        jPanelInformation.add(jComboBoxBloodType, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 170, -1));

        jComboBoxMaritalStatus.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro", "Casado", "Divorciado", "Viúvo" }));
        jPanelInformation.add(jComboBoxMaritalStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 170, -1));

        jCheckBoxDevelopmentProfessional.setText("Profissional de desenvolvimento");
        jCheckBoxDevelopmentProfessional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDevelopmentProfessionalActionPerformed(evt);
            }
        });
        jPanelInformation.add(jCheckBoxDevelopmentProfessional, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 180, -1));

        jDateChooserBirth.setDoubleBuffered(false);
        jPanelInformation.add(jDateChooserBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 170, -1));
        jPanelInformation.add(jTextFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 170, -1));
        jPanelInformation.add(jTextFieldTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 170, -1));
        jPanelInformation.add(jTextFieldCC, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 170, -1));
        jPanelInformation.add(jTextFieldEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 170, -1));
        jPanelInformation.add(jTextFieldLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 170, -1));
        jPanelInformation.add(jTextFieldNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 170, -1));

        jTextFieldAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAdressActionPerformed(evt);
            }
        });
        jPanelInformation.add(jTextFieldAdress, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 430, -1));

        jTextFieldNIF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNIFActionPerformed(evt);
            }
        });
        jPanelInformation.add(jTextFieldNIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 170, -1));
        jPanelInformation.add(jTextFieldInstitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 170, -1));

        jButtonEditPhoto.setText("Editar foto");
        jPanelInformation.add(jButtonEditPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

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

    
    
    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        try {
            HealthProfessional hp = loadHealthProfessionalFromPanel();
            HealthProfessionalWS hpWS = new HealthProfessionalWS();
            hpWS.saveEditHealthProfessional(hp);
            new healthprofprof().setVisible(true);
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(HealthProfessionalEdit.this,
                    e.getMessage(), "Erro ao editar perfil", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jCheckBoxDevelopmentProfessionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDevelopmentProfessionalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDevelopmentProfessionalActionPerformed

    private void jTextFieldAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAdressActionPerformed

    private void jTextFieldNIFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNIFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNIFActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        new healthprofprof().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

     private HealthProfessional loadHealthProfessionalFromPanel() {
        String warn = validator();
        if (!warn.isEmpty()) {
            throw new RuntimeException("Preencha o(s) seguintes dado(s): " + warn);
        }
        String name = jTextFieldName.getText();
        hp.setName(name);
        String lastName = jTextFieldLastName.getText();
        hp.setLastName(lastName);
        String email = jTextFieldEmail.getText().trim();
        hp.setEmail(email);
        String adress = jTextFieldAdress.getText();
        hp.setAdress(adress);
        String nationality = jTextFieldNationality.getText();
        hp.setNacionality(nationality);
        String institution = jTextFieldInstitution.getText();
        hp.setInstitution(institution);
        String gender = String.valueOf(jComboBoxBloodType.getSelectedItem());
        hp.setGender(gender);
        String maritalStatus = String.valueOf(jComboBoxMaritalStatus.getSelectedItem());
        hp.setMaritalStatus(maritalStatus);
        String bloodGroup = String.valueOf(jComboBoxBloodType.getSelectedItem());
        hp.setBloodGroup(bloodGroup);
        Date birthDate = jDateChooserBirth.getDate();
        hp.setBirthDate(lastName);
        int numTel = 0;
        int numCC = 0;
        int nif = 0;
        boolean developmentPro = jCheckBoxDevelopmentProfessional.isSelected() == true ? true : false;
        try {
            if (jTextFieldTel.getText().trim().length() != 9 || jTextFieldNIF.getText().trim().length() != 9) {
                throw new RuntimeException("O NºTel e NIF devem ter 9 digitos!");
            }
            if (jTextFieldCC.getText().trim().length() != 8) {
                throw new RuntimeException("O NºCC deve ter 8 digitos!");
            }
            numTel = Integer.valueOf(jTextFieldTel.getText().trim());
            hp.setNumTel(numTel);
            numCC = Integer.valueOf(jTextFieldCC.getText().trim());
            hp.setNumCC(numCC);
            nif = Integer.valueOf(jTextFieldNIF.getText().trim());
            hp.setNif(nif);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Apenas numeros são permitidos nos campos NºTel, NIF e NºCC");
        } catch (RuntimeException e) {
            throw new RuntimeException(e.getMessage());
        }

          return hp; 
    }
    
     
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
    
    private String parseDate(Date d) {
        SimpleDateFormat dateFromat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFromat.format(d);
        return date;
    }
    
    private String encodeToString(BufferedImage image, String type) {
        if (image == null) {
            return "profile";
        }

        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();

            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return imageString;
    }
    
    private String validator() {
        StringBuilder warns = new StringBuilder();
        warns.append(jTextFieldName.getText().isEmpty() ? "Nome, " : "");
        warns.append(jTextFieldLastName.getText().isEmpty() ? "Apelido, " : "");
        warns.append(jTextFieldAdress.getText().isEmpty() ? "Morada, " : "");
        warns.append(jDateChooserBirth.getDate().toString().isEmpty() ? "Data de Nascimento, " : "");
        warns.append(jTextFieldCC.getText().isEmpty() ? "Numero CC, " : "");
        warns.append(jTextFieldEmail.getText().isEmpty() ? "E-mail, " : "");
        warns.append(jTextFieldNIF.getText().isEmpty() ? "NIF, " : "");
        warns.append(jTextFieldNationality.getText().isEmpty() ? "Nacionalidade, " : "");

        if (!warns.toString().isEmpty()) {
            warns.delete(warns.toString().length() - 2, warns.toString().length());
            warns.append("!");
        }

        return warns.toString();
    }
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonEdit;
    private javax.swing.JButton jButtonEditPhoto;
    private javax.swing.JCheckBox jCheckBoxDevelopmentProfessional;
    private javax.swing.JComboBox jComboBoxBloodType;
    private javax.swing.JComboBox jComboBoxGender;
    private javax.swing.JComboBox jComboBoxMaritalStatus;
    private com.toedter.calendar.JDateChooser jDateChooserBirth;
    private javax.swing.JLabel jLabelAdress;
    private javax.swing.JLabel jLabelBirthDate;
    private javax.swing.JLabel jLabelBloodType;
    private javax.swing.JLabel jLabelCC;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHealthProfessionalEdit;
    private javax.swing.JLabel jLabelInformation;
    private javax.swing.JLabel jLabelInstitution;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelMaritalStatus;
    private javax.swing.JLabel jLabelNIF;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNationality;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelTel;
    private javax.swing.JLabel jLabelwallpaper;
    private javax.swing.JPanel jPanelInformation;
    private javax.swing.JPanel jPanelWallpaper;
    private javax.swing.JTextField jTextFieldAdress;
    private javax.swing.JTextField jTextFieldCC;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldInstitution;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldNIF;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNationality;
    private javax.swing.JTextField jTextFieldTel;
    // End of variables declaration//GEN-END:variables
}
