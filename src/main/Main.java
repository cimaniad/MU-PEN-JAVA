/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import backend.pojos.Terapeuta;
import backend.ws.TerapeutaWS;
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
//       Terapeuta t = new Terapeuta("Jose", "araujo", 1234, null ,1234, 1234, "mga@gmail", 123, null, "11-08-1994", null,"portu", "masc", "1234", "este", "aqe", null,false);
        TerapeutaWS tWS=new TerapeutaWS();
//        List<Terapeuta> terapeutas = tWS.getAllTerapeutas();
//        for(Terapeuta t : terapeutas){
//            System.out.println(t.toString());
//        }
//        System.out.println(terapeutas.size());
        
//         tWS.guardarEditarTerapeuta(t);
            Terapeuta t1 = tWS.getTerapeuta(14);
//            System.out.println(t1.getNome());
            System.out.println(t1.getNumCC());
            t1.setNome("Antonio");
          System.out.println(t1.getNome());
            tWS.guardarEditarTerapeuta(t1);
            Terapeuta t2 = tWS.getTerapeuta(14);
            System.out.println(t2.getNome());
           
//            
//          
        
    }
    
}
