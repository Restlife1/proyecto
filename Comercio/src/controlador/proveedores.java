package controlador;


public class proveedores {
    
    private String cif, nombre_empresa, direccion;
    private int telefonos, codigo_articulo_suministro;

    public proveedores(String cif, String nombre_empresa, String direccion, int telefonos, int codigo_articulo_suministro) {
        this.cif = cif;
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.telefonos = telefonos;
        this.codigo_articulo_suministro = codigo_articulo_suministro;
    }

    public proveedores() {
    }   

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(int telefonos) {
        this.telefonos = telefonos;
    }

    public int getCodigo_articulo_suministro() {
        return codigo_articulo_suministro;
    }

    public void setCodigo_articulo_suministro(int codigo_articulo_suministro) {
        this.codigo_articulo_suministro = codigo_articulo_suministro;
    }
    
    
    
}
