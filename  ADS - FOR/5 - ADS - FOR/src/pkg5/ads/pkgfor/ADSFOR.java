package pkg5.ads.pkgfor;

import java.util.Scanner;

public class ADSFOR {

    public static void main(String[] args) {
        int digito;
        Scanner ler = new Scanner(System.in);
        System.out.println("*~*~*~*~*~**~*~*~*~*~**~*~*~*~*~*~*");
        System.out.print("Informe um número para a tabuada: \n");
        digito = ler.nextInt();
        int resultado;
        System.out.println("*~*~*~*~*~*~* TABUADA *~*~*~*~*~*~*");
        for ( int ponto = 0; ponto < 10; ponto++ ) {
            resultado = digito * ponto;
            System.out.println(digito + " X " + ponto + " = " + resultado);
        }
    }
    
}
