/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.pojos;

/**
 *
 * @author jorge
 */
public class Exercise {
   
    private int idExercise;
    private int idSubdomain;
    private String designation;
    private String structure;

    public Exercise(int idSubdomain, String designation, String structure) {
        this.idSubdomain = idSubdomain;
        this.designation = designation;
        this.structure = structure;
    }

    public int getIdExercise() {
        return idExercise;
    }


    public int getIdSubdomain() {
        return idSubdomain;
    }

    public void setIdSubdomain(int idSubdomain) {
        this.idSubdomain = idSubdomain;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getStructure() {
        return structure;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public String toString() {
        return "Exercise{" + "idExercise=" + idExercise + ", idSubdomain=" + idSubdomain + ", designation=" + designation + ", structure=" + structure + '}';
    }
    
    
}
