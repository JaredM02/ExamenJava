/*
Descripcion:
    Subclase hija que hereda de Mascota y tiene atributos y metodos especificos para los gatos
*/

public class Gato extends Mascota {

    public Gato(int id, String nombre, int edad) {
        super(id, nombre, edad);
    }

    @Override
    public String hacerSonido() {
        return "El gato maulla: Miau Miau";
    }

}
