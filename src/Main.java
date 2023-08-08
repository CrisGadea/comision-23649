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




        Animal gatito = new Animal("gato", "Cleo", 3);

        Perro perrito = new Perro("perro", "ken", 2);

        System.out.println(gatito);
        System.out.println(perrito);
    }
}