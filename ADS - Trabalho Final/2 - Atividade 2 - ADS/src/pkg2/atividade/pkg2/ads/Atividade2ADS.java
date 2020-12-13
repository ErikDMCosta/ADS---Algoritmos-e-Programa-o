package pkg2.atividade.pkg2.ads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author erikdmcosta
 */
public class Atividade2ADS {

        public static void main(String[] args) throws IOException {
        
                // Uma classe em Java que solicite duas Strings chamadas (“senha1”) e (“senha2”).
                BufferedReader teclado =new BufferedReader(new InputStreamReader(System.in));

                System.out.print((char)27 + "[36mCrie sua senha: "); // Strings (“senha1”)
                String senha1 = teclado.readLine(); // Strings (“senha1”)

                System.out.print("\n" + (char)27 + "[36mConfirme sua senha: "); // Strings (“senha2”)
                String senha2 = teclado.readLine(); // Strings (“senha2”)

                // 1. Conversão do conteúdo das duas Strings para maiúsculas.
                String senha1up = senha1.toUpperCase(); // Não pedia para escrever na tela
                String senha2up = senha2.toUpperCase(); // Não pedia para escrever na tela

                // 2. Verificação se as duas Strings possuem tamanho entre 3 e 5 caracteres
                int senha1cont = senha1.length();
                int senha2cont = senha2.length();

                // (< Menor que <)                  (> Maior que >)

                // Se Strings ser inferior a 3 caracteres ou superior a 5 caracteres então exibir (“Não atende aos requisitos solicitados!”))
                if (((senha1cont < 3) || (senha1cont > 5)) || ((senha2cont < 3) || (senha2cont > 5))) {
                        System.out.println("\n" + (char)27 +  "[31mNão atende aos requisitos solicitados!");

                }

                /*
                * Podendo ser representado também por:
                *
                * if ((senha1cont < 3) || (senha1cont > 5)) {
                *          System.out.print("Não atende aos requisitos solicitados!");
                * 
                * } if ((senha2cont < 3) || (senha2cont > 5)) {              // Não usaria else if pois fazem parte de de um teste inicial não secundário
                *          System.out.print("Não atende aos requisitos solicitados!");
                *}
                */

                // 3. Verificar ser as Strings são iguais se for (“Senhas conferem!”.) se não (“Senhas não conferem!”)
                if (senha1.equals(senha2)) {
                        System.out.println("\n" + (char)27 + "[32mSenhas conferem!" + "\n");

                                // (< Menor que <)                  (> Maior que >)

                // 4. Se forem iguais (equals) então verifique se pelo menos um dos caracteres for de (0 a 9)

                        // Conferindo dígito por digito para descobirir se algum número é de 0 a 9
                        int contagem = 0;
                        for (int i = 0; i < senha1.length(); i++) {
                                if (Character.isDigit(senha1.charAt(i))==true) {
                                        contagem++;
                                }
                        } // Fecha Loop

                        if (contagem != 0) {
                                System.out.println((char)27 + "[32mSenha cadastrada com sucesso!" + "\n"); // Caso sim escreva (“Senha cadastrada com sucesso!”)

                        } else {
                                System.out.println((char)27 + "[31mNão foi possível cadastrar a senha! Tente Novamente!" + "\n"); // Caso não escreva (“Não foi possível cadastrar a senha! Tente Novamente!”)
                        }

                } else {

                        System.out.println("\n" + (char)27 + "[31mSenhas não conferem!" + "\n");

                }
        
        }
    
}
