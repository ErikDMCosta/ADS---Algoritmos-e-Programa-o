package pkg1.pkgwhile.ads;

import java.util.Scanner;

/**
 *
 * @author erikdmcosta
 */
public class WHILEADS {

    public static void main(String[] args) {
        
        int soma = 0;
        int loop = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva um número: ");
        int num = teclado.nextInt();
        while(loop <= num) {
            soma += loop;
            loop += 1;
            System.out.println(" + " + " = " + soma);
        }
        
    }
    
}
