/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package backend.pojos;

/**
 *
 * @author Ricardo
 */
public class Terapeuta {
    private String nome;
    private String apelido;
    private int numCC;
    private String morada;
    private int numTel;
    private int nif;
    private String email;
    private int numUtente;
    private String estadoCivil;
    private String dataNasc;
    private String grupoSang;
    private String nacionalidade;
    private String sexo;
    private String password;
    private String perfil;
    private String foto;
    private String instituicao;
    private boolean profossionalDesenvolvimento;

    public Terapeuta() {
    }

    public Terapeuta(String nome, String apelido, int numCC, String morada, int numTel, int nif, String email, int numUtente, String estadoCivil, String dataNasc, String grupoSang, String nacionalidade, String sexo, String password, String perfil, String foto, String instituicao, boolean profossionalDesenvolvimento) {
        this.nome = nome;
        this.apelido = apelido;
        this.numCC = numCC;
        this.morada = morada;
        this.numTel = numTel;
        this.nif = nif;
        this.email = email;
        this.numUtente = numUtente;
        this.estadoCivil = estadoCivil;
        this.dataNasc = dataNasc;
        this.grupoSang = grupoSang;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.password = password;
        this.perfil = perfil;
        this.foto = foto;
        this.instituicao = instituicao;
        this.profossionalDesenvolvimento = profossionalDesenvolvimento;
    }
    

    public Terapeuta(String nome, String apelido, int numCC, int numTel, int nif, String email, int numUtente, String dataNasc, String nacionalidade, String sexo, String password, String perfil, String foto, boolean profossionalDesenvolvimento) {
        this.nome = nome;
        this.apelido = apelido;
        this.numCC = numCC;
        this.numTel = numTel;
        this.nif = nif;
        this.email = email;
        this.numUtente = numUtente;
        this.dataNasc = dataNasc;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.password = password;
        this.perfil = perfil;
        this.foto = foto;
        this.profossionalDesenvolvimento = profossionalDesenvolvimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getNumCC() {
        return numCC;
    }

    public void setNumCC(int numCC) {
        this.numCC = numCC;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public int getNif() {
        return nif;
    }

    public void setNif(int nif) {
        this.nif = nif;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumUtente() {
        return numUtente;
    }

    public void setNumUtente(int numUtente) {
        this.numUtente = numUtente;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getGrupoSang() {
        return grupoSang;
    }

    public void setGrupoSang(String grupoSang) {
        this.grupoSang = grupoSang;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public boolean isProfossionalDesenvolvimento() {
        return profossionalDesenvolvimento;
    }

    public void setProfossionalDesenvolvimento(boolean profossionalDesenvolvimento) {
        this.profossionalDesenvolvimento = profossionalDesenvolvimento;
    }

    @Override
    public String toString() {
        return "Terapeuta{" + "nome=" + nome + ", apelido=" + apelido + ", numCC=" + numCC + ", morada=" + morada + ", numTel=" + numTel + ", nif=" + nif + ", email=" + email + ", numUtente=" + numUtente + ", estadoCivil=" + estadoCivil + ", dataNasc=" + dataNasc + ", grupoSang=" + grupoSang + ", nacionalidade=" + nacionalidade + ", sexo=" + sexo + ", password=" + password + ", perfil=" + perfil + ", foto=" + foto + ", instituicao=" + instituicao + ", profossionalDesenvolvimento=" + profossionalDesenvolvimento + '}';
    }
    
    
    
}
