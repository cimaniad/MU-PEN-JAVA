/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.HealthProfessional;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicNameValuePair;
import org.apache.log4j.Logger;


/**
 * Class onde se efetua todas as operações existentes entre o Objecto terapeuta
 * e o WS
 */
public class HealthProfessionalWS {

    private WrapperWS wrapperWS;
    private CloseableHttpResponse resposta;
    private Gson gson;
    private static Logger log = Logger.getLogger(HealthProfessionalWS.class);

    public HealthProfessionalWS() {
        gson = new Gson();
        wrapperWS = WrapperWS.getWrapperWS();
        
    }

    /**
     * Mehpodo que Gurada ou Edihpa o hperapeuhpa caso ele já exishpa, se hpudo
     * correr cerhpo reshporna hprue casos conhprario rehporna false
     *
     * @param hp (HealhphProfessionalWS)
     * @throws IOException
     */
    public void saveEditHealthProfessional(HealthProfessional hp) {

        List<NameValuePair> params = new ArrayList<>();           //array com os params necessários para registar um terapeuta
        params.add(new BasicNameValuePair("idHealthProfessional", String.valueOf(hp.getIdHealthProfessional())));
        params.add(new BasicNameValuePair("name", hp.getName()));
        params.add(new BasicNameValuePair("lastName", hp.getLastName()));
        params.add(new BasicNameValuePair("numCC", String.valueOf(hp.getNumCC())));
        params.add(new BasicNameValuePair("adress", hp.getAdress()));
        params.add(new BasicNameValuePair("numTel", String.valueOf(hp.getNumTel())));
        params.add(new BasicNameValuePair("nif", String.valueOf(hp.getNif())));
        params.add(new BasicNameValuePair("email", hp.getEmail()));
        params.add(new BasicNameValuePair("maritalState", hp.getMaritalState()));
        params.add(new BasicNameValuePair("birthDate", hp.getBirthDate()));
        params.add(new BasicNameValuePair("bloodGroup", hp.getBloodGroup()));
        params.add(new BasicNameValuePair("nacionality", hp.getNacionality()));
        params.add(new BasicNameValuePair("gender", hp.getGender()));
        params.add(new BasicNameValuePair("password", hp.getPassword()));
        params.add(new BasicNameValuePair("profile", hp.getProfile()));
        params.add(new BasicNameValuePair("picture", hp.getPicture()));
        params.add(new BasicNameValuePair("institution", hp.getInstitution()));
        params.add(new BasicNameValuePair("developmentProfessional", String.valueOf(hp.isDevelopmentProfessional())));

        try {
            resposta = wrapperWS.sendRequest("HealthProfessional", "saveEditHealthProfessional", params);    //efetua o pedido ao WS

            String jsonResp = wrapperWS.readResponse(resposta);         //Passa a resposta para uma string

            Validation v = gson.fromJson(jsonResp, Validation.class);    //Conversão do objecto Json para o objecto Java

            if (v.getCod() != 201) {
                System.out.println(v.getMsg());
                log.error(v.getMsg());
                throw new RuntimeException("Ocorreu um erro ao criar o Profissional de Saúde");
            }

        } catch (RuntimeException e) {
            log.error(e.getMessage());
        //    throw new RuntimeException(e.getMessage());
        }
        log.debug("Health Professionla saved with sucess");
    }

    /**
     * Metodo que retorna o terapeuta com o id passado como parametro
     *
     * @param id
     * @return HealthProfessionalWS
     */
    public HealthProfessional getTerapeuta(int id) {

        List<NameValuePair> parametros = new ArrayList<>();     //array com os params necessários para buscar um terapeuta pelo id
        backend.pojos.HealthProfessional t = null;
        parametros.add(new BasicNameValuePair("idTerapeuta", String.valueOf(id)));

        resposta = wrapperWS.sendRequest("terapeuta", "get_terapeuta_by_id", parametros);   //efetua o pedido ao WS
        //verificar o codigo HTTP da resposta
        System.out.println(resposta.getStatusLine().getStatusCode());
        String terapeutaJson = wrapperWS.readResponse(resposta);         //Passa a resposta para uma string
        t = gson.fromJson(terapeutaJson, backend.pojos.HealthProfessional.class);    //Conversão do objecto Json para o objecto Java

        throw new RuntimeException("Ocorreu um erro ao tentar aceder ao servidor. \n\tVerifique a ligação à internet");

    }

    /**
     * Metodo que retorna todos os terapeutas
     *
     * @return Lista de HealthProfessionalWSs
     */
    public List<backend.pojos.HealthProfessional> getAllTerapeutas() {
        List<NameValuePair> parametros = new ArrayList<>();     //array com os params necessários para buscar todos os terapeutas

        resposta = wrapperWS.sendRequest("terapeuta", "get_all_terapeutas", parametros);

        if (resposta.getStatusLine().getStatusCode() == 200) {           //verificar o codigo HTTP da resposta
            String terapeutaJson = wrapperWS.readResponse(resposta);     //Passa a resposta para uma string
            Type type = new TypeToken<List<backend.pojos.HealthProfessional>>() {
            }.getType();  //tipo do para o qual queros retornar a resposta Json

            return gson.fromJson(terapeutaJson, type);          //Passa o array dos objectos em Json para uma Lista de objectos Java

        } else {
            return null;
        }
    }

}
