import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //se le pide al usuario que ingrese su nombre para hacer recuento de las iniciales
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        //se divide el nombre en palabras
        String[] palabras = nombre.split(" ");

        // Imprimir las iniciales entre asteriscos
        for (String palabra : palabras) {
            char inicial = Character.toUpperCase(palabra.charAt(0));
            System.out.print("**" + inicial + "**\t");
        }
    }
}

