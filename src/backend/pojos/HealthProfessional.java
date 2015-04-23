/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.pojos;

/**
 *
 * @author Ricardo
 */
public class HealthProfessional {

    private int idHealthProfessional;
    private String name;
    private String lastName;
    private int numCC;
    private String adress;
    private int numTel;
    private int nif;
    private String email;
    private String maritalState;
    private String birthDate;
    private String bloodGroup;
    private String nacionality;
    private String gender;
    private String password;
    private String picture;
    private String institution;
    private boolean developmentProfessional;

    /**
     * Metdo construtor por defeito
     */
    public HealthProfessional() {
    }

    /**
     * Construct methoth
     *
     * @param idHealthProfessional
     * @param name
     * @param lastName
     * @param numCC
     * @param adress
     * @param numTel
     * @param nif
     * @param email
     * @param miritalState
     * @param birthDate
     * @param bloodGroup
     * @param nacionality
     * @param sex
     * @param password
     * @param profile
     * @param picture
     * @param institution
     * @param developmentProfessional
     */
    public HealthProfessional(String name, String lastName, int numCC, String adress,
            int numTel, int nif, String email, String miritalState, String birthDate,
            String bloodGroup, String nacionality, String gender, String password,
            String picture, String institution, boolean developmentProfessional) {

        this.name = name;
        this.lastName = lastName;
        this.numCC = numCC;
        this.adress = adress;
        this.numTel = numTel;
        this.nif = nif;
        this.email = email;
        this.maritalState = miritalState;
        this.birthDate = birthDate;
        this.bloodGroup = bloodGroup;
        this.nacionality = nacionality;
        this.gender = gender;
        this.password = password;
        this.picture = picture;
        this.institution = institution;
        this.developmentProfessional = developmentProfessional;

    }

    /**
     * Metodos modificadores e seletores
     */
    public int getIdHealthProfessional() {
        return idHealthProfessional;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumCC() {
        return numCC;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaritalState() {
        return maritalState;
    }

    public void setMaritalState(String maritalState) {
        this.maritalState = maritalState;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public boolean isDevelopmentProfessional() {
        return developmentProfessional;
    }

    public void setDevelopmentProfessional(boolean developmentProfessional) {
        this.developmentProfessional = developmentProfessional;
    }

    /**
     * Reescrita do metodo toString
     */
    @Override
    public String toString() {
        return "HealthProfessional{" + "idHealthProfessional=" + idHealthProfessional + ", name=" + name + ", lastName=" + lastName + ", numCC=" + numCC + ", adress=" + adress + ", numTel=" + numTel + ", nif=" + nif + ", email=" + email + ", miritalState=" + maritalState + ", birthDate=" + birthDate + ", bloodGroup=" + bloodGroup + ", nacionality=" + nacionality + ", sex=" + gender + ", password=" + password + ", picture=" + picture + ", institution=" + institution + ", developmentProfessional=" + developmentProfessional + '}';
    }

}
