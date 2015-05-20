/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import com.google.gson.Gson;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.log4j.Logger;



/**
 *
 * @author jorge
 */
public class SessionWS {
    
 private WrapperWS wrapperWS;
    private CloseableHttpResponse responseWS;
    private Gson gson;
    private Logger log = Logger.getLogger(SessionWS.class);

    public SessionWS() {
         gson = new Gson();
        wrapperWS = WrapperWS.getWrapperWS();
    }
}
