package controlador;

import javax.swing.JOptionPane;

public class Buscador {
	private String texto;
	//private ArbolBin arbol;
	//private TreeMap<String, Integer> arboll;
	//private TreeModel mod;
	public Buscador(){}

	public void buscar(String buscado, String contenido) {
		armarArbol(contenido);
		buscarArbol(buscado);
	}
	private void armarArbol(String cont){
		texto=cont;
		//arboll=new TreeMap<String, Integer>();
	}
	/*private void buscarArbol(String buscado){
		
	}*/
	
	private void buscarArbol(String buscado){
		String res="";
		int b=buscado.length();
		int c=texto.length();
		int posIni=-1;
		int posFin=-1;
		int x=1;
		for(int i=0;i<c-b+1;i++){
			if(buscado.equals(texto.substring(i, i+b))){
				posIni=i;
				posFin=i+b;
				res=texto.substring(i,i+b);
				break;
			}
			if('\n'==texto.charAt(i))
				x++;
		}
		if(res.equals(buscado)){
			JOptionPane.showMessageDialog(null,"Objetivo Encontrado:"+res+"!!!\n"+"En la posixion("+posIni+" , "+posFin+")\n"+"En la Fila: "+x);
		}else
			JOptionPane.showMessageDialog(null,"Objetivo No Encontrado");
	}
}
