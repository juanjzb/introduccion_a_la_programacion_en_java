import java.util.Scanner;

public class introduccion_a_la_sintaxis {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        int edad;
        String nombre;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        nombre = input.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = input.nextInt();

        System.out.println("Su nombre es " + nombre + ", y su edad es: " + edad);

        input.close();
    }
}