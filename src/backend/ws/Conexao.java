/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author Ricardo
 */
public class Conexao {

    private static Conexao instance;
    private final String URL = "http://localhost/NEP-UM-WEB/api/";
    private CloseableHttpClient clienteWS;
    private final HttpPost post;

    private Conexao() {
        this.clienteWS = HttpClients.createDefault();
        post = new HttpPost(URL);

    }

    public static Conexao getConexao() {
        if (instance == null) {
            synchronized (Conexao.class) {
                if (instance == null) {
                    instance = new Conexao();
                }
            }
        }
        return instance;
    }

    public CloseableHttpResponse fazerPedido(String objeto, String funcao, List<NameValuePair> parametros) {
        try {
            parametros.add(new BasicNameValuePair("objeto", objeto));
            parametros.add(new BasicNameValuePair("funcao", funcao));
            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(parametros, Consts.UTF_8);
            post.setEntity(entity);

            return clienteWS.execute(post);

        } catch (org.apache.http.conn.HttpHostConnectException e) {
            System.err.println(e.getMessage());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
        return null;
    }

    public String lerResposta(CloseableHttpResponse resposta) {
        
        try {

            BufferedReader br  = new BufferedReader(new InputStreamReader(resposta.getEntity().getContent()));

            String linha;
            StringBuilder dados = new StringBuilder();
            while ((linha = br.readLine()) != null) {
                dados.append(linha);
            }
            br.close();
            System.out.println("resposta: " + dados);
            return dados.toString();
        } catch (IOException | IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }

        return null;
    }
}
