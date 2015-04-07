/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend.ws;

import backend.pojos.Terapeuta;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.message.BasicNameValuePair;

/**
 *
 * @author Ricardo
 */
public class TerapeutaWS {

//    private final String URL = "http://localhost/NEP-UM-WEB/api/";
//    private CloseableHttpClient clientWS;
//    private HttpPost post;
//    private CloseableHttpResponse resposta;
    Conexao conexaoWS;
    CloseableHttpResponse resposta;
    Gson gson;

    public TerapeutaWS() {

//        clientWS = HttpClients.createDefault();
//        post = new HttpPost(URL);
        gson = new Gson();
        conexaoWS = Conexao.getConexao();

    }

    public boolean guardarTerapeuta(Terapeuta t) throws IOException {

        List<NameValuePair> parametros = new ArrayList<>();
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

        resposta = conexaoWS.fazerPedido("terapeuta", "registar_terapeuta", parametros);
        String terapeutaJson = conexaoWS.lerResposta(resposta);

        Validacao v = gson.fromJson(terapeutaJson, Validacao.class);

        if (v.getCod() == 200) {
            return true;
        }

        return false;
    }

    public Terapeuta getTerapeuta(int id) {
        try {
            List<NameValuePair> parametros = new ArrayList<>();
            parametros.add(new BasicNameValuePair("id", String.valueOf(id)));

            resposta = conexaoWS.fazerPedido("terapeuta", "get_terapeuta_by_id", parametros);
            System.out.println(resposta.getStatusLine().getStatusCode());
            if (resposta.getStatusLine().getStatusCode() == 200) {
                String terapeutaJson = conexaoWS.lerResposta(resposta);
                Terapeuta t = gson.fromJson(terapeutaJson, Terapeuta.class);
                return t;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public List<Terapeuta> getAllTerapeutas() {

        List<NameValuePair> parametros = new ArrayList<>();

        resposta = conexaoWS.fazerPedido("terapeuta", "get_all_terapeutas", parametros);
        String terapeutaJson = conexaoWS.lerResposta(resposta);
        Type type = new TypeToken<List<Terapeuta>>() {
        }.getType();

        return gson.fromJson(terapeutaJson, type);

    }

}
