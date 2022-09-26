import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

/*
Suposições é uma coleção de métodos utilitários que suportam a execução de testes condicionais com base em suposições.
Em contraste direto com asserções com falha, suposições com falha não resultam em falha de teste;
em vez disso, uma suposição com falha resulta no aborto de um teste.
Normalmente, as suposições são usadas sempre que não faz sentido continuar a execução de um determinado método de teste —
por exemplo, se o teste depender de algo que não existe no ambiente de tempo de execução atual.
Embora seja tecnicamente possível estender essa classe, a extensão é fortemente desencorajada.
A equipe JUnit recomenda que os métodos definidos nesta classe sejam usados ​​por meio de importações estáticas.
 */
public class AssumptionsTeste {
    @Test
    void validarAlgoSomenteNoUsuarioSamara() {
        Assumptions.assumeFalse("root".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5 + 5);
    }
}
