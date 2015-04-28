
package backend.pojos;

import java.util.Date;

public class Patient {
    private int idPatient;
    private String name;
    private String lastName;
    private int numCC;
    private String adress;
    private int numTel;
    private int nif;
    private String email;
    private String  maritalState;
    private String birthDate;
    private String bloodGroup;
    private String nationality;
    private String gender;
    private String password;
    private String pathology;
    private String description;
    private String picture;
    private int idHealthProfessional;

    public Patient() {
    }
    /**
     * 
     * @param idPacient
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
     * @param nationality
     * @param gender
     * @param password
     * @param pathology
     * @param description 
     */
    public Patient(String name, String lastName, int numCC, String picture,
            String adress, int numTel, int nif, String email, String miritalState, String birthDate,
            String bloodGroup, String nationality, String gender, String password, String pathology, String description) {
        
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
        this.nationality = nationality;
        this.gender = gender;
        this.password = password;
        this.pathology = pathology;
        this.description = description;
        this.picture= picture;
        
    }

    public int getIdHealthProfessional() {
        return idHealthProfessional;
    }

    public int getIdPatient() {
        return idPatient;
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

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
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

    public void setMaritalState(String miritalState) {
        this.maritalState = miritalState;
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

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPathology() {
        return pathology;
    }

    public void setPathology(String pathology) {
        this.pathology = pathology;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Patient{" + "idPatient=" + idPatient + ", name=" + name + ", lastName=" + lastName + ", numCC=" + numCC + ", adress=" + adress + ", numTel=" + numTel + ", nif=" + nif + ", email=" + email + ", maritalState=" + maritalState + ", birthDate=" + birthDate + ", bloodGroup=" + bloodGroup + ", nationality=" + nationality + ", gender=" + gender + ", password=" + password + ", pathology=" + pathology + ", description=" + description + '}';
    }
    
    
    
    
}


