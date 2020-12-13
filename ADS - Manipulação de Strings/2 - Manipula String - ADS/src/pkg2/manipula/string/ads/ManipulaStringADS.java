package pkg2.manipula.string.ads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erikdmcosta
 */

        /*
        *                                              QUESTÃO 2
        * Escreva um algoritmo que leia duas Strings. Após isso, o programa deve
        * concatenar as informações lidas e mostrar o resultado para o usuário.
        * Exemplo: Se a primeira String digitada for "Bom dia, " e a segunda "moçada!",
        * então o resultado
        * deverá ficar: "Bom dia, moçada!".
        */

public class ManipulaStringADS {

    public static void main(String[] args) throws IOException {
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print((char)27 + "[33mDigite uma palavra: ");
        String answerone =  teclado.readLine();
        
        System.out.print("\n" + (char)27 + "[33mDigite outra palavra: ");
        String answertwo = teclado.readLine();
        
        String view = answerone.concat(" "+answertwo);

        System.out.println("\n" + "               " + (char)27 + "[36m" + view);
        
    }
    
}
