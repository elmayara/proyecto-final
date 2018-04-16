package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

import controlador.Coordinador;


public class VLogin extends JFrame implements ActionListener{
	
	private Coordinador miCoordinador;
	private JPanel panel;
	private JTextField campoID;
	private JTextField campoPass;
	private JButton btn;
	
	public VLogin() {
		final int intentos=0;
		setTitle("LOGIN");
		setSize(700,450);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panelEntrada=new JPanel(new GridLayout(2,2,0,50));
		panelEntrada.setBorder(new EmptyBorder(100,80,100,80));
		panelEntrada.add(new JLabel("ID Usuario"));
		
		campoID = new JTextField(22);
		campoID.setEditable(true);
		campoID.addActionListener(this);
		JPanel panelID= new JPanel();
		panelID.add(campoID);
		panelEntrada.add(panelID);
		
		panelEntrada.add(new JLabel("Contraseña"));
		
		campoPass = new JPasswordField(22);
		campoPass.setEditable(true);
		campoPass.addActionListener(this);
		JPanel panelPass= new JPanel();
		panelPass.add(campoPass);
		panelEntrada.add(panelPass);
		
		JPanel panelBoton=new JPanel();
		panelBoton.setBorder(new EmptyBorder(10,10,10,20));
		btn=new JButton("ENTRAR");
		btn.addActionListener(this);
		panelBoton.add(btn);
		
		//vinculamos el JFrame con el JPanel
		panel=new JPanel(new BorderLayout(10,10));
		panel.add(panelEntrada, BorderLayout.CENTER);
		panel.add(panelBoton, BorderLayout.SOUTH);
		panelEntrada.setBackground(new Color(85,153,187));
		panelID.setBackground(new Color(85,153,187));
		panelPass.setBackground(new Color(85,153,187));
		panelBoton.setBackground(new Color(85,153,187));
		panel.setBackground(new Color(85,153,187));
		panel.setBorder(new EmptyBorder(10,10,10,10));
		setContentPane(panel);
		setVisible(true);
	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		
	}
	
}