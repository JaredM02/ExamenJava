/*
Descripcion:
    Subclase hija que hereda de Mascota y tiene atributos y metodos especificos para los perros
*/

public class Perro extends Mascota {

    public Perro(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "El perro ladra: Guau Guau";
    }
}
