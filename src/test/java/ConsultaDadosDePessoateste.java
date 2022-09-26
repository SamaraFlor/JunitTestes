
import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
/*
Os métodos anotados com a  anotação @Before são executados antes de cada teste.
Isso é útil quando queremos executar algum código comum antes de executar um teste.


Quando queremos executar uma operação comum cara antes de cada teste,
é preferível executá-la apenas uma vez antes de executar todos os testes usando @BeforeClass .
 */

public class ConsultaDadosDePessoateste {

    //@BeforeEac h e @BeforeAll são os equivalentes JUnit 5 de @Before e @BeforeClass .
    // Essas anotações foram renomeadas com nomes mais claros para evitar confusão.
    //Vamos duplicar nossas classes anteriores usando essas novas anotações,
    // começando com as anotações @BeforeEach  e @AfterEach :
    @BeforeAll
    static void configuraConexao() {
        GerenciadorDeConexaoComBancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste() {
        GerenciadorDeConexaoComBancoDeDados.insereDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @AfterEach
    void removeDadosDoTeste() {
        GerenciadorDeConexaoComBancoDeDados.removeDados(new Pessoa("João", LocalDateTime.of(2000, 1, 1, 13, 0, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    //Observe que esses métodos precisam ser estáticos ,
    // então eles serão executados antes de executar os testes da classe.
    @AfterAll
    static void finalizarConexao() {
        GerenciadorDeConexaoComBancoDeDados.finalizarConexao();
    }
}
