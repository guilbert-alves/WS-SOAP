package soap.calculadora;

import javax.xml.ws.Endpoint;

public class StartCalculadora {
	public static void main(String[] args) {

		Endpoint.publish("http://localhost:8080/calculadora", new CalculadoraImpl());


	}
}
