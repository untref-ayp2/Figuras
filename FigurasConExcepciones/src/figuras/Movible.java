package figuras;

/***
 * Interfaz que deben implementar todos los elementos que se puedan desplazar en el plano
 * @see Figura
 * @see Punto
 *
 */
public interface Movible {

	public void mover(Double incrementoX, Double incrementoY);

}
