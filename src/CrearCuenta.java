public class CrearCuenta {
    public static void main(String[] args) {
   
        Cuenta cuentaRobert = new Cuenta();
        cuentaRobert.titular.nombre = "Robert";
        cuentaRobert.titular.documento = "123456789";
        cuentaRobert.titular.direccion = "Calle 123";
        cuentaRobert.titular.telefono = "123456789";
        cuentaRobert.titular.email = "robert@gmail";
        cuentaRobert.titular.fechaNacimiento = "01/01/1990";
        cuentaRobert.titular.fechaRegistro = "01/01/1990";
        cuentaRobert.titular.fechaUltimoPago = "01/01/1990";
        cuentaRobert.titular.tipoCuenta = "Efectivo";
        cuentaRobert.numero = 1;
        cuentaRobert.agencia = 1;
        cuentaRobert.titular.prestamo.numero = 1;
        cuentaRobert.depositar(100);

        System.out.println();
        System.out.println("Nombre de cliente: " + cuentaRobert.titular.nombre);
        System.out.println("Documento de cliente: " + cuentaRobert.titular.documento);
        System.out.println("Direccion de cliente: " + cuentaRobert.titular.direccion);
        System.out.println("Telefono de cliente: " + cuentaRobert.titular.telefono);
        System.out.println("Email de cliente: " + cuentaRobert.titular.email);
        System.out.println("Fecha de nacimiento de cliente: " + cuentaRobert.titular.fechaNacimiento);
        System.out.println("Fecha de registro de cliente: " + cuentaRobert.titular.fechaRegistro);
        System.out.println("Fecha de ultimo pago de cliente: " + cuentaRobert.titular.fechaUltimoPago);
        System.out.println("Tipo de cuenta de cliente: " + cuentaRobert.titular.tipoCuenta);
        System.out.println("Numero de cuenta: " + cuentaRobert.numero);
        System.out.println("Agencia de cuenta: " + cuentaRobert.agencia);
        System.out.println("Saldo de cuenta: " + cuentaRobert.saldoCuenta());
        System.out.println("Numero de prestamo: " + cuentaRobert.titular.prestamo.numero);
        System.out.println();
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Runtime: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Classpath: " + System.getProperty("java.class.path"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Classpath URL: " + System.getProperty("java.class.path.url"));
        System.out.println();




        // cuenta.numero = 0001;
        // cuenta.titular = "Robert";
        // cuenta.saldo = 100.0;
        // cuenta.depositar(50.0);
        
        // Cuenta cuenta2 = new Cuenta();
        // cuenta2.numero = 0002;
        // cuenta2.titular = "jose";
        // cuenta2.saldo = 200.0;
        
        // Cuenta cuenta3 = new Cuenta();
        // cuenta3.numero = 0003;
        // cuenta3.titular = "Ana";
        // cuenta3.saldo = 300.0;
        // System.out.println();
        // System.out.println("Cuenta 1: " + cuenta.numero + " " + cuenta.titular + " " + cuenta.saldo);
        // System.out.println("Cuenta 2: " + cuenta2.numero + " " + cuenta2.titular + " " + cuenta2.saldo);
        // System.out.println("Cuenta 3: " + cuenta3.numero + " " + cuenta3.titular + " " + cuenta3.saldo);
        // System.out.println();
        // cuenta.retirar(100.0);
        // System.out.println("Cuenta 1: " + cuenta.numero + " " + cuenta.titular + " " + cuenta.saldo);
        // System.out.println();
    }


    
}
