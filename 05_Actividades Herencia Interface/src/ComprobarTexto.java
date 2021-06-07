
public class ComprobarTexto implements IComprobar {

	@Override
	public void comprobar(String texto) {
		// TODO Auto-generated method stub
		if (texto.length()>6) {
			System.out.println("Valido");
		}
		else {
			System.out.println("No valido");
		}

	}

}
