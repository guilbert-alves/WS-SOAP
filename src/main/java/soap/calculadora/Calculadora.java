package soap.calculadora;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface Calculadora {

	@WebMethod
	public Float soma(Float n1, Float n2);

	@WebMethod
	public Float subtracao(Float n1, Float n2);

	@WebMethod
	public Float func(Float n1, String operador, Float n2);
}
