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
 * Class responsavel por fazer a conexão ao web service sempre que necessário 
 */
public class Conexao {

    private static Conexao instance;
    private final String URL = "http://localhost/NEP-UM-WEB/api/"; 
    private final CloseableHttpClient clienteWS;
    private final HttpPost post;
    
    

    /**
     * metodo construtor privado para que não seja possivel a instanciação desta class.
     */
    private Conexao() {
        this.clienteWS = HttpClients.createDefault();
        this.post = new HttpPost(URL);
    }
    
    
/**
 * Metodo que retorna a a instancia da propria Class, utilização do design pattern Singlton
 * @return Conexao 
 */
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
    
    /**
     * Metodo resposnsavel por fazer o pedido ao WS, retorna a resposta do WS 
     * @param objeto    (objecto onde queremos executar a função)
     * @param funcao    (função que queremos que o WS execute)
     * @param parametros (parametros que são necessários enviar para o WS executar o pedido feito)
     * @return CloseableHttpResponse
     */

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
/**
 * Metodo que trata a resposta feita pelo WS, e a devolve como uma String
 * @param resposta
 * @return String
 */
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
