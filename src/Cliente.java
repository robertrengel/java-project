public class Cliente {
    private String nombre;
    private String documento;
    private String direccion;
    private String telefono;
    private String email;
    private String fechaNacimiento;
    private String fechaRegistro;
    private String fechaUltimoPago;
    private String tipoCuenta;
    private Prestamo prestamo = new Prestamo();

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setFechaUltimoPago(String fechaUltimoPago) {
        this.fechaUltimoPago = fechaUltimoPago;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipoCuenta(String tipoCuenta) {
        if (tipoCuenta == null || tipoCuenta.isEmpty() || tipoCuenta == "Efectivo") {
            this.tipoCuenta = "Efectivo";
        } else {
            this.tipoCuenta = "Corriente";
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDocumento() {
        return documento;
    }
    public String getEmail() {
        return email;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public String getFechaRegistro() {
        return fechaRegistro;
    }
    public String getFechaUltimoPago() {
        return fechaUltimoPago;
    }
    public String getNombre() {
        return nombre;
    }
    public Prestamo getPrestamo() {
        return prestamo;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    
    
}
