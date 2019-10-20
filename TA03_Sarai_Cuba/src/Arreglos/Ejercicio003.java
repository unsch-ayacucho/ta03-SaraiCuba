
package Arreglos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;


public class Ejercicio003 {
    
    public static void main(String[] args){
        
        //declarando varibles
        int i;
        
        //variables para convertir un string a int
        int dato1;
        int min,j,max;
  
        String dato;
        
        //Creando lista
        ArrayList<String> numeros;
        numeros = new ArrayList();
        
        Random aleatorio = new Random();
        
        //llenar elementos del arraylist
        for(i=0;i<100;i++){
            numeros.add(Integer.toString(aleatorio.nextInt(501)));
        }
        
        //Mostrar lista
        System.out.println(numeros);
        
        //Pedir al usuario si quiere maximo o minimo
        dato = (String) JOptionPane.showInputDialog("¿Que desea descartar? (Minimo-1 ; Maximo-2)");
        
        //mostrando lo que el usuario ingreso
        System.out.println("(Minimo-1 ; Maximo-2): "+dato);
        
        //convirtiendo dato a entero
        dato1 = Integer.parseInt(dato);
         
        //minimo o maximo
        
        //minimo
        if (dato1==1){
            min = Integer.parseInt(numeros.get(0));
            for(i=0;i<100;i++){
                j = Integer.parseInt(numeros.get(i));
                if(min>j){
                    min = j;
                    //numeros.set(i,"**"+numeros.get(i)+"**");
                }
            }
            for(i=0; i<100; i++){
                if(numeros.get(i).equals(Integer.toString(min))){
                   numeros.set(i,"**"+numeros.get(i)+"**"); 
                }
            }
            System.out.println(numeros);   
        }
        
        //maximo
        else if(dato1==2){
            max = Integer.parseInt(numeros.get(0));
            for(i=0;i<100;i++){
                j= Integer.parseInt(numeros.get(i));
                if(max<j){
                    max = j;
                }
            } 
            for (i=0;i<100;i++){
                if(numeros.get(i).equals(Integer.toString(max))){
                   numeros.set(i,"**"+numeros.get(i)+"**");  
                }
            }
            System.out.println(numeros);
        }
        //opcion invalida
        else{
            System.out.println("Ingrese opcion valida");
        }
    }
}
