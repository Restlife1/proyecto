package modelo;

import controlador.albaranVentas;
import controlador.albaranCompras;
import controlador.clientes;
import controlador.proveedores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import controlador.articulos;
import controlador.compraProveedor;
import controlador.detalleAlbaranCompras;
import controlador.detalleAlbaranVentas;
import controlador.suministra;
import controlador.ventaCliente;
import java.sql.Date;
import java.sql.ResultSet;

/**
 *
 * @author Ivet
 */
public class modelo {
    
        
    private PreparedStatement psInsertar;
    private Statement st;
    private ResultSet rs;
    conexion conect = new conexion();
    
    public void insertarCliente(clientes c) throws SQLException, ClassNotFoundException{
        
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO CLIENTES (nif, nombre, direccion, telefono, credito_disponible, "
                + "descuento_cliente)" + "values(?, ?, ?, ?, ?, ?)");
        
        psInsertar.setString(1, c.getNif());
        psInsertar.setString(2, c.getNombre());
        psInsertar.setString(3, c.getDireccion());
        psInsertar.setInt(4, c.getTelefono());
        psInsertar.setFloat(5, c.getCredito_disponible());
        psInsertar.setFloat(6, c.getDescuento_cliente());
        
        psInsertar.executeUpdate();
        
    }
    
    public void insertarProveedores(proveedores p) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO PROVEEDORES (cif, nombre_de_la_empresa, direccion, telefonos,"
                + " codigo_de_articulos_que_suministra)" + "values(?, ?, ?, ?, ?)");
        
        psInsertar.setString(1, p.getCif());
        psInsertar.setString(2, p.getNombre_empresa());
        psInsertar.setString(3, p.getDireccion());
        psInsertar.setInt(4, p.getTelefonos());
        psInsertar.setInt(5, p.getCodigo_articulo_suministro());
        
        psInsertar.executeUpdate();
        
    }
    
    public void insertarArticulos(articulos a) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO ARTICULOS (codigo, descripcion, precio, stock,"
                + " stock_medio, stock_minimo)" + "values(?, ?, ?, ?, ?, ?)");
        
        psInsertar.setInt(1, a.getCodigo());
        psInsertar.setString(2, a.getDescripcion());
        psInsertar.setFloat(3, a.getPrecio());
        psInsertar.setInt(4, a.getStock());
        psInsertar.setInt(5, a.getStock_medio());
        psInsertar.setInt(6, a.getStock_minimo());
        
        psInsertar.executeUpdate();
        
    }
    
    public void insertarAlbaranCompras(albaranCompras ac) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO ALBARAN_COMPRAS (cif_proveedor, numero_albaran_c, fecha_compra, orden_pedidos)" 
                + "values(?, ?, ?, ?)");
        
        psInsertar.setString(1, ac.getCif_proveedor());
        psInsertar.setInt(2, ac.getNumero_albaran());
        psInsertar.setDate(3, (Date) ac.getFecha_compra());
        psInsertar.setInt(4, ac.getOrden_pedidos());
        
        psInsertar.executeUpdate();
        
    }
    
        public void insertarAlbaranVentas(albaranVentas av) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO ALBARAN_VENTAS (nif_cliente, numero_albaran_v, contado_credito)" 
                + "values(?, ?, ?)");
        
        psInsertar.setString(1, av.getNif_cliente());
        psInsertar.setInt(2, av.getNumero_albaran());
        psInsertar.setString(3, String.valueOf(av.getTipo()));
        
        psInsertar.executeUpdate();

    }
        
     public void insertarDetalleAlbaranCompras(detalleAlbaranCompras dac) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO DETALLE_ALBARAN_COMPRAS (num_albaran_c, orden_pedido, "
                + "codigo_articulo, cantidad, precio, descuento)" 
                + "values(?, ?, ?, ?, ?, ?)");
        
        psInsertar.setInt(1, dac.getNumero_albaran());
        psInsertar.setInt(2, dac.getOrden_pedido());
        psInsertar.setInt(3, dac.getCodigo_articulo());
        psInsertar.setInt(4, dac.getCantidad());
        psInsertar.setFloat(5, dac.getPrecio());
        psInsertar.setFloat(6, dac.getDescuento());
        
        psInsertar.executeUpdate();

    }
     
    public void insertarDetalleAlbaranVenta(detalleAlbaranVentas dav) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO DETALLE_ALBARAN_VENTA (num_albaran_v, fecha_venta, "
                + "codigo_articulo, cantidad, precio, descuento)" 
                + "values(?, ?, ?, ?, ?, ?)");
        
        psInsertar.setInt(1, dav.getNumero_albaran());
        psInsertar.setDate(2, (Date) dav.getFecha_venta());
        psInsertar.setInt(3, dav.getCodigo_articulo());
        psInsertar.setInt(4, dav.getCantidad());
        psInsertar.setFloat(5, dav.getPrecio());
        psInsertar.setFloat(6, dav.getDescuento());
        
        psInsertar.executeUpdate();

    }
    
        public void insertarCompraProveedor(compraProveedor cp) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO COMPRA_PROVEEDOR (numero_albaran_c, cif, "
                + "fecha_compra)" 
                + "values(?, ?, ?)");
        
        psInsertar.setInt(1, cp.getNumero_albaran());        
        psInsertar.setString(2, cp.getCif_proveedor());
        psInsertar.setDate(3, (Date) cp.getFecha());
        
        psInsertar.executeUpdate();

    }
        
    public void insertarVentaCliente(ventaCliente vc) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO VENTA_CLIENTE (nif, numero_albaran_v, "
                + "fecha_venta)" 
                + "values(?, ?, ?)");
        
        psInsertar.setString(1, vc.getNif());        
        psInsertar.setInt(2, vc.getNumero_albaran());
        psInsertar.setDate(3, (Date) vc.getFecha());
        
        psInsertar.executeUpdate();

    }
    
    public void insertarSuministra(suministra s) throws SQLException, ClassNotFoundException{
        
        Connection con = conect.getConexion();
        st = con.createStatement();
        
        psInsertar = con.prepareStatement("INSERT INTO SUMINISTRA (codigo, cif)"
                + "values(?, ?)");
        
        psInsertar.setInt(1, s.getCodigo());        
        psInsertar.setString(2, s.getCif());
        
        psInsertar.executeUpdate();

    }
        
    public String[][] selectArticulos() throws ClassNotFoundException, SQLException{
        
        String articulos[][] = new String[10][6];
        Connection con = conect.getConexion();
        st = con.createStatement();
        int i=0;
        
        rs = st.executeQuery("SELECT * FROM ARTICULOS");
        while(rs.next()){
            
            articulos[i][0]=String.valueOf(rs.getInt("codigo"));        //Nombre de la columna en MySQL
            articulos[i][1]=rs.getString("descripcion");
            articulos[i][2]=String.valueOf(rs.getFloat("precio"));
            articulos[i][3]=String.valueOf(rs.getInt("stock"));
            articulos[i][4]=String.valueOf(rs.getInt("stock_medio"));
            articulos[i][5]=String.valueOf(rs.getInt("stock_minimo"));
            i++;
            
        }
        
        return articulos;
                
    }
    
    public String[][] selectAlbaranCompras() throws SQLException, ClassNotFoundException{
        
        String albaranCompras[][] = new String[4][10];
        Connection con = conect.getConexion();
        st = con.createStatement();
        int i=0;
        
        rs = st.executeQuery("SELECT * FROM ALBARAN_COMPRAS");
        while(rs.next()){
            
            albaranCompras[i][0]=rs.getString("cif_proveedor");
            albaranCompras[i][1]=String.valueOf(rs.getInt("numero_albaran_c"));
            albaranCompras[i][2]=String.valueOf(rs.getDate("fecha_compra"));
            albaranCompras[i][3]=String.valueOf(rs.getInt("orden_pedidos"));
            i++;
            
        }
        
        
        
        return albaranCompras;
        
    }
    
    public String[][] selectDetalleAlbaranCompras() throws ClassNotFoundException, SQLException{
        
        String detalleAlbaranCompras[][] = new String[6][10];
        Connection con = conect.getConexion();
        st = con.createStatement();
        int i=0;
        
        rs = st.executeQuery("SELECT * FROM DETALLE_ALBARAN_COMPRAS");
        while(rs.next()){
            
            detalleAlbaranCompras[i][0] = String.valueOf(rs.getInt("num_albaran_c"));
            detalleAlbaranCompras[i][1] = String.valueOf(rs.getInt("orden_pedido"));
            detalleAlbaranCompras[i][2] = String.valueOf(rs.getInt("codigo_articulo"));
            detalleAlbaranCompras[i][3] = String.valueOf(rs.getInt("cantidad"));
            detalleAlbaranCompras[i][4] = String.valueOf(rs.getFloat("precio"));
            detalleAlbaranCompras[i][5] = String.valueOf(rs.getFloat("descuento"));
            i++;
            
        }
        
        return detalleAlbaranCompras;
        
    }
    
    public String[][] selectAlbaranVentas() throws ClassNotFoundException, SQLException{
        
        String albaranVentas[][] = new String[3][10];
        Connection con = conect.getConexion();
        st = con.createStatement();
        int i=0;
        
        rs = st.executeQuery("SELECT * FROM ALBARAN_VENTAS");
        while(rs.next()){
            
            albaranVentas[i][0] = rs.getString("nif_cliente");
            albaranVentas[i][1] = String.valueOf(rs.getInt("numero_albaran_v"));
            albaranVentas[i][2] = rs.getString("contado_credito");
            i++;
            
        }
        
        return albaranVentas;
        
    }
    
    public String[][] selectDetalleAlbaranVentas() throws ClassNotFoundException, SQLException{
        
        String detalleAlbaranVentas[][] = new String[6][10];
        Connection con = conect.getConexion();
        st = con.createStatement();
        int i=0;
        
        rs = st.executeQuery("SELECT * FROM DETALLE_ALBARAN_VENTA");
        while(rs.next()){
            
            detalleAlbaranVentas[i][0] = String.valueOf(rs.getInt("num_albaran_v"));
            detalleAlbaranVentas[i][1] = String.valueOf(rs.getDate("fecha_venta"));
            detalleAlbaranVentas[i][2] = String.valueOf(rs.getInt("codigo_articulo"));
            detalleAlbaranVentas[i][3] = String.valueOf(rs.getInt("cantidad"));
            detalleAlbaranVentas[i][4] = String.valueOf(rs.getFloat("precio"));
            detalleAlbaranVentas[i][5] = String.valueOf(rs.getFloat("descuento"));
            i++;
            
        }
        
        return detalleAlbaranVentas;        
        
    }
    
    public String[][] selectVentaCliente() throws ClassNotFoundException, SQLException{
        
        String ventaCliente[][] = new String[3][10];
        Connection con = conect.getConexion();
        st = con.createStatement();
        int i=0;
        
        rs = st.executeQuery("SELECT * FROM VENTA_CLIENTE");
        while(rs.next()){
            
            ventaCliente[i][0] = rs.getString("nif");
            ventaCliente[i][1] = String.valueOf(rs.getInt("numero_albaran_v"));
            ventaCliente[i][2] = String.valueOf(rs.getDate("fecha_venta"));
            i++;
            
        }
        
        return ventaCliente;
        
    }
    
    public String[][] selectProveedor() throws ClassNotFoundException, SQLException{
        
        String proveedor[][] = new String[5][10];
        Connection con = conect.getConexion();
        st = con.createStatement();
        int i=0;
        
        rs = st.executeQuery("SELECT * FROM PROVEEDORES");
        while(rs.next()){
            
            proveedor[i][0] = rs.getString("cif");
            proveedor[i][1] = rs.getString("nombre_de_la_empresa");
            proveedor[i][2] = rs.getString("direccion");
            proveedor[i][3] = String.valueOf(rs.getInt("telefonos"));
            proveedor[i][4] = String.valueOf(rs.getInt("codigo_de_articulos_que_suministra"));
            i++;
            
        }
        
        return proveedor;
        
    }
    
    public String[][] selectCliente() throws ClassNotFoundException, SQLException{
        
        String cliente[][] = new String[6][10];
        Connection con = conect.getConexion();
        st = con.createStatement();
        int i=0;
        
        rs = st.executeQuery("SELECT * FROM CLIENTES");
        while(rs.next()){
            
            cliente[i][0] = rs.getString("nif");
            cliente[i][1] = rs.getString("nombre");
            cliente[i][2] = rs.getString("direccion");
            cliente[i][3] = String.valueOf(rs.getInt("telefono"));
            cliente[i][4] = String.valueOf(rs.getFloat("credito_disponible"));
            cliente[i][5] = String.valueOf(rs.getFloat("descuento_cliente"));
            i++;
            
        }
        
        return cliente;
        
    }
    
}
