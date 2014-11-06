package vistas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controlador.Controlador;



public class Panel1 extends JPanel{
	private static final long serialVersionUID = 1L;
	private Botones bot;
	private JTextArea tex;
	private JScrollPane margen;
	private Controlador ctrl;
	
	public Panel1(Controlador c){
		ctrl=c;
		confIni();
		crearContenido();
		confFin();
	}

	private void crearContenido() {
		bot=new Botones(ctrl);
		add(bot);
		
		tex=new JTextArea(34,65);
		tex.setBackground(Color.cyan);
		margen=new JScrollPane(tex);
		margen.setSize(ctrl.getFrame().getContentPane().getWidth(), getHeight()-50);
		JPanel cuerpo=new JPanel();
		cuerpo.add(margen);
		add(cuerpo);
	}

	private void confFin() {
		setVisible(true);
	}

	private void confIni() {
		setLayout(new FlowLayout());
	}

	public void paintComponent(Graphics g){
		cambiarTam();
		g.drawImage(null, 0, 0, Color.BLACK, null);
		super.paintComponent(g);
    }
	private void cambiarTam() {
		setSize(ctrl.getFrame().getWidth(),ctrl.getFrame().getHeight());
		setBackground(Color.DARK_GRAY);
	}

	public String getTexto() {
		return tex.getText();
	}

	public void setTexto(String t) {
		tex.setText(t);
	}
}
