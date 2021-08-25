package projeto_1_ED;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArranjoTest {
	@Test
	void test() {
		Arranjo a = new Arranjo();
		// Testa se o mnoer é 510
		assertEquals(510, a.menor(), "O menor deve ser 510");
		// Testa se o maior é o 940
		assertEquals(940, a.maior(), "O maior é 940");
	}
}
