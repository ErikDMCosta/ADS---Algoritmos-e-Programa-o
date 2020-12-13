package pkg4.pkgwhile.ads.cópia.pkg1;

import java.util.Scanner;

/**
 *
 * @author erikdmcosta
 */
public class WHILEADS {

    public static void main(String[] args) {
        float saldo = 0.0f;
        int descisao = 0;
        
        while(descisao != 4) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Quatro opções:"
            + "\n(1) Consulta Saldo"
            + "\n(2) Saque"
            + "\n(3) Depósito"
            + "\n(4) Sair"
            + "\n Sua resposta: ");
            descisao = teclado.nextInt();

            switch(descisao){
            case 1:                
                System.out.println("Seu saldo corresponde em R$ " + saldo);

            case 2:
                Scanner key = new Scanner(System.in);
                System.out.print("Quanto deseja sacar em R$ ");
                float saque = key.nextFloat();
                if (saque > saldo){
                    System.out.println ("Saldo Insuficiente!");
                } else {
                    saldo -= saque;
                    System.out.println ("R$ " + saque + " sacados da sua conta.");               
                }
                
            case 3:
                Scanner valordep = new Scanner(System.in);
                System.out.print("Digite o valor a ser depositado: ");
                float deposito = valordep.nextFloat();
                saldo += deposito;
                System.out.println("R$ " + deposito + " depositado em sua conta.");

            default:
                System.out.println("Digito inválido. Tente novamente!");
            }
        }
        System.out.println("Programa Finalizado!");

    }
}
