package molina.diego.bl;
import java.time.*;
import java.util.ArrayList;

/**
 * The type Cliente.
 */
public class Cliente {
    private String id;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private Period edad;
    private String direccion;
    private CuentaCorriente cuenta;
    private ArrayList<CuentaCorriente> cuentas = new ArrayList<CuentaCorriente>();

    /**
     * Instantiates a new Cliente.
     */
    public Cliente() {
    }

    /**
     * Instantiates a new Cliente.
     *
     * @param id              the id
     * @param nombreCompleto  the nombre completo
     * @param fechaNacimiento the fecha nacimiento
     * @param direccion       the direccion
     */
    public Cliente(String id, String nombreCompleto, LocalDate fechaNacimiento, String direccion) {

        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.edad = setEdad(fechaNacimiento);
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Gets nombre completo.
     *
     * @return the nombre completo
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Sets nombre completo.
     *
     * @param nombreCompleto the nombre completo
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * Gets fecha nacimiento.
     *
     * @return the fecha nacimiento
     */
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets fecha nacimiento.
     *
     * @param fechaNacimiento the fecha nacimiento
     */
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Gets edad.
     *
     * @return the edad
     */
    public Period getEdad() {
        return edad;
    }

    /**
     * Sets edad.
     *
     * @param fechaNacimiento the fecha nacimiento
     * @return the edad
     */
// No se si es valido, pero modifique la edad. no se si deberia hacer una funcion nueva.
    public Period setEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        this.edad = Period.between(fechaActual, fechaNacimiento);
        return edad;
    }

    /**
     * Gets direccion.
     *
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Sets direccion.
     *
     * @param direccion the direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Gets cuenta.
     *
     * @return the cuenta
     */
    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    /**
     * Sets cuenta.
     *
     * @param cuenta the cuenta
     */
    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Gets cuentas.
     *
     * @return the cuentas
     */
    public ArrayList getCuentas() {
        return cuentas;
    }

    /**
     * Sets cuentas.
     *
     * @param cuentas the cuentas
     */
    public void setCuentas(ArrayList cuentas) {
        this.cuentas = cuentas;
    }

    /**
     * Agregar cuenta.
     *
     * @param cuenta the cuenta
     */
    public void agregarCuenta(CuentaCorriente cuenta){
        cuentas.add(cuenta);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", cuentas=" + cuentas +
                '}';
    }
} // fin de la clase Cliente
