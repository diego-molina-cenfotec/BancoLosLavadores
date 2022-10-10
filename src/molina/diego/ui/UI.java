package molina.diego.ui;
import molina.diego.bl.Cliente;
import molina.diego.bl.CuentaCorriente;
import java.io.*;
import java.util.ArrayList;
import java.time.*;

/**
 * The type Ui.
 */
public class UI {
    /**
     * The constant in.
     */
// variables globales
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    /**
     * The Out.
     */
    static PrintStream out = System.out;
    /**
     * The Clientes.
     */
    static ArrayList<Cliente> clientes = new ArrayList<>();
    /**
     * The Consecutivo ctas.
     */
    static ArrayList<Integer> consecutivoCtas = new ArrayList<Integer>();
    /**
     * The Cuentas.
     */
    static ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
    /**
     * The Cliente.
     */
    static Cliente cliente;
    /**
     * The Tmp cuenta.
     */
    static CuentaCorriente tmpCuenta;

    /**
     * Leer texto string.
     *
     * @return the string
     * @throws IOException the io exception
     */
// metodos utilitarios mostrar y leer
    static String leerTexto()throws IOException {
        return in.readLine();
    }

    /**
     * Mostrar texto.
     *
     * @param msj the msj
     */
    static void mostrarTexto(String msj){
        out.println(msj);
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
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
        mostrarTexto("4. Asignar número Cuenta");
        mostrarTexto("5. buscar Cliente");
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
            case 4:
                // casos para probar funciones
                asignarNumeroCta();
                break;
            case 5:
                // casos para probar funciones
                buscarCliente();
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
            System.out.println((i+1) + " => " + clientes.get(i));
            System.out.println(clientes);
        }
    }
    private static Cliente buscarCliente() throws IOException {
        mostrarTexto("indique el numero de id del cliente al que se le va a crear una cuenta");
        String idCliente = leerTexto();
        mostrarTexto("el cliente buscado es =  " + idCliente);
        for (int i = 0; i <clientes.size() ; i++) {
            System.out.println(clientes.get(i).getNombreCompleto());
            if (idCliente.equals(clientes.get(i).getId())){
                mostrarTexto("cliente encontrado");
                cliente = clientes.get(i);
                mostrarTexto(cliente.toString());
            }
        }// fin del for
        return cliente;
    }// fin de buscarCliente

        private static void abrirCuenta() throws IOException {
        cliente = buscarCliente();
        String duenio = cliente.getNombreCompleto();
        int numeroCta = asignarNumeroCta();
        mostrarTexto("ingrese el monto sin comas ni puntos para el deposito inicial. el Monto => a 50000");
        int deposito = Integer.parseInt(leerTexto());
        tmpCuenta = new CuentaCorriente(numeroCta, deposito, duenio);
        cuentas.add(tmpCuenta);
        mostrarTexto("se creo la siguiente cuenta= "+cuentas);
        cliente.setCuenta(tmpCuenta);
    }// fin de abrir cuenta

    private static int asignarNumeroCta() throws IOException{
        int nuevo =0;
        if (consecutivoCtas == null || consecutivoCtas.size() == 0) {
            consecutivoCtas.add(1000000);
            nuevo = consecutivoCtas.get(0);
            System.out.println(nuevo);
        }else {
            int conseAnterior = consecutivoCtas.get(consecutivoCtas.size()-1);
            consecutivoCtas.add(conseAnterior+1);
            nuevo = consecutivoCtas.get(consecutivoCtas.size()-1);
            System.out.println(nuevo);
        }
        return nuevo;
    } // fin de asignarNumeroCta

} // fin de clase UI