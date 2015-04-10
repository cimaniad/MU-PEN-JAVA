/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.Terapeuta;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicNameValuePair;

/**
 * Class onde se efetua todas as operações existentes entre o Objecto terapeuta
 * e o WS
 */
public class TerapeutaWS {

    Conexao conexaoWS;
    CloseableHttpResponse resposta;
    Gson gson;

    public TerapeutaWS() {
        gson = new Gson();
        conexaoWS = Conexao.getConexao();
    }

    /**
     * Metodo que Gurada ou Edita o terapeuta caso ele já exista, se tudo correr
     * certo restorna true casos contrario retorna false
     *
     * @param t (Terapeuta)
     * @return
     * @throws IOException
     */
    public boolean guardarEditarTerapeuta(Terapeuta t) {

        List<NameValuePair> parametros = new ArrayList<>();           //array com os parametros necessários para registar um terapeuta
        parametros.add(new BasicNameValuePair("idTerapeuta", t.getIdTerapeuta()));
        parametros.add(new BasicNameValuePair("nome", t.getNome()));
        parametros.add(new BasicNameValuePair("apelido", t.getApelido()));
        parametros.add(new BasicNameValuePair("numCC", String.valueOf(t.getNumCC())));
        parametros.add(new BasicNameValuePair("morada", t.getMorada()));
        parametros.add(new BasicNameValuePair("numTel", String.valueOf(t.getNumTel())));
        parametros.add(new BasicNameValuePair("nif", String.valueOf(t.getNif())));
        parametros.add(new BasicNameValuePair("email", t.getEmail()));
        parametros.add(new BasicNameValuePair("numUtente", String.valueOf(t.getNumUtente())));
        parametros.add(new BasicNameValuePair("estadoCivil", t.getEstadoCivil()));
        parametros.add(new BasicNameValuePair("dataNasc", t.getDataNasc()));
        parametros.add(new BasicNameValuePair("grupoSang", t.getGrupoSang()));
        parametros.add(new BasicNameValuePair("nacionalidade", t.getNacionalidade()));
        parametros.add(new BasicNameValuePair("sexo", t.getSexo()));
        parametros.add(new BasicNameValuePair("password", t.getPassword()));
        parametros.add(new BasicNameValuePair("perfil", t.getPerfil()));
        parametros.add(new BasicNameValuePair("foto", t.getFoto()));
        parametros.add(new BasicNameValuePair("instituicao", t.getInstituicao()));
        parametros.add(new BasicNameValuePair("profissionalDesenvolvimento", String.valueOf(t.isProfossionalDesenvolvimento())));

        resposta = conexaoWS.fazerPedido("terapeuta", "registar_editar_terapeuta", parametros);    //efetua o pedido ao WS
        String validacao = conexaoWS.lerResposta(resposta);         //Passa a resposta para uma string

        if (resposta.getStatusLine().getStatusCode() == 200) {      //verificar o codigo HTTP da resposta
            System.out.println(resposta.getStatusLine().getStatusCode());
            Validacao v = gson.fromJson(validacao, Validacao.class);    //Conversão do objecto Json para o objecto Java
            
            if (v.getCod() == 200) {        //se o servidor retornar o codigo 200, segnifica que tudo correu como esperado, logo o metodo retorna true
                System.out.println(v.getCod());
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * Metodo que retorna o terapeuta com o id passado como parametro
     *
     * @param id
     * @return Terapeuta
     */
    public Terapeuta getTerapeuta(int id) {
        List<NameValuePair> parametros = new ArrayList<>();     //array com os parametros necessários para buscar um terapeuta pelo id

        parametros.add(new BasicNameValuePair("idTerapeuta", String.valueOf(id)));

        resposta = conexaoWS.fazerPedido("terapeuta", "get_terapeuta_by_id", parametros);   //efetua o pedido ao WS

        if (resposta.getStatusLine().getStatusCode() == 200) {              //verificar o codigo HTTP da resposta
            System.out.println(resposta.getStatusLine().getStatusCode());
            String terapeutaJson = conexaoWS.lerResposta(resposta);         //Passa a resposta para uma string
            Terapeuta t = gson.fromJson(terapeutaJson, Terapeuta.class);    //Conversão do objecto Json para o objecto Java
            return t;
        } else {
            return null;
        }
    }

    /**
     * Metodo que retorna todos os terapeutas
     *
     * @return Lista de Terapeutas
     */
    public List<Terapeuta> getAllTerapeutas() {
        List<NameValuePair> parametros = new ArrayList<>();     //array com os parametros necessários para buscar todos os terapeutas

        resposta = conexaoWS.fazerPedido("terapeuta", "get_all_terapeutas", parametros);

        if (resposta.getStatusLine().getStatusCode() == 200) {           //verificar o codigo HTTP da resposta
            String terapeutaJson = conexaoWS.lerResposta(resposta);     //Passa a resposta para uma string
            Type type = new TypeToken<List<Terapeuta>>() {
            }.getType();  //tipo do para o qual queros retornar a resposta Json

            return gson.fromJson(terapeutaJson, type);          //Passao array dos objectos em Json para uma Lista de objectos Java

        } else {
            return null;
        }
    }
}
