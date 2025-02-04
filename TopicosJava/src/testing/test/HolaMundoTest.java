package testing.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import testing.HolaMundo;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class HolaMundoTest {

    private final PrintStream stanadarOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp(){
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown(){
        System.setOut(stanadarOut);
    }

    @Test
    @ParameterizedTest
    void testPrintHolaMundo() {

        HolaMundo.printHolaMundo();
        String salida = outputStreamCaptor.toString();
        assertEquals("Hola Mundo\r\n",salida);



    }
}