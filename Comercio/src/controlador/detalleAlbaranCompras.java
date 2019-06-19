package controlador;


public class detalleAlbaranCompras {
    
    private int numero_albaran, orden_pedido, codigo_articulo, cantidad;
    private float precio, descuento;

    public detalleAlbaranCompras(int numero_albaran, int orden_pedido, int codigo_articulo, int cantidad, float precio, float descuento) {
        this.numero_albaran = numero_albaran;
        this.orden_pedido = orden_pedido;
        this.codigo_articulo = codigo_articulo;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
    }

    public detalleAlbaranCompras() {
    }

    public int getNumero_albaran() {
        return numero_albaran;
    }

    public void setNumero_albaran(int numero_albaran) {
        this.numero_albaran = numero_albaran;
    }

    public int getOrden_pedido() {
        return orden_pedido;
    }

    public void setOrden_pedido(int orden_pedido) {
        this.orden_pedido = orden_pedido;
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
