import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca su satisfacción en nuestra casa rural de Valleseco:\n(0-5) Siendo 0 la peor y 5 la mejor");

        double puntuacion = in.nextDouble();

        if (puntuacion >= 0 && puntuacion < 1){

            System.out.println("No vuelvo jamas");

        } else if (puntuacion >= 1 && puntuacion < 3 ){

            System.out.println("Ni fu Ni fa");

        } else if (puntuacion >= 3  && puntuacion < 4){

            System.out.println("Lo mismo de siempre");

        } else if (puntuacion >= 4 && puntuacion < 5){

            System.out.println("La recomendaré");

        } else if (puntuacion == 5){

            System.out.println("Fántastico");

        } else {

            System.out.println("Introduzca un numero valido para la valoración");

        }



    }
}