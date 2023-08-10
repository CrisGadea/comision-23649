package vehiculos;

public class Moto extends Vehiculo{

    private int cantMotores;

    public Moto(){}

    public Moto(String patente, String chasis, int cantMotores) {
        super(patente, chasis);
        this.cantMotores = cantMotores;
    }

    public int getCantMotores() {
        return cantMotores;
    }

    public void setCantMotores(int cantMotores) {
        this.cantMotores = cantMotores;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "cantMotores=" + cantMotores +
                ", patente='" + patente + '\'' +
                ", chasis='" + chasis + '\'' +
                ", km=" + km +
                '}';
    }
}
