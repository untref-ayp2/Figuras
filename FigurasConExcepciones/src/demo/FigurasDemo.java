package demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;


import figuras.Figura;
import util.Sort;

/***
 * Clase con ejemplo de uso del paquete figura
 * como se pide en el enunciado del ejercicio implementa el método main
 *
 */
public class FigurasDemo {
	
	/***
	 * Programa que lee un archivo de datos con figuras imprime los datos básicos de las figuras y el área
	 * de cada una por pantalla, luego ordena el arreglo, usando el comparador por defecto de la clase Figura
	 * y muestra nuevamente las figuras ordenadas.
	 * Utiliza la clase auxiliar Leccto
	 * @param args
	 */
	public static void main (String[] args) {
		
		//Path por defecto donde se encuentran los archivos de datos. 
		//Debe finalizar con /, en este caso a partir del directorio de trabajo, buscará
		//los archivos de datos ./src/demo
		String path = "./src/demo/";
		
		String archivo = "";   //se leera por teclado
		int cantidadFiguras = 0; //cantidad de figuras leidas del archivo sin error
		
		Figura[] figs = null; //array de figuras, se le pedirá al usuario que ingrese el tamaño inicial
		
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Ingrese el nombre del archivo de entrada: ");
			archivo = in.readLine();
			
			System.out.println("Ingrese el tamaño del contenedor de figuras: ");
			int cantidad = Integer.parseInt(in.readLine());
		
			LectorEntrada lector = new LectorEntrada(path+archivo, cantidad);
			lector.leer();
			figs = lector.getFiguras();
			cantidadFiguras = lector.getCantidadFiguras();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Se leyeron "+cantidadFiguras+" figuras válidas del archivo: "+ archivo);
		
		for (int i=0; i < cantidadFiguras; i++) {
			System.out.println(figs[i] + " área = "+ figs[i].obtenerArea());	
		}
		
		Sort.burbujeo(figs);
		
		System.out.println("Lista de figuras ordenadas por área: ");

		for (int i=0; i < cantidadFiguras; i++) {
			System.out.println(figs[i] + " área = "+ figs[i].obtenerArea());	
		}
		
	}
}
