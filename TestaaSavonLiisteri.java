

import java.util.Scanner;


public class TestaaSavonLiisteri {

   
    public static void main(String[] args) {
        double leveys, korkeus, nelioHinta;
        Scanner input = new Scanner(System.in);
        System.out.println("Ohjelma laskee huoneen tapetin kustannuksen. ");
        System.out.println("Anna huoneen leveys: ");
        leveys = input.nextDouble();
        System.out.println("Anna huoneen korkeus: ");
        korkeus = input.nextDouble();
        System.out.println("Anna tapetin neliohinta: ");
        nelioHinta = input.nextDouble();
        HuoneenMitat mitat = new HuoneenMitat(leveys, korkeus);
        Tapetti tapetti = new Tapetti(mitat, nelioHinta);
        System.out.printf("Tapetin kustannus on %.2f",tapetti.tapetinHinta());
    }
    
}