
package controlador;

public class albaranVentas {
    
    private String nif_cliente;
    private int numero_albaran;
    public pago tipo;
    
    public enum pago{
    
        contado, credito
    
    }

    public albaranVentas(String nif_cliente, int numero_albaran, pago tipo) {
        this.nif_cliente = nif_cliente;
        this.numero_albaran = numero_albaran;
        this.tipo = tipo;
    }

    public albaranVentas() {
    }

    public String getNif_cliente() {
        return nif_cliente;
    }

    public void setNif_cliente(String nif_cliente) {
        this.nif_cliente = nif_cliente;
    }

    public int getNumero_albaran() {
        return numero_albaran;
    }

    public void setNumero_albaran(int numero_albaran) {
        this.numero_albaran = numero_albaran;
    }

    public pago getTipo() {
        return tipo;
    }

    public void setTipo(pago tipo) {
        this.tipo = tipo;
    }
    
    
    
}
