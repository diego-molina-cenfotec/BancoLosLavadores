package molina.diego.bl;

/**
 * The type Cuenta corriente.
 */
public class CuentaCorriente {
    private int numeroCuenta;
    private String duenio;
    private int saldo;
    private int deposito;

    /**
     * Instantiates a new Cuenta corriente.
     */
    public CuentaCorriente() {
    }

    /**
     * Instantiates a new Cuenta corriente.
     *
     * @param numeroCuenta the numero cuenta
     * @param deposito     the deposito
     * @param duenio       the duenio
     */
    public CuentaCorriente(int numeroCuenta, int deposito, String duenio) {
        this.numeroCuenta = numeroCuenta;
        this.duenio = duenio;
        this.saldo = saldo;
        this.deposito = deposito;
    }

    /**
     * Gets numero cuenta.
     *
     * @return the numero cuenta
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    /**
     * Sets numero cuenta.
     *
     * @param numeroCuenta the numero cuenta
     */
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    /**
     * Gets duenio.
     *
     * @return the duenio
     */
    public String getDuenio() {
        return duenio;
    }

    /**
     * Sets duenio.
     *
     * @param duenio the duenio
     */
    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    /**
     * Gets saldo.
     *
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * Sets saldo.
     *
     * @param saldo the saldo
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * Gets deposito.
     *
     * @return the deposito
     */
    public int getDeposito() {
        return deposito;
    }

    /**
     * Sets deposito.
     *
     * @param deposito the deposito
     */
    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta=" + numeroCuenta +
                ", duenio='" + duenio + '\'' +
                ", saldo=" + saldo +
                ", deposito=" + deposito +
                '}';
    }
}
