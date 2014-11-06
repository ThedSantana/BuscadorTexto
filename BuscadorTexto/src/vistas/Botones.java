package vistas;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.Controlador;

public class Botones extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField direccion;
	private JButton insertar,buscar;
	private JFileChooser abrir;
	private Controlador ctrl;
	//private String texto;
	
	public Botones(Controlador c){
		ctrl=c;
		confIni();
		crearContenido();
		confFin();
	}
	private void confFin() {
		setVisible(true);
	}
	private void confIni() {
		setLayout(new FlowLayout());
		//setBounds(0,0,600,50);
	}
	private void crearContenido() {
		insertar=new JButton("Seleccionar Archivo");
		insertar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				leerDocumento();
			}
		});
		//insertar.setBounds(250,50,150,25);
		add(insertar);
		
		direccion=new JTextField(20);
		//direccion.setBounds(20, 50, 180,25);
		add(direccion);
				
		buscar=new JButton("Buscar");
		//buscar.setBounds(420,50,100,25);
		buscar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String b=direccion.getText();
				if(b.length()==0)
					JOptionPane.showMessageDialog(null, "No escribiste ningun texto a buscar");
				else					
					ctrl.buscar(b);
			}
		});
		add(buscar);		
	}
	private void leerDocumento() {
		abrir=new JFileChooser();
		int docA=abrir.showOpenDialog(ctrl.getFrame());
		if(docA==JFileChooser.APPROVE_OPTION){
			File doc=abrir.getSelectedFile();
			FileInputStream miDoc;
			int sizeDoc=Long.valueOf(doc.length()).intValue();
			byte document[]=new byte[sizeDoc];
			try {
				miDoc=new FileInputStream(doc.getPath());
				miDoc.read(document);
				ctrl.setText(new String(document));
			} catch (IOException e) {
				System.out.println("Error de: "+e.getMessage());
			}
		}
	}
	public void paintComponent(Graphics g){
		cambiarTam();
    }
	private void cambiarTam() {
		setBackground(Color.black);
		setSize(ctrl.getFrame().getContentPane().getWidth(),ctrl.getFrame().getContentPane().getHeight());
	}
}
