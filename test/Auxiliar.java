
import com.sun.xml.internal.ws.util.StringUtils;
import funcionarios.funcionarios;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Auxiliar {
    funcionarios f;
   
    public Auxiliar(funcionarios f){
    this.f = f;
    
    }
  public boolean erroLoginVasio(){
        if(f.getLogin().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
  
  public boolean erroLoginMaior(){
        if(f.getLogin().length() > 15){
            return true;
        }else{
            return false;
        }
    }
  
  public boolean erroLoginMenorIgual(){
        if(f.getLogin().length() <= 3 ){
            return true;
        }else{
            return false;
        }
    }
  
  public boolean erroSenhaVasio(){
        if(f.getLogin().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
  
  public boolean erroSenhaMaior(){
        if(f.getSenha().length() > 15){
            return true;
        }else{
            return false;
        }
    }
  
  public boolean erroSenhaMenorIgual(){
        if(f.getSenha().length() <= 3 ){
            return true;
        }else{
            return false;
        }
    }
   
  // Testes para a função cadastrar administradores
  
   public boolean erroNomeMaior(){
        if(f.getNome().length() > 50){
            return true;
        }else{
            return false;
        }
    }
  public boolean erroNomeMenor(){
        if(f.getNome().length() <= 3){
            return true;
        }else{
            return false;
        }
    }
  
  public boolean erroSexoVazio(){
        if(f.getSexo().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
  
  public boolean erroDataVazia(){
        if(f.getDataNascimento().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
  
   public boolean erroDataErrada(){
        if(f.getDataNascimento().length()!= 10){
            return true;
        }else{
            return false;
        }
    }
   
   public boolean erroRGVazio(){
        if(f.getRG().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
  public boolean erroRGerrado(){
        if(f.getRG().length()!= 9){
            return true;
        }else{
            return false;
        }
    }
  
   public boolean erroCPFVazio(){
        if(f.getCPF().isEmpty()){
            return true;
        }else{
            return false;
        }
    }
  public boolean erroCPFerrado(){
        if(f.getCPF().length()!= 14){
            return true;
        }else{
            return false;
        }
    }
  public boolean ValidaCPF(String cpfx) {
        String cpf = cpfx;

        if (cpf.matches("[0-9]{11}") || cpf.matches("([0-9]{3}+[\\.]{1}+[0-9]{3}+[\\.]{1}+[0-9]{3}+[\\-]{1}+[0-9]{2})")) {

            cpf = cpf.replaceAll("\\.", "").replaceAll("-", ""); //Remove pontos e o traço, caso existam

            String primeiroCaractere = cpf.substring(0, 1); //Busca o primeiro caractere

            String removerRepeticoes = cpf.replaceAll(primeiroCaractere, ""); //Remove as repetições do primeiro caractere

            if (removerRepeticoes.length() > 0) {

                int somatorio1 = 0, somatorio2 = 0, peso1 = 10, peso2 = 11, numero;

                String[] vetorCPF = cpf.split("");

                for (int i = 0; i < 10; i++) {

                    numero = Integer.parseInt(vetorCPF[i]); //Transforma o elemento do vetor em um número inteiro para ser multiplicado

                    somatorio1 = (i < 9) ? somatorio1 + (numero * peso1) : somatorio1; //Realiza o somatório para o primeiro digito verificador, utilizando somente os 9 primeiros dígitos

                    somatorio2 = somatorio2 + (numero * peso2); //Realiza o somatório para o segundo digito verificador

                    peso1--; //Subtrai 1 do peso para o primeiro digito verificador

                    peso2--; //Subtrai 1 do peso para o segundo digito verificador

                }

                int valor1 = 11 - (somatorio1 % 11); //Subtrai o resto da divisão inteira do primeiro somatório por 11, de 11.

                int valor2 = 11 - (somatorio2 % 11); //Subtrai o resto da divisão inteira do segundo somatório por 11, de 11.

                int digitoVerificador1 = (valor1 > 9) ? 0 : valor1; //Substitui por 0 se o valor maior que 9.

                int digitoVerificador2 = (valor2 > 9) ? 0 : valor2; //Substitui por 0 se o valor maior que 9.

                //transformar o valor do elemento do vetor em um inteiro antes de se fazer a comparação
                if (Integer.parseInt(vetorCPF[9]) == digitoVerificador1 && Integer.parseInt(vetorCPF[10]) == digitoVerificador2) {

                    return true;

                }

            }
        }
        return false;
    }

    public boolean ValidaRG() {
        String aux = f.getRG();
    
        if(!aux.matches("([0-9]{1}+[\\.]{1}+[0-9]{3}+[\\.]{1}+[0-9]{3})")){
            
            return true;
            
        
        }else{return false;}
}
}


