package pkg4.manipula.string.ads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erikdmcosta
 */

        /*
        *                             QUESTÃO 4
        * Escreva um algoritmo que leia uma String chamada 
        * “texto” e outras duas Strings chamadas “a” e “b”. 
        * Toda vez que o texto contido na String “a” aparecer no 
        * texto,deve ser substituída pelo texto  armazenado na String “b”
        */

public class ManipulaStringADS {

    public static void main(String[] args) throws IOException {
        String troca;
        
        System.out.println((char)27 + "[35m =-=-=-=-=-=-= Troca de Strings =-=-=-=-=-=-=");
        
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("\n" + (char)27 + "[33mEscreva uma palavra: ");
        String texto = teclado.readLine();
        System.out.println("\n" + (char)27 + "[37mTermo (Texto) escolhido foi de " + "'" + texto + "'");
        
        System.out.print("\n" + (char)27 + "[33mEscreva uma palavra: ");
        String a = teclado.readLine();
        System.out.println("\n" + (char)27 + "[37mTermo (A) escolhido foi de " + "'" + a + "'");
        
        System.out.print("\n" + (char)27 + "[33mEscreva outra palavra: ");
        String b = teclado.readLine();
        System.out.println("\n" + (char)27 + "[37Termo (B) escolhido foi de " + "'" + b + "'" + "\n");
        
        System.out.println((char)27 + "[35m =-=-=-=-=-=-= Resultado =-=-=-=-=-=-=");;
        
        if (texto.equals(a)) {
                troca = texto.replace(a,b);
                System.out.println((char)27 + "[31mO termo (Texto) ficou " + texto);
                System.out.println((char)27 + "[34mO termo (A) ficou " + troca);
                System.out.println((char)27 + "[36mO termo (B) ficou " + b);
                
        } else {
                System.out.println((char)27 + "[31mO termo (Texto) ficou " + texto);
                System.out.println((char)27 + "[34mO termo (A) ficou " + a);
                System.out.println((char)27 + "[36mO termo (B) ficou " + b);
                
        }
        
    }
    
}
