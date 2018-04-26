/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import funcionarios.funcionarios;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tiago Mendes
 */
public class LoginTest {
    funcionarios f;
    Auxiliar a;
    
    @Before
    public void setUp() {
        f = new funcionarios("Tiago", "Masculino", "20/03/1993","3.323.795", "055.688.960-99", "Master", "Tiago", "puleinaponte");
        a = new Auxiliar(f);
    }
   
    @Test
     public void LoginVazio(){
        assertFalse("O campo Login não deveria estar vazio",a.erroLoginVasio());
     }
      @Test
     public void LoginMaior(){
        assertFalse("O campo Login não deveria estar vazio",a.erroLoginMaior());
     }
     
      @Test
     public void LoginMenor(){
        assertFalse("O campo Login não deveria estar vazio",a.erroLoginMenorIgual());
     }
     
      @Test
     public void SenhaVazio(){
        assertFalse("O campo Senha não deveria estar vazio",a.erroSenhaVasio());
     }
      @Test
     public void SenhaMaior(){
        assertFalse("O campo Senha não deveria possuir mais do que 15 caracteres",a.erroSenhaMaior());
     }
     
      @Test
     public void SenhaMenor(){
        assertFalse("O campo Senha não deveria ter menos do que 3 caracteres",a.erroSenhaMenorIgual());
     }
    
     // 
      @Test
     public void NomeMaior(){
        assertFalse("O campo Nome não deve conter mais do que 50 caracteres",a.erroNomeMaior());
     }
     
     @Test
     public void NomeMenor(){
        assertFalse("O campo Nome não deve conter menos que 3 caracteres",a.erroNomeMenor());
     } 
     @Test
     public void SexoVazio(){
        assertFalse("O campo SEXO não pode estar vazio",a.erroSexoVazio());
     }
     @Test
       public void DataVazia(){
        assertFalse("O campo DATA não pode estar vazio",a.erroDataVazia());
     }
     @Test
       public void DataErrada(){
        assertFalse("O campo DATA encontra-se em um formato errado",a.erroDataErrada());
     }
     @Test
       public void RGVazio(){
        assertFalse("O campo RG não deve encontra-se vazio",a.erroRGVazio());
     }
     @Test
       public void RGErrado(){
        assertFalse("O campo RG encontra-se em um formato errado",a.erroRGerrado());
     }
     @Test
       public void CPFVazio(){
        assertFalse("O campo CPF não deve encontra-se vazio",a.erroCPFVazio());
     }
     @Test
       public void CPFErrado(){
        assertFalse("O campo CPF encontra-se em um formato errado",a.erroCPFerrado());
     }
     
     @Test
       public void validaCPF(){
        assertFalse("O campo CPF encontra-se em um formato errado",a.ValidaCPF("055.688.983-59"));
     }
       
     @Test
       public void validaRG(){
        assertFalse("O campo RG encontra-se em um formato errado",a.ValidaRG());
     }
}