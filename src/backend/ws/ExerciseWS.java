/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.Exercise;
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
public class ExerciseWS {
    
     private WrapperWS wrapperWS;
    private CloseableHttpResponse responseWS;
    private Gson gson;
    private Logger log = Logger.getLogger(Exercise
            .class);

    public ExerciseWS() {
        gson = new Gson();
        wrapperWS = WrapperWS.getWrapperWS();
    }
    
    public void saveExercise(Exercise ex) {

        try {
            responseWS = wrapperWS.sendRequest("Exercise", "saveExercise", getAllParams(ex));    //efetua o pedido ao WS
            String validacao = wrapperWS.readResponse(responseWS);         //Passa a resposta para uma string

            Validation v = gson.fromJson(validacao, Validation.class);    //Conversão do objecto Json para o objecto Java

            if (v.getCod() != 201) {
                System.out.println(v.getMsg());
                log.error(v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao criar o Exercício");
            }

        } catch (RuntimeException e) {
            log.error(e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("Exercise saved with sucess");
    }
    public List<Exercise> getAllExercises() {
        List<Exercise> exList = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta

        try {
            responseWS = wrapperWS.sendRequest("Exercise",
                    "getAllExercises", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Exercício");
            }

            Type type = new TypeToken<List<Exercise>>() {
            }.getType();  //tipo do para o qual queros retornar a responseWS Json
            exList = gson.fromJson(jsonResp, type);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tExercise data access success");
        log.debug("\n\tHPs : " + exList.toString());
        return exList;

    }

    public Exercise getExerciseById(int id) {

        Exercise ex = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idExercise", String.valueOf(id)));

        try {
            responseWS = wrapperWS.sendRequest("Exercise",
                    "getExerciseById", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Exercício");
            }

            ex = gson.fromJson(jsonResp, Exercise.class);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tExercise data access success");
        log.debug("\n\tEx with id " + id + ": " + ex.toString());
        return ex;
    }
    private List<NameValuePair> getAllParams(Exercise ex) {
        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idExercise", String.valueOf(ex.getIdExercise())));
        params.add(new BasicNameValuePair("idSubDomain", String.valueOf(ex.getIdSubDomain())));
        params.add(new BasicNameValuePair("designation", ex.getDesignation()));
        params.add(new BasicNameValuePair("structure", ex.getStructure()));
                params.add(new BasicNameValuePair("name", (ex.getName())));

        return params;
    }
}

