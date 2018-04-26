/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionarios;

/**
 *
 * @author Tiago
 */
public class funcionarios {

     public funcionarios (){
    
    }
    
    public int getCod_Fun() {
        return Cod_Fun;
    }

    public void setCod_Fun(int Cod_Fun) {
        this.Cod_Fun = Cod_Fun;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getFuncao() {
        return Funcao;
    }

    public void setFuncao(String Funcao) {
        this.Funcao = Funcao;
    }

    private int Cod_Fun;
    private String Nome;
    private String Sexo;
    private String DataNascimento;
    private String RG;
    private String CPF;
    private String Funcao;
    private String Login;
    private String Senha;

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public funcionarios(String Nome, String Sexo, String DataNascimento, String RG, String CPF, String Funcao, String Login, String Senha) {
       
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.DataNascimento = DataNascimento;
        this.RG = RG;
        this.CPF = CPF;
        this.Funcao = Funcao;
        this.Login = Login;
        this.Senha = Senha;
    }

   
}


