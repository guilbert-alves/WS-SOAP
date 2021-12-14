package soap.calculadora;


import javax.jws.WebService;

@WebService(endpointInterface = "soap.calculadora.Calculadora", serviceName = "Calculadora" )
public class CalculadoraImpl implements Calculadora{

	public Float soma(Float n1, Float n2) { return  n1 + n2; }

	public Float subtracao(Float n1, Float n2) {
		return  n1 - n2;
	}

	public Float func(Float n1, String operador, Float n2) {
		switch (operador){
			case "+":
				return n1 + n2;
			case "-":
				return n1 - n2;
			case  "*":
				return n1 * n2;
			case  "/":
				return n1 / n2;
			default:
				return  0F;
		}
	}
}
