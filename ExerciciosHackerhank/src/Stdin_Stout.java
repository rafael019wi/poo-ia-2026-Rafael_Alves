import java.util.Scanner;

public class Stdin_Stout {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner teclado = new Scanner(System.in);
        // String myString = teclado.next();
        int i1 = teclado.nextInt();
        int i2 = teclado.nextInt();
        int i3 = teclado.nextInt();
        teclado.close();

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

    }
}
