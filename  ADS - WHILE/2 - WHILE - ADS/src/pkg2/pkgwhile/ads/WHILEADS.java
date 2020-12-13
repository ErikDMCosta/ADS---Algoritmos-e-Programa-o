package pkg2.pkgwhile.ads;

import java.util.Scanner;

/**
 *
 * @author erikdmcosta
 */
public class WHILEADS {

    public static void main(String[] args) {

        int meta = 20;
        int loops = 1;
        int resultado;
        System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
        while(loops <= 20) {
            
            if (loops % 5 == 0) {
                System.out.println("O número " + loops + " é múltiplo por 5.");
            } else {
                System.out.println("O número " + loops + " não é múltiplo por 5.");
            }
            System.out.println("-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-~-");
            loops = loops + 1;
        }
       
    }
    
}
