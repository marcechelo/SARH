package guiSARH;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GUI_Empleado extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Empleado frame = new GUI_Empleado();
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
	public GUI_Empleado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 658, 415);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnEmpleado = new JMenu("EMPLEADO");
		menuBar.add(mnEmpleado);
		
		JMenuItem mntmIngresarEmpleado = new JMenuItem("Ingresar Empleado");
		mnEmpleado.add(mntmIngresarEmpleado);
		
		JMenuItem mntmBuscarEmpleado = new JMenuItem("Buscar Empleado");
		mnEmpleado.add(mntmBuscarEmpleado);
		
		JMenuItem mntmActualizarDatosEmpleado = new JMenuItem("Actualizar Datos Empleado");
		mnEmpleado.add(mntmActualizarDatosEmpleado);
		
		JMenu mnPuestosDeTrabajo = new JMenu("PUESTOS DE TRABAJO");
		menuBar.add(mnPuestosDeTrabajo);
		
		JMenu mnNewMenu = new JMenu("MOVIMIENTOS ADMINISTRATIVOS");
		menuBar.add(mnNewMenu);
		
		JMenu mnDesempeoDeEmpleados = new JMenu("DESEMPE\u00D1O DE EMPLEADOS");
		menuBar.add(mnDesempeoDeEmpleados);
		
		JMenu mnAyuda = new JMenu("AYUDA");
		menuBar.add(mnAyuda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}
}
