package vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;


public class VCliente extends JFrame implements ActionListener{
	
	private Coordinador miCoordinador;
	private JPanel panel;
	private JButton bAlta;
	private JButton bBaja;
	private JButton bModificar;
	private JButton bConsulta;
	private JButton bAtras;
	
	public VCliente() {
		setTitle("CLIENTE");
		setSize(700,450);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		JPanel panelBotones=new JPanel(new GridLayout(2,2,50,20));
		
		panelBotones.setBorder(new EmptyBorder(100,200,100,200));
		bAlta=new JButton("ALTA");
		bAlta.addActionListener(this);
		panelBotones.add(bAlta);
		
		bBaja=new JButton("BAJA");
		bBaja.addActionListener(this);
		panelBotones.add(bBaja);
		bModificar=new JButton("MODIFICAR");
		bModificar.addActionListener(this);
		panelBotones.add(bModificar);
		bConsulta=new JButton("CONSULTA");
		bConsulta.addActionListener(this);
		panelBotones.add(bConsulta);
		
		JPanel panelAtras=new JPanel(new BorderLayout());
		bAtras=new JButton("<<");
		bAtras.addActionListener(this);
		panelAtras.add(bAtras, BorderLayout.WEST);
		
		panel=new JPanel(new BorderLayout(10,10));
		panel.add(panelBotones, BorderLayout.CENTER);
		panel.add(panelAtras, BorderLayout.SOUTH);
		panelBotones.setBackground(new Color(85,153,187));
		panel.setBackground(new Color(85,153,187));
		panelAtras.setBackground(new Color(85,153,187));
		panel.setBorder(new EmptyBorder(10,10,10,10));
		setContentPane(panel);
		setVisible(true);
	}
	
	public void setCoordinador(Coordinador miCoordinador) {
		this.miCoordinador=miCoordinador;
	}

	
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		
		miCoordinador.mostrarVLogin();
		miCoordinador.ocultarVCliente();
	}
	
}