import java.util.Scanner;

import static java.lang.Math.pow;

public class Loops_II {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner teclado = new Scanner(System.in);
        int querrys = teclado.nextInt();
        int a[][] = new int[querrys][3];

        for(int i = 0 ; i<querrys;i++){
            for(int j = 0 ; j<3;j++){
                a[i][j] = teclado.nextInt();
                //System.out.print(a[i][j] + " ");
            }
            //System.out.print("\n");
        }
        for(int i = 0 ; i<querrys;i++){
            int soma = a[i][0];

            for(int j = 0 ; j < a[i][2];j++){
                //tamanho
                double n1 = a[i][1];
                double n2 = j;
                int fatorial = (int) (pow(2,n2));
                //System.out.println(fatorial + " fat");
                soma += a[i][1] * fatorial;
                System.out.print(soma + " ");
            }
            //linhas
            System.out.println(" ");
        }

    }
}
