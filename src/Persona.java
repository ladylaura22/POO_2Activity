import java.util.ArrayList;
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

        for (int i = 0; i < cantidad;i++) {
            System.out.println("Persona #" + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.next();
            System.out.print("Apellido: ");
            String apellido = scanner.next();
            System.out.print("Género (M/F): ");
            String genero = scanner.next();
            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            personas.add(new Persona(nombre, apellido, genero, edad));






        }
    }
}

