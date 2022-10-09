package molina.diego.bl;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cliente {
    private String id;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private LocalDate edad;
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

    public LocalDate getEdad() {
        return edad;
    }

    public void setEdad(LocalDate edad) {
        this.edad = edad;
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
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                '}';
    }
} // fin de la clase Cliente
