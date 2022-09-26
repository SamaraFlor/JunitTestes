import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    //junit todos os metodos retornam void, sem retorno
    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa samara = new Pessoa("Samara", LocalDateTime.of(1988, 8, 12, 9, 0, 0));
        //comparando dois objetos para igualdade, como as variantes
        // igual
        //o que se espera do lado esquerdo e o que vamos chamar do lado direito
        Assertions.assertEquals(34, samara.getIdade());
    }

    @Test
    void deveRetornarSeEhMaiorDeIdade() {
        Pessoa samara = new Pessoa("Samara", LocalDateTime.of(1988, 8, 12, 9, 0, 0));
        //verificar que é verdade
        Assertions.assertTrue(samara.ehMaiorDeIdade());

        Pessoa Pedro = new Pessoa("Pedro", LocalDateTime.now());
        //verificar que é falso
        Assertions.assertFalse(Pedro.ehMaiorDeIdade());
    }

    @Test
    void validaIgualdade() {
        Pessoa pessoa = new Pessoa("Pessoa 1", LocalDateTime.now());
        Assertions.assertSame(pessoa, pessoa);
    }

}
