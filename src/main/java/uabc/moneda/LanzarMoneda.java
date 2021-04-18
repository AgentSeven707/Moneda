package uabc.moneda;

import java.util.Scanner;

/**
 *
 * @author Princ
 */
public class LanzarMoneda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner(System.in);
        String r = "";
        int cuantos = 0;
        Moneda moneda = new Moneda();
        
        do{
            moneda.lanzarMoneda();
            cuantos=cuantos+1;
            System.out.println("\n¿Quieres lanzar otra moneda?: (s/n)");
            r = lectura.nextLine();
        }while (!r.equalsIgnoreCase("n"));
        
        System.out.println("\nLanzaste " + cuantos + " monedas. "); 
        moneda.lanzamientos();
    }
    
}
