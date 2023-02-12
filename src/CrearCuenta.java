public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta();
        cuenta.numero = 0001;
        cuenta.titular = "Robert";
        cuenta.saldo = 100.0;
        cuenta.depositar(50.0);
        
        Cuenta cuenta2 = new Cuenta();
        cuenta2.numero = 0002;
        cuenta2.titular = "jose";
        cuenta2.saldo = 200.0;
        
        Cuenta cuenta3 = new Cuenta();
        cuenta3.numero = 0003;
        cuenta3.titular = "Ana";
        cuenta3.saldo = 300.0;

        System.out.println("Cuenta 1: " + cuenta.numero + " " + cuenta.titular + " " + cuenta.saldo);
        System.out.println("Cuenta 2: " + cuenta2.numero + " " + cuenta2.titular + " " + cuenta2.saldo);
        System.out.println("Cuenta 3: " + cuenta3.numero + " " + cuenta3.titular + " " + cuenta3.saldo);

        cuenta.retirar(100.0);
        System.out.println("Cuenta 1: " + cuenta.numero + " " + cuenta.titular + " " + cuenta.saldo);
    }


    
}
