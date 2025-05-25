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
        this.genero = genero.toLowerCase(); // Convertir a minúsculas para evitar errores por mayúsculas
        this.edad = edad;

    }

    // **Constructor adicional solo con nombre y género**
    public Persona(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero.toLowerCase();
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


        mostrarPersonas(personas);
        List<Persona> nombresYGeneros = copiarNombresYGeneros(personas);
        imprimirNombresYGeneros(nombresYGeneros);

        System.out.println("Cantidad de personas masculinas: " + contarGenero(personas, "masculino"));
        System.out.println("Cantidad de personas femeninas: " + contarGenero(personas, "femenino"));
        System.out.println("PROMEDIO DE EDADES: " + calcularPromedioEdad(personas));

        scanner.close();
    }

    // METODO PARA MOSTRAR tODO
    public static void mostrarPersonas(List<Persona> personas) {
        System.out.println("Lista de personas ingresadas con todos sus datos:");
        for (Persona persona : personas) {
            System.out.println("Nombre: " + persona.getNombre() + "\nApellido: " + persona.getApellido() +
                    "\nGénero: " + persona.getGenero() + "\nEdad: " + persona.getEdad());

        }
    }


    // METODO PARA TOMAR NOMNBRES Y GENEROS
    public static List<Persona> copiarNombresYGeneros(List<Persona> personas) {
        List<Persona> nombresYGeneros = new ArrayList<>();
        for (Persona persona : personas) {
            nombresYGeneros.add(new Persona(persona.getNombre(), persona.getGenero()));
        }
        return nombresYGeneros;
    }

    // IMPRIMIR NOMBRES Y GENEROS
    public static void imprimirNombresYGeneros(List<Persona> nombresYGeneros) {
        System.out.println("--------------------------------------");
        System.out.println("LISTA DE NOMBRES Y GÉNEROS:");
        System.out.println("Nombres y géneros capturados:");
        int i = 1; // Contador para enumerar los nombres
        for (Persona persona : nombresYGeneros) {
            System.out.println("Nombre persona #" + (i++) + ": " + persona.getNombre()
                    + "\nGenero de " + persona.getNombre() + ": " + persona.getGenero());
        }
    }


    // METODO PARA CALCULAR EL PROMEDIO DE EDADES
    public static double calcularPromedioEdad(List<Persona> personas) {
        double suma = 0;
        for (Persona persona : personas) {
            suma += persona.getEdad();
        }
        double promedio = suma / personas.size();
        return promedio;
    }


    // Método para contar personas según género
    public static int contarGenero(List<Persona> personas, String generoBuscado) {
        int contador = 0;
        for (Persona p : personas) {
            if (p.getGenero().equalsIgnoreCase(generoBuscado)) {
                contador++;
            }
        }
        return contador;
    }
}