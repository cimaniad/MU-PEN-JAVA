/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.Appointment;
import backend.pojos.HealthProfessional;
import backend.pojos.Patient;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;

/**
 *
 * @author jorge
 */
public class AppointmentWS {
    
    private WrapperWS wrapperWS;
    private CloseableHttpResponse responseWS;
    private Gson gson;
    private static Logger log = Logger.getLogger(AppointmentWS.class);

    public AppointmentWS() {
        gson = new Gson();
        wrapperWS = WrapperWS.getWrapperWS();

    }
    
    public void saveEditAppointment(Appointment a) {

        try {
            responseWS = wrapperWS.sendRequest("Appointment",
                    "saveEditAppointment", getAllParams(a));    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 201) {
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao criar a consulta");
            }

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\t Appointment saved with success");
    }
    
    public List<Appointment> getAllAppointments() {
        List<Appointment> aList = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta

        try {
            responseWS = wrapperWS.sendRequest("Appointment",
                    "getAllAppointment", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados da consulta");
            }

            Type type = new TypeToken<List<Appointment>>() {
            }.getType();  //tipo do para o qual queros retornar a responseWS Json
            aList = gson.fromJson(jsonResp, type);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\t Appointment data access success");
        log.debug("\n\tHPs : " + aList.toString());
        return aList;

    }
    
    private List<NameValuePair> getAllParams(Appointment a) {
        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idHealthProfessional", String.valueOf(a.getIdHealthProfessional())));
        params.add(new BasicNameValuePair("idAppointment", String.valueOf(a.getIdAppointment())));
        params.add(new BasicNameValuePair("idPatient", String.valueOf(a.getIdPatient())));
        params.add(new BasicNameValuePair("date", String.valueOf(a.getDate())));
        params.add(new BasicNameValuePair("hour", a.getHour()));
        params.add(new BasicNameValuePair("okay", String.valueOf(a.getOkay())));
        params.add(new BasicNameValuePair("description", a.getDescription()));
 
        return params;
    }
    
    public Appointment getApointmentById(int id){
        Appointment ap = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idAppointment", String.valueOf(id)));

        try {
            responseWS = wrapperWS.sendRequest("Appointment",
                    "getAppointmentById", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados da consulta");
            }

            ap = gson.fromJson(jsonResp, Appointment.class);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tAppointment data access success");
        log.debug("\n\tAP with id " + id + ": " + ap.toString());
        return ap;
    }
    
   public Appointment getAppointmentByIdDate(int id, Date date){
        Appointment ap = null;

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idAppointment", String.valueOf(id)));
        params.add(new BasicNameValuePair("dataAppointment", String.valueOf(date)));

        try {
            responseWS = wrapperWS.sendRequest("Appointment",
                    "getAppointmentByIdDate", params);    //efetua o pedido ao WS
            String jsonResp = wrapperWS.readResponse(responseWS);         //Passa a responseWS para uma string

            int httpResponseCod = responseWS.getStatusLine().getStatusCode();
            if (httpResponseCod != 200) {
                Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java     
                log.error("\n\tCod: " + v.getCod() + "\tMsg: " + v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao aceder aos dados da consulta");
            }

            ap = gson.fromJson(jsonResp, Appointment.class);

        } catch (RuntimeException e) {
            log.error("\n\t" + e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
        log.debug("\n\tAppointment data access success");
        log.debug("\n\tAP with id " + id + ": " + ap.toString());
        return ap;
   } 
}
