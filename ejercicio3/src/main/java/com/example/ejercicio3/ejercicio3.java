import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {

// el programa fragmenta el nombre completo y cuenta la cantidad de letras de cada una

        Scanner scanner = new Scanner(System.in);
        //pedir al usuario su nombre completo
        System.out.print("Ingrese el nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        //se hace el recorrido caracter por caracter para contar las letras

        int inicioPalabra = 0;
        for (int i = 0; i < nombreCompleto.length(); i++) {
            if (nombreCompleto.charAt(i) == ' ') {
                String palabra = nombreCompleto.substring(inicioPalabra, i);
                int cantidadLetras = i - inicioPalabra;
                System.out.println(palabra + ": " + cantidadLetras + " letras");
                inicioPalabra = i + 1;
            }
        }

        //imprime la cantidad d eletras ya contadas y separadas
        String palabra = nombreCompleto.substring(inicioPalabra);
        int cantidadLetras = nombreCompleto.length() - inicioPalabra;
        System.out.println(palabra + ": " + cantidadLetras + " letras");
    }
}
