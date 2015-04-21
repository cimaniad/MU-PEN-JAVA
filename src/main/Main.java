/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import backend.pojos.HealthProfessional;
import backend.ws.HealthProfessionalWS;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       HealthProfessional t = new HealthProfessional("david", "nova", 123, "prazins", 123, 123, "nova@nova.com", "devolvido sem uso", "11-02-2015", "-n", "irlandes", "feminino", "nova", "pref", "nova.png", "HP", false);
        HealthProfessionalWS tWS=new HealthProfessionalWS();
        tWS.saveEditHealthProfessional(t);
//        List<Terapeuta> terapeutas = tWS.getAllTerapeutas();
//        for(HealthProfessionalWS t : terapeutas){
//            System.out.println(t.toString());
//        }
//        System.out.println(terapeutas.size());
        
//         tWS.guardarEditarTerapeuta(t);
        //    HealthProfessional t1 = tWS.getTerapeuta(14);
//            System.out.println(t1.getNome());
//            System.out.println(t1.getNumCC());
//            t1.setNome("Antonio");
//          System.out.println(t1.getNome());
//            tWS.guardarEditarTerapeuta(t1);
//            HealthProfessionalWS t2 = tWS.getTerapeuta(14);
//            System.out.println(t2.getNome());
           
//            
//          
        
    }
    
}
