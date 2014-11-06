package controlador;

public class Main {
	public static void main(String[] args) {
		try {
			new Controlador();
		} catch (Exception e) {
			System.out.println("No se pudo Abrir al archivo");
		}
	}
}
