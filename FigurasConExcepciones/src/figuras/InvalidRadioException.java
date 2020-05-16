package figuras;

/***
 * InvalidRadioException se lanza cuando una Elipse o un Círculo reciben un radio igual 
 * a 0 o negativo. Lo que imposibilita representar la figura en el plano
 *
 */
@SuppressWarnings("serial")
public class InvalidRadioException extends FigurasException {

	public InvalidRadioException(String string) {
		super(string);
	}

}
