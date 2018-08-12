package guiSARH;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.Action;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginSARH extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtPassword;
	private JButton btnIngresar;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public LoginSARH() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(51, 105, 46, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A");
		lblContrasea.setBounds(51, 152, 101, 14);
		contentPane.add(lblContrasea);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(169, 102, 143, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(169, 149, 143, 20);
		contentPane.add(txtPassword);
		
		btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(this);
		btnIngresar.setBounds(335, 122, 89, 23);
		contentPane.add(btnIngresar);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(106, 38, 46, 14);
		contentPane.add(lblLogin);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnIngresar) {
			char[] clave = txtPassword.getPassword();
			String password = new String(clave);
			
			if(txtUsuario.getText().equals("RaulCobo") && password.equals("12345")) {
				dispose();
				JOptionPane.showMessageDialog(null,"Bienvenido al Sistema", "Ingresaste",JOptionPane.INFORMATION_MESSAGE);
				GUI_Empleado empleado = new GUI_Empleado();
				empleado.setVisible(true);
			
			}else {
				
				JOptionPane.showMessageDialog(null, "Usuario o Contrase","Error", JOptionPane.ERROR_MESSAGE);
				txtUsuario.setText("");
				txtPassword.setText("");
				txtUsuario.requestFocus();
			}
		}
	}
}
