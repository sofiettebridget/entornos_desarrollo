import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FactorialTest {

	@ParameterizedTest
	@CsvSource({"1,1","0,1","4,24"})
	void testFactorial(int n,int valoresperado) {
		Factorial calculo = new Factorial(n);
		int resultado = calculo.calcularfact();
		assertEquals(valoresperado,resultado,0);
		
		
	}

}
