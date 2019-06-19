package controlador;


public class articulos {
    
    private int codigo, stock, stock_medio, stock_minimo;
    private String descripcion;
    private float precio;

    public articulos(int codigo, String descripcion, float precio, int stock, int stock_medio, int stock_minimo) {
        this.codigo = codigo;
        this.stock = stock;
        this.stock_medio = stock_medio;
        this.stock_minimo = stock_minimo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public articulos() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock_medio() {
        return stock_medio;
    }

    public void setStock_medio(int stock_medio) {
        this.stock_medio = stock_medio;
    }

    public int getStock_minimo() {
        return stock_minimo;
    }

    public void setStock_minimo(int stock_minimo) {
        this.stock_minimo = stock_minimo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
}
