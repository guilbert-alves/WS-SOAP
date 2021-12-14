package soap.pessoa;

import soap.calculadora.CalculadoraImpl;

import javax.xml.ws.Endpoint;

public class StartPessoa {
    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/pessoa", new PessoaImpl());


    }
}
