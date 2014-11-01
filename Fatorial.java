public class Fatorial {
	public int calcularFatorial(int n) throws IllegalArgumentException{
		if(n < 0)
			throw new IllegalArgumentException("N�o existe fatorial para numeros negativos");
		int resultado = 1;
		
		for(int = 2; i <= n; i++){
			resultado*=i;
		}
		return resultado;
	}
}