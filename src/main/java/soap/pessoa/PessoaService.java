package soap.pessoa;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class PessoaService {
    private static final String urlWsdl= "http://localhost:8080/pessoa?wsdl";
    private static final String nameSpaceService =  "http://pessoa.soap/";

    public static Pessoa Build() throws MalformedURLException {
        URL url  = new URL(urlWsdl);
        QName qName = new QName(nameSpaceService, "Pessoa");
        Service service  = Service.create(url, qName);
        return  service.getPort(Pessoa.class);

    }

}
