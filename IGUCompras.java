import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class IGUCompras extends JFrame{

    private JComboBox<String> unidadesMedida;

    public IGUCompras(){

        super("IGUCompras");

        add(getBarraHtas(), BorderLayout.NORTH);
        add(getFormulario(), BorderLayout.CENTER);
        add(getTablaCompras(), BorderLayout.SOUTH);

        setSize(600, 500);
        setLocation(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    /**
     * Método que crea una barra de herramientas con los botones de la sección.
     * @return La barra de herramientas para ser agregada a la interfaz.
     */
    public JToolBar getBarraHtas(){

        //Creamos los botones
        JToolBar barraHtas = new JToolBar();
        JButton btSalir = new JButton();
        JButton btRegistrar = new JButton();
        JButton btModificar = new JButton();
        JButton btConsultar = new JButton();
        JButton btListar = new JButton();

        //Colocamos el texto a los botones
        btSalir.setText("Salir");
        btRegistrar.setText("Registrar");
        btModificar.setText("Modificar");
        btConsultar.setText("Consultar");
        btListar.setText("Listar");

        //Agregamos los botones
        barraHtas.add(btRegistrar);
        barraHtas.add(btModificar);
        barraHtas.add(btConsultar);
        barraHtas.add(btListar);
        barraHtas.add(btSalir);

        return barraHtas;

    }

    public JPanel getFormulario(){

        //Declaramos nuestras columnas
        JPanel labels = new JPanel();
        JPanel textFields = new JPanel();
        JPanel botones = new JPanel();
        JPanel formulario = new JPanel();

        //Declaramos los botones
        JButton btAceptar = new JButton();
        btAceptar.setText("Aceptar");
        JButton btCancelar = new JButton();
        btCancelar.setText("Cancelar");
        JButton btBorrar = new JButton();
        btBorrar.setText("Borrar");

        //Declaramos nuestros labels
        JLabel etiquetas[] = {
            new JLabel("Producto"),
            new JLabel ("Fecha de Compra"),
            new JLabel("Cantidad"),
            new JLabel("Total")
        };

        //Declaramos los textFields
        JTextField camposTexto[] = {
            new JTextField(),
            new JTextField(),
            new JTextField(),
            new JTextField()
        };
        

        //Establecemos las columnas
        labels.setLayout(new GridLayout(0, 1));
        textFields.setLayout(new GridLayout(0, 1));
        botones.setLayout(new GridLayout(3, 1));
        formulario.setLayout(new GridLayout(1,3));
        
        //Agregamos los labels
        for (int i = 0; i < etiquetas.length; i++){
			labels.add(etiquetas[i]);
        }
        
        //Agregamos los txtfields
        for (int i = 0; i < camposTexto.length; i++){
			textFields.add(camposTexto[i]);
        }

        //Agregamos los botones
        botones.add(btAceptar);
        botones.add(btCancelar);
        botones.add(btBorrar);

        //Preparamos el formulario
        formulario.add(labels);
        formulario.add(textFields);
        formulario.add(botones);

        formulario.setBorder(BorderFactory.createTitledBorder("Formulario de Registro de Compras"));

        return formulario;

    }

    public JPanel getTablaCompras(){

        JPanel panelTabla = new JPanel();
       
        //creacion de la tabla
		JTable tablaCompras = new JTable();

        //Parte del código de Frida
		String [] nombre = {
                "ID", "Fecha", "Producto", "Cantidad", "Total" 
            };
        
        //Más código de Frida pero funciona
		tablaCompras.setModel(new DefaultTableModel(
            new Object [][] {
                {"ID Compra", "Fecha Compra", "Producto", "Cantidad", "Total"},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            }, nombre
            
        ));
        
        //Agregamos la tabla al panel
        panelTabla.add(tablaCompras);

        panelTabla.setBorder(BorderFactory.createTitledBorder("Registros de Compras"));

        return panelTabla;

    }

    public static void main(String[] args) {
     
        IGUCompras oIguMenu = new IGUCompras();

    }

}