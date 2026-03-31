/*
Descricpion:
    Clase gestora que administra la lista de mascotas, permitiendo agregar, eliminar y mostrar las mascotas registradas en el sistema.
*/

import java.util.ArrayList;
public class GestionMascotas {

    private ArrayList<Mascota> listaMascotas;

    public GestionMascotas() {
        this.listaMascotas = new ArrayList<>();
    }

    // Registro con validaciones
    public void registrarMascota(Mascota nuevaMascota) {
        if (nuevaMascota.getId() <= 0) {
            System.out.println("Error: El ID debe ser mayor a 0."); 
            return;
        }
        if (nuevaMascota.getNombre() == null || nuevaMascota.getNombre().trim().isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacio."); 
            return;
        }
        if (nuevaMascota.getEdad() <= 0) {
            System.out.println("Error: La edad debe ser mayor a 0.");
            return;
        }
        
        listaMascotas.add(nuevaMascota);
        System.out.println("Mascota registrada con exito.");
    }
     // Mostrar todas usando polimorfismo
    public void mostrarMascotas() {
        if (listaMascotas.isEmpty()) {
            System.out.println("No hay mascotas registradas."); 
            return;
        }
        for (Mascota mascota : listaMascotas) {
            mascota.mostrarInfo();
            // Polimorfismo: cada objeto responde según su tipo 
            // Se obtiene el nombre de la clase hija (Perro/Gato) dinamicamente con mascota.getClass().getSimpleName() , lo investigue
            System.out.println("Tipo: " + mascota.getClass().getSimpleName()); 
            System.out.println("Sonido: " + mascota.hacerSonido());
            System.out.println("-----------------------");
        }
    }

    // Ejecutar sonido por ID 
    public void sonarPorId(int id) {
        for (Mascota mascota : listaMascotas) {
            if (mascota.getId() == id) {
                System.out.println("Resultado: " + mascota.hacerSonido()); 
                return;
            }
        }
        System.out.println("Mascota no encontrada.");
    }

    // Buscar por nombre 
    public void buscarPorNombre(String nombre) {

        for (Mascota mascota : listaMascotas) {
            // Compara el nombre guardado con el buscado sin importar mayusculas o minusculas
            if (mascota.getNombre().equalsIgnoreCase(nombre)) {
                mascota.mostrarInfo(); 
                return;
            }
        }
        System.out.println("Mascota no encontrada."); 
    }
}
