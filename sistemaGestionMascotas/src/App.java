/*
Examen Java - Sistema de Gestión de Mascotas
Nombre: Martin Correa
Fecha: 30 de marzo del 2026
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionMascotas control = new GestionMascotas();
        int opcion = 0;

        do {
            try { // Manejo de errores de entrada 
                System.out.println("\n===== GESTION DE MASCOTAS =====");
                System.out.println("1. Registrar mascota");
                System.out.println("2. Mostrar mascotas");
                System.out.println("3. Sonido de mascota por ID");
                System.out.println("4. Buscar mascota por nombre");
                System.out.println("5. Salir");
                System.out.print("Elija una opcion: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Seleccione tipo: 1. Perro | 2. Gato (Ingrese numero)");
                        int tipo = sc.nextInt();
                        System.out.print("Ingrese ID: "); 
                        int id = sc.nextInt();
                        sc.nextLine(); // Limpiar buffer
                        System.out.print("Ingrese Nombre: "); 
                        String nom = sc.nextLine();
                        System.out.print("Ingrese Edad: "); 
                        int edad = sc.nextInt();
                        if (tipo == 1) {
                            // Si eligio 1, creamos un objeto de la subclase Perro
                            control.registrarMascota(new Perro(id, nom, edad));

                        }
                        
                        else if (tipo == 2) {
                            // Si eligio 2, creamos un objeto de la subclase Gato
                            control.registrarMascota(new Gato(id, nom, edad));
                        }
                        else {
                            System.out.println("Tipo no valido.");
                        }
                        break;

                    case 2:
                        control.mostrarMascotas();
                        break;

                    case 3:
                        System.out.print("ID de la mascota: ");
                        control.sonarPorId(sc.nextInt());
                        break;

                    case 4:
                        sc.nextLine();
                        System.out.print("Nombre de la mascota: ");
                        control.buscarPorNombre(sc.nextLine());
                        break;

                    case 5:
                        System.out.println("Saliendo del sistema..."); 
                        break;

                    default:
                        System.out.println("Opcion invalida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada incorrecta. Use numeros.");
                sc.nextLine(); // Limpiar buffer para evitar bucle 
            }
        } while (opcion != 5);
        sc.close();
    }
}
