import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Introduce el nombre de 3 personas:");

        System.out.println("Primera persona: ");

        String nombre1 = in.nextLine();

        System.out.println("Segunda persona: ");

        String nombre2 = in.nextLine();

        System.out.println("Tercera persona: ");

        String nombre3 = in.nextLine();

        System.out.println("Introduce el año de nacimiento de esas 3 personas:");

        System.out.println("Introduce el año de nacimiento de "+nombre1);

        int año1 = in.nextInt();

        System.out.println("Introduce el año de nacimiento de "+nombre2);

        int año2 = in.nextInt();

        System.out.println("Introduce el año de nacimiento de "+nombre3);

        int año3 = in.nextInt();

        año1 = 2023 - año1;
        año2 = 2023 - año2;
        año3 = 2023 - año3;

        if (año1 >= año2){

            if (año1 >= año3){

                if (año2 >= año3){

                    System.out.println("El mas grande es "+nombre1+" con "+año1+" años");
                    System.out.println("El segundo mas grandes es "+nombre2+" con "+ año2+" años");
                    System.out.println("El mas pequeño es "+nombre3+" con "+ año3+" años");

                } else {

                    System.out.println("El mas grande es " + nombre1 + " con " + año1+" años");
                    System.out.println("El segundo mas grandes es " + nombre3 + " con " + año3+" años");
                    System.out.println("El mas pequeño es " + nombre2 + " con " + año2+" años");

                }

            } else {

                System.out.println("El mas grande es " + nombre3 + " con " + año3+" años");
                System.out.println("El segundo mas grandes es " + nombre1 + " con " + año1+" años");
                System.out.println("El mas pequeño es " + nombre2 + " con " + año2+" años");

            }

        } else if (año1 >= año3){

            System.out.println("El mas grande es " + nombre2 + " con " + año2+" años");
            System.out.println("El segundo mas grandes es " + nombre1 + " con " + año1+" años");
            System.out.println("El mas pequeño es " + nombre3 + " con " + año3+" años");

        } else if (año2 >= año3){

            System.out.println("El mas grande es " + nombre2 + " con " + año2+" años");
            System.out.println("El segundo mas grandes es " + nombre3 + " con " + año3+" años");
            System.out.println("El mas pequeño es " + nombre1 + " con " + año1+" años");

        } else {

            System.out.println("El mas grande es " + nombre3 + " con " + año3+" años");
            System.out.println("El segundo mas grandes es " + nombre2 + " con " + año2+" años");
            System.out.println("El mas pequeño es " + nombre1 + " con " + año1+" años");

        }



    }
}