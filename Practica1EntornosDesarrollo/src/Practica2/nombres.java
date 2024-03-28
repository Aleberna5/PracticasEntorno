package Practica2;



import java.util.Scanner;

public class nombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        // Solicitar apellidos
        System.out.print("Ingrese sus apellidos: ");
        String apellidos = scanner.nextLine();

        // Solicitar edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Mostrar los datos ingresados por el usuario
        System.out.println("Datos ingresados:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);

        // Cerrar el scanner
        scanner.close();
    }
}
