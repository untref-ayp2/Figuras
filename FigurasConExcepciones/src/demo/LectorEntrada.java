package demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Elipse;
import figuras.Figura;
import figuras.FigurasException;
import figuras.Rectangulo;
import figuras.Triangulo;
/***
 * Clase que manipula archivos de entrada con el formato dado en la consigna y crea las figuras
 * Maneja las excepciones que puedan ocurrir
 *
 */
public class LectorEntrada {
	String archivo;
	String separador = ":";
	String sep2 = ",";
	Figura[] figuras;
	int ultimaFigura;

	/***
	 * 
	 * @return un arreglo con las figuras creadas a partir del archivo.
	 */
	public Figura[] getFiguras() {
		return figuras;
	}
	
	/***
	 * 
	 * @return la cantidad de figuras correctamente creadas 
	 */
	public int getCantidadFiguras() {
		return ultimaFigura;
	}

	/***
	 * 
	 * @param archivo  : path completo al archivo
	 * @param cantidad : cantidad estimada de figuras que hay en el archivo. Esta cantidad debe ser
	 * mayor o igual a la cantidad de figuras que efectivamente se encuentran en el archivo
	 * 
	 * @implNote utiliza arreglos estáticos para almacenar las figuras por lo que se debe estimar el tamaño
	 * 
	 */
	public LectorEntrada(String archivo, int cantidad) {
		this.archivo = archivo;
		figuras = new Figura[cantidad];
		ultimaFigura = 0;
	}

	/***
	 * Método que obtiene los datos de cada línea de texto leída
	 * @param linea 					: la línea leída del archivo
	 * @param nro						: el número de línea dentro del archivo
	 * @throws InvalidLineException		: la lanza si la linea del archivo está mal formateada
	 * @throws ContenedorLLenoException : la lanza si la cantidad de figuras en el archivo es superior a la cantidad estimada
	 */
	private void parsearLinea(String linea, int nro) throws InvalidLineException, ContenedorLLenoException {
		
		String tipo;        //tipo de figura leido del archivo
		String[] params;    //parametros para construir la figura como cadena de caracteres
		Double[] valores;   //parametros para construir la figura como double
		Figura fig = null;  
				
		String[] datos = linea.split(separador);
		
		if (ultimaFigura == figuras.length) throw new ContenedorLLenoException("Contenedor de figuras completos, se sugiere aumentar el tamaño");

		if (datos.length != 2) throw new InvalidLineException("Linea "+ nro+" inválida: formato desconocido");
		
		tipo = datos[0].trim().toLowerCase();
		params = datos[1].split(sep2);
		try {
			int i = 0;
			valores = new Double[params.length];
			for (String arg: params) {
				arg=arg.trim();
				valores[i++]=Double.parseDouble(arg);
			}
			switch(tipo) {
			case "cuadrado": 	if (valores.length != 3) throw new InvalidLineException("Linea "+ nro+" inválida: Cuadrado precisa tres parámetros double");
								fig = new Cuadrado(valores[0], valores[1], valores[2]);
							 	break;
			case "circulo":  	if (valores.length != 3) throw new InvalidLineException("Linea "+ nro+" inválida: Círculo precisa tres parámetros double");
								fig= new Circulo(valores[1], valores[2], valores[0]);
								break;
			case "rectangulo": 	if (valores.length != 4) throw new InvalidLineException("Linea "+ nro+" inválida: Rectángulo precisa cuatro parámetros double");
								fig= new Rectangulo(valores[0], valores[1], valores[2], valores[3]);
								break;
			case "elipse":		if (valores.length != 4) throw new InvalidLineException("Linea "+ nro+" inválida: Elipse precisa cuatro parámetros double");
								fig= new Elipse(valores[2], valores[3], valores[0], valores[1]);
								break;
			case "triangulo": 	if (valores.length != 6) throw new InvalidLineException("Linea "+ nro+" inválida: Triángulo precisa seis parámetros double");
								fig= new Triangulo(valores[0], valores[1], valores[2], valores[3], valores[4], valores[5]);
								break;				
			default: throw new InvalidLineException("Linea "+ nro+" inválida: Tipo de figura no soportado: "+tipo);
			
			}
		} catch (FigurasException e) {
			//atrapa cualquier excepción que se pueda generar en los constructores, agrega información
			//sobre el numero de linea y lanza una excepción propia que podremos manejar
			throw new InvalidLineException("Linea "+ nro+" inválida: "+ e.getMessage());
		}
		figuras[ultimaFigura++]=fig;	
	}
					
	/***
	 * Método que lee efectivamente el archivo linea a linea y almacena las figuras
	 * Usa el método parsearLinea para interpretar la línea y crear la figura.
	 * 
	 * Si atrapa un Excepción del tipo InvalidLineException la muestra por Standar Error y continua
	 * 
	 * @throws ContenedorLLenoException la lanza si no puede continuar almacenando figuras
	 */
	
	public void leer() throws ContenedorLLenoException {
		Figura[] figs= new Figura[10];
		FileReader elArchivo;
		BufferedReader lector = null;;
		
		try {
            elArchivo = new FileReader(archivo);
            lector = new BufferedReader(elArchivo);
            String oneLine;
            int nroLinea = 0;
            
            while ((oneLine = lector.readLine()) != null) {
            	try {
                	nroLinea++;
            		parsearLinea(oneLine, nroLinea);
            	} catch (InvalidLineException e) {
                	System.err.println(e.getMessage());
            	}
            	
            }
           
        } catch (IOException e) {
        	//Si se produce un Error de Entrada y Salida al leer el archivo, lo muestra continua
        	//la ejecución
            System.out.println(e);
        } finally {
        	// Nos aseguramos de cerrar siempre el archivo de datos
        	if (lector != null)
				try {
					lector.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
        }

		
	}

	
}
