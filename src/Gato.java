public class Gato extends Animal{

    private int peso;

    public Gato(String nombre, Integer edad, int peso) {
        super(nombre, edad);
        this.peso = peso;
    }

    @Override
    public String moverse(){
        return "El gato se mueve";
    }

    @Override
    public String toString() {
        return "Gato{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
