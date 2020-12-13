package pkg3.ads.pkgfor;

public class ADSFOR {
    
    public static void main(String[] args) {
        int calculo = 0;
        for ( int ponto = 1; ponto < 11; ponto++ ) {
            calculo += ponto; // Utilizei += como no Pỳthon o Java aceita também
            System.out.print(ponto + " ");
              
        }
        System.out.println("= " + calculo);
    }
    
}
