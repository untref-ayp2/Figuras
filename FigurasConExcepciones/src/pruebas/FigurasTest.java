package pruebas;

import org.junit.Assert;
import org.junit.Test;

import figuras.Circulo;
import figuras.Cuadrado;
import figuras.Elipse;
import figuras.Punto;
import figuras.Rectangulo;
import figuras.Triangulo;

public class FigurasTest {

	//Circulo
	@Test
	public void testCrearCirculoYComprobarPosicion() {

		Punto centro = new Punto(0.0, 0.0);
		Circulo circuloA;
		circuloA = new Circulo(0.0, 0.0, 10.0);
		Assert.assertTrue(circuloA.getCentro().equals(centro));	
	}

	@Test
	public void testMoverCirculo() {
		Circulo circuloA;
		circuloA = new Circulo(0.0, 0.0, 10.0);
		circuloA.mover(10.0, 10.0);
		Punto centroEsperado = new Punto(10.0, 10.0);
		
		Assert.assertTrue(circuloA.getCentro().equals(centroEsperado));
	}

	@Test

	public void testCirculoCalcularArea() {

		Circulo circuloA;
		circuloA = new Circulo(10.0, 0.0, 10.0);
		Assert.assertTrue(circuloA.obtenerArea() == (10 * 10 * Math.PI));
	}

	//Cuadrado

	@Test
	public void testCrearCuadradoYComprobarPosicion() {

		Punto inferiorIzquierdo = new Punto();
		double lado=10.0;
		
		Rectangulo cuadradoA = new Cuadrado(0.0, 0.0, lado);
	
		Assert.assertTrue(cuadradoA.getInferiorIzquierdo().equals(inferiorIzquierdo));
		Assert.assertTrue(cuadradoA.obtenerArea() == lado*lado);
		
	}

	

	@Test
	public void testCuadradoCalcularArea() {

		Rectangulo cuadradoA = new Cuadrado(0.0, 0.0, 10.0);

		Assert.assertTrue(cuadradoA.obtenerArea() == 100);
	}

	//Elipse
	@Test
	public void testCrearElipseYComprobarPosicion() {

		Punto centroEsperado = new Punto();
		Elipse elipseA = new Elipse(0.0, 0.0, 10, 5);
		
		Assert.assertTrue(elipseA.getCentro().equals(centroEsperado));
	}

	@Test
	public void testMoverElipse() {
		Punto centroEsperado = new Punto();
		Elipse elipseA = new Elipse(0.0, 0.0, 10, 5);
		Assert.assertTrue(elipseA.getCentro().getX() == centroEsperado.getX());

		centroEsperado.mover(10.0, 10.0);
		elipseA.mover(10.0, 10.0);

		Assert.assertTrue(elipseA.getCentro().getY() == centroEsperado.getY());
	}

	@Test

	public void testElipseCalcularArea() {
		Elipse elipseA = new Elipse(0.0, 0.0, 10.0, 5.0);

		Assert.assertTrue(elipseA.obtenerArea() == (10 * 5 * Math.PI));
	}

	//Rectangulo

	

	@Test
	public void testMoverRectangulo() {
		double base = 10;
		double altura = 5;
		Rectangulo rectanguloA = new Rectangulo(0.0, 0.0, base, altura);

		rectanguloA.mover(10.0, 10.0);
		Punto inferiorIzquierdoEsperado = new Punto(10.0, 10.0);

		Assert.assertTrue(rectanguloA.getInferiorIzquierdo().equals(inferiorIzquierdoEsperado));

	}

	@Test
	public void testRectanguloCalcularArea() {
		double base = 10;
		double altura = 5;
		
		Rectangulo rectanguloA = new Rectangulo(0.0, 0.0, base, altura);

		Assert.assertTrue(rectanguloA.obtenerArea() == base * altura);
		
	}
	
	//Triangulo
	
	@Test
	public void testCrearTrianguloYComprobarPosicion() {
		Punto verticeA = new Punto();
		Punto verticeB = new Punto(3.0, 0.0);
		Punto verticeC = new Punto(3.0, 4.0);
		
		Punto[] vertices;
		double[] lados;
		
		//Triangulo de lados  3 4 5
		Triangulo trianguloA = new Triangulo(0.0, 0.0, 3.0, 0.0, 3.0, 4.0);
		vertices = trianguloA.getVertices();
		lados = trianguloA.getLados();

		Assert.assertTrue(vertices[0].equals(verticeA));
		Assert.assertTrue(vertices[1].equals(verticeB));
		Assert.assertTrue(vertices[2].equals(verticeC));

		Assert.assertTrue(lados[0] == 3.0);
		Assert.assertTrue(lados[1] == 4.0);
		Assert.assertTrue(lados[2] == 5.0);

	}

	@Test
	public void testMoverTriangulo() {
		
		Punto verticeA = new Punto(10.0, 10.0);
		Punto verticeB = new Punto(13.0, 10.0);
		Punto verticeC = new Punto(13.0, 14.0);
		
		Punto[] vertices;
		double[] lados;
		
		//Triangulo de lados  3 4 5
		Triangulo trianguloA = new Triangulo(0.0, 0.0, 3.0, 0.0, 3.0, 4.0);
		
		trianguloA.mover(10.0,  10.0);
		
		vertices = trianguloA.getVertices();
		
		lados = trianguloA.getLados();
		
		Assert.assertTrue(vertices[0].equals(verticeA));
		Assert.assertTrue(vertices[1].equals(verticeB));
		Assert.assertTrue(vertices[2].equals(verticeC));

		Assert.assertTrue(lados[0] == 3.0);
		Assert.assertTrue(lados[1] == 4.0);
		Assert.assertTrue(lados[2] == 5.0);

	}

	@Test
	public void testTrianguloCalcularArea() {

		//Triangulo de lados  3 4 5
		Triangulo trianguloA = new Triangulo(0.0, 0.0, 3.0, 0.0, 3.0, 4.0);

		Assert.assertTrue(trianguloA.obtenerArea() == 3.0*4.0/2);
		
	}



}
