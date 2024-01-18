package es.studium.Ejemplos;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class VentanaCerrar implements WindowListener
{
	Frame ventana = new Frame ("Ventana que se cierra");

	public VentanaCerrar()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setSize(270,220);

		ventana.addWindowListener(this);

		ventana.setSize(550,250);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}






	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new VentanaCerrar();

	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Opened / La ventana se abrió");
	}
	@Override
	public void windowClosing(WindowEvent e) {

		System.exit(0);
		// TODO Auto-generated method stub

	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se cerró, pero no te voy a ver");
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se minimizó");
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Se restauró");
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana se activó");
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("La ventana se desactivó");
	}

}
