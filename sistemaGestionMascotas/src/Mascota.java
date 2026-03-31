/*
Descripcion:
    Clase padre que tendra los atributos generales
*/

public class Mascota {

    //Defino las variables con private para encapsular los datos y evitar que se modifiquen directamente desde fuera de la clase
    private int id;
    private String nombre;
    private int edad;

    public Mascota(int id, String nombre, int edad){ // Constructor
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;

    }

    // GETTERS (Para obtener los valores)
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // SETTERS (Para modificar los valores)

    
}



