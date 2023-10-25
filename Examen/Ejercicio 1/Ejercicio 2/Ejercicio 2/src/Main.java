import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        System.out.println("Escribe un numero de 3 cifras: ");

        int cifras = in.nextInt();
        int unidades = 0;
        int centenas = 0;
        int decenas = 0;
        unidades = cifras % 10;
        centenas = cifras / 100;
        decenas = (cifras /10) % 10;

        if (cifras >= 100 && cifras <= 999){

            System.out.println("Ese numero tiene: "+centenas+" centenas, "+decenas+" decenas y "+unidades+" unidades.");

        } else {

            System.out.println("Escriba un numero de 3 cifras.");

        }
    }
}