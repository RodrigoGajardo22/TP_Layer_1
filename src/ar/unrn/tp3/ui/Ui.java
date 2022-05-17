package ar.unrn.tp3.ui;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ar.unrn.tp3.modelo.Participante;
import ar.unrn.tp3.modelo.RepositorioDeParticipante;
import excepciones.Coneccion;
import excepciones.ErrorDeDatos;

public class Ui extends JFrame {
	private JTextField nombre;
	private JTextField telefono;
	private JTextField region;
	private Participante participante;
	private RepositorioDeParticipante repositorio;

	public Ui(RepositorioDeParticipante repositorio) { // lo recibe desde el main

		this.repositorio = repositorio;
		setupUIComponents();

	}

	private void setupUIComponents() {
		setTitle("Add Participant");
		setSize(400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.nombre = new JTextField(10);
		this.telefono = new JTextField(10);
		this.region = new JTextField(10);
		this.nombre.setText("");
		this.telefono.setText("");
		this.region.setText("China");
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new JLabel("Nombre: "));
		contentPane.add(nombre);
		contentPane.add(new JLabel("Telefono: "));
		contentPane.add(telefono);
		contentPane.add(new JLabel("Region: "));
		contentPane.add(region);
		JButton botonCargar = new JButton("Cargar");
		botonCargar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {

					onBotonCargar();

				} catch (Coneccion e1) {

					e1.printStackTrace();
				} catch (ErrorDeDatos e1) {
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(botonCargar);
		setContentPane(contentPane);
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		pack();
		setVisible(true);
	}

	private void onBotonCargar() throws Coneccion, ErrorDeDatos {

		participante = new Participante(nombre.getText(), telefono.getText(), region.getText());
		repositorio.nuevoParticipante(participante);

	}

}
