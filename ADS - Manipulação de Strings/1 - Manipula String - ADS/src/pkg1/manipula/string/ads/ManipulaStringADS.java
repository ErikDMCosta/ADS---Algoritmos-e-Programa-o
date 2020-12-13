package pkg1.manipula.string.ads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erikdmcosta
 */

        /*
        *                                                  QUESTÃO 1
        * Elabore um algoritmo para testar se uma senha digita é igual a “batatafrita”. Se a
        * senha estiver correta escreva “Acesso permitido”, do contrário emita a mensagem
        * “Você não tem acesso ao sistema”.
        */
        
public class ManipulaStringADS {

    public static void main(String[] args) throws IOException {
        String keysalva = "batatafrita";
        
        System.out.println("\n" + (char)27 + "[35m =-=-=-=-=-=-= CAMPO DE LOGIN =-=-=-=-=-=-=");
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("\n" +(char)27 + "[33mDigite a senha: "); // BufferedReader - NOVA SKILL ADQUIRIDA COM SUCESSO ! (TAM TAM TANNN)
        String keytry = teclado.readLine();
        
        if (keytry.equals(keysalva)){
                System.out.println("\n" + (char)27 + "[34m              Acesso permitido" + "\n");
        
        } else {
                System.out.println("\n" + (char)27 + "[31m      Você não tem acesso ao sistema" + "\n");
            
        }
        
    }
    
}
