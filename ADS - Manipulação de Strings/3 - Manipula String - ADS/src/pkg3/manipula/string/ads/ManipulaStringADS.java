package pkg3.manipula.string.ads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erikdmcosta
 */

        /*
        *                                         QUESTÃO 3
        * Escreva um algoritmo que leia uma String e mostre na tela a String invertida.
        * Exemplo: se o usuário digitar “ALGORITMOS” deve-se mostrar na tela
        * “SOMTIROGLA”
        */
        
public class ManipulaStringADS {

    public static void main(String[] args) throws IOException {
        System.out.println((char)27 + "[35m =-=-=-=-=-=-= Invertedor de Strings =-=-=-=-=-=-=");
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\n" + (char)27 + "[33mEscreva uma palavra para inverter: ");
        String resposta = teclado.readLine();
        
        StringBuffer reverso = new StringBuffer(resposta);
        reverso.reverse();
        
        System.out.println("\n" + (char)27 + "[37m =-= Invertendo Ficou =-=");
        System.out.println((char)27 + "[1;36m           " + reverso);
        
    }
    
}
