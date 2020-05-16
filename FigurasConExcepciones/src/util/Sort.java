package util;

/***
 * Clase con métodos de ordenamiento
 *
 * */
public class Sort {
	

	/***
	 * Método privado para intercambiar dos objetos de un arreglo estático
	 * 
	 * @implNote Solo funciona con arreglos estáticos. Se debería modificar para usar estructuras dinámicas
	 *
	 */
	private static <T extends Comparable<? super T>> void intercambiar(T[] a, int i, int posMaxima) {

		T aux = a[i];
		a[i] = a[posMaxima];
		a[posMaxima] = aux;

	}


	/***
	 * Ordena un arreglo estático de algún tipo T que implementa la interfaz Comparable
	 * o T tiene algún ancestro que implementa Comparable
	 * 
	 * @implNote Solo funciona con arreglos estáticos. Se debería modificar para usar estructuras dinámicas
	 */
	public static <T extends Comparable<? super T>> void burbujeo( T[] a ) {

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j + 1] != null && a[j].compareTo(a[j + 1]) == 1) { 		
					intercambiar(a, j, j + 1);
				}
			}
		}
	}
}
