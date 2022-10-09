package molina.diego.bl;
public class CuentaCorriente {
    private String numeroCuenta;
    private int saldo;
    private int deposito;

    public CuentaCorriente() {
    }
    public CuentaCorriente(String numeroCuenta, int deposito) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = deposito;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public int getSaldo() {
        return saldo;
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "numeroCuenta='" + numeroCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
