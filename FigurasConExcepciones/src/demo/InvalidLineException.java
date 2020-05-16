package demo;

/***
 * Excepcion para señalar que una linea del archivo de datos está mal formada
 *
 */
public class InvalidLineException extends DemoException {
	
	public InvalidLineException(String s) {
		super(s);
	}

}
