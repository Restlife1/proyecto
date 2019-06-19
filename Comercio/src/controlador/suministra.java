package controlador;


public class suministra {
    
    private int codigo;
    private String cif;

    public suministra(int codigo, String cif) {
        this.codigo = codigo;
        this.cif = cif;
    }

    public suministra() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }
    
    
    
}
