package java.ru.helloworld;


import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class WorldTest {


    @Test
    public void greetResultsInHello() {
        world msg = new world();
        assertEquals("Hello world", msg.greet());
    }


}

