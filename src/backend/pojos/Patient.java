
package backend.pojos;

import java.util.Date;

public class Patient {
    private int idPacient;
    private String name;
    private String lastName;
    private String numCC;
    private String adress;
    private int numTel;
    private int nif;
    private String email;
    private String  miritalState;
    private Date birthDate;
    private String bloodGroup;
    private String nationality;
    private String gender;
    private String password;
    private String pathology;
    private String description;

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
    public Patient(int idPacient, String name, String lastName, String numCC, String adress, int numTel, int nif, String email, String miritalState, Date birthDate, String bloodGroup, String nationality, String gender, String password, String pathology, String description) {
        this.idPacient = idPacient;
        this.name = name;
        this.lastName = lastName;
        this.numCC = numCC;
        this.adress = adress;
        this.numTel = numTel;
        this.nif = nif;
        this.email = email;
        this.miritalState = miritalState;
        this.birthDate = birthDate;
        this.bloodGroup = bloodGroup;
        this.nationality = nationality;
        this.gender = gender;
        this.password = password;
        this.pathology = pathology;
        this.description = description;
    }

    public int getIdPacient() {
        return idPacient;
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

    public String getNumCC() {
        return numCC;
    }

    public void setNumCC(String numCC) {
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

    public String getMiritalState() {
        return miritalState;
    }

    public void setMiritalState(String miritalState) {
        this.miritalState = miritalState;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
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
        return "Patient{" + "idPacient=" + idPacient + ", name=" + name + ", lastName=" + lastName + ", numCC=" + numCC + ", adress=" + adress + ", numTel=" + numTel + ", nif=" + nif + ", email=" + email + ", miritalState=" + miritalState + ", birthDate=" + birthDate + ", bloodGroup=" + bloodGroup + ", nationality=" + nationality + ", gender=" + gender + ", password=" + password + ", pathology=" + pathology + ", description=" + description + '}';
    }
    
    
    
    
}


