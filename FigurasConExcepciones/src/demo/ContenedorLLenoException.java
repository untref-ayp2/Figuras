package demo;
/***
 * Excepción que se lanza si el contenedor de figuras (arreglo estático) no tiene más espacio
 * para almacenar y se intenta almacenar otra figura
 *
 */
@SuppressWarnings("serial")
public class ContenedorLLenoException extends Exception {

	public ContenedorLLenoException(String s) {
		super(s);
	}
	
	

}
