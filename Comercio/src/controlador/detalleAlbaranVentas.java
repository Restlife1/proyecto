package controlador;

import java.util.Date;

public class detalleAlbaranVentas {
 
    private Date fecha_venta;
    private int numero_albaran, codigo_articulo, cantidad;
    private float precio, descuento;

    public detalleAlbaranVentas(int numero_albaran, Date fecha_venta, int codigo_articulo, int cantidad, float precio, float descuento) {
        this.fecha_venta = fecha_venta;
        this.numero_albaran = numero_albaran;
        this.codigo_articulo = codigo_articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
    }

    public detalleAlbaranVentas() {
    }

    public Date getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(Date fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public int getNumero_albaran() {
        return numero_albaran;
    }

    public void setNumero_albaran(int numero_albaran) {
        this.numero_albaran = numero_albaran;
    }

    public int getCodigo_articulo() {
        return codigo_articulo;
    }

    public void setCodigo_articulo(int codigo_articulo) {
        this.codigo_articulo = codigo_articulo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }
    
    
    
}
