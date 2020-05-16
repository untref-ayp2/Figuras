package demo;

/***
 * Clase base para las manejar las situaciones excepcionales que se puedan producir
 * al manipular el archivo de datos y generar las figuras
 * 
 * En este caso se extiende de Exception, es decir que vamos a tener excepciones chequeadas
 * ya que pretendemos que nuestro programa se encargue de lidiar y eventualmente recuperarse 
 * de las situaciones excepcionales que puedan surgir al manipular el archivo de datos como
 * lineas con formato incorrecto y contenedor de figuras lleno
 *
 */
public class DemoException extends Exception{
	public DemoException (String s) {
		super(s);
	}

}
