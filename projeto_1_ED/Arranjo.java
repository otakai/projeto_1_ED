package projeto_1_ED;

public class Arranjo {
	Integer[] a = { 940, 880, 830, 790, 750, 660, 650, 590, 510, 940 };
	public Integer menor() {
		Integer min = a[0];
		for (int i = 1; i < 10; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}
	public Integer maior() {
		Integer max = a[0];
		for (int i = 1; i < 10; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	public Integer soma() {
		Integer soma = a[0];
		for (int i = 1; i < 10; i++) {
			soma += a[i];
		}
		return soma;
	}
	public Integer repeticoes(int n) {
		Integer cont = 0;
		for (int i = 0; i < 10; i++) {
			if (a[i]==n) {
				cont++;
			}
		}
		return cont;
	}
}
