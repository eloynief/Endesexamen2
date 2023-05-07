package grupob;

public class CuentaImpares {

	public static int cuentaImpares(int num) {
		int cuenta = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 1) {
				cuenta++;
			}
		}
		return cuenta;
	}
	public static void main(String[] args) {
		System.out.println(cuentaImpares(1));
	}
	
	
}
