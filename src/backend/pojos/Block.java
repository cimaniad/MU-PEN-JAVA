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
public class Block {
    
    private int idBlock;
    private String description;
    private String name;

    public Block(String description) {
        this.description = description;
    }

    public int getIdBlock() {
        return idBlock;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Block{" + "idBlock=" + idBlock + ", description=" + description + '}';
    }
    
    
}
