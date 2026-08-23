import java.util.Scanner;

public class Stdin_Stout_II {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        double b = teclado.nextDouble();

        String pula = teclado.nextLine();
        String c =teclado.nextLine();

        System.out.println("String: " + c);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
    }
}
