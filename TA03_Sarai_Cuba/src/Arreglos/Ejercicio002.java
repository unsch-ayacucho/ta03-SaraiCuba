
package Arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio002 {
    
    public static void main(String[] args) {
    
        int i,j ;// contador del for
        int c, a = 0;
        int n = 10;
        
        //Declaramos lista
        ArrayList<Integer> numeros;
        numeros = new ArrayList(n);
        
        //lista que se mostrará 
        ArrayList<Integer>nprimos;
        nprimos = new ArrayList();
        
        
        //Llenar la primera lista
        for(i=0;i<n;i++){
            Scanner entrada = new Scanner(System.in);
            System.out.print((i+1)+".-Ingrese numero: ");
            numeros.add(entrada.nextInt());
            
        }
        System.out.println("\n"+numeros+"\n");
        
        //Verificando que numeros son primos
        for(i=0;i<10;i++){
            c=0;
            for(j=1;j<=numeros.get(i);j++){
                if(numeros.get(i) % j==0){
                    c++;
                }
            }
            if(c <= 2){
                nprimos.add(a,numeros.get(i));
                a++;
            }
            else{
                nprimos.add(numeros.get(i));
            }
        }
        System.out.println(nprimos+"\n");  
    }        
}
