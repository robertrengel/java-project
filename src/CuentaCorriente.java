public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(int agencia, String titular) {
        super(agencia, titular);
    }

    @Override
     public boolean retirar(double cantidad) {
         return super.retirar(cantidad + 0.2);
     }

    @Override
    public void depositar(double cantidad) {
        this.saldo += cantidad;
    }
    
}
