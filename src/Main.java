import vehiculos.Auto;
import vehiculos.Avion;
import vehiculos.Moto;
import vehiculos.Vehiculo;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //String nombre = "Cristian";
        //final Integer EDAD_DE_CRISTIAN = 26;

        //System.out.println("Mi nombre es " + nombre + ", y tengo " + EDAD_DE_CRISTIAN + " años");

        /*String dias [] = new String[7];

        dias[0] = "Domingo";
        dias[1] = "Lunes";
        dias[2] = "Martes";
        dias[3] = "Miércoles";
        dias[4] = "Jueves";
        dias[5] = "Viernes";
        dias[6] = "Sábado";

        for (int i = 0; i < dias.length; i++){
            // Validamos que muestre solo los días con índice impar
            if (i % 2 != 0){
                System.out.println(dias[i]);
            }
        }
        */




/*
        Gato gatito = new Gato( "Cleo", 3, 20);

        Perro perrito = new Perro("ken", 2);

        System.out.println(gatito);
        System.out.println(perrito);

        System.out.println(gatito.moverse());
  */





        // Ejercicio: Crear diferentes tipos de Vehiculos

        // Clase Padre
        Vehiculo v1 = new Vehiculo();
        v1.setPatente("ABC12GH");

        // 3 clases Hijas: Auto, Moto, Avión
        Auto a1 = new Auto();
        a1.setPatente("CDA456YH");
        Moto m1 = new Moto();
        m1.setPatente("JKL98IJ");
        Avion av1 = new Avion();
        av1.setPatente("DFG45JK");

        System.out.println("La patente del Vehiculo es: " + v1.getPatente());
        System.out.println("La patente del Avión es: " + av1.getPatente());


    }
}