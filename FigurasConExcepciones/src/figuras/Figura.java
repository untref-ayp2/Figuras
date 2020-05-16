package figuras;

/***
 * 
 * Clase abstracta para manipular Figuras geométricas en el plano.
 * Implementa la interfaz Movible que permite desplazar las figuras y 
 * Comparable
 * 
 * @see Movible
 * @see Comparable 
 * 
 */
public abstract class Figura implements Movible, Comparable<Figura> {

	/***
	 * Cada Clase concreta que extienda de Figura será responsable de calcular su
	 * área.
	 *
	 * @return el área calculada
	 */
	public abstract double obtenerArea();

	/***
	 * Compara dos figuras por su área
	 * 
	 * @return 1 Si el área de this es mayor que la que recibe por parámetro, -1 si
	 *         el área de la otra Figura es mayor y 0 si el área de ambas Figuras
	 *         son iguales
	 * 
	 */
	
	/***
	 * Las figuras se comparan por el tamaño de su área
	 */
	@Override
	public int compareTo(Figura otraFigura) {

		if (obtenerArea() > otraFigura.obtenerArea()) {
			return 1;
		} else if (obtenerArea() < otraFigura.obtenerArea()) {
			return -1;
		} else {
			return 0;
		}
	}

}
