/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.Block;
import backend.pojos.Patient;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class BlockWS {
    
    private WrapperWS wrapperWS;
    private CloseableHttpResponse responseWS;
    private Gson gson;
    private Logger log = Logger.getLogger(Patient.class);

    public BlockWS() {
         gson = new Gson();
        wrapperWS = WrapperWS.getWrapperWS();
    }
    
     public void saveBlock(Block b) {

        try {
            responseWS = wrapperWS.sendRequest("Block", "saveBlock", getAllParams(b));    //efetua o pedido ao WS
            String validacao = wrapperWS.readResponse(responseWS);         //Passa a resposta para uma string

            Validation v = gson.fromJson(validacao, Validation.class);    //Conversão do objecto Json para o objecto Java

            if (v.getCod() != 201) {
                System.out.println(v.getMsg());
                log.error(v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao criar o Bloco");
            }

        } catch (RuntimeException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("Block saved with sucess");
    }
 
     private List<NameValuePair> getAllParams(Block b) {
        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idBlock", String.valueOf(b.getIdBlock())));
        params.add(new BasicNameValuePair("description", (b.getDescription())));
        
        return params;
    }
}
