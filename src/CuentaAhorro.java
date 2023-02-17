public class CuentaAhorro extends Cuenta {
    
    public CuentaAhorro(int agencia, String titular) {
        super(agencia, titular);
    }

    @Override
    public void depositar(double cantidad) {
        this.saldo += cantidad;
        
    }
    
}
    

