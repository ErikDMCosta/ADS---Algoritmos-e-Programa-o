package pkg3.pkgwhile.ads;

/**
 *
 * @author erikdmcosta
 */
public class WHILEADS {

    public static void main(String[] args) {
        
        int anacleto = 150;
        int felisberto = 110;
        int quantAnos = 0; 
        
        while (felisberto <= anacleto) {
            
            felisberto = felisberto +3;
            anacleto = anacleto + 2;
            quantAnos++;
        }  
            
        System.out.println("Serão " + quantAnos + " anos");
   
    }
}
