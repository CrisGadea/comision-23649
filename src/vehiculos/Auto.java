package vehiculos;

public class Auto extends Vehiculo{

    private int rodaje;

    public Auto(String patente, String chasis, int rodaje){
        super(patente, chasis);
        this.rodaje = rodaje;
    }

    public Auto(){}

    public int getRodaje() {
        return rodaje;
    }

    public void setRodaje(int rodaje) {
        this.rodaje = rodaje;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "rodaje=" + rodaje +
                ", patente='" + patente + '\'' +
                ", chasis='" + chasis + '\'' +
                ", km=" + km +
                '}';
    }
}
