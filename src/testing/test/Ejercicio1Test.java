package testing.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import testing.Ejercicio1;

class Ejercicio1Test {

    @Test
    void testDoble() {
        //act
        Integer resultadoActual = Ejercicio1.doble(2);
        Integer resultadoEsperado = 4;

        //asset
        Assertions.assertEquals(resultadoEsperado, resultadoActual, "el doble de 2 deberia ser 4");

    }
}