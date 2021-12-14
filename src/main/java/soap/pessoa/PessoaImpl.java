package soap.pessoa;


import javax.jws.WebService;

@WebService(endpointInterface = "soap.pessoa.Pessoa", serviceName = "Pessoa" )
public class PessoaImpl {

    public String nome(String n1) {return "Bom dia " + n1 ;}

}
