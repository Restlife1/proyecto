package controlador;

import java.util.Date;


public class ventaCliente {
    
    private String nif;
    private Date fecha;
    private int numero_albaran;

    public ventaCliente(String nif, int numero_albaran, Date fecha) {
        this.nif = nif;
        this.fecha = fecha;
        this.numero_albaran = numero_albaran;
    }

    public ventaCliente() {
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getNumero_albaran() {
        return numero_albaran;
    }

    public void setNumero_albaran(int numero_albaran) {
        this.numero_albaran = numero_albaran;
    }
    
    
    
}
