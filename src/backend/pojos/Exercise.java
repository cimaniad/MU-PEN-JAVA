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
    private int idSubDomain;
    private String designation;
    private String structure;
    private String name;

    public Exercise(int idSubdomain, String designation, String structure) {
        this.idSubDomain = idSubdomain;
        this.designation = designation;
        this.structure = structure;
        this.name = name;
    }

    public int getIdExercise() {
        return idExercise;
    }


    public int getIdSubDomain() {
        return idSubDomain;
    }

    public void setIdSubdomain(int idSubdomain) {
        this.idSubDomain = idSubdomain;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Exercise{" + "idExercise=" + idExercise + ", idSubDomain=" + idSubDomain + ", designation=" + designation + ", structure=" + structure + ", name=" + name + '}';
    }

    
    
    
}
