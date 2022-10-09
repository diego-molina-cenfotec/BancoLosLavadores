package molina.diego.ui;
import molina.diego.bl.Cliente;
import java.io.*;
import java.util.ArrayList;
import java.time.*;

public class UI {
    // variables globales
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static ArrayList clientes = new ArrayList<>();
    static Cliente cliente;

    // metodos utilitarios mostrar y leer
    static String leerTexto()throws IOException {
        return in.readLine();
    }
    static void mostrarTexto(String msj){
        out.println(msj);
    }
    public static void main(String[] args) throws IOException {
        mostrarTexto("*** Bienvenido al sistema Banco Los Lavadores");
        int opcion = -1;
        do {
            mostrarMenu();
            opcion = seleccionarOpcion();
            procesarOpcion(opcion);
        }while (opcion !=0);
    } // fin del metodo main

    private static void mostrarMenu() {
        mostrarTexto("   Las opciones a escoger son: ");
        mostrarTexto("1. Registrar Cliente");
        mostrarTexto("2. Listar Clientes");
        mostrarTexto("3. Abrir Cuenta Corriente");
        mostrarTexto("0. Salir del programa");
    }
    private static int seleccionarOpcion() throws IOException {
        mostrarTexto("Por favor indicar con numero la opcion deseada");
        return Integer.parseInt(leerTexto());
    }
    private static void procesarOpcion(int opcion) throws IOException {
        switch (opcion){
            case 0:
                mostrarTexto("Adios, vuelva pronto");
                break;
            case 1:
                registrarCliente();
                break;
            case 2:
                listarCliente();
                break;
            case 3:
                abrirCuenta();
                break;
            default:
                mostrarTexto("Opcion invalida por favor confirme la opcion deseada");
                break;
        }
    }
    private static void registrarCliente() throws IOException {
        mostrarTexto("va a registrar cliente nuevo");
        mostrarTexto("ingrese numero de identificación");
        String id = leerTexto();
        mostrarTexto("ingresar nombre completo");
        String nombre = leerTexto();
        mostrarTexto("ingresar año de nacimiento 4 digitos");
        int anio = Integer.parseInt(leerTexto());
        mostrarTexto("ingrese mes de nacimiento con 2 numeros, ejemplo 09");
        int mes = Integer.parseInt(leerTexto());
        mostrarTexto("ingrese dia de nacimiento en 2 digitos, ejemplo 31");
        int dia = Integer.parseInt(leerTexto());
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        mostrarTexto("indicar direccion de domicilio");
        String direccion = leerTexto();
        mostrarTexto("Los datos ingresados son:  " + id + nombre + direccion);
        cliente = new Cliente(id, nombre, fechaNacimiento, direccion);
        clientes.add(cliente);
    }
    private static void listarCliente() {
        mostrarTexto("los clientes actuales son");
        mostrarTexto("Cliente #");
        for (int i = 0; i <clientes.size() ; i++) {
            System.out.println(i + " => " + clientes.get(i));
        }
    }
    private static void abrirCuenta() {

    }

} // fin de clase UI