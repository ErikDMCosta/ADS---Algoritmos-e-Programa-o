package pkg1.atividade.pkg1.ads;

import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 *
 * @author erikdmcosta
 */
public class Atividade1ADS {

         public static void main(String[] args) {
                  System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= ATIVIDADE 1 =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                  
                  System.out.println((char)27 + "[37m           Imagine que sejam digitados os valores 11 para a variável\n"
                          + (char)27 + "[37m           divisor e 3,2 para a variável dividendo, o resultado da\n"
                          + (char)27 + "[37m           divisão é apresentado na figura abaixo: \n");

                  System.out.println((char)27 + "[37m Pesquise sobre o uso de NumberFormat"
                          + (char)27 + "[37m ou DecimalFormat em Java e altere a classe\n"
                          + (char)27 + "[37m acima de forma a exibir o resultado da divisão"
                          + (char)27 + "[37m com apenas duas casas decimais.\n");
                  System.out.println((char)27 + "[35m=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                  System.out.println("\n" + (char)27 + "[31m                               ATIVIDADE ABAIXO!");
                  
                  //Início do código que é dado no enunciado com pequenas alterações de impressão na tela
                  Scanner entrada = new Scanner(System.in);      
                  System.out.println((char)27 + "[33m");
                  System.out.print("Divisor: ");
                  double divisor = entrada.nextDouble(); 
                  System.out.print("\nDividendo: ");
                  double dividendo = entrada.nextDouble();
                  double resultado = dividendo / divisor;
                  System.out.print("\nResultado: " + resultado + "\n");
                  //Termino do código que é dado no enunciado com pequenas alterações de impressão na tela
                  
                  entrada.close();       // Resolvi fechar :V

                  // Usando NumberFormat para formatar com apenas duas casas decimais da variavel (resultado)
                  NumberFormat formatacao = NumberFormat.getNumberInstance();
                  formatacao.setMaximumFractionDigits(2);
                  System.out.println("\nUsando NumberFormat com duas casas decimais ficou: " + formatacao.format(resultado));

                  // Usando DecimalFormat para formatar com apenas duas casas decimais da variavel (resultado)
                  DecimalFormat decimal = new DecimalFormat("0.##");
                  String formatodecimal = decimal.format(resultado);
                  System.out.println("\nUsando DecimalFormat com duas casas decimais ficou: " + formatodecimal + "\n");

        }

}
