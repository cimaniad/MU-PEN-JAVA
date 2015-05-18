/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.Admin;
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
 * @author Ricardo
 */
public class AdminWS {

    private WrapperWS wrapperWS;
    private CloseableHttpResponse responseWS;
    private Gson gson;
    private Logger log = Logger.getLogger(Patient.class);

    public AdminWS() {
        gson = new Gson();
        wrapperWS = WrapperWS.getWrapperWS();
    }

    public Admin getAdminById(int id) {

        Admin a = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta

        params.add(
                new BasicNameValuePair("idAdmin", String.valueOf(id)));

        try {
            responseWS = wrapperWS.sendRequest("Admin",
                    "getAdminById", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados do Administrador");
            }

            a = gson.fromJson(jsonResp, Admin.class);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }

        log.debug(
                "\n\tAdmin data access success");
        log.debug(
                "\n\tAdmin with id " + id + ": " + a.toString());
        return a;
    }
}
