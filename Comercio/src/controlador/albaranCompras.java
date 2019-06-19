package controlador;

import java.util.Date;


public class albaranCompras {
    
    private String cif_proveedor;
    private int numero_albaran, orden_pedidos;
    private Date fecha_compra;

    public albaranCompras(String cif_proveedor, int numero_albaran, Date fecha_compra, int orden_pedidos) {
        this.cif_proveedor = cif_proveedor;
        this.numero_albaran = numero_albaran;
        this.orden_pedidos = orden_pedidos;
        this.fecha_compra = fecha_compra;
    }

    public albaranCompras() {
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

    public int getOrden_pedidos() {
        return orden_pedidos;
    }

    public void setOrden_pedidos(int orden_pedidos) {
        this.orden_pedidos = orden_pedidos;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
    
}
