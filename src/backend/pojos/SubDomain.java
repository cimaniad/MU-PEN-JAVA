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
public class SubDomain {
    
    private int idSubdomain;
    private String name;
    private String description;
    private int idDomain;

    public SubDomain(String name, String description, int idDomain) {
        this.name = name;
        this.description = description;
        this.idDomain = idDomain;
    }

    public int getIdSubdomain() {
        return idSubdomain;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdDomain() {
        return idDomain;
    }

    public void setIdDomain(int idDomain) {
        this.idDomain = idDomain;
    }

    @Override
    public String toString() {
        return "subDomain{" + "idSubdomain=" + idSubdomain + ", name=" + name + ", description=" + description + ", idDomain=" + idDomain + '}';
    }
    
    
           
}
