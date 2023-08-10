package vehiculos;

public class Vehiculo {

    protected String patente;
    protected String chasis;

    protected int km;

    public Vehiculo(){}

    public Vehiculo(String patente, String chasis){
        this.patente = patente;
        this.chasis = chasis;
        this.km = 0;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void acelerar(){
        // this.km = this.km + 10
        this.km += 10;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", chasis='" + chasis + '\'' +
                ", km=" + km +
                '}';
    }
}
