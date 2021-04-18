package uabc.moneda;

/**
 *
 * @author Princ
 */
public class Moneda {
    
    private int cara = 1;
    private int cruz = 2;
    private int a = 0;
    private int b = 0;
    
    public void lanzarMoneda(){
        int x = (int)(Math. random()*2+1);
        
        if(cara==x){
                
            a=a+1; 
            System.out.println("\nEl resultado es cara");
        }
        else {
                
            b=b+1;
            System.out.println("\nEl resultado es cruz");
        }
    }
    
    public void lanzamientos()
    {
        System.out.println("El resultado de cara: " +a);
        System.out.println("El resultado de cruz: " +b);
    }
}
