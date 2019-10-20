
package Arreglos;

import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class Ejercicio001 {
    
    public static void main(String[] args) {
       
       int i = 0;
       String dato, dato2;
    
       Random numeros = new Random();
       
       String lista[];
       lista = new String[100];
       String aux;
       
       for (i=0;i<lista.length;i++){
           lista[i]= Integer.toString(numeros.nextInt(21));//agregamos elementos a la lista
       }
        System.out.println(" "+Arrays.toString(lista)+" ");
       
       dato = (String) JOptionPane.showInputDialog("Ingrese el numero que desee cambiar: ");
       dato2 = (String) JOptionPane.showInputDialog("Ingrese numero nuevo: ");
       
       for (i=0;i<lista.length;i++){
           if(dato.equals(lista[i])){
               lista[i]= ((char)34+dato2+(char)34);//codigo ASCII para agregar comillas(char)34
           }
       }
        System.out.println(" "+Arrays.toString(lista)+" ");
    }          
}
        
        
        
    
    

