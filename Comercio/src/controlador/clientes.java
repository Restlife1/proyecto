
package controlador;


public class clientes {
    
    private String nif, nombre, direccion;
    private int telefono;
    private float credito_disponible, descuento_cliente;

    public clientes(String nif, String nombre, String direccion, int telefono, float credito_disponible, float descuento_cliente) {
        this.nif = nif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.credito_disponible = credito_disponible;
        this.descuento_cliente = descuento_cliente;
    }

    public clientes() {
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public float getCredito_disponible() {
        return credito_disponible;
    }

    public void setCredito_disponible(float credito_disponible) {
        this.credito_disponible = credito_disponible;
    }

    public float getDescuento_cliente() {
        return descuento_cliente;
    }

    public void setDescuento_cliente(float descuento_cliente) {
        this.descuento_cliente = descuento_cliente;
    }    
    
}
