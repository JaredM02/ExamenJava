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

   
}
