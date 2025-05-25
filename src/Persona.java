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

        // METODO PARA MOSTRAR tODO

        System.out.println("Lista de personas ingresadas con todos sus datos:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + "\nApellido: " + persona.getApellido() +
                    "\nGénero: " + persona.getGenero() + "\nEdad: " + persona.getEdad());

        }



        // METODO PARA TOMAR NOMNBRES Y GENEROS

        List<Persona> NombresYGeneros = new ArrayList<>();

        for (Persona persona : personas) {
            NombresYGeneros.add(new Persona(persona.getNombre(), persona.getGenero()));

        }

        // IMPRIMIR NOMBRES Y GENEROS
        System.out. println("--------------------------------------");
        System.out.println("LISTA DE NOMBRES Y GÉNEROS:");
        System.out.println("Nombres y géneros capturados:");
        int i= 1; // Contador para enumerar los nombres
        for (Persona persona : NombresYGeneros)
        {
            System.out.println("Nombre " + (i++) + ": " + persona.getNombre()
            + " Genero de "+ persona.getNombre() + ": " + persona.getGenero());
        }


        // METODO PARA CALCULAR EL PROMEDIO DE EDADES





        scanner.close();
    }
}





