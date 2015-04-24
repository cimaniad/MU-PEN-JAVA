/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import backend.pojos.HealthProfessional;
import backend.ws.HealthProfessionalWS;
import java.io.IOException;

/**
 *
 * @author Ricardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        HealthProfessional t = new HealthProfessional("david", "nova", 123, "prazins", 123, 123, "nova@nova.com", "devolvido sem uso", "11-02-2015", "-n", "irlandes", "feminino", "nova", "nova.png", "HP", false);
        HealthProfessionalWS tWS = new HealthProfessionalWS();
        tWS.saveEditHealthProfessional(t);
        tWS.getHealthProfessionalById(15);
        tWS.getAllHealthProfessionals();
    }

}
