package guiSARH;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JButton;

public class GUI_Empleado extends JFrame {

	private JPanel contentPane;
	private JTextField txt_cedula;
	private JTextField txt_nombres;
	private JTextField txt_apellidos;
	private JTextField txt_fecha_dia;
	private JTextField txt_ciudad;
	private JTextField txt_direccion;
	private JTextField txt_cargas;
	private JTextField txt_fecha_anio;
	private JTextField txt_fecha_mes;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		setBounds(100, 100, 651, 533);
		
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
		
		JLabel lblCdula = new JLabel("C\u00E9dula");
		lblCdula.setBounds(23, 42, 46, 14);
		contentPane.add(lblCdula);
		
		txt_cedula = new JTextField();
		txt_cedula.setBounds(102, 39, 127, 20);
		contentPane.add(txt_cedula);
		txt_cedula.setColumns(10);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setBounds(23, 85, 46, 14);
		contentPane.add(lblNombres);
		
		txt_nombres = new JTextField();
		txt_nombres.setBounds(102, 82, 195, 17);
		contentPane.add(txt_nombres);
		txt_nombres.setColumns(10);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(307, 85, 46, 14);
		contentPane.add(lblApellidos);
		
		txt_apellidos = new JTextField();
		txt_apellidos.setBounds(376, 82, 249, 20);
		contentPane.add(txt_apellidos);
		txt_apellidos.setColumns(10);
		
		JLabel lblFechaDeNacimiento = new JLabel("Fecha de Nacimiento");
		lblFechaDeNacimiento.setBounds(23, 129, 108, 14);
		contentPane.add(lblFechaDeNacimiento);
		
		txt_fecha_dia = new JTextField();
		txt_fecha_dia.setBounds(130, 126, 30, 20);
		contentPane.add(txt_fecha_dia);
		txt_fecha_dia.setColumns(10);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(23, 168, 46, 14);
		contentPane.add(lblCiudad);
		
		txt_ciudad = new JTextField();
		txt_ciudad.setBounds(102, 165, 166, 20);
		contentPane.add(txt_ciudad);
		txt_ciudad.setColumns(10);
		
		JLabel lblTipo = new JLabel("Tipo Empleado");
		lblTipo.setBounds(23, 210, 69, 14);
		contentPane.add(lblTipo);
		
		JRadioButton radio_contrato = new JRadioButton("Contrato");
		radio_contrato.setBounds(102, 206, 69, 23);
		contentPane.add(radio_contrato);
		
		JRadioButton radio_nombramiento = new JRadioButton("Nombramiento");
		radio_nombramiento.setBounds(173, 206, 95, 23);
		contentPane.add(radio_nombramiento);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n");
		lblDireccin.setBounds(307, 168, 46, 14);
		contentPane.add(lblDireccin);
		
		txt_direccion = new JTextField();
		txt_direccion.setBounds(376, 165, 249, 20);
		contentPane.add(txt_direccion);
		txt_direccion.setColumns(10);
		
		JLabel lblFechaDeIngreso = new JLabel("Fecha de Salida");
		lblFechaDeIngreso.setBounds(23, 283, 108, 14);
		contentPane.add(lblFechaDeIngreso);
		
		JLabel label = new JLabel("Fecha de Ingreso");
		label.setBounds(23, 248, 108, 14);
		contentPane.add(label);
		
		JLabel lblN = new JLabel("N de Cargas Familiares");
		lblN.setBounds(307, 248, 127, 14);
		contentPane.add(lblN);
		
		txt_cargas = new JTextField();
		txt_cargas.setBounds(456, 245, 86, 20);
		contentPane.add(txt_cargas);
		txt_cargas.setColumns(10);
		
		JLabel lblEnfermedadCatastrofica = new JLabel("Enfermedad Catastrofica");
		lblEnfermedadCatastrofica.setBounds(23, 320, 127, 14);
		contentPane.add(lblEnfermedadCatastrofica);
		
		JRadioButton radio_si = new JRadioButton("Si");
		radio_si.setBounds(173, 316, 109, 23);
		contentPane.add(radio_si);
		
		JTextArea textArea = new JTextArea();
		textArea.setBorder(new LineBorder(new Color(0, 0, 0)));
		textArea.setBounds(22, 348, 331, 84);
		contentPane.add(textArea);
		
		JButton boton_guardar = new JButton("Guardar");
		boton_guardar.setBounds(453, 348, 89, 23);
		contentPane.add(boton_guardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(453, 381, 89, 23);
		contentPane.add(btnCancelar);
		
		txt_fecha_anio = new JTextField();
		txt_fecha_anio.setColumns(10);
		txt_fecha_anio.setBounds(238, 126, 30, 20);
		contentPane.add(txt_fecha_anio);
		
		txt_fecha_mes = new JTextField();
		txt_fecha_mes.setColumns(10);
		txt_fecha_mes.setBounds(180, 126, 30, 20);
		contentPane.add(txt_fecha_mes);
		
		JLabel label_1 = new JLabel("/");
		label_1.setBounds(170, 129, 15, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("/");
		label_2.setBounds(220, 129, 15, 14);
		contentPane.add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(130, 280, 30, 20);
		contentPane.add(textField);
		
		JLabel label_3 = new JLabel("/");
		label_3.setBounds(170, 283, 15, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("/");
		label_4.setBounds(170, 258, 15, 14);
		contentPane.add(label_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(130, 252, 30, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(180, 280, 30, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(238, 280, 30, 20);
		contentPane.add(textField_3);
		
		JLabel label_5 = new JLabel("/");
		label_5.setBounds(220, 283, 15, 14);
		contentPane.add(label_5);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(180, 252, 30, 20);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(238, 252, 30, 20);
		contentPane.add(textField_5);
		
		JLabel label_6 = new JLabel("/");
		label_6.setBounds(220, 255, 15, 14);
		contentPane.add(label_6);
	}
}
