package grupoa;

public class SumaNumeros {
	/**
	 * el método sumaNumeros sirve para devolver la suma de todos los números pares
	 * desde 1 hasta el número que introduzcamos
	 * @param num es el número hasta que se puedan sumar los números que son pares
	 * @return devuelve la suma de los números pares desde i hasta num
	 */
	public static int sumaNumeros(int num) {
		//int el cual sirve para acumular la suma de números pares que se encuentran entre i y num
		int suma = 0;
		/**
		 * el problema del código es que si num es par,
		 * el número no se añadiría ya que i siempre es menor que num.
		 * si i puede ser igual que num tambíen, entonces también podríamos ver
		 * el último par el cual se evitaría por el i<num 
		 */
		
		for (int i = 1; i <= num; i++) {
			
			//si el número i es par, se añade a la suma
			if(i%2==0) {
				suma += i;
			}
		}
		//devuelve la suma de los números pares desde i hasta num
		return suma;
	}
	
	
	//lo puse por tests
	public static void main(String[] args) {
		System.out.println(sumaNumeros(-1));
		
		
		
	}
}
