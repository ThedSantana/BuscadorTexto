package controlador;

import vistas.Frame;
import vistas.Panel1;

public class Controlador {
	private Frame frame;
	private Panel1 p1;
	private Buscador busc;
	//private Arbol<String> arbol;
	
	public Controlador(){
		frame=new Frame(this);
		p1=new Panel1(this);
		frame.setContentPane(p1);
		frame.setVisible(true);
		busc=new Buscador();
	}
	public Frame getFrame(){
		return frame;
	}
	
	public void buscar(String b) {
		busc.buscar(b,p1.getTexto());
	}
	public void setText(String t) {
		p1.setTexto(t);
	}
}
