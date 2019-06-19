package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.modelo;
import vista.principalV;

/**
 *
 * @author Ivet
 */
public class Controlador {

    public static principalV objv;
    public static modelo objm;

    public Controlador(principalV vistaGeneral, modelo modelo) {
        objv = vistaGeneral;
        objm = modelo;

        objv.jButtonCompras.addActionListener(new clickCompras());
        objv.jButtonArticulos.addActionListener(new clickArticulos());
        objv.jButtonConsultarCompras.addActionListener(new clickConsultarCompras());
        
        objv.jButtonCliente.addActionListener(new clickCliente());
        objv.jButtonProveedor.addActionListener(new clickProveedor());
        
        objv.jButtonConsultarCliente.addActionListener(new clickConsultarCliente());
        objv.jButtonConsultarProveedor.addActionListener(new clickConsultarProveedor());

        objv.jButtonInputArticulos.addActionListener(new clickInputArticulos());
        objv.jButtonInputCliente.addActionListener(new clickInputCliente());
        objv.jButtonInputProveedor.addActionListener(new clickInputProveedor());
        objv.jButtonInputCompras.addActionListener(new clickInputCompras());

        objv.jButtonInsertarAlbaranCompras.addActionListener(new clickInsertarAlbaranCompras());
        objv.jButtonInsertarAlbaranDetallesCompras.addActionListener(new clickinsertarAlbaranDetallesCompras());
        objv.jButtonInsertarArticulo.addActionListener(new clickInsertarArticulo());
        objv.jButtonInsertarProveedor.addActionListener(new clickInsertarProveedor());
        objv.jButtonInsertarCliente.addActionListener(new clickInsertarCliente());

        objv.jButtonVentas.addActionListener(new clickVistaVentas());
        objv.jButtonConsultarVentas.addActionListener(new clickConsultarVentas());
        objv.jButtonInsertarVentas.addActionListener(new clickInsertarVentas());
        
        objv.jButtonInsertarAlbaranVentas.addActionListener(new clickInsertarVentaNueva());
        objv.jButtonInsertarAlbaranDetallesVentas.addActionListener(new clickDetalleAlbaranVentas());
        objv.jButtonInsertarVentasCliente.addActionListener(new clickInsertarVentaCliente());

    }

    private static class clickCompras implements ActionListener {

        public clickCompras() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.inicializarMenu2();
            principalV.vistaMenu2.setVisible(true);
        }
    }

    private static class clickArticulos implements ActionListener {

        public clickArticulos() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String articulos[][] = objm.selectArticulos();
                objv.inicializarTablaArticulos(articulos);
                principalV.articulosDialog.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickConsultarCompras implements ActionListener {

        public clickConsultarCompras() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String compras[][] = objm.selectAlbaranCompras();
                String detalles[][] = objm.selectDetalleAlbaranCompras();
                objv.inicializarVistaCompras(detalles, compras);
                principalV.consultaComprasDialog.setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickInputArticulos implements ActionListener {

        public clickInputArticulos() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.insertarArticulo();
            principalV.insertarArticuloDialog.setVisible(true);
        }
    }

    private static class clickInputCliente implements ActionListener {

        public clickInputCliente() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.insertarCliente();
            principalV.insertarClienteDialog.setVisible(true);
        }

    }

    private static class clickInputProveedor implements ActionListener {

        public clickInputProveedor() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.insertarProveedor();
            principalV.insertarProveedorDialog.setVisible(true);
        }
    }

    private static class clickConsultarVentas implements ActionListener {

        public clickConsultarVentas() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                String ventaCliente[][] = objm.selectVentaCliente();
                String albaranVenta[][] = objm.selectAlbaranVentas();
                String detalleAlbaranVenta[][] = objm.selectDetalleAlbaranVentas();
                objv.inicializarVistaConsultaVentas(albaranVenta, ventaCliente, detalleAlbaranVenta);
                principalV.consultarVentasDialog.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickInputCompras implements ActionListener {

        public clickInputCompras() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.insertarCompras();
            principalV.insertarComprasDialog.setVisible(true);
        }
    }

    private static class clickInsertarAlbaranCompras implements ActionListener {

        public clickInsertarAlbaranCompras() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                albaranCompras ac = new albaranCompras(principalV.cifProveedorText.getText(),
                        Integer.parseInt(principalV.numAlbaranComprasText.getText()),
                        Date.valueOf(principalV.fechaCompraText.getText()),
                        Integer.parseInt(principalV.ordenPedidosText.getText()));
                objm.insertarAlbaranCompras(ac);
                principalV.cifProveedorText.setText("");
                principalV.numAlbaranComprasText.setText("");
                principalV.fechaCompraText.setText("");
                principalV.ordenPedidosText.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickinsertarAlbaranDetallesCompras implements ActionListener {

        public clickinsertarAlbaranDetallesCompras() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                detalleAlbaranCompras dac = new detalleAlbaranCompras(Integer.parseInt(principalV.numAlbaranDetallesComprasText.getText()),
                        Integer.parseInt(principalV.ordenPedidosDetallesText.getText()),
                        Integer.parseInt(principalV.codigoArticuloText.getText()),
                        Integer.parseInt(principalV.cantidadText.getText()),
                        Float.parseFloat(principalV.precioArticuloText.getText()),
                        Float.parseFloat(principalV.descuentoDetallesCText.getText()));
                objm.insertarDetalleAlbaranCompras(dac);
                principalV.numAlbaranDetallesComprasText.setText("");
                principalV.ordenPedidosDetallesText.setText("");
                principalV.codigoArticuloText.setText("");
                principalV.cantidadText.setText("");
                principalV.precioArticuloText.setText("");
                principalV.descuentoDetallesCText.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private static class clickInsertarArticulo implements ActionListener {

        public clickInsertarArticulo() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                articulos a = new articulos(Integer.parseInt(principalV.codigoText.getText()),
                        principalV.descripcionText.getText(),
                        Float.parseFloat(principalV.precioText.getText()),
                        Integer.parseInt(principalV.stockText.getText()),
                        Integer.parseInt(principalV.stockMedioText.getText()),
                        Integer.parseInt(principalV.stockMinimoText.getText()));
                objm.insertarArticulos(a);
                principalV.codigoText.setText("");
                principalV.descripcionText.setText("");
                principalV.precioText.setText("");
                principalV.stockText.setText("");
                principalV.stockMedioText.setText("");
                principalV.stockMinimoText.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickInsertarProveedor implements ActionListener {

        public clickInsertarProveedor() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                proveedores p = new proveedores(principalV.nifProveedorText.getText(),
                        principalV.nombreEmpresaText.getText(),
                        principalV.direccionProveedorText.getText(),
                        Integer.parseInt(principalV.telefonoProveedorText.getText()),
                        Integer.parseInt(principalV.codigoArticuloSuministradoText.getText()));
                objm.insertarProveedores(p);
                principalV.nifProveedorText.setText("");
                principalV.nombreEmpresaText.setText("");
                principalV.direccionProveedorText.setText("");
                principalV.telefonoProveedorText.setText("");
                principalV.codigoArticuloSuministradoText.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickInsertarCliente implements ActionListener {

        public clickInsertarCliente() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                clientes c = new clientes(principalV.nifClienteText.getText(),
                        principalV.nombreClienteText.getText(),
                        principalV.direccionClienteText.getText(),
                        Integer.parseInt(principalV.telefonoClienteText.getText()),
                        Float.parseFloat(principalV.creditoDisponibleClienteText.getText()),
                        Integer.parseInt(principalV.descuentoClienteText.getText()));
                objm.insertarCliente(c);
                principalV.nifClienteText.setText("");
                principalV.nombreClienteText.setText("");
                principalV.direccionClienteText.setText("");
                principalV.telefonoClienteText.setText("");
                principalV.creditoDisponibleClienteText.setText("");
                principalV.descuentoClienteText.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickVistaVentas implements ActionListener {

        public clickVistaVentas() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.inicializarMenu3();
            principalV.vistaMenu3.setVisible(true);
        }
    }

    private static class clickInsertarVentas implements ActionListener {

        public clickInsertarVentas() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.insertarVentas();
            principalV.insertarVentasDialog.setVisible(true);
        }
    }

    private static class clickCliente implements ActionListener {

        public clickCliente() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.inicializarCliente();
            principalV.vistaMenuCliente.setVisible(true);
        }
    }

    private static class clickProveedor implements ActionListener {

        public clickProveedor() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            objv.inicializarProveedor();
            principalV.vistaMenuProveedor.setVisible(true);
        }
    }

    private static class clickConsultarCliente implements ActionListener {

        public clickConsultarCliente() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String filasClientes[][] = objm.selectCliente();
                objv.inicializarTablaConsultarClientes(filasClientes);
                principalV.clienteConsultaDialog.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickConsultarProveedor implements ActionListener {

        public clickConsultarProveedor() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                String [][]ConsultarProveedores = objm.selectProveedor();
                objv.inicializarTablaConsultarProveedores(ConsultarProveedores);
                principalV.proveedorConsultaDialog.setVisible(true);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickInsertarVentaNueva implements ActionListener {

        public clickInsertarVentaNueva() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            albaranVentas av = null;
            try {
                av = new albaranVentas(principalV.nifClienteInsertarText.getText(),
                        Integer.parseInt(principalV.numAlbaranVentasInsertarText.getText()),
                        albaranVentas.pago.valueOf(principalV.tipoDePagoVentaInsertarText.getText()));
                objm.insertarAlbaranVentas(av);
                principalV.nifClienteInsertarText.setText("");
                principalV.numAlbaranVentasInsertarText.setText("");
                principalV.tipoDePagoVentaInsertarText.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    private static class clickDetalleAlbaranVentas implements ActionListener {

        public clickDetalleAlbaranVentas() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                detalleAlbaranVentas dav = null;
                dav = new detalleAlbaranVentas(Integer.parseInt(principalV.numAlbaranDetallesVentasText.getText()),
                        Date.valueOf(principalV.fechaVentaText.getText()),
                        Integer.parseInt(principalV.codigoArticuloVentasText.getText()),
                        Integer.parseInt(principalV.cantidadVentasText.getText()),
                        Float.parseFloat(principalV.precioArticuloVentasText.getText()),
                        Float.parseFloat(principalV.descuentoDetallesVText.getText()));
                objm.insertarDetalleAlbaranVenta(dav);
                principalV.numAlbaranDetallesVentasText.setText("");
                principalV.fechaVentaText.setText("");
                principalV.codigoArticuloVentasText.setText("");
                principalV.cantidadVentasText.setText("");
                principalV.precioArticuloVentasText.setText("");
                principalV.descuentoDetallesVText.setText("");
                        } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private static class clickInsertarVentaCliente implements ActionListener {

        public clickInsertarVentaCliente() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                ventaCliente vc = null;
                vc = new ventaCliente(principalV.nifClienteVClienteText.getText(),
                        Integer.parseInt(principalV.numAlbaranVClienteText.getText()),
                        Date.valueOf(principalV.fechaVText.getText()));
                objm.insertarVentaCliente(vc);
                principalV.nifClienteVClienteText.setText("");
                principalV.numAlbaranVClienteText.setText("");
                principalV.fechaVText.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
            }
                
        }
    }

}
