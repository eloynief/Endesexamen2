package grupob;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import grupoa.SumaNumeros;

class CuentaImparesTest {

	
	/**
	 * test
	 * igual
	 * menor limite
	 * menor
	 * mayor limite
	 * mayor
	 * 0
	 */
	@Test
	void testIgual() {
		//crear objeto con el valor que queramos introducir 
		CuentaImpares obj = new CuentaImpares();
		//como el 1 es impar y solo está el 1, la suma de los números impares es 1
        int numeroEsperado = 1;
        //variable que llama al objeto
        int numero = obj.cuentaImpares(1);
        //probar valores
        assertEquals(numeroEsperado, numero);
	}
	
	@Test
	void testMayorLimite() {
		//crear objeto con el valor que queramos introducir 
		CuentaImpares obj = new CuentaImpares();
		//la suma de los números impares es 1
        int numeroEsperado = 1;
        //variable que llama al objeto
        int numero = obj.cuentaImpares(2);
        //probar valores
        assertEquals(numeroEsperado, numero);
	}
	
	@Test
	void testMayor() {
		//crear objeto con el valor que queramos introducir 
		CuentaImpares obj = new CuentaImpares();
		//la suma de los números impares es 1+3=4
        int numeroEsperado = 4;
        //variable que llama al objeto
        int numero = obj.cuentaImpares(3);
        //probar valores
        assertEquals(numeroEsperado, numero);
	}
	
	@Test
	void testMenorLimite() {
		//crear objeto con el valor que queramos introducir 
		CuentaImpares obj = new CuentaImpares();
		//como el valor introducido es 0, entonces no hay numeros impares
        int numeroEsperado = 0;
        //variable que llama al objeto
        int numero = obj.cuentaImpares(0);
        //probar valores
        assertEquals(numeroEsperado, numero);
	}
	
	@Test
	void testMenor() {
		//crear objeto con el valor que queramos introducir 
		CuentaImpares obj = new CuentaImpares();
		//como el número es negativo, entonces el bucle que aumenta el valor del numero esperado no aumenta
	    int numeroEsperado = 0;
        //variable que llama al objeto
        int numero = obj.cuentaImpares(-1);
        //probar valores
        assertEquals(numeroEsperado, numero);
	}

}
