import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    // Constructor
    public Persona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;

    }
    // **Constructor adicional solo con nombre y género**
    public Persona(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
        this.apellido = ""; // valor por defecto
        this.edad = 0;      // valor por defecto
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        System.out.println("Por favor, ingresa cuantas personas deseas registrar:");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Persona #" + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Apellido: ");
            String apellido = scanner.next();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.next();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            personas.add(new Persona(nombre, apellido, genero, edad));


        }



        // Metodo para capturar nombre y genero

        List<Persona> NombresYGeneros = new ArrayList<>();

        for (Persona persona : personas) {
            NombresYGeneros.add(new Persona(persona.getNombre(), persona.getGenero()));

        }

        // Mostrar nombres y géneros
        System.out.println("Nombres y géneros capturados:");
        int i= 1; // Contador para enumerar los nombres
        for (Persona persona : NombresYGeneros)
        {
            System.out.println("Nombre " + (i++) + ": " + persona.getNombre()
            + " Genero de "+ persona.getNombre() + ": " + persona.getGenero());
        }


        // METODO PARA MOSTRAR TODO

        System.out.println("Lista de personas registradas:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() +
                    "Género: " + persona.getGenero());

        }


        scanner.close();
    }
}





