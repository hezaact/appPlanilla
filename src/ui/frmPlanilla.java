package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import bean.Empleado;

public class frmPlanilla extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	Empleado empleado = new Empleado();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPlanilla frame = new frmPlanilla();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmPlanilla() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLayout(null);
		setUndecorated(true);
		setLocationRelativeTo(null);
	}
	
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
		JOptionPane.showMessageDialog(this, empleado.getNombres());
	}
	
	
	
	
	
	
	
	
	
	
}