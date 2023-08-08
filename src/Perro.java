public class Perro extends Animal{

    public Perro(String tipo, String nombre, Integer edad) {
        super(tipo, nombre, edad);
    }

    @Override
    public String toString() {
        return "Perro{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
