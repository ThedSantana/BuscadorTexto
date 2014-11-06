package vistas;

import java.awt.Dimension;

import javax.swing.JFrame;

import controlador.Controlador;


public class Frame extends JFrame{
	private static final long serialVersionUID = 1L;
	private int ancho,alto;
	public Frame(Controlador c){
		confIni();
		confFin();
	}

	private void confFin() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void confIni() {
		setTitle("Buscador de Texto");
		ancho=800;
		alto=650;
		setLayout(null);
		setSize(ancho, alto);
		setLocationRelativeTo(null);
		setResizable(false);
		setMinimumSize(new Dimension(700,600));
	}
}