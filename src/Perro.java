public class Perro extends Animal{

    public Perro(String nombre, Integer edad) {
        super(nombre, edad);
    }

    @Override
    public String toString() {
        return "Perro{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
