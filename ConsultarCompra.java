import java.awt.*;
import javax.swing.*;

public class ConsultarCompra extends JFrame {
    private JTextField camposTexto[] = {
		new JTextField()
	};

	private JLabel etiquetas[] = {
		new JLabel("ID Compra:")
    };
    
    private JButton btAceptar = new JButton("Aceptar"), btCancelar = new JButton("Cancelar");

    public ConsultarCompra(){
		super("Consultar Compra");

		add(getPanel1(), BorderLayout.CENTER);
		add(getPanel2(), BorderLayout.SOUTH);

		setSize(900, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

    }
    
    public JPanel getPanel1(){

		JPanel panel = new JPanel();

		panel.setLayout(new GridLayout(6, 2));

		for (int i = 0; i < etiquetas.length; i++){
			panel.add(etiquetas[i]);
			panel.add(camposTexto[i]);
		}

		return panel;

	}

	public JPanel getPanel2(){
		JPanel panel = new JPanel();

		panel.add(btAceptar);
		panel.add(btCancelar);

		return panel;
	}

	

	public static void main(String[] args) {
		ConsultarCompra ventana = new ConsultarCompra();
		
	}
}
