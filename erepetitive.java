import java.util.Scanner;
public class erepetitive {

    static Scanner teclado=new Scanner(System.in);
    
    public static void suma10numeros() {
        //Declarar variables
        int contador=1;
        double numeros, sumanumeros=0;
        //datos de entrada y proceso
        while (contador<=10) {
            System.out.println("Ingrese el valor del contador "+contador+":");
            numeros=teclado.nextDouble();
            sumanumeros=sumanumeros+numeros;
            contador++;
        }
        System.out.println("La suma de los 10 numeros es: "+sumanumeros);
    }

    public static void main(String[] args) {
        System.out.println("Buenas a todos!");
        suma10numeros();
    }
}
