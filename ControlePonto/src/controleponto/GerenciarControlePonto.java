
package controleponto;

import java.time.LocalDate;
import java.time.LocalDateTime;




public class GerenciarControlePonto {

   
    public static void main(String[] args) {
        Gerente ger = new Gerente(); 
        RegistroPonto rpger = new RegistroPonto();
        rpger.setFunc(ger);
        ger.setNome("Rogério Carvalho");
        rpger.setDataRegistro(LocalDate.now());
        rpger.setHoraEntrada(LocalDateTime.now());
        rpger.apresentarRegistroPonto();
        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
            
        }
        
        Secretaria sec = new Secretaria(); 
        RegistroPonto rpsec = new RegistroPonto();
        rpsec.setFunc(sec);
        sec.setNome("Sasha");
        rpsec.setDataRegistro(LocalDate.now());
        rpsec.setHoraEntrada(LocalDateTime.now());
        rpsec.apresentarRegistroPonto();
        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
            
        }
        
        Operador ope = new Operador(); 
        RegistroPonto rpope = new RegistroPonto();
        rpope.setFunc(ope);
        ope.setNome("Lucas Rodrigues");
        rpope.setDataRegistro(LocalDate.now());
        rpope.setHoraEntrada(LocalDateTime.now());
        rpope.apresentarRegistroPonto();
        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
            
        }
        
       ger.setNome("Rogério Carvalho");
        rpger.setDataRegistro(LocalDate.now());
        rpger.getHoraEntrada();
        rpger.setHoraSaida(LocalDateTime.now());
        rpger.apresentarRegistroPonto();
        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
            
        }
        
        sec.setNome("Sasha");
        rpsec.setDataRegistro(LocalDate.now());
        rpsec.getHoraEntrada();
        rpsec.setHoraSaida(LocalDateTime.now());
        rpsec.apresentarRegistroPonto();
       
        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
            
        }
        
        ope.setNome("Lucas Rodrigues");
        rpope.setDataRegistro(LocalDate.now());
        rpope.getHoraEntrada();
        rpope.setHoraSaida(LocalDateTime.now());
        rpope.apresentarRegistroPonto();
        try {
            Thread.sleep(1000);
        } catch (Exception erro) {
            
        }
    }
    
}
