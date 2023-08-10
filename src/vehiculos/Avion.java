package vehiculos;

public class Avion extends Vehiculo{

    private final int MAX_AKTITUD = 800;

    private int cantTurbinas;

    public Avion(){}

    public Avion(String patente, String chasis, int cantTurbinas) {
        super(patente, chasis);
        this.cantTurbinas = cantTurbinas;
    }

    public int getMAX_AKTITUD() {
        return MAX_AKTITUD;
    }

    public int getCantTurbinas() {
        return cantTurbinas;
    }

    public void setCantTurbinas(int cantTurbinas) {
        this.cantTurbinas = cantTurbinas;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "MAX_AKTITUD=" + MAX_AKTITUD +
                ", cantTurbinas=" + cantTurbinas +
                ", patente='" + patente + '\'' +
                ", chasis='" + chasis + '\'' +
                ", km=" + km +
                '}';
    }
}
