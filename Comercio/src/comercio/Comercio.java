/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercio;

import controlador.Controlador;
import controlador.albaranCompras;
import controlador.albaranVentas;
import controlador.albaranVentas.pago;
import controlador.articulos;
import java.sql.SQLException;
import controlador.clientes;
import controlador.compraProveedor;
import controlador.detalleAlbaranCompras;
import controlador.detalleAlbaranVentas;
import controlador.proveedores;
import controlador.suministra;
import controlador.ventaCliente;
import java.sql.Date;
import modelo.conexion;
import modelo.modelo;
import vista.principalV;
//import vista.principalV;


/**
 *
 * @author Ivet
 */
public class Comercio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        principalV ir = new principalV();
//        ir.setVisible(true);
//        articulosV art =  new articulosV();
//        art.setVisible(true);
//        comprasD comprar = new comprasD();
//        comprar.setVisible(true);

//    clientes c1 = new clientes("78945632G" , "Paco", "C/ Alvea 3", 999785461, 32f, 33.13f);
//    
    modelo m = new modelo();
    principalV p = new principalV();    
    Controlador c = new Controlador(p,m);
    p.setVisible(true);
    
//   
//    m.insertarCliente(c1);    //porque el método se llaman insertar en la clase conexion
    
//
//proveedores p = new proveedores("798789", "Jeringas S.L.", "C/ Sin acera 44", 987987987, 1);
//m.insertarProveedores(p);

//articulos ar = new articulos(2, "Articulillo2", 35.50f, 50, 10, 25);
//
//m.insertarArticulos(ar);
//albaranVentas av = new albaranVenta
    
//albaranVentas av = new albaranVentas("78945632G", 14, pago.contado);
//m.insertarAlbaranVentas(av);

//albaranCompras ac = new albaranCompras("798789", 21, Date.valueOf("2017-05-03"), 35);
//m.insertarAlbaranCompras(ac);

//detalleAlbaranCompras dac = new detalleAlbaranCompras(21, 15, 1, 55, 44, 92);
//m.insertarDetalleAlbaranCompras(dac);

//detalleAlbaranVentas dav = new detalleAlbaranVentas(14, Date.valueOf("2015-05-03"), 1, 33, 50.25f, 25);
//m.insertarDetalleAlbaranVenta(dav);

//compraProveedor cp = new compraProveedor(21, "798789", Date.valueOf("2019-03-11"));
//m.insertarCompraProveedor(cp);

//ventaCliente vc = new ventaCliente("78945632G", 14, Date.valueOf("2000-11-15"));
//m.insertarVentaCliente(vc);

//suministra s = new suministra(1, "798789");
//m.insertarSuministra(s);

//m.selectArticulos();


        // TODO code application logic here
    }
    
}
