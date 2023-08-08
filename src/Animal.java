public class Animal {

    String tipo;
    String nombre;
    Integer edad;

    public Animal(String tipo, String nombre, Integer edad){
        this.tipo = tipo;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String moverse(){
        return "El animal: " + this.tipo + " se está moviendo";
    }

    @Override
    public String toString() {
        return "Animal{" +
                "tipo='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
