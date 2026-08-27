package app;

import java.util.Arrays;
import java.util.Scanner;

public class Inverte {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Integer[] array = new Integer[5];
        Integer[] inv = new Integer[5];
        for(int i = 0 ; i<array.length; i++){
            array[i] = teclado.nextInt();
        }
        for(int i = 0 ; i < array.length; i++){
            //System.out.print(i+ "valor de i  ");
            //System.out.println("Valor de i-a" + (array.length-i-1));
            inv[i] = array[array.length-1-i];
            System.out.println(inv[i]);
            
        }


    }
}
