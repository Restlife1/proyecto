package controlador;

import java.util.Date;


public class compraProveedor {
    
    private String cif_proveedor;
    private int numero_albaran;
    private Date fecha;

    public compraProveedor(int numero_albaran, String cif_proveedor, Date fecha) {
        this.cif_proveedor = cif_proveedor;
        this.numero_albaran = numero_albaran;
        this.fecha = fecha;
    }

    public compraProveedor() {
    }

    public String getCif_proveedor() {
        return cif_proveedor;
    }

    public void setCif_proveedor(String cif_proveedor) {
        this.cif_proveedor = cif_proveedor;
    }

    public int getNumero_albaran() {
        return numero_albaran;
    }

    public void setNumero_albaran(int numero_albaran) {
        this.numero_albaran = numero_albaran;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    
    
}
