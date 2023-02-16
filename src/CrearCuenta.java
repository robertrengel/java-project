public class CrearCuenta {
    public static void main(String[] args) {
        CuentaAhorro cuentaAhorro = new CuentaAhorro(1, "Jisen");
        cuentaAhorro.depositar(1000);
        System.out.printf("\nEl saldo en la cuenta de ahorros de %s es: %s \n",cuentaAhorro.getTitular().getNombre(), cuentaAhorro.getSaldo());
        
       

        CuentaCorriente cuentaCorriente = new CuentaCorriente(1, "Juan");
        cuentaCorriente.depositar(2000);
        cuentaCorriente.transferir(cuentaAhorro, 1000);
        System.out.printf("El saldo en la cuenta corriente de %s es: %s: \n",cuentaCorriente.getTitular().getNombre(), cuentaCorriente.getSaldo());
        System.out.printf("El saldo en la cuenta de ahorros de %s es: %s \n\n",cuentaAhorro.getTitular().getNombre(), cuentaAhorro.getSaldo());
     
       
    }


    
}
