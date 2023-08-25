public class ejercicio2 {
public static void main(String[] args) {

        int jugador1 = 0;
        int jugador2 = 0;

        System.out.println("JUEGO DE DADOS!!  \n");

        for (int i = 0; i < 4; i++) {
        if (i < 2) {
        // Turno del jugador 1
        //generar los resultados aleatorios para el jugador 1
        int resultadoJugador1 = (int) (Math.random() * 6) + 1;
        jugador1 += resultadoJugador1;
        System.out.println("Jugador 1 lanzó un dado y obtuvo: " + resultadoJugador1);
        } else {
        // Turno del jugador 2
        //generar los resultados aleatorios para el jugador 2
        int resultadoJugador2 = (int) (Math.random() * 6) + 1;
        jugador2 += resultadoJugador2;
        System.out.println("Jugador 2 lanzó un dado y obtuvo: " + resultadoJugador2);
        }
        }
        //impresión de los resultados por jugador
        System.out.println("\nResultados: ");
        System.out.println("Jugador 1: " + jugador1);
        System.out.println("Jugador 2: " + jugador2);

        //anuncio del ganador, perdedor o si hay un empate
        if (jugador1 > jugador2) {
        System.out.println("¡El ganador es el Jugador 1!");
        } else if (jugador2 > jugador1) {
        System.out.println("¡El ganador es el Jugador 2!");
        } else {
        System.out.println("¡Es un empate!");
        }
        }
        }
