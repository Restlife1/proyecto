package vista;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author Ivet
 */
public class principalV extends JFrame {

    //Creamos los botones en PrincipalV
    public static JButton jButtonCompras = new JButton("COMPRAS");
    public static JButton jButtonVentas = new JButton("VENTAS");
    public static JButton jButtonFactura = new JButton("FACTURA CLIENTE");

    public static JButton jButtonCliente = new JButton("CLIENTE");
    public static JButton jButtonProveedor = new JButton("PROVEEDOR");

    //Creamos los botenes del Menu2(COMPRAS)
    public static JFrame vistaMenu2 = new JFrame();

    public static JButton jButtonArticulos = new JButton("CONSULTA ARTICULOS");
    public static JButton jButtonConsultarCompras = new JButton("CONSULTAR COMPRAS");

    public static JButton jButtonInputArticulos = new JButton("INSERTAR ARTICULOS");
    public static JButton jButtonInputCompras = new JButton("INSERTAR COMPRAS");

    //Cremoas los botones del Menu3(VENTAS)
    public static JFrame vistaMenu3 = new JFrame();
    public static JButton jButtonConsultarVentas = new JButton("CONSULTAR VENTAS");
    public static JButton jButtonInsertarVentas = new JButton("INSERTAR VENTAS");

    //Cremaos los botones del menu CLIENTE
    public static JFrame vistaMenuCliente = new JFrame();
    public static JButton jButtonInputCliente = new JButton("INSERTAR CLIENTE");
    public static JButton jButtonConsultarCliente = new JButton("CONSULTAR CLIENTE");

    //Creamos los botons del menu PROVEEDOR
    public static JFrame vistaMenuProveedor = new JFrame();
    public static JButton jButtonInputProveedor = new JButton("INSERTAR PROVEEDOR");
    public static JButton jButtonConsultarProveedor = new JButton("CONSULTAR PROVEEDOR");

    //Creamos la tabla para el botón CLIENTE CONSULTAS
    public static JDialog clienteConsultaDialog = new JDialog();
    public static JTable jTableClientesConsultas;
    public static JScrollPane scrollPaneClientesConsulta = new JScrollPane();

    //Creamos la tabla para el botón PROVEEDOR CONSULTAS
    public static JDialog proveedorConsultaDialog = new JDialog();
    public static JTable jTableProveedorConsultas;
    public static JScrollPane scrollPaneProveedorConsulta = new JScrollPane();

    //Creamos la tabla para el botón artículos
    public static JDialog articulosDialog = new JDialog();
    public static JTable jTableArticulos;
    public static JScrollPane scrollPaneArticulos = new JScrollPane();

    //Creamos la vista compras para albaran y detalles
    public static JDialog consultaComprasDialog = new JDialog();
    public static JTable jTableAlbaranCompras;
    public static JScrollPane scrollPaneAlbaranCompras = new JScrollPane();
    public static JTable jTableDetallesAlbaranCompras;
    public static JScrollPane scrollPaneDetallesAlbaranCompras = new JScrollPane();

    //Creamos ventana para insertar articulo
    public static JDialog insertarArticuloDialog = new JDialog();

    public static JLabel codigoLabel;
    public static JLabel descripcionLabel;
    public static JLabel precioLabel;
    public static JLabel stockLabel;
    public static JLabel stockMedioLabel;
    public static JLabel stockMinimoLabel;

    public static JTextField codigoText;
    public static JTextField descripcionText;
    public static JTextField precioText;
    public static JTextField stockText;
    public static JTextField stockMedioText;
    public static JTextField stockMinimoText;

    //Boton para confirmar la insercción de un articulo
    public static JButton jButtonInsertarArticulo = new JButton("INSERTAR ARTICULO");

    //Creamos ventana donde vamos a insertar el cliente
    public static JDialog insertarClienteDialog = new JDialog();

    public static JLabel nifClienteLabel;
    public static JLabel nombreClienteLabel;
    public static JLabel direccionClienteLabel;
    public static JLabel telefonoClienteLabel;
    public static JLabel creditoDisponibleClienteLabel;
    public static JLabel descuentoClienteLabel;

    public static JTextField nifClienteText;
    public static JTextField nombreClienteText;
    public static JTextField direccionClienteText;
    public static JTextField telefonoClienteText;
    public static JTextField creditoDisponibleClienteText;
    public static JTextField descuentoClienteText;

    //Boton para confirmar la insercción de un cliente
    public static JButton jButtonInsertarCliente = new JButton("INSERTAR CLIENTE");

    //Creamos ventana donde vamos a insertar un proveedor
    public static JDialog insertarProveedorDialog = new JDialog();

    public static JLabel nifProveedorLabel;
    public static JLabel nombreEmpresaLabel;
    public static JLabel direccionProveedorLabel;
    public static JLabel telefonoProveedorLabel;
    public static JLabel codigoArticuloSuministradoLabel;

    public static JTextField nifProveedorText;
    public static JTextField nombreEmpresaText;
    public static JTextField direccionProveedorText;
    public static JTextField telefonoProveedorText;
    public static JTextField codigoArticuloSuministradoText;

    //Boton para cofirmar la insercción de un proveedor
    public static JButton jButtonInsertarProveedor = new JButton("INSERTAR PROVEEDOR");

    //Creamos ventana donde vamos a insertar las compras
    public static JDialog insertarComprasDialog = new JDialog();
    public static JLabel cifProveedorLabel;
    public static JLabel numAlbaranComprasLabel;
    public static JLabel fechaCompraLabel;
    public static JLabel ordenPedidosLabel;

    public static JTextField cifProveedorText;
    public static JTextField numAlbaranComprasText;
    public static JTextField fechaCompraText;
    public static JTextField ordenPedidosText;

    public static JLabel numAlbaranDetallesComprasLabel;
    public static JLabel ordenPedidosDetallesLabel;
    public static JLabel codigoArticuloLabel;
    public static JLabel cantidadLabel;
    public static JLabel precioArticuloLabel;
    public static JLabel descuentoDetallesCLabel;

    public static JTextField numAlbaranDetallesComprasText;
    public static JTextField ordenPedidosDetallesText;
    public static JTextField codigoArticuloText;
    public static JTextField cantidadText;
    public static JTextField precioArticuloText;
    public static JTextField descuentoDetallesCText;

    //Boton para confirmar la inserccion de datos ALBARAN COMPRAS
    public static JButton jButtonInsertarAlbaranCompras = new JButton("INSERTAR");

    //Boton para confirmar la inserccion de datos ALBARAN DETALLES COMPRAS
    public static JButton jButtonInsertarAlbaranDetallesCompras = new JButton("INSERTAR");

    //Creamos ventana donde vamos a insertar las VENTAS
    public static JDialog insertarVentasDialog = new JDialog();

    public static JLabel nifClienteInsertarLabel;
    public static JLabel numAlbaranVentasInsertarLabel;
    public static JLabel tipoDePagoVentaInsertarLabel;

    public static JTextField nifClienteInsertarText;
    public static JTextField numAlbaranVentasInsertarText;
    public static JTextField tipoDePagoVentaInsertarText;

    public static JLabel numAlbaranDetallesVentasLabel;
    public static JLabel fechaVentaLabel;
    public static JLabel codigoArticuloVentasLabel;
    public static JLabel cantidadVentasLabel;
    public static JLabel precioArticuloVentasLabel;
    public static JLabel descuentoDetallesVLabel;

    public static JTextField numAlbaranDetallesVentasText;
    public static JTextField fechaVentaText;
    public static JTextField codigoArticuloVentasText;
    public static JTextField cantidadVentasText;
    public static JTextField precioArticuloVentasText;
    public static JTextField descuentoDetallesVText;

    public static JLabel nifClienteVClienteLabel;
    public static JLabel numAlbaranVClienteLabel;
    public static JLabel fechaVLabel;

    public static JTextField nifClienteVClienteText;
    public static JTextField numAlbaranVClienteText;
    public static JTextField fechaVText;

    //Boton para confirmar la inserccion de datos ALBARAN COMPRAS
    public static JButton jButtonInsertarAlbaranVentas = new JButton("INSERTAR");

    //Boton para confirmar la inserccion de datos ALBARAN DETALLES COMPRAS
    public static JButton jButtonInsertarAlbaranDetallesVentas = new JButton("INSERTAR");

    //Boton para confirmar la inserccion de datos VENTAS CLIENTE
    public static JButton jButtonInsertarVentasCliente = new JButton("INSERTAR");

    //Creamos las tablas para ventas
    public static JDialog consultarVentasDialog = new JDialog();
    public static JTable jTableAlbaranVentas;
    public static JTable jTableDetallesAlbaranVentas;
    public static JTable jTableVentaCliente;
    public static JScrollPane scrollPaneAlbaranVentas = new JScrollPane();
    public static JScrollPane scrollPaneDetallesAlbaranVentas = new JScrollPane();
    public static JScrollPane scrollPaneVentaCliente = new JScrollPane();

    public principalV() {

        inicializarVistaPrincipal();

    }

    public void inicializarVistaPrincipal() {
        this.setLayout(null);
        this.add(jButtonCompras);
        jButtonCompras.setBounds(60, 200, 150, 50);
        this.add(jButtonVentas);
        jButtonVentas.setBounds(240, 200, 150, 50);
        this.add(jButtonFactura);
        jButtonFactura.setBounds(410, 200, 150, 50);

        jButtonCliente.setBounds(110, 300, 200, 50);
        this.add(jButtonCliente);
        jButtonProveedor.setBounds(330, 300, 200, 50);
        this.add(jButtonProveedor);

        this.setSize(600, 600);
    }

    //Menu3 de COMPRAS
    public void inicializarMenu2() {
        vistaMenu2.setLayout(null);

        //Botones para ventanas consultar
        vistaMenu2.add(jButtonArticulos);
        jButtonArticulos.setBounds(80, 100, 300, 50);
        vistaMenu2.add(jButtonConsultarCompras);
        jButtonConsultarCompras.setBounds(80, 200, 300, 50);

        //Botones para abrir ventana
        vistaMenu2.add(jButtonInputArticulos);
        jButtonInputArticulos.setBounds(400, 100, 300, 50);
        vistaMenu2.add(jButtonInputCompras);
        jButtonInputCompras.setBounds(400, 200, 300, 50);

        vistaMenu2.setSize(1000, 500);
    }

    //Menu3 de VENTAS
    public void inicializarMenu3() {
        vistaMenu3.setLayout(null);

        //Boton para consultas
        vistaMenu3.add(jButtonConsultarVentas);
        jButtonConsultarVentas.setBounds(100, 100, 300, 50);

        //Boton para insertar
        vistaMenu3.add(jButtonInsertarVentas);
        jButtonInsertarVentas.setBounds(100, 200, 300, 50);

        vistaMenu3.setSize(500, 500);

    }

    public void inicializarCliente() {
        vistaMenuCliente.setLayout(null);

        //Boton consultas
        vistaMenuCliente.add(jButtonConsultarCliente);
        jButtonConsultarCliente.setBounds(100, 100, 200, 50);

        //Boton insertar
        vistaMenuCliente.add(jButtonInputCliente);
        jButtonInputCliente.setBounds(100, 200, 200, 50);

        vistaMenuCliente.setSize(500, 500);
    }
    
     public void inicializarProveedor() {
        vistaMenuProveedor.setLayout(null);

        //Boton consultas
        vistaMenuProveedor.add(jButtonConsultarProveedor);
        jButtonConsultarProveedor.setBounds(100, 100, 200, 50);

        //Boton insertar
        vistaMenuProveedor.add(jButtonInputProveedor);
        jButtonInputProveedor.setBounds(100, 200, 200, 50);

        vistaMenuProveedor.setSize(500, 500);
    }

    //Tabla Clientes
    public void inicializarTablaConsultarClientes(String[][] arrayDatosFilasClientes) {
        String[] arrayColumnasClientes = {"NIF", "NOMBRE", "DIRECCION", "TELEFONO", "CREDITO", "DESCUENTO"};
        jTableClientesConsultas = new JTable(arrayDatosFilasClientes, arrayColumnasClientes);
        clienteConsultaDialog.add(scrollPaneClientesConsulta);
        scrollPaneClientesConsulta.setBounds(50, 50, 50, 50);
        scrollPaneClientesConsulta.setViewportView(jTableClientesConsultas);
        jTableClientesConsultas.setEnabled(false);

        //Damos tamaño a la pantalla
        clienteConsultaDialog.setSize(800, 500);

    }

    //Tabla proveedores
    public void inicializarTablaConsultarProveedores(String[][] arrayDatosFilasConsultarProveedores) {
        String[] arrayColumnasConsultarProveedores = {"CIF", "NOMBRE DE EMPRESA", "DIRECCION", "TELEFONO", "CODIGO ART."};
        jTableProveedorConsultas = new JTable(arrayDatosFilasConsultarProveedores, arrayColumnasConsultarProveedores);
        proveedorConsultaDialog.add(scrollPaneProveedorConsulta);
        scrollPaneProveedorConsulta.setBounds(50, 50, 50, 50);
        scrollPaneProveedorConsulta.setViewportView(jTableProveedorConsultas);
        jTableProveedorConsultas.setEnabled(false);

        //Damos tamaño a la pantalla
        proveedorConsultaDialog.setSize(800, 500);

    }

    //Tabla Articulos
    public void inicializarTablaArticulos(String[][] arrayDatosFilasArticulos) {
        String[] arrayColumnasArticulos = {"CODIGO", "DESCRIPCION", "PRECIO", "STOCK", "STOCK MEDIO", "STOCK MINIMO"};
        jTableArticulos = new JTable(arrayDatosFilasArticulos, arrayColumnasArticulos);
        articulosDialog.add(scrollPaneArticulos);
        scrollPaneArticulos.setBounds(50, 50, 50, 50);
        scrollPaneArticulos.setViewportView(jTableArticulos);
        jTableArticulos.setEnabled(false);

        //Damos tamaño a la pantalla
        articulosDialog.setSize(800, 500);

    }

    //Mostrar tablas AlbaranCommpras y DetallesAlbaranCompras
    public void inicializarVistaCompras(String[][] detalles, String[][] compras) {
        consultaComprasDialog.setLayout(null);
        inicializarTablaAlbaranCompras(compras);
        inicializarTablaDetallesAlbaranCompras(detalles);
        consultaComprasDialog.add(scrollPaneAlbaranCompras);
        consultaComprasDialog.add(scrollPaneDetallesAlbaranCompras);
        scrollPaneAlbaranCompras.setBounds(30, 300, 600, 183);
        scrollPaneDetallesAlbaranCompras.setBounds(30, 50, 500, 183);
        consultaComprasDialog.setSize(1000, 1000);

    }

    //Tabla Albaran Compras
    public void inicializarTablaAlbaranCompras(String[][] arrayDatosFilasAlbaranCompras) {
        String[] arrayColumnasAlbaranCompras = {"CIF PROVEEDOR", "NUMERO ALBARAN", "FECHA COMPRA", "ORDEN PEDIDOS"};
        jTableAlbaranCompras = new JTable(arrayDatosFilasAlbaranCompras, arrayColumnasAlbaranCompras);
        scrollPaneAlbaranCompras.setViewportView(jTableAlbaranCompras);
        jTableAlbaranCompras.setEnabled(false);

    }

    //Tabla detalles Albaran Compras
    public void inicializarTablaDetallesAlbaranCompras(String[][] arrayDatosFilasDetallesAlbaranCompras) {
        String[] arrayColumnasDetallesAlbaranCompras = {"NUM ALBARAN", "ORDEN PEDIDO", "CODIGO ARTICULO", "CANTIDAD", "PRECIO", "DESCUENTO"};
        jTableDetallesAlbaranCompras = new JTable(arrayDatosFilasDetallesAlbaranCompras, arrayColumnasDetallesAlbaranCompras);
        scrollPaneDetallesAlbaranCompras.setViewportView(jTableDetallesAlbaranCompras);
        jTableDetallesAlbaranCompras.setEnabled(false);

    }

    //Inicializar vista Insertar Compras
    public void insertarCompras() {
        insertarComprasDialog.setLayout(null);
        insertarAlbaranCompras();
        insertarAlbaranDetallesCompras();

        insertarComprasDialog.add(cifProveedorLabel);
        insertarComprasDialog.add(numAlbaranComprasLabel);
        insertarComprasDialog.add(fechaCompraLabel);
        insertarComprasDialog.add(ordenPedidosLabel);

        insertarComprasDialog.add(cifProveedorText);
        insertarComprasDialog.add(numAlbaranComprasText);
        insertarComprasDialog.add(fechaCompraText);
        insertarComprasDialog.add(ordenPedidosText);

        insertarComprasDialog.add(jButtonInsertarAlbaranCompras);

        cifProveedorLabel.setBounds(50, 50, 100, 100);
        numAlbaranComprasLabel.setBounds(50, 100, 100, 100);
        fechaCompraLabel.setBounds(50, 150, 100, 100);
        ordenPedidosLabel.setBounds(50, 200, 100, 100);

        cifProveedorText.setBounds(150, 90, 100, 20);
        numAlbaranComprasText.setBounds(150, 140, 100, 20);
        fechaCompraText.setBounds(150, 190, 100, 20);
        ordenPedidosText.setBounds(150, 240, 100, 20);

        jButtonInsertarAlbaranCompras.setBounds(50, 400, 250, 50);

        cifProveedorText.setHorizontalAlignment(0);
        numAlbaranComprasText.setHorizontalAlignment(0);
        fechaCompraText.setHorizontalAlignment(0);
        ordenPedidosText.setHorizontalAlignment(0);

        //**********************************************************
        insertarComprasDialog.add(numAlbaranDetallesComprasLabel);
        insertarComprasDialog.add(ordenPedidosDetallesLabel);
        insertarComprasDialog.add(codigoArticuloLabel);
        insertarComprasDialog.add(cantidadLabel);
        insertarComprasDialog.add(precioLabel);
        insertarComprasDialog.add(descuentoDetallesCLabel);

        insertarComprasDialog.add(numAlbaranDetallesComprasText);
        insertarComprasDialog.add(ordenPedidosDetallesText);
        insertarComprasDialog.add(codigoArticuloText);
        insertarComprasDialog.add(cantidadText);
        insertarComprasDialog.add(precioArticuloText);
        insertarComprasDialog.add(descuentoDetallesCText);

        insertarComprasDialog.add(jButtonInsertarAlbaranDetallesCompras);

        numAlbaranDetallesComprasLabel.setBounds(450, 50, 100, 100);
        ordenPedidosDetallesLabel.setBounds(450, 100, 100, 100);
        codigoArticuloLabel.setBounds(450, 150, 100, 100);
        cantidadLabel.setBounds(450, 200, 100, 100);
        precioLabel.setBounds(450, 250, 100, 100);
        descuentoDetallesCLabel.setBounds(450, 300, 100, 100);

        numAlbaranDetallesComprasText.setBounds(550, 90, 100, 20);
        ordenPedidosDetallesText.setBounds(550, 140, 100, 20);
        codigoArticuloText.setBounds(550, 190, 100, 20);
        cantidadText.setBounds(550, 240, 100, 20);
        precioArticuloText.setBounds(550, 290, 100, 20);
        descuentoDetallesCText.setBounds(550, 340, 100, 20);

        jButtonInsertarAlbaranDetallesCompras.setBounds(450, 400, 250, 50);

        numAlbaranDetallesComprasText.setHorizontalAlignment(0);
        ordenPedidosDetallesText.setHorizontalAlignment(0);
        codigoArticuloText.setHorizontalAlignment(0);
        cantidadText.setHorizontalAlignment(0);
        precioArticuloText.setHorizontalAlignment(0);
        descuentoDetallesCText.setHorizontalAlignment(0);

        insertarComprasDialog.setSize(1000, 1000);

    }

    public void insertarAlbaranCompras() {
        cifProveedorLabel = new JLabel("CIF PROVEEDOR");
        numAlbaranComprasLabel = new JLabel("Nº ALBARAN");
        fechaCompraLabel = new JLabel("FECHA");
        ordenPedidosLabel = new JLabel("ORDEN PEDIDO");

        cifProveedorText = new JTextField("");
        numAlbaranComprasText = new JTextField("");
        fechaCompraText = new JTextField("");
        ordenPedidosText = new JTextField("");

    }

    public void insertarAlbaranDetallesCompras() {
        numAlbaranDetallesComprasLabel = new JLabel("Nº ALABRAN");
        ordenPedidosDetallesLabel = new JLabel("ORDEN PEDIDOS");
        codigoArticuloLabel = new JLabel("CODIGO ART.");
        cantidadLabel = new JLabel("CANTIDAD");
        precioLabel = new JLabel("PRECIO");
        descuentoDetallesCLabel = new JLabel("DESCUENTO");

        numAlbaranDetallesComprasText = new JTextField("");
        ordenPedidosDetallesText = new JTextField("");
        codigoArticuloText = new JTextField("");
        cantidadText = new JTextField("");
        precioArticuloText = new JTextField("");
        descuentoDetallesCText = new JTextField("");

    }

    //Insertar atributos de articulos
    public void insertarArticulo() {
        insertarArticuloDialog.setLayout(null);
        codigoLabel = new JLabel("CODIGO");
        descripcionLabel = new JLabel("DESCRIPCION");
        precioLabel = new JLabel("PRECIO");
        stockLabel = new JLabel("STOCK");
        stockMedioLabel = new JLabel("STOCK MEDIO");
        stockMinimoLabel = new JLabel("STOCK MINIMO");

        codigoText = new JTextField("");
        descripcionText = new JTextField("");
        precioText = new JTextField("");
        stockText = new JTextField("");
        stockMedioText = new JTextField("");
        stockMinimoText = new JTextField("");

        insertarArticuloDialog.add(codigoLabel);
        insertarArticuloDialog.add(descripcionLabel);
        insertarArticuloDialog.add(precioLabel);
        insertarArticuloDialog.add(stockLabel);
        insertarArticuloDialog.add(stockMedioLabel);
        insertarArticuloDialog.add(stockMinimoLabel);

        insertarArticuloDialog.add(codigoText);
        insertarArticuloDialog.add(descripcionText);
        insertarArticuloDialog.add(precioText);
        insertarArticuloDialog.add(stockText);
        insertarArticuloDialog.add(stockMedioText);
        insertarArticuloDialog.add(stockMinimoText);

        insertarArticuloDialog.add(jButtonInsertarArticulo);

        codigoLabel.setBounds(50, 50, 100, 100);
        descripcionLabel.setBounds(50, 100, 100, 100);
        precioLabel.setBounds(50, 150, 100, 100);
        stockLabel.setBounds(50, 200, 100, 100);
        stockMedioLabel.setBounds(50, 250, 100, 100);
        stockMinimoLabel.setBounds(50, 300, 100, 100);

        codigoText.setBounds(150, 90, 100, 20);
        descripcionText.setBounds(150, 140, 100, 20);
        precioText.setBounds(150, 190, 100, 20);
        stockText.setBounds(150, 240, 100, 20);
        stockMedioText.setBounds(150, 290, 100, 20);
        stockMinimoText.setBounds(150, 340, 100, 20);

        jButtonInsertarArticulo.setBounds(50, 400, 250, 50);

        codigoText.setHorizontalAlignment(0);
        descripcionText.setHorizontalAlignment(0);
        precioText.setHorizontalAlignment(0);
        stockText.setHorizontalAlignment(0);
        stockMedioText.setHorizontalAlignment(0);
        stockMinimoText.setHorizontalAlignment(0);

        insertarArticuloDialog.setSize(1000, 1000);

    }

    //Inicializar venta para insertar cliente
    public void insertarCliente() {
        insertarClienteDialog.setLayout(null);

        nifClienteLabel = new JLabel("NIF CLIENTE");
        nombreClienteLabel = new JLabel("NOMBRE CLIENTE");
        direccionClienteLabel = new JLabel("DIRECCION");
        telefonoClienteLabel = new JLabel("TELEFONO");
        creditoDisponibleClienteLabel = new JLabel("CREDITO DISPONIBLE");
        descuentoClienteLabel = new JLabel("DESCUENTO");

        nifClienteText = new JTextField("");
        nombreClienteText = new JTextField("");
        direccionClienteText = new JTextField("");
        telefonoClienteText = new JTextField("");
        creditoDisponibleClienteText = new JTextField("");
        descuentoClienteText = new JTextField("");

        insertarClienteDialog.add(nifClienteLabel);
        insertarClienteDialog.add(nombreClienteLabel);
        insertarClienteDialog.add(direccionClienteLabel);
        insertarClienteDialog.add(telefonoClienteLabel);
        insertarClienteDialog.add(creditoDisponibleClienteLabel);
        insertarClienteDialog.add(descuentoClienteLabel);

        insertarClienteDialog.add(nifClienteText);
        insertarClienteDialog.add(nombreClienteText);
        insertarClienteDialog.add(direccionClienteText);
        insertarClienteDialog.add(telefonoClienteText);
        insertarClienteDialog.add(creditoDisponibleClienteText);
        insertarClienteDialog.add(descuentoClienteText);

        insertarClienteDialog.add(jButtonInsertarCliente);

        nifClienteLabel.setBounds(50, 50, 100, 100);
        nombreClienteLabel.setBounds(50, 100, 100, 100);
        direccionClienteLabel.setBounds(50, 150, 100, 100);
        telefonoClienteLabel.setBounds(50, 200, 100, 100);
        creditoDisponibleClienteLabel.setBounds(50, 250, 100, 100);
        descuentoClienteLabel.setBounds(50, 300, 100, 100);

        nifClienteText.setBounds(150, 90, 100, 20);
        nombreClienteText.setBounds(150, 140, 100, 20);
        direccionClienteText.setBounds(150, 190, 100, 20);
        telefonoClienteText.setBounds(150, 240, 100, 20);
        creditoDisponibleClienteText.setBounds(150, 290, 100, 20);
        descuentoClienteText.setBounds(150, 340, 100, 20);

        jButtonInsertarCliente.setBounds(50, 400, 250, 50);

        nifClienteText.setHorizontalAlignment(0);
        nombreClienteText.setHorizontalAlignment(0);
        direccionClienteText.setHorizontalAlignment(0);
        telefonoClienteText.setHorizontalAlignment(0);
        creditoDisponibleClienteText.setHorizontalAlignment(0);
        descuentoClienteText.setHorizontalAlignment(0);

        insertarClienteDialog.setSize(1000, 1000);

    }

    public void insertarProveedor() {
        insertarProveedorDialog.setLayout(null);

        nifProveedorLabel = new JLabel("CIF PROVEEDOR");
        nombreEmpresaLabel = new JLabel("NOMBRE EMPRESA");
        direccionProveedorLabel = new JLabel("DIRECCION");
        telefonoProveedorLabel = new JLabel("TELEFONO");
        codigoArticuloSuministradoLabel = new JLabel("CODGIO ARTICULO");

        nifProveedorText = new JTextField("");
        nombreEmpresaText = new JTextField("");
        direccionProveedorText = new JTextField("");
        telefonoProveedorText = new JTextField("");
        codigoArticuloSuministradoText = new JTextField("");

        insertarProveedorDialog.add(nifProveedorLabel);
        insertarProveedorDialog.add(nombreEmpresaLabel);
        insertarProveedorDialog.add(direccionProveedorLabel);
        insertarProveedorDialog.add(telefonoProveedorLabel);
        insertarProveedorDialog.add(codigoArticuloSuministradoLabel);

        insertarProveedorDialog.add(nifProveedorText);
        insertarProveedorDialog.add(nombreEmpresaText);
        insertarProveedorDialog.add(direccionProveedorText);
        insertarProveedorDialog.add(telefonoProveedorText);
        insertarProveedorDialog.add(codigoArticuloSuministradoText);

        insertarProveedorDialog.add(jButtonInsertarProveedor);

        nifProveedorLabel.setBounds(50, 50, 100, 100);
        nombreEmpresaLabel.setBounds(50, 100, 100, 100);
        direccionProveedorLabel.setBounds(50, 150, 100, 100);
        telefonoProveedorLabel.setBounds(50, 200, 100, 100);
        codigoArticuloSuministradoLabel.setBounds(50, 250, 100, 100);

        nifProveedorText.setBounds(150, 90, 100, 20);
        nombreEmpresaText.setBounds(150, 140, 100, 20);
        direccionProveedorText.setBounds(150, 190, 100, 20);
        telefonoProveedorText.setBounds(150, 240, 100, 20);
        codigoArticuloSuministradoText.setBounds(150, 290, 100, 20);

        jButtonInsertarProveedor.setBounds(50, 350, 250, 50);

        nifProveedorText.setHorizontalAlignment(0);
        nombreEmpresaText.setHorizontalAlignment(0);
        direccionProveedorText.setHorizontalAlignment(0);
        telefonoProveedorText.setHorizontalAlignment(0);
        codigoArticuloSuministradoText.setHorizontalAlignment(0);

        insertarProveedorDialog.setSize(1000, 1000);

    }

    //Panel y vista para ver todas las tablas de ventas
    public void inicializarVistaConsultaVentas(String ventaCliente[][], String albaranVentas[][], String detalleAlbaranVenta[][]) {
        consultarVentasDialog.setLayout(null);
        inicializarTablaAlbaranVentas(albaranVentas);
        inicializarTablaDetallesAlbaranVentas(detalleAlbaranVenta);
        inicializarTablaVentasClientes(ventaCliente);
        consultarVentasDialog.add(scrollPaneAlbaranVentas);
        consultarVentasDialog.add(scrollPaneDetallesAlbaranVentas);
        consultarVentasDialog.add(scrollPaneVentaCliente);
        scrollPaneDetallesAlbaranVentas.setBounds(280, 300, 600, 183);
        scrollPaneAlbaranVentas.setBounds(30, 50, 500, 183);
        scrollPaneVentaCliente.setBounds(550, 50, 500, 183);
        consultarVentasDialog.setSize(1100, 1000);

    }

    //Tabla Albaran Ventas
    public void inicializarTablaAlbaranVentas(String albaranVentas[][]) {
        String[] arrayColumnasAlbaranVentas = {"NIF CLIENTE", "NUMERO ALBARAN", "TIPO DE PAGO"};
        jTableAlbaranVentas = new JTable(albaranVentas, arrayColumnasAlbaranVentas);
        scrollPaneAlbaranVentas.setViewportView(jTableAlbaranVentas);
        jTableAlbaranVentas.setEnabled(false);

        //Damos tamaño a la pantalla
    }

    //Tablas Detalles Albaran Ventas
    public void inicializarTablaDetallesAlbaranVentas(String detalleAlbaranVenta[][]) {
        String[] arrayColumnasDetallesVentas = {"NUMERO ALBARAN", "FECHA VENTA", "CODIGO ARTICULO", "CANTIDAD", "PRECIO", "DESCUENTO"};
        jTableDetallesAlbaranVentas = new JTable(detalleAlbaranVenta, arrayColumnasDetallesVentas);
        consultarVentasDialog.add(scrollPaneDetallesAlbaranVentas);
        scrollPaneDetallesAlbaranVentas.setViewportView(jTableDetallesAlbaranVentas);
        jTableDetallesAlbaranVentas.setEnabled(false);

        //Damos tamaño a la pantalla
    }

    //Tabla Ventas Clientes
    public void inicializarTablaVentasClientes(String ventaCliente[][]) {
        String[] arrayColumnasVentasCliente = {"NIF CLIENTE", "NUMERO ALBARAN", "FECHA VENTA"};
        jTableVentaCliente = new JTable(ventaCliente, arrayColumnasVentasCliente);
        consultarVentasDialog.add(scrollPaneDetallesAlbaranVentas);
        scrollPaneVentaCliente.setViewportView(jTableVentaCliente);
        jTableVentaCliente.setEnabled(false);

        //Damos tamaño a la pantalla
    }

    //Inicializar vista Insertar VENTAS
    public void insertarVentas() {
        insertarVentasDialog.setLayout(null);
        insertarAlbaranVentas();
        insertarAlbaranDetallesVentas();
        insertarVentasCliente();

        insertarVentasDialog.add(nifClienteInsertarLabel);
        insertarVentasDialog.add(numAlbaranVentasInsertarLabel);
        insertarVentasDialog.add(tipoDePagoVentaInsertarLabel);

        insertarVentasDialog.add(nifClienteInsertarText);
        insertarVentasDialog.add(numAlbaranVentasInsertarText);
        insertarVentasDialog.add(tipoDePagoVentaInsertarText);

        insertarVentasDialog.add(jButtonInsertarAlbaranVentas);

        nifClienteInsertarLabel.setBounds(50, 50, 100, 100);
        numAlbaranVentasInsertarLabel.setBounds(50, 100, 100, 100);
        tipoDePagoVentaInsertarLabel.setBounds(50, 150, 100, 100);

        nifClienteInsertarText.setBounds(150, 90, 100, 20);
        numAlbaranVentasInsertarText.setBounds(150, 140, 100, 20);
        tipoDePagoVentaInsertarText.setBounds(150, 190, 100, 20);

        jButtonInsertarAlbaranVentas.setBounds(50, 400, 250, 50);

        nifClienteInsertarText.setHorizontalAlignment(0);
        numAlbaranVentasInsertarText.setHorizontalAlignment(0);
        tipoDePagoVentaInsertarText.setHorizontalAlignment(0);

        //**********************************************************
        insertarVentasDialog.add(numAlbaranDetallesVentasLabel);
        insertarVentasDialog.add(fechaVentaLabel);
        insertarVentasDialog.add(codigoArticuloVentasLabel);
        insertarVentasDialog.add(cantidadVentasLabel);
        insertarVentasDialog.add(precioArticuloVentasLabel);
        insertarVentasDialog.add(descuentoDetallesVLabel);

        insertarVentasDialog.add(numAlbaranDetallesVentasText);
        insertarVentasDialog.add(fechaVentaText);
        insertarVentasDialog.add(codigoArticuloVentasText);
        insertarVentasDialog.add(cantidadVentasText);
        insertarVentasDialog.add(precioArticuloVentasText);
        insertarVentasDialog.add(descuentoDetallesVText);

        insertarVentasDialog.add(jButtonInsertarAlbaranDetallesVentas);

        numAlbaranDetallesVentasLabel.setBounds(450, 50, 100, 100);
        fechaVentaLabel.setBounds(450, 100, 100, 100);
        codigoArticuloVentasLabel.setBounds(450, 150, 100, 100);
        cantidadVentasLabel.setBounds(450, 200, 100, 100);
        precioArticuloVentasLabel.setBounds(450, 250, 100, 100);
        descuentoDetallesVLabel.setBounds(450, 300, 100, 100);

        numAlbaranDetallesVentasText.setBounds(550, 90, 100, 20);
        fechaVentaText.setBounds(550, 140, 100, 20);
        codigoArticuloVentasText.setBounds(550, 190, 100, 20);
        cantidadVentasText.setBounds(550, 240, 100, 20);
        precioArticuloVentasText.setBounds(550, 290, 100, 20);
        descuentoDetallesVText.setBounds(550, 340, 100, 20);

        jButtonInsertarAlbaranDetallesVentas.setBounds(450, 400, 250, 50);

        numAlbaranDetallesVentasText.setHorizontalAlignment(0);
        fechaVentaText.setHorizontalAlignment(0);
        codigoArticuloVentasText.setHorizontalAlignment(0);
        cantidadVentasText.setHorizontalAlignment(0);
        precioArticuloVentasText.setHorizontalAlignment(0);
        descuentoDetallesVText.setHorizontalAlignment(0);

        //**********************************************************
        insertarVentasDialog.add(nifClienteVClienteLabel);
        insertarVentasDialog.add(numAlbaranVClienteLabel);
        insertarVentasDialog.add(fechaVLabel);

        insertarVentasDialog.add(nifClienteVClienteText);
        insertarVentasDialog.add(numAlbaranVClienteText);
        insertarVentasDialog.add(fechaVText);

        insertarVentasDialog.add(jButtonInsertarVentasCliente);

        nifClienteVClienteLabel.setBounds(800, 50, 100, 100);
        numAlbaranVClienteLabel.setBounds(800, 100, 100, 100);
        fechaVLabel.setBounds(800, 150, 100, 100);

        nifClienteVClienteText.setBounds(900, 90, 100, 20);
        numAlbaranVClienteText.setBounds(900, 140, 100, 20);
        fechaVText.setBounds(900, 190, 100, 20);

        jButtonInsertarVentasCliente.setBounds(800, 400, 250, 50);

        nifClienteVClienteText.setHorizontalAlignment(0);
        numAlbaranVClienteText.setHorizontalAlignment(0);
        fechaVText.setHorizontalAlignment(0);

        insertarVentasDialog.setSize(1200, 600);

    }

    public void insertarAlbaranVentas() {
        nifClienteInsertarLabel = new JLabel("NIF CLIENTE");
        numAlbaranVentasInsertarLabel = new JLabel("Nº ALBARAN");
        tipoDePagoVentaInsertarLabel = new JLabel("TIPO DE PAGO");

        nifClienteInsertarText = new JTextField("");
        numAlbaranVentasInsertarText = new JTextField("");
        tipoDePagoVentaInsertarText = new JTextField("");

    }

    public void insertarAlbaranDetallesVentas() {

        numAlbaranDetallesVentasLabel = new JLabel("Nº ALABRAN");
        fechaVentaLabel = new JLabel("FECHA VENTA");
        codigoArticuloVentasLabel = new JLabel("CODIGO ART.");
        cantidadVentasLabel = new JLabel("CANTIDAD");
        precioArticuloVentasLabel = new JLabel("PRECIO");
        descuentoDetallesVLabel = new JLabel("DESCUENTO");

        numAlbaranDetallesVentasText = new JTextField("");
        fechaVentaText = new JTextField("");
        codigoArticuloVentasText = new JTextField("");
        cantidadVentasText = new JTextField("");
        precioArticuloVentasText = new JTextField("");
        descuentoDetallesVText = new JTextField("");
    }

    public void insertarVentasCliente() {

        nifClienteVClienteLabel = new JLabel("NIF CLIENTE");
        numAlbaranVClienteLabel = new JLabel("Nº ALBARAN");
        fechaVLabel = new JLabel("FECHA VENTA");

        nifClienteVClienteText = new JTextField("");
        numAlbaranVClienteText = new JTextField("");
        fechaVText = new JTextField("");

    }

}
