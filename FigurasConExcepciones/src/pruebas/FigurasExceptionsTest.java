package pruebas;

import org.junit.Assert;
import org.junit.Test;

import figuras.Circulo;
import figuras.Elipse;
import figuras.InvalidRadioException;
import figuras.InvalidRectangleException;
import figuras.InvalidTriangleException;
import figuras.Rectangulo;
import figuras.Triangulo;

public class FigurasExceptionsTest {

	@Test
	public void testCirculoInvalidRadioException() {

		
		//Chequea que se levanta InvalidRadioException cuando intenta crear un
		//Círculo con radio 0
		InvalidRadioException e = Assert.assertThrows(InvalidRadioException.class,
				() ->{new Circulo(0.0, 0.0, 0.0);});
		
		//Chequea que el mensaje de la excepción sea "El radio debe ser mayor que 0"
		Assert.assertEquals("El radio debe ser mayor que 0", e.getMessage());
	}

	@Test
	public void testElipseInvalidRadioException() {

		
		//Chequea que se levanta InvalidRadioException cuando intenta crear un
		//Elipse con radio mayor 0
		InvalidRadioException e = Assert.assertThrows(InvalidRadioException.class,
				() ->{new Elipse(0.0, 10, 0.0, 10.0);});
		
		//Chequea que el mensaje de la excepción sea "El radio debe ser mayor que 0"
		Assert.assertEquals("El radio debe ser mayor que 0", e.getMessage());
		
		//Chequea que se levanta InvalidRadioException cuando intenta crear un
		//Elipse con radio mayor 0
		e = Assert.assertThrows(InvalidRadioException.class,
				() ->{new Elipse(0.0, 0.0, 10.0,0.0);});
		
		//Chequea que el mensaje de la excepción sea "El radio debe ser mayor que 0"
		Assert.assertEquals("El radio debe ser mayor que 0", e.getMessage());
	}


	@Test
	public void testInvalidTriangleException() {
		
		
		//Chequea que se levanta InvalidTriangleException cuando intenta crear un
		//triángulo con tres puntos alineados. En este ejemplo los tres tienen X=0
		Assert.assertThrows(InvalidTriangleException.class, ()->{new Triangulo(0, 5, 0, 6, 0, 10);});
	}
	
	@Test
	public void testInvalidRectangleException() {
		
	
		
		//Chequea que se levanta InvalidRectangleException cuando intenta crear un
		//rectángulo base o altura igual a 0
		Assert.assertThrows(InvalidRectangleException.class, ()->{new Rectangulo(0.0, 0.0, 0.0,10);});
		
	}
	
}
