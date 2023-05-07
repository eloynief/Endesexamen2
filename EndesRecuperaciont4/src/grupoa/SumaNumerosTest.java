package grupoa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SumaNumerosTest {

	@Test
	void testMayorQue1() {
		//crear objeto con el valor que queramos introducir 
		SumaNumeros obj = new SumaNumeros();
		//la suma de los números pares desde 1 hasta 4 es 2+4=6
        int numeroEsperado = 6;
        //crear variable que llama al objeto
        int numero = obj.sumaNumeros(4);
        //probar los valores
        assertEquals(numeroEsperado, numero);
	}
	
	@Test
	void testMayorQuePrimerPar() {
		//crear objeto con el valor que queramos introducir 
		SumaNumeros obj = new SumaNumeros();
		//la suma de los números pares
        int numeroEsperado = 2;
        //variable que llama al objeto
        int numero = obj.sumaNumeros(3);
        //probar los valores
        assertEquals(numeroEsperado, numero);
	}
	
	@Test
	void testLimiteMenor() {
		//crear objeto con el valor que queramos introducir 
		SumaNumeros obj = new SumaNumeros();
		//la suma de los números pares desde 1 hasta 4 es 2+4=6
        int numeroEsperado = 0;
        //crear variable que llama al objeto
        int numero = obj.sumaNumeros(0);
        //probar los valores
        assertEquals(numeroEsperado, numero);
	}

	@Test
	void testMenorQue1() {
		//crear objeto con el valor que queramos introducir 
		SumaNumeros obj = new SumaNumeros();
		//como el número introducido es negativo, entonces no se cuentan
        int numeroEsperado = 0;
        //crear variable que llama al objeto
        int numero = obj.sumaNumeros(-2);
        //probar los valores
        assertEquals(numeroEsperado, numero);
	}
	
	@Test
	void testIgualQue1() {
		//crear objeto con el valor que queramos introducir 
		SumaNumeros obj = new SumaNumeros();
		//El número 1 no es par, por lo tanto la suma de pares es 0
        int numeroEsperado = 0;
        //crear variable que llama al objeto
        int numero = obj.sumaNumeros(1);
        //probar los valores
        assertEquals(numeroEsperado, numero);
	}
	
	@Test
	void testNegativo() {
		//crear objeto con el valor que queramos introducir 
		SumaNumeros obj = new SumaNumeros();
		//como el número es negativo, entonces el bucle que aumenta el valor del numero esperado no aumenta
        int numeroEsperado = 0;
        //variable que llama al objeto
        int numero = obj.sumaNumeros(-1);
        //probar valores
        assertEquals(numeroEsperado, numero);
	}
	
	
	
}
