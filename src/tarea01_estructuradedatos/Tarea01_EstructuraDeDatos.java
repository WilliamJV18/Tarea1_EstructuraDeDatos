
package tarea01_estructuradedatos;


public class Tarea01_EstructuraDeDatos {

    
    public static void main(String[] args) {
        
        int diagonal1=0, diagonal2=0, granTotal=0;
        int matriz[][] = new int[3][3];
        int contador=1;
        int C=matriz.length-1;
        
        for (int digf = 0; digf < matriz.length; digf++) {
            for (int digc = 0; digc < matriz.length; digc++) {
                matriz[digf][digc] = contador++;
            }
        }
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print("  "+matriz[f][c]);
                if (f==c){ 
                    diagonal1 += matriz[f][c];
                }
                int F=f;
                if (F==f&c==C){ 
                    diagonal2 += matriz[f][c];
                    C--;  
                }
            }
            System.out.println(" ");
        }
        granTotal = diagonal1+diagonal2;
        System.out.println(" ");
        System.out.println("Sumatoria de la diagonal 1: "+diagonal1);
        System.out.println("Sumatoria de la diagonal 2: "+diagonal2);
        System.out.println("La suma total es de: "+granTotal);
        
    }
    
}
