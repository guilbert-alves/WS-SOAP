package soap.pessoa;

import soap.calculadora.Calculadora;
import soap.calculadora.CalculadoraService;

import java.net.MalformedURLException;

public class PessoaClient {

    public static void main(String[] args) throws MalformedURLException {
        Pessoa pessoa = PessoaService.Build();
        String resultado = pessoa.nome( "");
        System.out.println(resultado);

    }
}
