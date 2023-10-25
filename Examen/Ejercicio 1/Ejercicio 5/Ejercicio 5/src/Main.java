import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca su año de nacimiento:");

        int año = in.nextInt();

        if (año < 1970) {

            System.out.println("Ya eres tod@ un@ viej@ de "+(2023-año)+" años");

        } else if ((año >= 1970) && (año < 1980)){

            System.out.println("Eres un@ baby boomeer de "+(2023-año)+" años");

        } else if ((año >= 1980) && (año < 1990)){

            System.out.println("Eres un@ ochentero de "+(2023-año)+" años");

        } else if ((año >= 1990) && (año < 2000)){

            System.out.println("Eres un@ final de siglo de "+(2023-año)+" años");

        } else {

            System.out.println("Eres un@ pipiol@ de "+(2023-año)+" años");

        }
    }
}