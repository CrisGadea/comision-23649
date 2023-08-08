public class Gato extends Animal{

    int peso;

    public Gato(String tipo, String nombre, Integer edad, int peso) {
        super(tipo, nombre, edad);
        this.peso = peso;
    }

    @Override
    public String moverse(){
        return "El geto se mueve";
    }


}
