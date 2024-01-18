package es.studium.Ejercicios;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Ejercicio1 implements WindowListener, ActionListener
{
	// Declarar Variables y Objetos
	Frame ventana = new Frame();
	TextField txtNumero = new TextField(10);
	Button btnCalcular = new Button("Calcular");
	Label lblResultado = new Label("               ");
	public Ejercicio1()
	{
		ventana.addWindowListener(this);
		btnCalcular.addActionListener(this);
		
	
		
		ventana.setTitle("Par / Impar"); // Dame título a la ventana
		ventana.setSize(300, 70); // Establecer el tamaño ancho x alto en píxeles
		ventana.setBackground(Color.cyan); // Color de fondo
		
		ventana.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
		ventana.setResizable(false); // No redimensionar
		ventana.setLayout(new FlowLayout()); // Establecer la distribución
		
		ventana.add(txtNumero); // Agregar el botón a la ventana (Frame)
		ventana.add(btnCalcular);
		ventana.add(lblResultado);
		
		ventana.setVisible(true); // Mostrar la ventana
	}
	public static void main(String[] args)
	{
		new Ejercicio1();
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//Coger el numero escrito
		int numero = Integer.parseInt(txtNumero.getText());
		//Comprobar si es impar o par
		String mensaje = "";
		if(numero % 2==0)
		{
			mensaje = "Es par";
		}
		else 
		{
			mensaje = "Es impar";
		}
		
		//Mostrar el resultado
		lblResultado.setText(mensaje);
	}
}
