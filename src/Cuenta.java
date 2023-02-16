class Cuenta{
    private int numero;
    private int agencia;
    private double saldo;
    private Cliente titular;
    private static int total = 0;

    public Cuenta(int agencia, String titular) {
        if(agencia <= 0){
            this.agencia = 1;
        }
        this.agencia = agencia;
        this.titular = new Cliente(titular);
        total++;
    }

    public static int getTotal() {
        return total;
    }

    double getSaldo(){
        return this.saldo;
    }

    int getNumero(){
        return this.numero;
    }

    int getAgencia(){
        return this.agencia;
    }

    public Cliente getTitular() {
        return titular;
    }

    void setNumero(int numero){
        if (numero < 0){
            this.numero = 0;
        }
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    void depositar(double cantidad){
        this.saldo += cantidad;
    }

    boolean retirar(double cantidad){
        if(this.saldo >= cantidad){
            this.saldo -= cantidad;
            return true;}
       return false; 
    }

    boolean transferir(Cuenta cuenta, double cantidad){
        if(retirar(cantidad)){
            cuenta.depositar(cantidad);
            return true;
        }
        return false;
    }


}