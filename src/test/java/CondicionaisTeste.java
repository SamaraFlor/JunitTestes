import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;

import static org.junit.jupiter.api.condition.JRE.JAVA_11;
import static org.junit.jupiter.api.condition.JRE.JAVA_17;

public class CondicionaisTeste {




    @Test
    //@EnabledForJreRange fala o minimo e o maximo
    @EnabledForJreRange(min = JAVA_11, max = JAVA_17)
    void validarAlgoSomenteNoUsuarioWillyan() {
        Assertions.assertEquals(10, 5 + 5);
    }
}
