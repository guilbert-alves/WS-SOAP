package soap.calculadora;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class CalculadoraService {
	private static final String urlWsdl= "http://localhost:8080/calculadora?wsdl";
	private static final String nameSpaceService =  "http://calculadora.soap/";

	public static Calculadora Build() throws MalformedURLException {
		URL url  = new URL(urlWsdl);
		QName qName = new QName(nameSpaceService, "Calculadora");
		Service service  = Service.create(url, qName);
		return  service.getPort(Calculadora.class);
	}
}
