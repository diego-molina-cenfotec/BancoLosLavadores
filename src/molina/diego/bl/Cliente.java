package molina.diego.bl;
import java.time.*;
import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private Period edad;
    private String direccion;
    private CuentaCorriente cuenta;
    private ArrayList cuentas = new ArrayList<CuentaCorriente>();

    public Cliente() {
    }

    public Cliente(String id, String nombreCompleto, LocalDate fechaNacimiento, String direccion) {

        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.edad = setEdad(fechaNacimiento);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Period getEdad() {
        return edad;
    }

    // No se si es valido, pero modifique la edad. no se si deberia hacer una funcion nueva.
    public Period setEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        this.edad = Period.between(fechaActual, fechaNacimiento);
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public ArrayList getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad.getYears() +
                ", direccion='" + direccion + '\'' +
                '}';
    }
} // fin de la clase Cliente
