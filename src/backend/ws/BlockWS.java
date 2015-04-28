/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.Block;
import backend.pojos.Patient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
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
     
     public List<Block> getAllBlocks() {
        List<Block> bList = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta

        try {
            responseWS = wrapperWS.sendRequest("Block",
                    "getAllBlocks", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Bloco");
            }

            Type type = new TypeToken<List<Block>>() {
            }.getType();  //tipo do para o qual queros retornar a responseWS Json
            bList = gson.fromJson(jsonResp, type);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\t Block data access success");
        log.debug("\n\tBs : " + bList.toString());
        return bList;

    }
     
     public Block getBlockById(int id) {

        Block b = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idBlock", String.valueOf(id)));

        try {
            responseWS = wrapperWS.sendRequest("Blcok",
                    "getBlockById", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Bloco");
            }

            b = gson.fromJson(jsonResp, Block.class);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tBlock data access success");
        log.debug("\n\tB with id " + id + ": " + b.toString());
        return b;
    }
}
