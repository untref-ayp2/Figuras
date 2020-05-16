package figuras;

/***
 * 
 * Clase que representa una Elipse. 
 * Una Elipse es una Figura que tiene un Centro y dos radios o semiejes
 * uno sobre el eje X y otro sobre el eje Y
 * Hereda de la clase abstracta Figura
 * @see Figura
 *
 */
public class Elipse extends Figura {

	protected double radioX;
	protected double radioY;
	protected Punto centro;

	/***
	 * Crea una Elipse centrada con centro en las coordenadas X e Y y con los radios que recibe como
	 * parámetro
	 * 
	 * @param radioX 	Radio sobre el eje X
	 * @param radioY 	Radio sobre el eje Y
	 * @param centroX 	Coordenada X del centro de la Elipse
	 * @param centroY	Coordenada Y del centro de la Elipse
	 * @throws InvalidRadioException Se lanza si algunos de los radios es menor o igual a 0
	 * @see Figura
	 * @see InvalidRadioException
	 */
	public Elipse(double centroX, double centroY, double radioX, double radioY) throws InvalidRadioException {
		if ((radioX <= 0) || (radioY <= 0))
			throw new InvalidRadioException("El radio debe ser mayor que 0");
		this.radioX = radioX;
		this.radioY = radioY;
		this.centro = new Punto(centroX, centroY);

	}

	public Punto getCentro() {
		return centro;
	}

	/***
	 * Implementa la Interfaz Movible
	 * 
	 * @see Movible
	 */
	@Override
	public void mover(Double incrementoX, Double incrementoY) {

		centro.mover(incrementoX, incrementoY);
	}

	/***
	 * Implementación del método abstracto de la clase Figura que permite
	 * calcular el área de la Elipse
	 */
	@Override
	public double obtenerArea() {

		return radioX * radioY * Math.PI;
	}

	@Override
	public String toString() {

		return ("Elipse: centro = " + centro.toString() + " radioX = " + radioX + " radioY = " + radioY);
	}

}
