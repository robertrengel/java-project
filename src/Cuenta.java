class Cuenta{
    int numero;
    int agencia;
    private double saldo;
    Cliente titular = new Cliente();


    double saldoCuenta(){
        return this.saldo;
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